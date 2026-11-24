package org.telegram.messenger.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private u31 bulletin;
    private c41 bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private bu5 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private kj8 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new ecc(this, 1);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final ln showCrossAnimated;
        private final ln showTimerAnimated;
        private final long startTime;
        private final ho timer;
        private final ln timerScaleAnimated;

        public CloseDrawable(View view, int i, int i2, long j) {
            ho hoVar = new ho(false, true, true);
            this.timer = hoVar;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = nm7.d4;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j;
            this.min_display_duration = i * 1000;
            this.max_display_duration = i2 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            hoVar.setCallback(view);
            hoVar.b = 17;
            hoVar.w(gm.L(12.0f));
            hoVar.x(gm.n1("fonts/num.otf"));
            hoVar.N = gm.q.x;
            hoVar.u(-1);
            d53 d53Var = d53.h;
            this.showCrossAnimated = new ln(view, 0L, 420L, d53Var);
            this.showTimerAnimated = new ln(view, 0L, 420L, d53Var);
            this.timerScaleAnimated = new ln(view, 0L, 420L, d53Var);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j = this.min_display_duration;
            float f = max / j;
            float d = this.showTimerAnimated.d(currentTimeMillis < j);
            String valueOf = String.valueOf((int) Math.ceil(max / 1000.0d));
            float e = this.timerScaleAnimated.e(false, valueOf.length() >= 3 ? 0.825f : valueOf.length() >= 2 ? 0.875f : 1.0f);
            canvas.save();
            canvas.scale(e, e, centerX, centerY);
            this.timer.t(valueOf, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            ho hoVar = this.timer;
            hoVar.C = (int) (this.alpha * d);
            hoVar.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(gm.L(2.0f));
            RectF rectF = gm.P;
            rectF.set(centerX - gm.L(9.0f), centerY - gm.L(9.0f), gm.L(9.0f) + centerX, gm.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f * (-360.0f), false, this.paint);
            float d2 = this.showCrossAnimated.d((1.0f - f) * 360.0f > 75.0f);
            float R1 = gm.R1(centerX, gm.L(8.0f) + centerX, d);
            float R12 = gm.R1(centerY, centerY - gm.L(8.0f), d);
            float R13 = gm.R1(0.35f, 1.0f, d2) * gm.U1(d, gm.L(5.0f), gm.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d2));
            float f2 = R1 - R13;
            float f3 = R12 - R13;
            float f4 = R1 + R13;
            float f5 = R13 + R12;
            canvas.drawLine(f2, f3, f4, f5, this.paint);
            canvas.drawLine(f2, f5, f4, f3, this.paint);
            if (d > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return gm.L(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return gm.L(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        public boolean isCrossAvailable() {
            return (this.paused ? this.pausedTime : System.currentTimeMillis() - this.minusTime) - this.startTime > this.min_display_duration;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.alpha = i;
        }

        public void setColor(int i) {
            this.timer.u(i);
            this.paint.setColor(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.timer.setColorFilter(colorFilter);
            this.paint.setColorFilter(colorFilter);
        }

        public void setPaused(boolean z) {
            if (this.paused == z) {
                return;
            }
            this.paused = z;
            if (z) {
                this.pausedTime = System.currentTimeMillis();
            } else {
                this.minusTime += System.currentTimeMillis() - this.pausedTime;
            }
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    private static class VideoAdsCache {
        final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
        int betweenDelay;
        long loadTime;
        boolean loaded;
        final int msgId;
        int startDelay;

        public VideoAdsCache(int i) {
            this.msgId = i;
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    private static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i, long j) {
            this.currentAccount = i;
            this.dialogId = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                VideoAdsLocation videoAdsLocation = (VideoAdsLocation) obj;
                if (this.currentAccount == videoAdsLocation.currentAccount && this.dialogId == videoAdsLocation.dialogId) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.currentAccount), Long.valueOf(this.dialogId));
        }
    }

    private VideoAds(int i, long j, int i2, c41 c41Var, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i;
        this.dialogId = j;
        this.msg_id = i2;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(c41Var);
    }

    private void checkPopupShownCallback() {
        if (this.lastPopupShown != isPopupShown()) {
            this.lastPopupShown = isPopupShown();
            Runnable runnable = this.onPopupCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void dropCache() {
        cached.evictAll();
    }

    private void init(c41 c41Var) {
        this.bulletinFactory = c41Var;
        this.lastTime = System.currentTimeMillis();
        this.first = true;
        VideoAdsCache videoAdsCache = this.cache;
        if (!videoAdsCache.loaded) {
            load();
            return;
        }
        this.start_delay = videoAdsCache.startDelay;
        this.between_delay = videoAdsCache.betweenDelay;
        this.ads.addAll(videoAdsCache.ads);
        this.loaded = true;
        schedule();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(TLObject tLObject) {
        if (this.loading) {
            if (tLObject instanceof TLRPC.TL_messages_sponsoredMessages) {
                TLRPC.TL_messages_sponsoredMessages tL_messages_sponsoredMessages = (TLRPC.TL_messages_sponsoredMessages) tLObject;
                oc7.r1(this.currentAccount).d4(tL_messages_sponsoredMessages.users, false);
                oc7.r1(this.currentAccount).X3(tL_messages_sponsoredMessages.chats, false);
                this.ads.addAll(tL_messages_sponsoredMessages.messages);
                this.start_delay = tL_messages_sponsoredMessages.start_delay;
                this.between_delay = tL_messages_sponsoredMessages.between_delay;
                this.cache.ads.clear();
                this.cache.ads.addAll(tL_messages_sponsoredMessages.messages);
                VideoAdsCache videoAdsCache = this.cache;
                videoAdsCache.startDelay = tL_messages_sponsoredMessages.start_delay;
                videoAdsCache.betweenDelay = tL_messages_sponsoredMessages.between_delay;
            }
            this.cache.loadTime = System.currentTimeMillis();
            this.cache.loaded = true;
            this.loaded = true;
            this.loading = false;
            schedule();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new x4c(this, tLObject, (byte) 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gm.g(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$12(bu5 bu5Var) {
        if (!z8c.h(this.currentAccount).p()) {
            showPremium();
            return;
        }
        bu5Var.u();
        u31 u31Var = this.bulletin;
        if (u31Var != null) {
            u31Var.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(jb6.M0(2131754485, null)).j();
        oc7.r1(this.currentAccount).l0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, bu5 bu5Var) {
        int i = this.currentAccount;
        long j = this.dialogId;
        c41 c41Var = this.bulletinFactory;
        q63 q63Var = new q63();
        ecc eccVar = new ecc(this, (byte) 0);
        Objects.requireNonNull(bu5Var);
        bo1 bo1Var = new bo1(bu5Var, (byte) 11);
        int i2 = da9.v1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_reportSponsoredMessage, new l15(context, q63Var, j, bArr, bo1Var, c41Var, eccVar, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$15(bu5 bu5Var) {
        if (!z8c.h(this.currentAccount).p()) {
            showPremium();
            return;
        }
        bu5Var.u();
        u31 u31Var = this.bulletin;
        if (u31Var != null) {
            u31Var.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(jb6.M0(2131754485, null)).j();
        oc7.r1(this.currentAccount).l0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$16(qac qacVar) {
        qacVar.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r4.startsWith("https://" + oc7.r1(r21.currentAccount).N2) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(u31 u31Var, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, ylb ylbVar, AdLayout adLayout, qac qacVar, View view) {
        ViewGroup viewGroup;
        q63 q63Var;
        Context context2;
        int i;
        u31 u31Var2 = this.bulletin;
        if (u31Var2 == null || u31Var2 != u31Var) {
            return;
        }
        try {
            viewGroup = (ViewGroup) u31Var2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        q63 q63Var2 = new q63();
        final bu5 bu5Var = new bu5(viewGroup, q63Var2, this.bulletin.e, true, false, false);
        bu5Var.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bu5Var.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        bu5Var.I = true;
        bu5Var.s = (short) 0;
        bu5Var.t = false;
        bu5Var.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            q63Var = q63Var2;
            if (!z8c.h(this.currentAccount).p() && !oc7.r1(this.currentAccount).H3() && !tL_sponsoredMessage.can_report) {
                final byte b = 1;
                bu5Var.b(R.drawable.msg_block2, jb6.M0(2131749080, null), new Runnable(this) { // from class: dcc
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        bu5 bu5Var2 = bu5Var;
                        VideoAds videoAds = this.b;
                        switch (b2) {
                            case 0:
                                videoAds.lambda$show$15(bu5Var2);
                                break;
                            default:
                                videoAds.lambda$show$12(bu5Var2);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                bu5Var.b(R.drawable.msg_info, jb6.M0(2131754943, null), new x4c(context2, q63Var, (byte) 13), false);
                String M0 = jb6.M0(2131745967, null);
                hza hzaVar = new hza((Object) this, (Object) context2, (Object) tL_sponsoredMessage, (Object) bu5Var, (byte) 22);
                bu5Var = bu5Var;
                bu5Var.b(R.drawable.msg_block2, M0, hzaVar, false);
                if (!oc7.r1(this.currentAccount).H3()) {
                    bu5Var.j();
                    final byte b2 = 0;
                    bu5Var.b(R.drawable.msg_cancel, jb6.M0(2131746053, null), new Runnable(this) { // from class: dcc
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            bu5 bu5Var2 = bu5Var;
                            VideoAds videoAds = this.b;
                            switch (b22) {
                                case 0:
                                    videoAds.lambda$show$15(bu5Var2);
                                    break;
                                default:
                                    videoAds.lambda$show$12(bu5Var2);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (bu5Var.y() <= 0) {
                this.currentMenu = bu5Var;
                this.currentMenuTranslationY = adLayout.getTranslationY();
                qacVar.a(Boolean.TRUE);
                bu5Var.p = new x4c(this, qacVar, (byte) 12);
                bu5Var.a0();
                checkPopupShownCallback();
                return;
            }
            return;
        }
        bu5 K = bu5Var.K();
        q63Var = q63Var2;
        a8 a8Var = new a8(0, q63Var, context, true, false);
        context2 = context;
        a8Var.setItemHeight(44);
        a8Var.j(jb6.M0(2131753721, null), R.drawable.msg_arrow_back, null);
        a8Var.getTextView().setPadding(jb6.a0 ? 0 : gm.L(40.0f), 0, jb6.a0 ? gm.L(40.0f) : 0, 0);
        a8Var.setOnClickListener(new to1(bu5Var, (byte) 3));
        K.q(a8Var, qoe.o(-1, -2));
        K.q(new j8(context2, q63Var), qoe.o(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 != null && !TextUtils.equals(gm.J0(str2, false), oc7.r1(this.currentAccount).N2)) {
            TextView textView = new TextView(context2);
            anb.X(textView, cmb.Wc, q63Var);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(gm.L(18.0f), gm.L(10.0f), gm.L(18.0f), gm.L(10.0f));
            textView.setMaxWidth(gm.L(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(l11.x(parse, null, null, l11.a(parse.getHost()), null));
            int i2 = cmb.H5;
            fg0 Y = cmb.Y(cmb.v0(i2, q63Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            wmb M = anb.M(i2);
            textView.setBackground(Y);
            anb.j(textView, Y, null, M, q63Var);
            textView.setOnClickListener(new ef((Object) this, (Object) bu5Var, (Object) tL_sponsoredMessage, (Object) context2, (byte) 17));
            textView.setOnLongClickListener(new au(tL_sponsoredMessage, (byte) 19));
            arrayList.add(textView);
        }
        if (tL_sponsoredMessage.sponsor_info != null) {
            TextView textView2 = new TextView(context2);
            anb.X(textView2, cmb.D8, q63Var);
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(gm.L(18.0f), gm.L(10.0f), gm.L(18.0f), gm.L(10.0f));
            textView2.setMaxWidth(gm.L(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            int i3 = cmb.H5;
            fg0 Y2 = cmb.Y(cmb.v0(i3, q63Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            wmb M2 = anb.M(i3);
            textView2.setBackground(Y2);
            anb.j(textView2, Y2, null, M2, q63Var);
            final byte b3 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: hcc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b3;
                    TLRPC.TL_sponsoredMessage tL_sponsoredMessage2 = tL_sponsoredMessage;
                    switch (b4) {
                        case 0:
                            VideoAds.lambda$show$9(tL_sponsoredMessage2, view2);
                            break;
                        default:
                            VideoAds.lambda$show$10(tL_sponsoredMessage2, view2);
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            anb.X(textView3, cmb.D8, q63Var);
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(gm.L(18.0f), gm.L(10.0f), gm.L(18.0f), gm.L(10.0f));
            textView3.setMaxWidth(gm.L(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            int i4 = cmb.H5;
            fg0 Y3 = cmb.Y(cmb.v0(i4, ylbVar), 0, 6);
            wmb M3 = anb.M(i4);
            textView3.setBackground(Y3);
            anb.j(textView3, Y3, null, M3, ylbVar);
            final byte b4 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: hcc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b42 = b4;
                    TLRPC.TL_sponsoredMessage tL_sponsoredMessage2 = tL_sponsoredMessage;
                    switch (b42) {
                        case 0:
                            VideoAds.lambda$show$9(tL_sponsoredMessage2, view2);
                            break;
                        default:
                            VideoAds.lambda$show$10(tL_sponsoredMessage2, view2);
                            break;
                    }
                }
            });
            arrayList.add(textView3);
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            View view2 = (View) arrayList.get(i5);
            if (i5 > 0) {
                FrameLayout frameLayout = new FrameLayout(context2);
                anb.h(cmb.c7, q63Var, frameLayout);
                i = -1;
                LinearLayout.LayoutParams o = qoe.o(-1, 1);
                o.height = 1;
                K.q(frameLayout, o);
            } else {
                i = -1;
            }
            K.q(view2, qoe.o(i, -2));
        }
        bu5Var.b(R.drawable.msg_channel, jb6.M0(2131744937, null), new c20(bu5Var, K, (byte) 11), false);
        if (!z8c.h(this.currentAccount).p()) {
            final byte b5 = 1;
            bu5Var.b(R.drawable.msg_block2, jb6.M0(2131749080, null), new Runnable(this) { // from class: dcc
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b5;
                    bu5 bu5Var2 = bu5Var;
                    VideoAds videoAds = this.b;
                    switch (b22) {
                        case 0:
                            videoAds.lambda$show$15(bu5Var2);
                            break;
                        default:
                            videoAds.lambda$show$12(bu5Var2);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (bu5Var.y() <= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        l11.t(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, oc7.r1(z8c.t0).l4.A2.f, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            u31 u31Var = this.bulletin;
            if (u31Var != null) {
                u31Var.b();
                return;
            }
            return;
        }
        if (!z8c.h(this.currentAccount).p()) {
            showPremium();
            return;
        }
        u31 u31Var2 = this.bulletin;
        if (u31Var2 != null) {
            u31Var2.b();
            this.bulletin = null;
        }
        oc7.r1(this.currentAccount).l0(true);
        this.bulletinFactory.c(jb6.M0(2131754485, null)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(u31 u31Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        u31 u31Var2 = this.bulletin;
        if (u31Var2 == null || u31Var2 != u31Var) {
            return;
        }
        u31Var2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
        u31Var2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(u31 u31Var, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        u31 u31Var2 = this.bulletin;
        if (u31Var2 == null || u31Var2 != u31Var || bool.booleanValue() == zArr[0]) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        zArr[0] = booleanValue;
        closeDrawable.setPaused(booleanValue);
        if (zArr[0]) {
            this.bulletin.i(false);
            jArr[0] = System.currentTimeMillis();
            gm.r(runnable);
            return;
        }
        gm.r(runnable);
        jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
        long currentTimeMillis = (System.currentTimeMillis() - j) - jArr2[0];
        long j2 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
        long j3 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
        if (j3 <= 0) {
            u31 u31Var3 = this.bulletin;
            if (u31Var3 != null) {
                u31Var3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j2 > 0) {
            gm.d3(runnable, j2);
            return;
        }
        u31 u31Var4 = this.bulletin;
        u31Var4.j = (int) j3;
        u31Var4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(u31 u31Var, boolean[] zArr) {
        u31 u31Var2 = this.bulletin;
        if (u31Var2 == null || u31Var2 != u31Var || zArr[0]) {
            return;
        }
        zArr[0] = true;
        bu5 bu5Var = this.currentMenu;
        if (bu5Var != null) {
            bu5Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        this.currentBulletinPassedTime = 0L;
        this.lastTime = System.currentTimeMillis();
        if (this.waitingPaused) {
            this.waitingTimeSince = System.currentTimeMillis();
        }
        if (!this.ads.isEmpty()) {
            this.ads.remove(0);
        }
        this.first = false;
        schedule();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$7(bu5 bu5Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        bu5Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        l11.t(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, oc7.r1(this.currentAccount).l4.A2.f, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gm.g(tL_sponsoredMessage.url);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gm.g(tL_sponsoredMessage.sponsor_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremium$19(kj8 kj8Var) {
        if (kj8Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (z8c.h(this.currentAccount).p() && oc7.r1(this.currentAccount).F2()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = oc7.r1(this.currentAccount).i1(this.dialogId);
        tL_messages_getSponsoredMessages.flags |= 1;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new go9(this, (byte) 23));
    }

    public static VideoAds make(int i, long j, int i2, c41 c41Var) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i, j);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i2 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i2);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i, j, i2, c41Var, videoAdsCache);
    }

    private void schedule() {
        gm.r(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        gm.d3(this.showRunnable, Math.max(0L, ((this.first ? this.start_delay : this.between_delay) * 1000) - (System.currentTimeMillis() - this.lastTime)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        u31 u31Var = this.bulletin;
        if (u31Var != null) {
            u31Var.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        ylb ylbVar = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(X, ylbVar) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // y21
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.Y(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override // org.telegram.messenger.video.VideoAds.AdLayout, y21, vlb
            public void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        lka lkaVar = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i = cmb.Ei;
        lkaVar.i(new AdOptionsDrawable(X2, cmb.v0(i, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, gn5.b(tL_sponsoredMessage.media.document), gn5.c(bc4.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document), null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w = bc4.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, gn5.i(w, tL_sponsoredMessage.media.photo), gn5.i(bc4.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w, false), tL_sponsoredMessage.media.photo), null, "48_48", "48_48", null);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w2 = bc4.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, gn5.i(w2, tL_sponsoredMessage.photo), gn5.i(bc4.w(tL_sponsoredMessage.photo.sizes, 48, true, w2, false), tL_sponsoredMessage.photo), null, "48_48", "48_48", null);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(cmb.v0(i, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new fyb(this, closeDrawable, (byte) 9));
        final u31 b = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b;
        b.v = false;
        b.i(false);
        final j2b j2bVar = new j2b(this, b, tL_sponsoredMessage, (byte) 29);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        qac qacVar = new qac() { // from class: fcc
            @Override // qac
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b, zArr, closeDrawable, jArr2, j2bVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        gm.d3(j2bVar, tL_sponsoredMessage.min_display_duration * 1000);
        u31 u31Var2 = this.bulletin;
        u31Var2.s = false;
        u31Var2.w = new gcc(this, b, new boolean[1], (byte) 0);
        adLayout.titleTextView.setRightDrawableOnClick(new x55(this, b, tL_sponsoredMessage, X, ylbVar, adLayout, qacVar, (byte) 1));
        u31 u31Var3 = this.bulletin;
        fyb fybVar = new fyb(this, tL_sponsoredMessage, (byte) 10);
        y21 y21Var = u31Var3.e;
        if (y21Var != null) {
            y21Var.setOnClickListener(fybVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        kj8 kj8Var = this.premiumSheet;
        if (kj8Var != null) {
            kj8Var.dismiss();
            this.premiumSheet = null;
        }
        kj8 kj8Var2 = new kj8(new d() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.d
            public Context getContext() {
                return gm.W(LaunchActivity.H1);
            }

            @Override // org.telegram.ui.ActionBar.d
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.d
            public Activity getParentActivity() {
                Activity W = gm.W(org.telegram.messenger.a.b);
                return W == null ? LaunchActivity.H1 : W;
            }
        }, 3, true);
        this.premiumSheet = kj8Var2;
        kj8Var2.n(new x4c(this, kj8Var2, (byte) 10));
        kj8Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        bu5 bu5Var = this.currentMenu;
        if (bu5Var != null && bu5Var.E()) {
            return true;
        }
        kj8 kj8Var = this.premiumSheet;
        return (kj8Var == null || kj8Var.J) ? false : true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        boolean z = e21.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z = e21.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z) {
        if (this.waitingPaused != z) {
            this.waitingPaused = z;
            gm.r(this.showRunnable);
            if (z) {
                this.waitingTimeSince = System.currentTimeMillis();
                return;
            }
            this.lastTime += System.currentTimeMillis() - this.waitingTimeSince;
            if (this.bulletin == null) {
                schedule();
            }
        }
    }

    public void stop() {
        if (this.bulletin != null) {
            this.currentBulletinPassedTime = System.currentTimeMillis() - this.bulletinShowTime;
            if (!this.ads.isEmpty()) {
                if (this.currentBulletinPassedTime > this.ads.get(0).min_display_duration * 1000) {
                    this.currentBulletinPassedTime = 0L;
                    this.ads.remove(0);
                    this.first = false;
                }
            }
            this.bulletin.b();
            this.bulletin = null;
        } else {
            this.currentBulletinPassedTime = 0L;
        }
        bu5 bu5Var = this.currentMenu;
        if (bu5Var != null) {
            bu5Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        gm.r(this.showRunnable);
        setWaitingPaused(true);
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    /* loaded from: classes2.dex */
    public static class AdLayout extends p21 {
        public final ImageView buttonView;
        public final bf0 imageView;
        private final LinearLayout linearLayout;
        public final l66 subtitleTextView;
        public final lka titleTextView;

        public AdLayout(Context context, ylb ylbVar) {
            super(context, ylbVar);
            setBackground(getThemedColor(cmb.vj));
            bf0 bf0Var = new bf0(context);
            this.imageView = bf0Var;
            bf0Var.setRoundRadius(gm.L(48.0f));
            addView(bf0Var, qoe.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i = cmb.xj;
            getThemedColor(i);
            int i2 = cmb.wj;
            getThemedColor(i2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, qoe.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            lka lkaVar = new lka(context);
            this.titleTextView = lkaVar;
            lkaVar.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            anb.W(lkaVar, i, ylbVar);
            lkaVar.setTextSize(14);
            lkaVar.setTypeface(gm.o());
            linearLayout.addView(lkaVar);
            l66 l66Var = new l66(context, null);
            this.subtitleTextView = l66Var;
            l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            anb.X(l66Var, i, ylbVar);
            anb.G(l66Var, i2, ylbVar);
            l66Var.setTypeface(Typeface.SANS_SERIF);
            l66Var.setTextSize(1, 13.0f);
            linearLayout.addView(l66Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = cmb.Ei;
            fg0 f0 = cmb.f0(cmb.p1(0.15f, getThemedColor(i3)), 7, -1);
            wmb K = anb.K(0.15f, i3);
            imageView.setBackground(f0);
            anb.j(imageView, f0, null, K, ylbVar);
            addView(imageView, qoe.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // y21
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(qoe.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // y21
        public void onShow() {
            super.onShow();
        }

        @Override // y21, vlb
        public void addColorKeys(HashSet hashSet) {
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final uib text = new uib(jb6.M0(2131744947, null), 11.0f, gm.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i) {
            this.color = i;
            Drawable d = b10.d(context, R.drawable.ic_ab_other);
            this.icon = d;
            d.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            RectF rectF = gm.P;
            rectF.set(getBounds());
            rectF.left += gm.L(4.0f);
            this.backgroundPaint.setColor(cmb.p1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + gm.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - gm.L(12.99f), getBounds().centerY() - gm.L(5.665f), getBounds().right - gm.L(1.66f), gm.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return gm.L(16.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return (int) (this.text.j() + gm.L(4.0f) + gm.L(18.0f));
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.alpha = i / 255.0f;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
