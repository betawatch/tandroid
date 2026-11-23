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
import bi.a6;
import bi.s6;
import c8.na;
import fi.h0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import kg.x;
import n2.c0;
import oi.i1;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d1;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.py0;
import ug.y0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private fc bulletin;
    private kc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private x60 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private y0 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 1);

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final c6 showCrossAnimated;
        private final c6 showTimerAnimated;
        private final long startTime;
        private final m6 timer;
        private final c6 timerScaleAnimated;

        public CloseDrawable(View view, int i7, int i10, long j3) {
            m6 m6Var = new m6(false, true, true);
            this.timer = m6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = ks.e4;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j3;
            this.min_display_duration = i7 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            m6Var.setCallback(view);
            m6Var.b = 17;
            m6Var.w(g0.L(12.0f));
            m6Var.x(g0.o1("fonts/num.otf"));
            m6Var.N = g0.q.x;
            m6Var.u(-1);
            kr krVar = kr.h;
            this.showCrossAnimated = new c6(view, 0L, 420L, krVar);
            this.showTimerAnimated = new c6(view, 0L, 420L, krVar);
            this.timerScaleAnimated = new c6(view, 0L, 420L, krVar);
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
            m6 m6Var = this.timer;
            m6Var.C = (int) (this.alpha * d);
            m6Var.draw(canvas);
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

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    private VideoAds(int i7, long j3, int i10, kc kcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i7;
        this.dialogId = j3;
        this.msg_id = i10;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(kcVar);
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

    private void init(kc kcVar) {
        this.bulletinFactory = kcVar;
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
                mp.u1(this.currentAccount).f4(tL_messages_sponsoredMessages.users, false);
                mp.u1(this.currentAccount).Z3(tL_messages_sponsoredMessages.chats, false);
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
        g0.g3(new c0(11, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        g0.g(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$12(x60 x60Var) {
        if (!i10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        x60Var.v();
        fc fcVar = this.bulletin;
        if (fcVar != null) {
            fcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(gd.N0(2131754485, null)).j();
        mp.u1(this.currentAccount).p0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, x60 x60Var) {
        int i7 = this.currentAccount;
        long j3 = this.dialogId;
        kc kcVar = this.bulletinFactory;
        h0 h0Var = new h0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(x60Var);
        a aVar = new a(x60Var, 1);
        int i10 = py0.w1;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_reportSponsoredMessage, new ii.c(context, h0Var, j3, bArr, aVar, kcVar, dVar, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$15(x60 x60Var) {
        if (!i10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        x60Var.v();
        fc fcVar = this.bulletin;
        if (fcVar != null) {
            fcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(gd.N0(2131754485, null)).j();
        mp.u1(this.currentAccount).p0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$16(w10 w10Var) {
        w10Var.a(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.mp.u1(r21.currentAccount).X2) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(fc fcVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, i6 i6Var, AdLayout adLayout, w10 w10Var, View view) {
        ViewGroup viewGroup;
        h0 h0Var;
        Context context2;
        int i7;
        fc fcVar2 = this.bulletin;
        if (fcVar2 == null || fcVar2 != fcVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) fcVar2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        h0 h0Var2 = new h0();
        final x60 x60Var = new x60(viewGroup, h0Var2, this.bulletin.e, true, false, false);
        x60Var.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x60Var.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        x60Var.I = true;
        x60Var.s = 0;
        x60Var.t = false;
        x60Var.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            h0Var = h0Var2;
            if (!i10.i(this.currentAccount).q() && !mp.u1(this.currentAccount).K3() && !tL_sponsoredMessage.can_report) {
                final int i10 = 1;
                x60Var.c(R.drawable.msg_block2, gd.N0(2131749130, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.b.lambda$show$15(x60Var);
                                break;
                            default:
                                this.b.lambda$show$12(x60Var);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                x60Var.c(R.drawable.msg_info, gd.N0(2131754943, null), new c0(13, context2, h0Var), false);
                String N0 = gd.N0(2131746038, null);
                oi.h hVar = new oi.h(this, context2, tL_sponsoredMessage, x60Var, 3);
                x60Var = x60Var;
                x60Var.c(R.drawable.msg_block2, N0, hVar, false);
                if (!mp.u1(this.currentAccount).K3()) {
                    x60Var.k();
                    final int i11 = 0;
                    x60Var.c(R.drawable.msg_cancel, gd.N0(2131746124, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.b.lambda$show$15(x60Var);
                                    break;
                                default:
                                    this.b.lambda$show$12(x60Var);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (x60Var.y() > 0) {
                return;
            }
            this.currentMenu = x60Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            w10Var.a(Boolean.TRUE);
            x60Var.p = new c0(12, this, w10Var);
            x60Var.a0();
            checkPopupShownCallback();
            return;
        }
        x60 K = x60Var.K();
        h0Var = h0Var2;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, context, h0Var, true, false);
        context2 = context;
        y0Var.setItemHeight(44);
        y0Var.j(gd.N0(2131753753, null), R.drawable.msg_arrow_back, null);
        y0Var.getTextView().setPadding(gd.a0 ? 0 : g0.L(40.0f), 0, gd.a0 ? g0.L(40.0f) : 0, 0);
        final int i12 = 2;
        y0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) x60Var, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) x60Var, view2);
                        break;
                    default:
                        ((x60) x60Var).s();
                        break;
                }
            }
        });
        K.r(y0Var, na.o(-1, -2));
        K.r(new d1(context2, h0Var), na.o(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 != null && !TextUtils.equals(g0.K0(str2, false), mp.u1(this.currentAccount).X2)) {
            TextView textView = new TextView(context2);
            u6.U(textView, n6.Xc, h0Var);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView.setMaxWidth(g0.L(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null));
            int i13 = n6.I5;
            y a02 = n6.a0(n6.w0(i13, h0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            q6 M = u6.M(i13);
            textView.setBackground(a02);
            u6.j(textView, a02, null, M, h0Var);
            textView.setOnClickListener(new s6(this, x60Var, tL_sponsoredMessage, context2, 5));
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
            u6.U(textView2, n6.E8, h0Var);
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView2.setMaxWidth(g0.L(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            int i14 = n6.I5;
            y a03 = n6.a0(n6.w0(i14, h0Var), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            q6 M2 = u6.M(i14);
            textView2.setBackground(a03);
            u6.j(textView2, a03, null, M2, h0Var);
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
                            ((x60) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            u6.U(textView3, n6.E8, h0Var);
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(g0.L(18.0f), g0.L(10.0f), g0.L(18.0f), g0.L(10.0f));
            textView3.setMaxWidth(g0.L(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            int i16 = n6.I5;
            y a04 = n6.a0(n6.w0(i16, i6Var), 0, 6);
            q6 M3 = u6.M(i16);
            textView3.setBackground(a04);
            u6.j(textView3, a04, null, M3, i6Var);
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
                            ((x60) tL_sponsoredMessage).s();
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
                u6.h(n6.d7, frameLayout, h0Var);
                i7 = -1;
                LinearLayout.LayoutParams o4 = na.o(-1, 1);
                o4.height = 1;
                K.r(frameLayout, o4);
            } else {
                i7 = -1;
            }
            K.r(view2, na.o(i7, -2));
        }
        x60Var.c(R.drawable.msg_channel, gd.N0(2131745007, null), new a6(x60Var, K, 4), false);
        if (!i10.i(this.currentAccount).q()) {
            final int i102 = 1;
            x60Var.c(R.drawable.msg_block2, gd.N0(2131749130, null), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i102) {
                        case 0:
                            this.b.lambda$show$15(x60Var);
                            break;
                        default:
                            this.b.lambda$show$12(x60Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (x60Var.y() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, mp.u1(i10.t0).g6, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            fc fcVar = this.bulletin;
            if (fcVar != null) {
                fcVar.b();
                return;
            }
            return;
        }
        if (!i10.i(this.currentAccount).q()) {
            showPremium();
            return;
        }
        fc fcVar2 = this.bulletin;
        if (fcVar2 != null) {
            fcVar2.b();
            this.bulletin = null;
        }
        mp.u1(this.currentAccount).p0(true);
        this.bulletinFactory.c(gd.N0(2131754485, null)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(fc fcVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        fc fcVar2 = this.bulletin;
        if (fcVar2 == null || fcVar2 != fcVar) {
            return;
        }
        fcVar2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * 1000;
        fcVar2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(fc fcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j3, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        fc fcVar2 = this.bulletin;
        if (fcVar2 == null || fcVar2 != fcVar || bool.booleanValue() == zArr[0]) {
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
            fc fcVar3 = this.bulletin;
            if (fcVar3 != null) {
                fcVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j10 > 0) {
            g0.h3(runnable, j10);
            return;
        }
        fc fcVar4 = this.bulletin;
        fcVar4.j = (int) j11;
        fcVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(fc fcVar, boolean[] zArr) {
        fc fcVar2 = this.bulletin;
        if (fcVar2 == null || fcVar2 != fcVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        x60 x60Var = this.currentMenu;
        if (x60Var != null) {
            x60Var.v();
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
    public void lambda$show$7(x60 x60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        x60Var.v();
        logSponsoredClicked(tL_sponsoredMessage);
        vf.c.s(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, mp.u1(this.currentAccount).g6, false, false);
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
    public /* synthetic */ void lambda$showPremium$19(y0 y0Var) {
        if (y0Var == this.premiumSheet) {
            this.premiumSheet = null;
            checkPopupShownCallback();
        }
    }

    private void load() {
        if (this.loading || this.loaded) {
            return;
        }
        if (i10.i(this.currentAccount).q() && mp.u1(this.currentAccount).K2()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = mp.u1(this.currentAccount).l1(this.dialogId);
        tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() { // from class: org.telegram.messenger.video.g
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VideoAds.this.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public static VideoAds make(int i7, long j3, int i10, kc kcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i7, j3);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i10 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i10);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i7, j3, i10, kcVar, videoAdsCache);
    }

    private void schedule() {
        g0.r(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        g0.h3(this.showRunnable, Math.max(0L, ((this.first ? this.start_delay : this.between_delay) * 1000) - (System.currentTimeMillis() - this.lastTime)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        fc fcVar = this.bulletin;
        if (fcVar != null) {
            fcVar.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        i6 i6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(X, i6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.kb
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.Y(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override // org.telegram.messenger.video.VideoAds.AdLayout, org.telegram.ui.Components.kb, org.telegram.ui.ActionBar.c6
            public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        n5 n5Var = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i7 = n6.Fi;
        n5Var.i(new AdOptionsDrawable(X2, n6.w0(i7, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.fc.b(tL_sponsoredMessage.media.document), org.telegram.messenger.fc.c(w7.w(document.thumbs, 48, false, null, false), tL_sponsoredMessage.media.document));
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 48, true, null, true);
                    adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.fc.i(w10, tL_sponsoredMessage.media.photo), org.telegram.messenger.fc.i(w7.w(tL_sponsoredMessage.media.photo.sizes, 48, true, w10, false), tL_sponsoredMessage.media.photo));
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w11 = w7.w(photo2.sizes, 48, true, null, true);
                adLayout.imageView.g(0, 0L, null, "48_48", "48_48", null, org.telegram.messenger.fc.i(w11, tL_sponsoredMessage.photo), org.telegram.messenger.fc.i(w7.w(tL_sponsoredMessage.photo.sizes, 48, true, w11, false), tL_sponsoredMessage.photo));
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(n6.w0(i7, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new i1(1, this, closeDrawable));
        final fc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * 1000);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final x xVar = new x(this, b10, tL_sponsoredMessage, 20);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        w10 w10Var = new w10() { // from class: org.telegram.messenger.video.e
            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, xVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        g0.h3(xVar, tL_sponsoredMessage.min_display_duration * 1000);
        fc fcVar2 = this.bulletin;
        fcVar2.r = false;
        fcVar2.v = new x(this, b10, new boolean[1], 21);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, X, i6Var, adLayout, w10Var, 0));
        fc fcVar3 = this.bulletin;
        i1 i1Var = new i1(2, this, tL_sponsoredMessage);
        kb kbVar = fcVar3.e;
        if (kbVar != null) {
            kbVar.setOnClickListener(i1Var);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        y0 y0Var = this.premiumSheet;
        if (y0Var != null) {
            y0Var.dismiss();
            this.premiumSheet = null;
        }
        y0 y0Var2 = new y0(new g2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.g2
            public Context getContext() {
                return g0.W(LaunchActivity.H1);
            }

            @Override // org.telegram.ui.ActionBar.g2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.g2
            public Activity getParentActivity() {
                Activity W = g0.W(t0.b);
                return W == null ? LaunchActivity.H1 : W;
            }
        }, 3, true);
        this.premiumSheet = y0Var2;
        y0Var2.n(new c0(10, this, y0Var2));
        y0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        x60 x60Var = this.currentMenu;
        if (x60Var != null && x60Var.E()) {
            return true;
        }
        y0 y0Var = this.premiumSheet;
        return (y0Var == null || y0Var.J) ? false : true;
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        boolean z10 = s2.a;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        boolean z10 = s2.a;
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
        x60 x60Var = this.currentMenu;
        if (x60Var != null) {
            x60Var.v();
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

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
    public static class AdLayout extends db {
        public final ImageView buttonView;
        public final p9 imageView;
        private final LinearLayout linearLayout;
        public final j80 subtitleTextView;
        public final n5 titleTextView;

        public AdLayout(Context context, i6 i6Var) {
            super(context, i6Var);
            setBackground(getThemedColor(n6.wj));
            p9 p9Var = new p9(context);
            this.imageView = p9Var;
            p9Var.setRoundRadius(g0.L(48.0f));
            addView(p9Var, na.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i7 = n6.yj;
            getThemedColor(i7);
            int i10 = n6.xj;
            getThemedColor(i10);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, na.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            n5 n5Var = new n5(context);
            this.titleTextView = n5Var;
            n5Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            u6.X(n5Var, i7, i6Var);
            n5Var.setTextSize(14);
            n5Var.setTypeface(g0.o());
            linearLayout.addView(n5Var);
            j80 j80Var = new j80(context, null);
            this.subtitleTextView = j80Var;
            j80Var.setPadding(g0.L(4.0f), 0, g0.L(4.0f), 0);
            u6.U(j80Var, i7, i6Var);
            u6.G(j80Var, i10, i6Var);
            j80Var.setTypeface(Typeface.SANS_SERIF);
            j80Var.setTextSize(1, 13.0f);
            linearLayout.addView(j80Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = n6.Fi;
            y h02 = n6.h0(n6.r1(0.15f, getThemedColor(i11)), 7, -1);
            q6 K = u6.K(0.15f, i11);
            imageView.setBackground(h02);
            u6.j(imageView, h02, null, K, i6Var);
            addView(imageView, na.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.kb
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(na.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.kb
        public void onShow() {
            super.onShow();
        }

        @Override // org.telegram.ui.Components.kb, org.telegram.ui.ActionBar.c6
        public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
        }
    }

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final wy0 text = new wy0(gd.N0(2131745017, null), 11.0f, g0.o());
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
            this.backgroundPaint.setColor(n6.r1(this.alpha * 0.2f, this.color));
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
