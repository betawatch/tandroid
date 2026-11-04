package org.telegram.messenger.video;

import ai.r4;
import ai.y3;
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
import b8.mf;
import ei.k0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import k2.p1;
import m2.s;
import o4.b1;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c1;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ya;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey0;
import vg.v0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private ac bulletin;
    private fc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private f60 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private v0 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 1);

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final u5 showCrossAnimated;
        private final u5 showTimerAnimated;
        private final long startTime;
        private final g6 timer;
        private final u5 timerScaleAnimated;

        public CloseDrawable(View view, int i3, int i10, long j10) {
            g6 g6Var = new g6(false, true, true);
            this.timer = g6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = hs.e4;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j10;
            this.min_display_duration = i3 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            g6Var.setCallback(view);
            g6Var.b = 17;
            g6Var.w(g0.L(12.0f));
            g6Var.x(g0.o1("fonts/num.otf"));
            g6Var.M = g0.q.x;
            g6Var.u(-1);
            xq xqVar = xq.h;
            this.showCrossAnimated = new u5(view, 0L, 420L, xqVar);
            this.showTimerAnimated = new u5(view, 0L, 420L, xqVar);
            this.timerScaleAnimated = new u5(view, 0L, 420L, xqVar);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j10 = this.min_display_duration;
            float f10 = max / j10;
            float d = this.showTimerAnimated.d(currentTimeMillis < j10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float e10 = this.timerScaleAnimated.e(false, str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f);
            canvas.save();
            canvas.scale(e10, e10, centerX, centerY);
            this.timer.t(str, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            g6 g6Var = this.timer;
            g6Var.B = (int) (this.alpha * d);
            g6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(g0.L(2.0f));
            RectF rectF = g0.P;
            rectF.set(centerX - g0.L(9.0f), centerY - g0.L(9.0f), g0.L(9.0f) + centerX, g0.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, this.paint);
            float d10 = this.showCrossAnimated.d((1.0f - f10) * 360.0f > 75.0f);
            float T1 = g0.T1(centerX, g0.L(8.0f) + centerX, d);
            float T12 = g0.T1(centerY, centerY - g0.L(8.0f), d);
            float T13 = g0.T1(0.35f, 1.0f, d10) * g0.W1(d, g0.L(5.0f), g0.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d10));
            float f11 = T1 - T13;
            float f12 = T12 - T13;
            float f13 = T1 + T13;
            float f14 = T13 + T12;
            canvas.drawLine(f11, f12, f13, f14, this.paint);
            canvas.drawLine(f11, f14, f13, f12, this.paint);
            if (d > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return g0.L(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return g0.L(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        public boolean isCrossAvailable() {
            return (this.paused ? this.pausedTime : System.currentTimeMillis() - this.minusTime) - this.startTime > this.min_display_duration;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i3) {
            this.alpha = i3;
        }

        public void setColor(int i3) {
            this.timer.u(i3);
            this.paint.setColor(i3);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.timer.setColorFilter(colorFilter);
            this.paint.setColorFilter(colorFilter);
        }

        public void setPaused(boolean z10) {
            if (this.paused == z10) {
                return;
            }
            this.paused = z10;
            if (z10) {
                this.pausedTime = System.currentTimeMillis();
            } else {
                this.minusTime += System.currentTimeMillis() - this.pausedTime;
            }
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class VideoAdsCache {
        final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
        int betweenDelay;
        long loadTime;
        boolean loaded;
        final int msgId;
        int startDelay;

        public VideoAdsCache(int i3) {
            this.msgId = i3;
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i3, long j10) {
            this.currentAccount = i3;
            this.dialogId = j10;
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

    private VideoAds(int i3, long j10, int i10, fc fcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i3;
        this.dialogId = j10;
        this.msg_id = i10;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(fcVar);
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

    private void init(fc fcVar) {
        this.bulletinFactory = fcVar;
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
                hp.s1(this.currentAccount).Y3(tL_messages_sponsoredMessages.users, false);
                hp.s1(this.currentAccount).S3(tL_messages_sponsoredMessages.chats, false);
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
        g0.h3(new s(21, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$12(f60 f60Var) {
        if (!h10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        f60Var.u();
        ac acVar = this.bulletin;
        if (acVar != null) {
            acVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(bd.M0(2131754488, null)).j();
        hp.s1(this.currentAccount).o0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, f60 f60Var) {
        int i3 = this.currentAccount;
        long j10 = this.dialogId;
        fc fcVar = this.bulletinFactory;
        k0 k0Var = new k0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(f60Var);
        a aVar = new a(f60Var, 1);
        int i10 = ey0.t1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_reportSponsoredMessage, new g60(context, k0Var, j10, bArr, aVar, fcVar, dVar, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$15(f60 f60Var) {
        if (!h10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        f60Var.u();
        ac acVar = this.bulletin;
        if (acVar != null) {
            acVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(bd.M0(2131754488, null)).j();
        hp.s1(this.currentAccount).o0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$16(u10 u10Var) {
        u10Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.hp.s1(r21.currentAccount).V2) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(ac acVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, e6 e6Var, AdLayout adLayout, u10 u10Var, View view) {
        ViewGroup viewGroup;
        k0 k0Var;
        Context context2;
        int i3;
        ac acVar2 = this.bulletin;
        if (acVar2 == null || acVar2 != acVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) acVar2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        k0 k0Var2 = new k0();
        final f60 f60Var = new f60(viewGroup, k0Var2, this.bulletin.e, true, false, false);
        f60Var.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f60Var.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        f60Var.I = true;
        f60Var.s = 0;
        f60Var.t = false;
        f60Var.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            k0Var = k0Var2;
            if (!h10.i(this.currentAccount).q() && !hp.s1(this.currentAccount).D3() && !tL_sponsoredMessage.can_report) {
                final int i10 = 1;
                f60Var.c(R.drawable.msg_block2, bd.M0(2131749331, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.b.lambda$show$15(f60Var);
                                break;
                            default:
                                this.b.lambda$show$12(f60Var);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                f60Var.c(R.drawable.msg_info, bd.M0(2131754943, null), new s(23, context2, k0Var), false);
                String M0 = bd.M0(2131746244, null);
                b1 b1Var = new b1(this, context2, tL_sponsoredMessage, f60Var, 3);
                f60Var = f60Var;
                f60Var.c(R.drawable.msg_block2, M0, b1Var, false);
                if (!hp.s1(this.currentAccount).D3()) {
                    f60Var.k();
                    final int i11 = 0;
                    f60Var.c(R.drawable.msg_cancel, bd.M0(2131746328, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.b.lambda$show$15(f60Var);
                                    break;
                                default:
                                    this.b.lambda$show$12(f60Var);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (f60Var.x() > 0) {
                return;
            }
            this.currentMenu = f60Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            u10Var.a(Boolean.TRUE);
            f60Var.p = new s(22, this, u10Var);
            f60Var.Z();
            checkPopupShownCallback();
            return;
        }
        f60 J = f60Var.J();
        k0Var = k0Var2;
        y0 y0Var = new y0(0, context, k0Var, true, false);
        context2 = context;
        y0Var.setItemHeight(44);
        y0Var.j(bd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
        y0Var.getTextView().setPadding(bd.a0 ? 0 : g0.L(40.0f), 0, bd.a0 ? g0.L(40.0f) : 0, 0);
        final int i12 = 2;
        y0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) f60Var, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) f60Var, view2);
                        break;
                    default:
                        ((f60) f60Var).s();
                        break;
                }
            }
        });
        J.r(y0Var, mf.o(-1, -2));
        J.r(new c1(context2, k0Var), mf.o(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 != null && !TextUtils.equals(g0.K0(str2, false), hp.s1(this.currentAccount).V2)) {
            TextView textView = new TextView(context2);
            r6.V(textView, k6.Uc, k0Var);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView.setMaxWidth(g0.L(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(sf.c.w(parse, null, null, sf.c.a(parse.getHost()), null));
            int i13 = k6.I5;
            y a02 = k6.a0(k6.w0(i13, k0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            n6 N = r6.N(i13);
            textView.setBackground(a02);
            r6.k(textView, a02, null, N, k0Var);
            textView.setOnClickListener(new r4(this, f60Var, tL_sponsoredMessage, context2, 5));
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.messenger.video.i
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean lambda$show$8;
                    lambda$show$8 = VideoAds.lambda$show$8(TLRPC.TL_sponsoredMessage.this, view2);
                    return lambda$show$8;
                }
            });
            arrayList.add(textView);
        }
        if (tL_sponsoredMessage.sponsor_info != null) {
            TextView textView2 = new TextView(context2);
            r6.V(textView2, k6.E8, k0Var);
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView2.setMaxWidth(g0.L(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            int i14 = k6.I5;
            y a03 = k6.a0(k6.w0(i14, k0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            n6 N2 = r6.N(i14);
            textView2.setBackground(a03);
            r6.k(textView2, a03, null, N2, k0Var);
            final int i15 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        case 1:
                            VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        default:
                            ((f60) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            r6.V(textView3, k6.E8, k0Var);
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView3.setMaxWidth(g0.L(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            int i16 = k6.I5;
            y a04 = k6.a0(k6.w0(i16, e6Var), 0, 6);
            n6 N3 = r6.N(i16);
            textView3.setBackground(a04);
            r6.k(textView3, a04, null, N3, e6Var);
            final int i17 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        case 1:
                            VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        default:
                            ((f60) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView3);
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            View view2 = (View) arrayList.get(i18);
            if (i18 > 0) {
                FrameLayout frameLayout = new FrameLayout(context2);
                r6.i(k6.d7, frameLayout, k0Var);
                i3 = -1;
                LinearLayout.LayoutParams o10 = mf.o(-1, 1);
                o10.height = 1;
                J.r(frameLayout, o10);
            } else {
                i3 = -1;
            }
            J.r(view2, mf.o(i3, -2));
        }
        f60Var.c(R.drawable.msg_channel, bd.M0(2131745258, null), new y3(f60Var, J, 4), false);
        if (!h10.i(this.currentAccount).q()) {
            final int i102 = 1;
            f60Var.c(R.drawable.msg_block2, bd.M0(2131749331, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i102) {
                        case 0:
                            this.b.lambda$show$15(f60Var);
                            break;
                        default:
                            this.b.lambda$show$12(f60Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (f60Var.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        sf.c.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, hp.s1(h10.t0).d6, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            ac acVar = this.bulletin;
            if (acVar != null) {
                acVar.b();
                return;
            }
            return;
        }
        if (!h10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        ac acVar2 = this.bulletin;
        if (acVar2 != null) {
            acVar2.b();
            this.bulletin = null;
        }
        hp.s1(this.currentAccount).o0(true);
        this.bulletinFactory.c(bd.M0(2131754488, null)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(ac acVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        ac acVar2 = this.bulletin;
        if (acVar2 == null || acVar2 != acVar) {
            return;
        }
        acVar2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
        acVar2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(ac acVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        ac acVar2 = this.bulletin;
        if (acVar2 == null || acVar2 != acVar || bool.booleanValue() == zArr[0]) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        zArr[0] = booleanValue;
        closeDrawable.setPaused(booleanValue);
        if (zArr[0]) {
            this.bulletin.i(false);
            jArr[0] = System.currentTimeMillis();
            g0.r(runnable);
            return;
        }
        g0.r(runnable);
        jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
        long currentTimeMillis = (System.currentTimeMillis() - j10) - jArr2[0];
        long j11 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
        long j12 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
        if (j12 <= 0) {
            ac acVar3 = this.bulletin;
            if (acVar3 != null) {
                acVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j11 > 0) {
            g0.i3(runnable, j11);
            return;
        }
        ac acVar4 = this.bulletin;
        acVar4.j = (int) j12;
        acVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(ac acVar, boolean[] zArr) {
        ac acVar2 = this.bulletin;
        if (acVar2 == null || acVar2 != acVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        f60 f60Var = this.currentMenu;
        if (f60Var != null) {
            f60Var.u();
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
    public void lambda$show$7(f60 f60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        f60Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        sf.c.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, hp.s1(this.currentAccount).d6, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.url);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.sponsor_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremium$19(v0 v0Var) {
        if (v0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (h10.i(this.currentAccount).q() && hp.s1(this.currentAccount).E2()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = hp.s1(this.currentAccount).j1(this.dialogId);
        tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() { // from class: org.telegram.messenger.video.h
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VideoAds.this.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public static VideoAds make(int i3, long j10, int i10, fc fcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i3, j10);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i10 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i10);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i3, j10, i10, fcVar, videoAdsCache);
    }

    private void schedule() {
        g0.r(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        g0.i3(this.showRunnable, Math.max(0L, ((this.first ? this.start_delay : this.between_delay) * 1000) - (System.currentTimeMillis() - this.lastTime)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        ac acVar = this.bulletin;
        if (acVar != null) {
            acVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        e6 e6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(W, e6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.fb
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override // org.telegram.messenger.video.VideoAds.AdLayout, org.telegram.ui.Components.fb, org.telegram.ui.ActionBar.z5
            public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        k5 k5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i3 = k6.Ci;
        k5Var.i(new AdOptionsDrawable(W2, k6.w0(i3, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.ac.b(tL_sponsoredMessage.media.document), org.telegram.messenger.ac.c(w7.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.ac.i(w10, tL_sponsoredMessage.media.photo), org.telegram.messenger.ac.i(w7.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w11 = w7.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.ac.i(w11, tL_sponsoredMessage.photo), org.telegram.messenger.ac.i(w7.w(tL_sponsoredMessage.photo.sizes, 48, true, w11, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(k6.w0(i3, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new ai.d(29, this, closeDrawable));
        final ac b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final lg.y yVar = new lg.y(this, b10, tL_sponsoredMessage, 17);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        u10 u10Var = new u10() { // from class: org.telegram.messenger.video.e
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, yVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        g0.i3(yVar, tL_sponsoredMessage.min_display_duration * 1000);
        ac acVar2 = this.bulletin;
        acVar2.r = false;
        acVar2.v = new lg.y(this, b10, new boolean[1], 18);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, e6Var, adLayout, u10Var, 0));
        ac acVar3 = this.bulletin;
        g gVar = new g(0, this, tL_sponsoredMessage);
        fb fbVar = acVar3.e;
        if (fbVar != null) {
            fbVar.setOnClickListener(gVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        v0 v0Var = this.premiumSheet;
        if (v0Var != null) {
            v0Var.dismiss();
            this.premiumSheet = null;
        }
        v0 v0Var2 = new v0(new d2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.d2
            public Context getContext() {
                return g0.W(LaunchActivity.K1);
            }

            @Override // org.telegram.ui.ActionBar.d2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.d2
            public Activity getParentActivity() {
                Activity W = g0.W(t0.b);
                return W == null ? LaunchActivity.K1 : W;
            }
        }, 3, true);
        this.premiumSheet = v0Var2;
        v0Var2.n(new s(20, this, v0Var2));
        v0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        f60 f60Var = this.currentMenu;
        if (f60Var != null && f60Var.D()) {
            return true;
        }
        v0 v0Var = this.premiumSheet;
        return (v0Var == null || v0Var.J) ? false : true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        boolean z10 = r2.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z10 = r2.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z10) {
        if (this.waitingPaused == z10) {
            return;
        }
        this.waitingPaused = z10;
        g0.r(this.showRunnable);
        if (z10) {
            this.waitingTimeSince = System.currentTimeMillis();
            return;
        }
        this.lastTime += System.currentTimeMillis() - this.waitingTimeSince;
        if (this.bulletin == null) {
            schedule();
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
        f60 f60Var = this.currentMenu;
        if (f60Var != null) {
            f60Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        g0.r(this.showRunnable);
        setWaitingPaused(true);
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class AdLayout extends ya {
        public final ImageView buttonView;
        public final k9 imageView;
        private final LinearLayout linearLayout;
        public final s70 subtitleTextView;
        public final k5 titleTextView;

        public AdLayout(Context context, e6 e6Var) {
            super(context, e6Var);
            setBackground(getThemedColor(k6.tj));
            k9 k9Var = new k9(context);
            this.imageView = k9Var;
            k9Var.setRoundRadius(g0.L(48.0f));
            addView(k9Var, mf.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i3 = k6.vj;
            getThemedColor(i3);
            int i10 = k6.uj;
            getThemedColor(i10);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, mf.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            k5 k5Var = new k5(context);
            this.titleTextView = k5Var;
            k5Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            r6.Y(k5Var, i3, e6Var);
            k5Var.setTextSize(14);
            k5Var.setTypeface(g0.o());
            linearLayout.addView(k5Var);
            s70 s70Var = new s70(context, null);
            this.subtitleTextView = s70Var;
            s70Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            r6.V(s70Var, i3, e6Var);
            r6.H(s70Var, i10, e6Var);
            s70Var.setTypeface(Typeface.SANS_SERIF);
            s70Var.setTextSize(1, 13.0f);
            linearLayout.addView(s70Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = k6.Ci;
            y h02 = k6.h0(k6.r1(0.15f, getThemedColor(i11)), 7, -1);
            n6 L = r6.L(0.15f, i11);
            imageView.setBackground(h02);
            r6.k(imageView, h02, null, L, e6Var);
            addView(imageView, mf.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.fb
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(mf.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.fb
        public void onShow() {
            super.onShow();
        }

        @Override // org.telegram.ui.Components.fb, org.telegram.ui.ActionBar.z5
        public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final ly0 text = new ly0(bd.M0(2131745268, null), 11.0f, g0.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i3) {
            this.color = i3;
            Drawable g7 = p1.g(context, R.drawable.ic_ab_other);
            this.icon = g7;
            g7.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            RectF rectF = g0.P;
            rectF.set(getBounds());
            rectF.left += g0.L(4.0f);
            this.backgroundPaint.setColor(k6.r1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + g0.L(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - g0.L(12.99f), getBounds().centerY() - g0.L(5.665f), getBounds().right - g0.L(1.66f), g0.L(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return g0.L(16.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return (int) (this.text.k() + g0.L(4.0f) + g0.L(18.0f));
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i3) {
            this.alpha = i3 / 255.0f;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
