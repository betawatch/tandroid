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
import bi.f4;
import bi.n3;
import c8.ja;
import fi.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import oi.u4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d1;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.my0;
import ug.x0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private xb bulletin;
    private cc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private m60 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private x0 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 1);

    /* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

        public CloseDrawable(View view, int i7, int i10, long j3) {
            g6 g6Var = new g6(false, true, true);
            this.timer = g6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = ns.e4;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j3;
            this.min_display_duration = i7 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            g6Var.setCallback(view);
            g6Var.b = 17;
            g6Var.w(g0.L(12.0f));
            g6Var.x(g0.o1("fonts/num.otf"));
            g6Var.N = g0.q.x;
            g6Var.u(-1);
            er erVar = er.h;
            this.showCrossAnimated = new u5(view, 0L, 420L, erVar);
            this.showTimerAnimated = new u5(view, 0L, 420L, erVar);
            this.timerScaleAnimated = new u5(view, 0L, 420L, erVar);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j3 = this.min_display_duration;
            float f10 = max / j3;
            float d = this.showTimerAnimated.d(currentTimeMillis < j3);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float e10 = this.timerScaleAnimated.e(false, str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f);
            canvas.save();
            canvas.scale(e10, e10, centerX, centerY);
            this.timer.t(str, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            g6 g6Var = this.timer;
            g6Var.C = (int) (this.alpha * d);
            g6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * d));
            this.paint.setStrokeWidth(g0.L(2.0f));
            RectF rectF = g0.P;
            rectF.set(centerX - g0.L(9.0f), centerY - g0.L(9.0f), g0.L(9.0f) + centerX, g0.L(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, this.paint);
            float d2 = this.showCrossAnimated.d((1.0f - f10) * 360.0f > 75.0f);
            float T1 = g0.T1(centerX, g0.L(8.0f) + centerX, d);
            float T12 = g0.T1(centerY, centerY - g0.L(8.0f), d);
            float T13 = g0.T1(0.35f, 1.0f, d2) * g0.W1(d, g0.L(5.0f), g0.L(3.0f));
            this.paint.setAlpha((int) (this.alpha * d2));
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
        public void setAlpha(int i7) {
            this.alpha = i7;
        }

        public void setColor(int i7) {
            this.timer.u(i7);
            this.paint.setColor(i7);
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

    /* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
    public static class VideoAdsCache {
        final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
        int betweenDelay;
        long loadTime;
        boolean loaded;
        final int msgId;
        int startDelay;

        public VideoAdsCache(int i7) {
            this.msgId = i7;
        }
    }

    /* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i7, long j3) {
            this.currentAccount = i7;
            this.dialogId = j3;
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

    private VideoAds(int i7, long j3, int i10, cc ccVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i7;
        this.dialogId = j3;
        this.msg_id = i10;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(ccVar);
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

    private void init(cc ccVar) {
        this.bulletinFactory = ccVar;
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
                np.s1(this.currentAccount).Y3(tL_messages_sponsoredMessages.users, false);
                np.s1(this.currentAccount).S3(tL_messages_sponsoredMessages.chats, false);
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
        g0.h3(new u4(4, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$12(m60 m60Var) {
        if (!m10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        m60Var.u();
        xb xbVar = this.bulletin;
        if (xbVar != null) {
            xbVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(hd.M0(2131754488, null)).j();
        np.s1(this.currentAccount).o0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, m60 m60Var) {
        int i7 = this.currentAccount;
        long j3 = this.dialogId;
        cc ccVar = this.bulletinFactory;
        i0 i0Var = new i0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(m60Var);
        a aVar = new a(m60Var, 1);
        int i10 = my0.w1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_reportSponsoredMessage, new n60(context, i0Var, j3, bArr, aVar, ccVar, dVar, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$15(m60 m60Var) {
        if (!m10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        m60Var.u();
        xb xbVar = this.bulletin;
        if (xbVar != null) {
            xbVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(hd.M0(2131754488, null)).j();
        np.s1(this.currentAccount).o0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$16(z10 z10Var) {
        z10Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.np.s1(r21.currentAccount).V2) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(xb xbVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, e6 e6Var, AdLayout adLayout, z10 z10Var, View view) {
        ViewGroup viewGroup;
        i0 i0Var;
        Context context2;
        int i7;
        xb xbVar2 = this.bulletin;
        if (xbVar2 == null || xbVar2 != xbVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) xbVar2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        i0 i0Var2 = new i0();
        final m60 m60Var = new m60(viewGroup, i0Var2, this.bulletin.e, true, false, false);
        m60Var.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m60Var.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        m60Var.I = true;
        m60Var.s = 0;
        m60Var.t = false;
        m60Var.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            i0Var = i0Var2;
            if (!m10.i(this.currentAccount).q() && !np.s1(this.currentAccount).D3() && !tL_sponsoredMessage.can_report) {
                final int i10 = 1;
                m60Var.c(R.drawable.msg_block2, hd.M0(2131749323, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.b.lambda$show$15(m60Var);
                                break;
                            default:
                                this.b.lambda$show$12(m60Var);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                m60Var.c(R.drawable.msg_info, hd.M0(2131754943, null), new u4(6, context2, i0Var), false);
                String M0 = hd.M0(2131746234, null);
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(this, context2, tL_sponsoredMessage, m60Var, 28);
                m60Var = m60Var;
                m60Var.c(R.drawable.msg_block2, M0, aVar, false);
                if (!np.s1(this.currentAccount).D3()) {
                    m60Var.k();
                    final int i11 = 0;
                    m60Var.c(R.drawable.msg_cancel, hd.M0(2131746320, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.b.lambda$show$15(m60Var);
                                    break;
                                default:
                                    this.b.lambda$show$12(m60Var);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (m60Var.x() > 0) {
                return;
            }
            this.currentMenu = m60Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            z10Var.a(Boolean.TRUE);
            m60Var.p = new u4(5, this, z10Var);
            m60Var.Z();
            checkPopupShownCallback();
            return;
        }
        m60 J = m60Var.J();
        i0Var = i0Var2;
        z0 z0Var = new z0(0, context, i0Var, true, false);
        context2 = context;
        z0Var.setItemHeight(44);
        z0Var.j(hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
        z0Var.getTextView().setPadding(hd.a0 ? 0 : g0.L(40.0f), 0, hd.a0 ? g0.L(40.0f) : 0, 0);
        final int i12 = 2;
        z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) m60Var, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) m60Var, view2);
                        break;
                    default:
                        ((m60) m60Var).s();
                        break;
                }
            }
        });
        J.r(z0Var, ja.o(-1, -2));
        J.r(new d1(context2, i0Var), ja.o(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 != null && !TextUtils.equals(g0.K0(str2, false), np.s1(this.currentAccount).V2)) {
            TextView textView = new TextView(context2);
            q6.U(textView, j6.Xc, i0Var);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView.setMaxWidth(g0.L(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null));
            int i13 = j6.I5;
            y a02 = j6.a0(j6.w0(i13, i0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            m6 M = q6.M(i13);
            textView.setBackground(a02);
            q6.j(textView, a02, null, M, i0Var);
            textView.setOnClickListener(new f4(this, m60Var, tL_sponsoredMessage, context2, 5));
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
            q6.U(textView2, j6.E8, i0Var);
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView2.setMaxWidth(g0.L(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            int i14 = j6.I5;
            y a03 = j6.a0(j6.w0(i14, i0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            m6 M2 = q6.M(i14);
            textView2.setBackground(a03);
            q6.j(textView2, a03, null, M2, i0Var);
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
                            ((m60) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            q6.U(textView3, j6.E8, i0Var);
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView3.setMaxWidth(g0.L(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            int i16 = j6.I5;
            y a04 = j6.a0(j6.w0(i16, e6Var), 0, 6);
            m6 M3 = q6.M(i16);
            textView3.setBackground(a04);
            q6.j(textView3, a04, null, M3, e6Var);
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
                            ((m60) tL_sponsoredMessage).s();
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
                q6.h(j6.d7, frameLayout, i0Var);
                i7 = -1;
                LinearLayout.LayoutParams o4 = ja.o(-1, 1);
                o4.height = 1;
                J.r(frameLayout, o4);
            } else {
                i7 = -1;
            }
            J.r(view2, ja.o(i7, -2));
        }
        m60Var.c(R.drawable.msg_channel, hd.M0(2131745248, null), new n3(m60Var, J, 4), false);
        if (!m10.i(this.currentAccount).q()) {
            final int i102 = 1;
            m60Var.c(R.drawable.msg_block2, hd.M0(2131749323, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i102) {
                        case 0:
                            this.b.lambda$show$15(m60Var);
                            break;
                        default:
                            this.b.lambda$show$12(m60Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (m60Var.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, np.s1(m10.t0).e6, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            xb xbVar = this.bulletin;
            if (xbVar != null) {
                xbVar.b();
                return;
            }
            return;
        }
        if (!m10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        xb xbVar2 = this.bulletin;
        if (xbVar2 != null) {
            xbVar2.b();
            this.bulletin = null;
        }
        np.s1(this.currentAccount).o0(true);
        this.bulletinFactory.c(hd.M0(2131754488, null)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(xb xbVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        xb xbVar2 = this.bulletin;
        if (xbVar2 == null || xbVar2 != xbVar) {
            return;
        }
        xbVar2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
        xbVar2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(xb xbVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j3, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        xb xbVar2 = this.bulletin;
        if (xbVar2 == null || xbVar2 != xbVar || bool.booleanValue() == zArr[0]) {
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
        long currentTimeMillis = (System.currentTimeMillis() - j3) - jArr2[0];
        long j10 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
        long j11 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
        if (j11 <= 0) {
            xb xbVar3 = this.bulletin;
            if (xbVar3 != null) {
                xbVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j10 > 0) {
            g0.i3(runnable, j10);
            return;
        }
        xb xbVar4 = this.bulletin;
        xbVar4.j = (int) j11;
        xbVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(xb xbVar, boolean[] zArr) {
        xb xbVar2 = this.bulletin;
        if (xbVar2 == null || xbVar2 != xbVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        m60 m60Var = this.currentMenu;
        if (m60Var != null) {
            m60Var.u();
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
    public void lambda$show$7(m60 m60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        m60Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, np.s1(this.currentAccount).e6, false, false);
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
    public /* synthetic */ void lambda$showPremium$19(x0 x0Var) {
        if (x0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (m10.i(this.currentAccount).q() && np.s1(this.currentAccount).E2()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = np.s1(this.currentAccount).j1(this.dialogId);
        tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() { // from class: org.telegram.messenger.video.h
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VideoAds.this.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public static VideoAds make(int i7, long j3, int i10, cc ccVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i7, j3);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i10 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i10);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i7, j3, i10, ccVar, videoAdsCache);
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
        xb xbVar = this.bulletin;
        if (xbVar != null) {
            xbVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        e6 e6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(W, e6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.cb
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override // org.telegram.messenger.video.VideoAds.AdLayout, org.telegram.ui.Components.cb, org.telegram.ui.ActionBar.z5
            public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        j5 j5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i7 = j6.Fi;
        j5Var.i(new AdOptionsDrawable(W2, j6.w0(i7, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, gc.b(tL_sponsoredMessage.media.document), gc.c(w7.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, gc.i(w10, tL_sponsoredMessage.media.photo), gc.i(w7.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w11 = w7.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, gc.i(w11, tL_sponsoredMessage.photo), gc.i(w7.w(tL_sponsoredMessage.photo.sizes, 48, true, w11, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(j6.w0(i7, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new e(0, this, closeDrawable));
        final xb b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final ki.n nVar = new ki.n(this, b10, tL_sponsoredMessage, 14);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        z10 z10Var = new z10() { // from class: org.telegram.messenger.video.f
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, nVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        g0.i3(nVar, tL_sponsoredMessage.min_display_duration * 1000);
        xb xbVar2 = this.bulletin;
        xbVar2.r = false;
        xbVar2.v = new ki.n(this, b10, new boolean[1], 15);
        adLayout.titleTextView.setRightDrawableOnClick(new g(this, b10, tL_sponsoredMessage, W, e6Var, adLayout, z10Var, 0));
        xb xbVar3 = this.bulletin;
        e eVar = new e(1, this, tL_sponsoredMessage);
        cb cbVar = xbVar3.e;
        if (cbVar != null) {
            cbVar.setOnClickListener(eVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        x0 x0Var = this.premiumSheet;
        if (x0Var != null) {
            x0Var.dismiss();
            this.premiumSheet = null;
        }
        x0 x0Var2 = new x0(new e2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.e2
            public Context getContext() {
                return g0.W(LaunchActivity.H1);
            }

            @Override // org.telegram.ui.ActionBar.e2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.e2
            public Activity getParentActivity() {
                Activity W = g0.W(t0.b);
                return W == null ? LaunchActivity.H1 : W;
            }
        }, 3, true);
        this.premiumSheet = x0Var2;
        x0Var2.n(new u4(3, this, x0Var2));
        x0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        m60 m60Var = this.currentMenu;
        if (m60Var != null && m60Var.D()) {
            return true;
        }
        x0 x0Var = this.premiumSheet;
        return (x0Var == null || x0Var.J) ? false : true;
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
        m60 m60Var = this.currentMenu;
        if (m60Var != null) {
            m60Var.u();
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

    /* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
    public static class AdLayout extends va {
        public final ImageView buttonView;
        public final i9 imageView;
        private final LinearLayout linearLayout;
        public final z70 subtitleTextView;
        public final j5 titleTextView;

        public AdLayout(Context context, e6 e6Var) {
            super(context, e6Var);
            setBackground(getThemedColor(j6.wj));
            i9 i9Var = new i9(context);
            this.imageView = i9Var;
            i9Var.setRoundRadius(g0.L(48.0f));
            addView(i9Var, ja.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i7 = j6.yj;
            getThemedColor(i7);
            int i10 = j6.xj;
            getThemedColor(i10);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, ja.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            j5 j5Var = new j5(context);
            this.titleTextView = j5Var;
            j5Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            q6.X(j5Var, i7, e6Var);
            j5Var.setTextSize(14);
            j5Var.setTypeface(g0.o());
            linearLayout.addView(j5Var);
            z70 z70Var = new z70(context, null);
            this.subtitleTextView = z70Var;
            z70Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            q6.U(z70Var, i7, e6Var);
            q6.G(z70Var, i10, e6Var);
            z70Var.setTypeface(Typeface.SANS_SERIF);
            z70Var.setTextSize(1, 13.0f);
            linearLayout.addView(z70Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = j6.Fi;
            y h02 = j6.h0(j6.r1(0.15f, getThemedColor(i11)), 7, -1);
            m6 K = q6.K(0.15f, i11);
            imageView.setBackground(h02);
            q6.j(imageView, h02, null, K, e6Var);
            addView(imageView, ja.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.cb
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(ja.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.cb
        public void onShow() {
            super.onShow();
        }

        @Override // org.telegram.ui.Components.cb, org.telegram.ui.ActionBar.z5
        public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
        }
    }

    /* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final oy0 text = new oy0(hd.M0(2131745258, null), 11.0f, g0.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i7) {
            this.color = i7;
            Drawable g10 = i5.c.g(context, R.drawable.ic_ab_other);
            this.icon = g10;
            g10.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            RectF rectF = g0.P;
            rectF.set(getBounds());
            rectF.left += g0.L(4.0f);
            this.backgroundPaint.setColor(j6.r1(this.alpha * 0.2f, this.color));
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
        public void setAlpha(int i7) {
            this.alpha = i7 / 255.0f;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
