package org.telegram.messenger.video;

import ai.d0;
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
import bi.r;
import c8.ha;
import di.i0;
import di.u3;
import hi.h2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import li.j3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d1;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oy0;
import ug.w0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private cc bulletin;
    private hc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private k60 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private w0 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 1);

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final w5 showCrossAnimated;
        private final w5 showTimerAnimated;
        private final long startTime;
        private final i6 timer;
        private final w5 timerScaleAnimated;

        public CloseDrawable(View view, int i7, int i10, long j3) {
            i6 i6Var = new i6(false, true, true);
            this.timer = i6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = qs.e4;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j3;
            this.min_display_duration = i7 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            i6Var.setCallback(view);
            i6Var.b = 17;
            i6Var.w(g0.L(12.0f));
            i6Var.x(g0.o1("fonts/num.otf"));
            i6Var.M = g0.q.x;
            i6Var.u(-1);
            xq xqVar = xq.h;
            this.showCrossAnimated = new w5(view, 0L, 420L, xqVar);
            this.showTimerAnimated = new w5(view, 0L, 420L, xqVar);
            this.timerScaleAnimated = new w5(view, 0L, 420L, xqVar);
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
            i6 i6Var = this.timer;
            i6Var.B = (int) (this.alpha * d);
            i6Var.draw(canvas);
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

        public void setPaused(boolean z9) {
            if (this.paused == z9) {
                return;
            }
            this.paused = z9;
            if (z9) {
                this.pausedTime = System.currentTimeMillis();
            } else {
                this.minusTime += System.currentTimeMillis() - this.pausedTime;
            }
        }
    }

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    private VideoAds(int i7, long j3, int i10, hc hcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i7;
        this.dialogId = j3;
        this.msg_id = i10;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(hcVar);
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

    private void init(hc hcVar) {
        this.bulletinFactory = hcVar;
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
                qp.s1(this.currentAccount).Y3(tL_messages_sponsoredMessages.users, false);
                qp.s1(this.currentAccount).S3(tL_messages_sponsoredMessages.chats, false);
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
        g0.h3(new j3(16, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$12(k60 k60Var) {
        if (!p10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        k60Var.u();
        cc ccVar = this.bulletin;
        if (ccVar != null) {
            ccVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(hd.M0(2131754488, null)).j();
        qp.s1(this.currentAccount).o0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, k60 k60Var) {
        int i7 = this.currentAccount;
        long j3 = this.dialogId;
        hc hcVar = this.bulletinFactory;
        i0 i0Var = new i0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(k60Var);
        a aVar = new a(k60Var, 1);
        int i10 = oy0.s1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_reportSponsoredMessage, new l60(context, i0Var, j3, bArr, aVar, hcVar, dVar, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$15(k60 k60Var) {
        if (!p10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        k60Var.u();
        cc ccVar = this.bulletin;
        if (ccVar != null) {
            ccVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(hd.M0(2131754488, null)).j();
        qp.s1(this.currentAccount).o0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$16(c20 c20Var) {
        c20Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.qp.s1(r21.currentAccount).U2) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(cc ccVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, f6 f6Var, AdLayout adLayout, c20 c20Var, View view) {
        ViewGroup viewGroup;
        i0 i0Var;
        Context context2;
        int i7;
        cc ccVar2 = this.bulletin;
        if (ccVar2 == null || ccVar2 != ccVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) ccVar2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        i0 i0Var2 = new i0();
        final k60 k60Var = new k60(viewGroup, i0Var2, this.bulletin.e, true, false, false);
        k60Var.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = k60Var.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        k60Var.I = true;
        k60Var.s = 0;
        k60Var.t = false;
        k60Var.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            i0Var = i0Var2;
            if (!p10.i(this.currentAccount).q() && !qp.s1(this.currentAccount).D3() && !tL_sponsoredMessage.can_report) {
                final int i10 = 1;
                k60Var.c(R.drawable.msg_block2, hd.M0(2131749322, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.b.lambda$show$15(k60Var);
                                break;
                            default:
                                this.b.lambda$show$12(k60Var);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                k60Var.c(R.drawable.msg_info, hd.M0(2131754943, null), new j3(18, context2, i0Var), false);
                String M0 = hd.M0(2131746235, null);
                d0 d0Var = new d0(this, context2, tL_sponsoredMessage, k60Var, 27);
                k60Var = k60Var;
                k60Var.c(R.drawable.msg_block2, M0, d0Var, false);
                if (!qp.s1(this.currentAccount).D3()) {
                    k60Var.k();
                    final int i11 = 0;
                    k60Var.c(R.drawable.msg_cancel, hd.M0(2131746319, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.b.lambda$show$15(k60Var);
                                    break;
                                default:
                                    this.b.lambda$show$12(k60Var);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (k60Var.x() > 0) {
                return;
            }
            this.currentMenu = k60Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            c20Var.a(Boolean.TRUE);
            k60Var.p = new j3(17, this, c20Var);
            k60Var.Z();
            checkPopupShownCallback();
            return;
        }
        k60 J = k60Var.J();
        i0Var = i0Var2;
        z0 z0Var = new z0(0, context, i0Var, true, false);
        context2 = context;
        z0Var.setItemHeight(44);
        z0Var.j(hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
        z0Var.getTextView().setPadding(hd.a0 ? 0 : g0.L(40.0f), 0, hd.a0 ? g0.L(40.0f) : 0, 0);
        final int i12 = 2;
        z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) k60Var, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) k60Var, view2);
                        break;
                    default:
                        ((k60) k60Var).s();
                        break;
                }
            }
        });
        J.r(z0Var, ha.o(-1, -2));
        J.r(new d1(context2, i0Var), ha.o(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 != null && !TextUtils.equals(g0.K0(str2, false), qp.s1(this.currentAccount).U2)) {
            TextView textView = new TextView(context2);
            r6.V(textView, k6.Uc, i0Var);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView.setMaxWidth(g0.L(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null));
            int i13 = k6.I5;
            y a02 = k6.a0(k6.w0(i13, i0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            n6 N = r6.N(i13);
            textView.setBackground(a02);
            r6.k(textView, a02, null, N, i0Var);
            textView.setOnClickListener(new u3(this, k60Var, tL_sponsoredMessage, context2, 4));
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.messenger.video.h
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
            r6.V(textView2, k6.E8, i0Var);
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView2.setMaxWidth(g0.L(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            int i14 = k6.I5;
            y a03 = k6.a0(k6.w0(i14, i0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            n6 N2 = r6.N(i14);
            textView2.setBackground(a03);
            r6.k(textView2, a03, null, N2, i0Var);
            final int i15 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
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
                            ((k60) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            r6.V(textView3, k6.E8, i0Var);
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView3.setMaxWidth(g0.L(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            int i16 = k6.I5;
            y a04 = k6.a0(k6.w0(i16, f6Var), 0, 6);
            n6 N3 = r6.N(i16);
            textView3.setBackground(a04);
            r6.k(textView3, a04, null, N3, f6Var);
            final int i17 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
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
                            ((k60) tL_sponsoredMessage).s();
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
                r6.i(k6.d7, frameLayout, i0Var);
                i7 = -1;
                LinearLayout.LayoutParams o4 = ha.o(-1, 1);
                o4.height = 1;
                J.r(frameLayout, o4);
            } else {
                i7 = -1;
            }
            J.r(view2, ha.o(i7, -2));
        }
        k60Var.c(R.drawable.msg_channel, hd.M0(2131745249, null), new h2(k60Var, J, 3), false);
        if (!p10.i(this.currentAccount).q()) {
            final int i102 = 1;
            k60Var.c(R.drawable.msg_block2, hd.M0(2131749322, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i102) {
                        case 0:
                            this.b.lambda$show$15(k60Var);
                            break;
                        default:
                            this.b.lambda$show$12(k60Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (k60Var.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, qp.s1(p10.s0).d6, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            cc ccVar = this.bulletin;
            if (ccVar != null) {
                ccVar.b();
                return;
            }
            return;
        }
        if (!p10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        cc ccVar2 = this.bulletin;
        if (ccVar2 != null) {
            ccVar2.b();
            this.bulletin = null;
        }
        qp.s1(this.currentAccount).o0(true);
        this.bulletinFactory.c(hd.M0(2131754488, null)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(cc ccVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        cc ccVar2 = this.bulletin;
        if (ccVar2 == null || ccVar2 != ccVar) {
            return;
        }
        ccVar2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
        ccVar2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(cc ccVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j3, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        cc ccVar2 = this.bulletin;
        if (ccVar2 == null || ccVar2 != ccVar || bool.booleanValue() == zArr[0]) {
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
            cc ccVar3 = this.bulletin;
            if (ccVar3 != null) {
                ccVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j10 > 0) {
            g0.i3(runnable, j10);
            return;
        }
        cc ccVar4 = this.bulletin;
        ccVar4.j = (int) j11;
        ccVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(cc ccVar, boolean[] zArr) {
        cc ccVar2 = this.bulletin;
        if (ccVar2 == null || ccVar2 != ccVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        k60 k60Var = this.currentMenu;
        if (k60Var != null) {
            k60Var.u();
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
    public void lambda$show$7(k60 k60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        k60Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, qp.s1(this.currentAccount).d6, false, false);
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
    public /* synthetic */ void lambda$showPremium$19(w0 w0Var) {
        if (w0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (p10.i(this.currentAccount).q() && qp.s1(this.currentAccount).E2()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = qp.s1(this.currentAccount).j1(this.dialogId);
        tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() { // from class: org.telegram.messenger.video.g
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VideoAds.this.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public static VideoAds make(int i7, long j3, int i10, hc hcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i7, j3);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i10 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i10);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i7, j3, i10, hcVar, videoAdsCache);
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
        cc ccVar = this.bulletin;
        if (ccVar != null) {
            ccVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        f6 f6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(W, f6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.gb
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override // org.telegram.messenger.video.VideoAds.AdLayout, org.telegram.ui.Components.gb, org.telegram.ui.ActionBar.a6
            public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        k5 k5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i7 = k6.Ci;
        k5Var.i(new AdOptionsDrawable(W2, k6.w0(i7, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.hc.b(tL_sponsoredMessage.media.document), org.telegram.messenger.hc.c(w7.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.hc.i(w10, tL_sponsoredMessage.media.photo), org.telegram.messenger.hc.i(w7.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w11 = w7.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.hc.i(w11, tL_sponsoredMessage.photo), org.telegram.messenger.hc.i(w7.w(tL_sponsoredMessage.photo.sizes, 48, true, w11, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(k6.w0(i7, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new r(23, this, closeDrawable));
        final cc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final l2.z0 z0Var = new l2.z0(this, b10, tL_sponsoredMessage, 13);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        c20 c20Var = new c20() { // from class: org.telegram.messenger.video.e
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, z0Var, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        g0.i3(z0Var, tL_sponsoredMessage.min_display_duration * 1000);
        cc ccVar2 = this.bulletin;
        ccVar2.r = false;
        ccVar2.v = new l2.z0(this, b10, new boolean[1], 14);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, f6Var, adLayout, c20Var, 0));
        cc ccVar3 = this.bulletin;
        r rVar = new r(24, this, tL_sponsoredMessage);
        gb gbVar = ccVar3.e;
        if (gbVar != null) {
            gbVar.setOnClickListener(rVar);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        w0 w0Var = this.premiumSheet;
        if (w0Var != null) {
            w0Var.dismiss();
            this.premiumSheet = null;
        }
        w0 w0Var2 = new w0(new f2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.f2
            public Context getContext() {
                return g0.W(LaunchActivity.G1);
            }

            @Override // org.telegram.ui.ActionBar.f2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.f2
            public Activity getParentActivity() {
                Activity W = g0.W(t0.b);
                return W == null ? LaunchActivity.G1 : W;
            }
        }, 3, true);
        this.premiumSheet = w0Var2;
        w0Var2.n(new j3(15, this, w0Var2));
        w0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        k60 k60Var = this.currentMenu;
        if (k60Var != null && k60Var.D()) {
            return true;
        }
        w0 w0Var = this.premiumSheet;
        return (w0Var == null || w0Var.I) ? false : true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        boolean z9 = r2.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z9 = r2.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setPauseOnPopupCallback(Runnable runnable) {
        this.onPopupCallback = runnable;
    }

    public void setWaitingPaused(boolean z9) {
        if (this.waitingPaused == z9) {
            return;
        }
        this.waitingPaused = z9;
        g0.r(this.showRunnable);
        if (z9) {
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
        k60 k60Var = this.currentMenu;
        if (k60Var != null) {
            k60Var.u();
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

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static class AdLayout extends za {
        public final ImageView buttonView;
        public final l9 imageView;
        private final LinearLayout linearLayout;
        public final w70 subtitleTextView;
        public final k5 titleTextView;

        public AdLayout(Context context, f6 f6Var) {
            super(context, f6Var);
            setBackground(getThemedColor(k6.tj));
            l9 l9Var = new l9(context);
            this.imageView = l9Var;
            l9Var.setRoundRadius(g0.L(48.0f));
            addView(l9Var, ha.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i7 = k6.vj;
            getThemedColor(i7);
            int i10 = k6.uj;
            getThemedColor(i10);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            k5 k5Var = new k5(context);
            this.titleTextView = k5Var;
            k5Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            r6.Y(k5Var, i7, f6Var);
            k5Var.setTextSize(14);
            k5Var.setTypeface(g0.o());
            linearLayout.addView(k5Var);
            w70 w70Var = new w70(context, null);
            this.subtitleTextView = w70Var;
            w70Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            r6.V(w70Var, i7, f6Var);
            r6.H(w70Var, i10, f6Var);
            w70Var.setTypeface(Typeface.SANS_SERIF);
            w70Var.setTextSize(1, 13.0f);
            linearLayout.addView(w70Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = k6.Ci;
            y h02 = k6.h0(k6.r1(0.15f, getThemedColor(i11)), 7, -1);
            n6 L = r6.L(0.15f, i11);
            imageView.setBackground(h02);
            r6.k(imageView, h02, null, L, f6Var);
            addView(imageView, ha.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.gb
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(ha.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.gb
        public void onShow() {
            super.onShow();
        }

        @Override // org.telegram.ui.Components.gb, org.telegram.ui.ActionBar.a6
        public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
        }
    }

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final ly0 text = new ly0(hd.M0(2131745259, null), 11.0f, g0.o());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i7) {
            this.color = i7;
            Drawable h = jg.g.h(context, R.drawable.ic_ab_other);
            this.icon = h;
            h.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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
        public void setAlpha(int i7) {
            this.alpha = i7 / 255.0f;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
