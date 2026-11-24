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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private m21 bulletin;
    private u21 bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private cs5 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private jh8 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new dac(this, 1);

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final lm showCrossAnimated;
        private final lm showTimerAnimated;
        private final long startTime;
        private final gn timer;
        private final lm timerScaleAnimated;

        public CloseDrawable(View view, int i, int i2, long j) {
            gn gnVar = new gn(false, true, true);
            this.timer = gnVar;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = kk7.d4;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j;
            this.min_display_duration = i * 1000;
            this.max_display_duration = i2 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            gnVar.setCallback(view);
            gnVar.b = 17;
            gnVar.w(gl.L(12.0f));
            gnVar.x(gl.n1("fonts/num.otf"));
            gnVar.N = gl.q.x;
            gnVar.u(-1);
            s33 s33Var = s33.h;
            this.showCrossAnimated = new lm(view, 0L, 420L, s33Var);
            this.showTimerAnimated = new lm(view, 0L, 420L, s33Var);
            this.timerScaleAnimated = new lm(view, 0L, 420L, s33Var);
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
            gn gnVar = this.timer;
            gnVar.C = (int) (this.alpha * d);
            gnVar.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(gl.L(2.0f));
            RectF rectF = gl.P;
            rectF.set(centerX - gl.L(9.0f), centerY - gl.L(9.0f), gl.L(9.0f) + centerX, gl.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f * (-360.0f), false, this.paint);
            float d2 = this.showCrossAnimated.d((1.0f - f) * 360.0f > 75.0f);
            float R1 = gl.R1(centerX, gl.L(8.0f) + centerX, d);
            float R12 = gl.R1(centerY, centerY - gl.L(8.0f), d);
            float R13 = gl.R1(0.35f, 1.0f, d2) * gl.U1(d, gl.L(5.0f), gl.L(3.0f));
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
            return gl.L(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return gl.L(24.0f);
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

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    private VideoAds(int i, long j, int i2, u21 u21Var, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i;
        this.dialogId = j;
        this.msg_id = i2;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(u21Var);
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

    private void init(u21 u21Var) {
        this.bulletinFactory = u21Var;
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
                na7.q1(this.currentAccount).b4(tL_messages_sponsoredMessages.users, false);
                na7.q1(this.currentAccount).V3(tL_messages_sponsoredMessages.chats, false);
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
        gl.c3(new l3c(this, tLObject, (byte) 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gl.g(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$12(cs5 cs5Var) {
        if (!y6c.h(this.currentAccount).p()) {
            showPremium();
            return;
        }
        cs5Var.u();
        m21 m21Var = this.bulletin;
        if (m21Var != null) {
            m21Var.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(k96.M0(2131754485, null)).j();
        na7.q1(this.currentAccount).l0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, cs5 cs5Var) {
        int i = this.currentAccount;
        long j = this.dialogId;
        u21 u21Var = this.bulletinFactory;
        e53 e53Var = new e53();
        dac dacVar = new dac(this, (byte) 0);
        Objects.requireNonNull(cs5Var);
        en1 en1Var = new en1(cs5Var, (byte) 11);
        int i2 = b89.v1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_reportSponsoredMessage, new mz4(context, e53Var, j, bArr, en1Var, u21Var, dacVar, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$15(cs5 cs5Var) {
        if (!y6c.h(this.currentAccount).p()) {
            showPremium();
            return;
        }
        cs5Var.u();
        m21 m21Var = this.bulletin;
        if (m21Var != null) {
            m21Var.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(k96.M0(2131754485, null)).j();
        na7.q1(this.currentAccount).l0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$16(p8c p8cVar) {
        p8cVar.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r4.startsWith("https://" + na7.q1(r21.currentAccount).N2) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(m21 m21Var, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, wjb wjbVar, AdLayout adLayout, p8c p8cVar, View view) {
        ViewGroup viewGroup;
        e53 e53Var;
        Context context2;
        byte b;
        int i;
        m21 m21Var2 = this.bulletin;
        if (m21Var2 == null || m21Var2 != m21Var) {
            return;
        }
        try {
            viewGroup = (ViewGroup) m21Var2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        e53 e53Var2 = new e53();
        final cs5 cs5Var = new cs5(viewGroup, e53Var2, this.bulletin.e, true, false, false);
        cs5Var.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = cs5Var.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        cs5Var.I = true;
        cs5Var.s = (short) 0;
        cs5Var.t = false;
        cs5Var.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            b = 11;
            e53Var = e53Var2;
            if (!y6c.h(this.currentAccount).p() && !na7.q1(this.currentAccount).F3() && !tL_sponsoredMessage.can_report) {
                final byte b2 = 1;
                cs5Var.b(R.drawable.msg_block2, k96.M0(2131749131, null), new Runnable(this) { // from class: cac
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        cs5 cs5Var2 = cs5Var;
                        VideoAds videoAds = this.b;
                        switch (b3) {
                            case 0:
                                videoAds.lambda$show$15(cs5Var2);
                                break;
                            default:
                                videoAds.lambda$show$12(cs5Var2);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                cs5Var.b(R.drawable.msg_info, k96.M0(2131754943, null), new l3c(context2, e53Var, b), false);
                String M0 = k96.M0(2131746041, null);
                exa exaVar = new exa((Object) this, (Object) context2, (Object) tL_sponsoredMessage, (Object) cs5Var, (byte) 22);
                cs5Var = cs5Var;
                cs5Var.b(R.drawable.msg_block2, M0, exaVar, false);
                if (!na7.q1(this.currentAccount).F3()) {
                    cs5Var.j();
                    final byte b3 = 0;
                    cs5Var.b(R.drawable.msg_cancel, k96.M0(2131746127, null), new Runnable(this) { // from class: cac
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            cs5 cs5Var2 = cs5Var;
                            VideoAds videoAds = this.b;
                            switch (b32) {
                                case 0:
                                    videoAds.lambda$show$15(cs5Var2);
                                    break;
                                default:
                                    videoAds.lambda$show$12(cs5Var2);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (cs5Var.y() <= 0) {
                this.currentMenu = cs5Var;
                this.currentMenuTranslationY = adLayout.getTranslationY();
                p8cVar.a(Boolean.TRUE);
                cs5Var.p = new l3c(this, p8cVar, (byte) 10);
                cs5Var.a0();
                checkPopupShownCallback();
                return;
            }
            return;
        }
        cs5 K = cs5Var.K();
        e53Var = e53Var2;
        a8 a8Var = new a8(0, e53Var, context, true, false);
        context2 = context;
        a8Var.setItemHeight(44);
        a8Var.j(k96.M0(2131753753, null), R.drawable.msg_arrow_back, null);
        a8Var.getTextView().setPadding(k96.a0 ? 0 : gl.L(40.0f), 0, k96.a0 ? gl.L(40.0f) : 0, 0);
        a8Var.setOnClickListener(new ln1(cs5Var, (byte) 3));
        K.q(a8Var, nme.o(-1, -2));
        K.q(new j8(context2, e53Var), nme.o(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 != null && !TextUtils.equals(gl.J0(str2, false), na7.q1(this.currentAccount).N2)) {
            TextView textView = new TextView(context2);
            zkb.X(textView, bkb.Wc, e53Var);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(gl.L(18.0f), gl.L(10.0f), gl.L(18.0f), gl.L(10.0f));
            textView.setMaxWidth(gl.L(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(d01.w(parse, null, null, d01.a(parse.getHost()), null));
            int i2 = bkb.H5;
            ff0 Y = bkb.Y(bkb.v0(i2, e53Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            vkb M = zkb.M(i2);
            textView.setBackground(Y);
            zkb.j(textView, Y, null, M, e53Var);
            textView.setOnClickListener(new ee((Object) this, (Object) cs5Var, (Object) tL_sponsoredMessage, (Object) context2, (byte) 17));
            textView.setOnLongClickListener(new zs(tL_sponsoredMessage, (byte) 19));
            arrayList.add(textView);
        }
        if (tL_sponsoredMessage.sponsor_info != null) {
            TextView textView2 = new TextView(context2);
            zkb.X(textView2, bkb.D8, e53Var);
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(gl.L(18.0f), gl.L(10.0f), gl.L(18.0f), gl.L(10.0f));
            textView2.setMaxWidth(gl.L(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            int i3 = bkb.H5;
            ff0 Y2 = bkb.Y(bkb.v0(i3, e53Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            vkb M2 = zkb.M(i3);
            textView2.setBackground(Y2);
            zkb.j(textView2, Y2, null, M2, e53Var);
            final byte b4 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: fac
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b5 = b4;
                    TLRPC.TL_sponsoredMessage tL_sponsoredMessage2 = tL_sponsoredMessage;
                    switch (b5) {
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
            zkb.X(textView3, bkb.D8, e53Var);
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(gl.L(18.0f), gl.L(10.0f), gl.L(18.0f), gl.L(10.0f));
            textView3.setMaxWidth(gl.L(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            int i4 = bkb.H5;
            ff0 Y3 = bkb.Y(bkb.v0(i4, wjbVar), 0, 6);
            vkb M3 = zkb.M(i4);
            textView3.setBackground(Y3);
            zkb.j(textView3, Y3, null, M3, wjbVar);
            final byte b5 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: fac
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b52 = b5;
                    TLRPC.TL_sponsoredMessage tL_sponsoredMessage2 = tL_sponsoredMessage;
                    switch (b52) {
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
                zkb.h(bkb.c7, e53Var, frameLayout);
                i = -1;
                LinearLayout.LayoutParams o = nme.o(-1, 1);
                o.height = 1;
                K.q(frameLayout, o);
            } else {
                i = -1;
            }
            K.q(view2, nme.o(i, -2));
        }
        b = 11;
        cs5Var.b(R.drawable.msg_channel, k96.M0(2131745011, null), new c10(cs5Var, K, b), false);
        if (!y6c.h(this.currentAccount).p()) {
            final byte b22 = 1;
            cs5Var.b(R.drawable.msg_block2, k96.M0(2131749131, null), new Runnable(this) { // from class: cac
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b32 = b22;
                    cs5 cs5Var2 = cs5Var;
                    VideoAds videoAds = this.b;
                    switch (b32) {
                        case 0:
                            videoAds.lambda$show$15(cs5Var2);
                            break;
                        default:
                            videoAds.lambda$show$12(cs5Var2);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (cs5Var.y() <= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        d01.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, na7.q1(y6c.t0).k4.A2.f, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            m21 m21Var = this.bulletin;
            if (m21Var != null) {
                m21Var.b();
                return;
            }
            return;
        }
        if (!y6c.h(this.currentAccount).p()) {
            showPremium();
            return;
        }
        m21 m21Var2 = this.bulletin;
        if (m21Var2 != null) {
            m21Var2.b();
            this.bulletin = null;
        }
        na7.q1(this.currentAccount).l0(true);
        this.bulletinFactory.c(k96.M0(2131754485, null)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(m21 m21Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        m21 m21Var2 = this.bulletin;
        if (m21Var2 == null || m21Var2 != m21Var) {
            return;
        }
        m21Var2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
        m21Var2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(m21 m21Var, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        m21 m21Var2 = this.bulletin;
        if (m21Var2 == null || m21Var2 != m21Var || bool.booleanValue() == zArr[0]) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        zArr[0] = booleanValue;
        closeDrawable.setPaused(booleanValue);
        if (zArr[0]) {
            this.bulletin.i(false);
            jArr[0] = System.currentTimeMillis();
            gl.r(runnable);
            return;
        }
        gl.r(runnable);
        jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
        long currentTimeMillis = (System.currentTimeMillis() - j) - jArr2[0];
        long j2 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
        long j3 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
        if (j3 <= 0) {
            m21 m21Var3 = this.bulletin;
            if (m21Var3 != null) {
                m21Var3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j2 > 0) {
            gl.d3(runnable, j2);
            return;
        }
        m21 m21Var4 = this.bulletin;
        m21Var4.j = (int) j3;
        m21Var4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(m21 m21Var, boolean[] zArr) {
        m21 m21Var2 = this.bulletin;
        if (m21Var2 == null || m21Var2 != m21Var || zArr[0]) {
            return;
        }
        zArr[0] = true;
        cs5 cs5Var = this.currentMenu;
        if (cs5Var != null) {
            cs5Var.u();
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
    public void lambda$show$7(cs5 cs5Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        cs5Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        d01.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, na7.q1(this.currentAccount).k4.A2.f, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gl.g(tL_sponsoredMessage.url);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        gl.g(tL_sponsoredMessage.sponsor_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremium$19(jh8 jh8Var) {
        if (jh8Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (y6c.h(this.currentAccount).p() && na7.q1(this.currentAccount).D2()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = na7.q1(this.currentAccount).h1(this.dialogId);
        tL_messages_getSponsoredMessages.flags |= 1;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new wx9(this, (byte) 22));
    }

    public static VideoAds make(int i, long j, int i2, u21 u21Var) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i, j);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i2 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i2);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i, j, i2, u21Var, videoAdsCache);
    }

    private void schedule() {
        gl.r(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        gl.d3(this.showRunnable, Math.max(0L, ((this.first ? this.start_delay : this.between_delay) * 1000) - (System.currentTimeMillis() - this.lastTime)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        m21 m21Var = this.bulletin;
        if (m21Var != null) {
            m21Var.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        wjb wjbVar = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(X, wjbVar) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // q11
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.Y(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override // org.telegram.messenger.video.VideoAds.AdLayout, q11, tjb
            public void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        jia jiaVar = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i = bkb.Ei;
        jiaVar.i(new AdOptionsDrawable(X2, bkb.v0(i, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, gl5.b(tL_sponsoredMessage.media.document), gl5.c(ba4.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document), null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w = ba4.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, gl5.i(w, tL_sponsoredMessage.media.photo), gl5.i(ba4.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w, false), tL_sponsoredMessage.media.photo), null, "48_48", "48_48", null);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w2 = ba4.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, gl5.i(w2, tL_sponsoredMessage.photo), gl5.i(ba4.w(tL_sponsoredMessage.photo.sizes, 48, true, w2, false), tL_sponsoredMessage.photo), null, "48_48", "48_48", null);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(bkb.v0(i, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new vzb(this, closeDrawable, (byte) 8));
        final m21 b = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b;
        b.u = false;
        b.i(false);
        final r1b r1bVar = new r1b(this, b, tL_sponsoredMessage, (byte) 26);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        p8c p8cVar = new p8c() { // from class: eac
            @Override // p8c
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b, zArr, closeDrawable, jArr2, r1bVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        gl.d3(r1bVar, tL_sponsoredMessage.min_display_duration * 1000);
        m21 m21Var2 = this.bulletin;
        m21Var2.r = false;
        m21Var2.v = new r1b(this, b, new boolean[1], (byte) 27);
        adLayout.titleTextView.setRightDrawableOnClick(new y35(this, b, tL_sponsoredMessage, X, wjbVar, adLayout, p8cVar, (byte) 1));
        m21 m21Var3 = this.bulletin;
        vzb vzbVar = new vzb(this, tL_sponsoredMessage, (byte) 9);
        q11 q11Var = m21Var3.e;
        if (q11Var != null) {
            q11Var.setOnClickListener(vzbVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        jh8 jh8Var = this.premiumSheet;
        if (jh8Var != null) {
            jh8Var.dismiss();
            this.premiumSheet = null;
        }
        jh8 jh8Var2 = new jh8(new d() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.d
            public Context getContext() {
                return gl.W(LaunchActivity.H1);
            }

            @Override // org.telegram.ui.ActionBar.d
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.d
            public Activity getParentActivity() {
                Activity W = gl.W(org.telegram.messenger.a.b);
                return W == null ? LaunchActivity.H1 : W;
            }
        }, 3, true);
        this.premiumSheet = jh8Var2;
        jh8Var2.n(new l3c(this, jh8Var2, (byte) 8));
        jh8Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        cs5 cs5Var = this.currentMenu;
        if (cs5Var != null && cs5Var.E()) {
            return true;
        }
        jh8 jh8Var = this.premiumSheet;
        return (jh8Var == null || jh8Var.J) ? false : true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        boolean z = w01.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z = w01.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z) {
        if (this.waitingPaused != z) {
            this.waitingPaused = z;
            gl.r(this.showRunnable);
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
        cs5 cs5Var = this.currentMenu;
        if (cs5Var != null) {
            cs5Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        gl.r(this.showRunnable);
        setWaitingPaused(true);
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    /* loaded from: classes2.dex */
    public static class AdLayout extends h11 {
        public final ImageView buttonView;
        public final be0 imageView;
        private final LinearLayout linearLayout;
        public final l46 subtitleTextView;
        public final jia titleTextView;

        public AdLayout(Context context, wjb wjbVar) {
            super(context, wjbVar);
            setBackground(getThemedColor(bkb.vj));
            be0 be0Var = new be0(context);
            this.imageView = be0Var;
            be0Var.setRoundRadius(gl.L(48.0f));
            addView(be0Var, nme.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i = bkb.xj;
            getThemedColor(i);
            int i2 = bkb.wj;
            getThemedColor(i2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, nme.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            jia jiaVar = new jia(context);
            this.titleTextView = jiaVar;
            jiaVar.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            zkb.W(jiaVar, i, wjbVar);
            jiaVar.setTextSize(14);
            jiaVar.setTypeface(gl.o());
            linearLayout.addView(jiaVar);
            l46 l46Var = new l46(context, null);
            this.subtitleTextView = l46Var;
            l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            zkb.X(l46Var, i, wjbVar);
            zkb.G(l46Var, i2, wjbVar);
            l46Var.setTypeface(Typeface.SANS_SERIF);
            l46Var.setTextSize(1, 13.0f);
            linearLayout.addView(l46Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = bkb.Ei;
            ff0 f0 = bkb.f0(bkb.p1(0.15f, getThemedColor(i3)), 7, -1);
            vkb K = zkb.K(0.15f, i3);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, K, wjbVar);
            addView(imageView, nme.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // q11
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(nme.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // q11
        public void onShow() {
            super.onShow();
        }

        @Override // q11, tjb
        public void addColorKeys(HashSet hashSet) {
        }
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final tgb text = new tgb(k96.M0(2131745021, null), 11.0f, gl.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i) {
            this.color = i;
            Drawable d = b00.d(context, R.drawable.ic_ab_other);
            this.icon = d;
            d.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            RectF rectF = gl.P;
            rectF.set(getBounds());
            rectF.left += gl.L(4.0f);
            this.backgroundPaint.setColor(bkb.p1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + gl.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - gl.L(12.99f), getBounds().centerY() - gl.L(5.665f), getBounds().right - gl.L(1.66f), gl.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return gl.L(16.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return (int) (this.text.j() + gl.L(4.0f) + gl.L(18.0f));
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
