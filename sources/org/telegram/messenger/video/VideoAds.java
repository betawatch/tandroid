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
import bi.q;
import di.c4;
import di.k0;
import hi.o2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import jg.f1;
import k2.e0;
import m4.v0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v21;
import tg.y0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private qc bulletin;
    private wc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private k80 currentMenu;
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

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final h6 showCrossAnimated;
        private final h6 showTimerAnimated;
        private final long startTime;
        private final r6 timer;
        private final h6 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j10) {
            r6 r6Var = new r6(false, true, true);
            this.timer = r6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j10;
            this.min_display_duration = i10 * 1000;
            this.max_display_duration = i11 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            r6Var.setCallback(view);
            r6Var.b = 17;
            r6Var.w(AndroidUtilities.dp(12.0f));
            r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
            r6Var.M = AndroidUtilities.displaySize.x;
            r6Var.u(-1);
            ds dsVar = ds.h;
            this.showCrossAnimated = new h6(view, 0L, 420L, dsVar);
            this.showTimerAnimated = new h6(view, 0L, 420L, dsVar);
            this.timerScaleAnimated = new h6(view, 0L, 420L, dsVar);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j10 = this.min_display_duration;
            float f7 = max / j10;
            float e = this.showTimerAnimated.e(currentTimeMillis < j10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float d = this.timerScaleAnimated.d(str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.t(str, true, true);
            this.timer.o(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            r6 r6Var = this.timer;
            r6Var.B = (int) (this.alpha * e);
            r6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f7 * (-360.0f), false, this.paint);
            float e10 = this.showCrossAnimated.e((1.0f - f7) * 360.0f > 75.0f);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e10) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e);
            this.paint.setAlpha((int) (this.alpha * e10));
            float f10 = lerp - lerp3;
            float f11 = lerp2 - lerp3;
            float f12 = lerp + lerp3;
            float f13 = lerp3 + lerp2;
            canvas.drawLine(f10, f11, f12, f13, this.paint);
            canvas.drawLine(f10, f13, f12, f11, this.paint);
            if (e > 0.0f) {
                this.parentView.invalidate();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        public boolean isCrossAvailable() {
            return (this.paused ? this.pausedTime : System.currentTimeMillis() - this.minusTime) - this.startTime > this.min_display_duration;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            this.alpha = i10;
        }

        public void setColor(int i10) {
            this.timer.u(i10);
            this.paint.setColor(i10);
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

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static class VideoAdsCache {
        final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
        int betweenDelay;
        long loadTime;
        boolean loaded;
        final int msgId;
        int startDelay;

        public VideoAdsCache(int i10) {
            this.msgId = i10;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i10, long j10) {
            this.currentAccount = i10;
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

    private VideoAds(int i10, long j10, int i11, wc wcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j10;
        this.msg_id = i11;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(wcVar);
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

    private void init(wc wcVar) {
        this.bulletinFactory = wcVar;
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
                MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_sponsoredMessages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_messages_sponsoredMessages.chats, false);
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
        AndroidUtilities.runOnUIThread(new e0(21, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$12(k80 k80Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        k80Var.u();
        qc qcVar = this.bulletin;
        if (qcVar != null) {
            qcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, k80 k80Var) {
        int i10 = this.currentAccount;
        long j10 = this.dialogId;
        wc wcVar = this.bulletinFactory;
        k0 k0Var = new k0();
        d dVar = new d(this, 0);
        Objects.requireNonNull(k80Var);
        a aVar = new a(k80Var, 1);
        int i11 = v21.w;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new l80(context, k0Var, j10, bArr, aVar, wcVar, dVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$15(k80 k80Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        k80Var.u();
        qc qcVar = this.bulletin;
        if (qcVar != null) {
            qcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$16(Utilities.Callback callback) {
        callback.run(Boolean.FALSE);
        this.currentMenu = null;
        checkPopupShownCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r0.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r21.currentAccount).linkPrefix) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(qc qcVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, u6 u6Var, AdLayout adLayout, Utilities.Callback callback, View view) {
        ViewGroup viewGroup;
        Context context2;
        k80 k80Var;
        int i10;
        qc qcVar2 = this.bulletin;
        if (qcVar2 == null || qcVar2 != qcVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) qcVar2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        k0 k0Var = new k0();
        final k80 k80Var2 = new k80(viewGroup, k0Var, this.bulletin.e, true, false, false);
        k80Var2.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = k80Var2.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        k80Var2.I = true;
        k80Var2.s = 0;
        k80Var2.t = false;
        k80Var2.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !tL_sponsoredMessage.can_report) {
                final int i11 = 1;
                k80Var2.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.lambda$show$15(k80Var2);
                                break;
                            default:
                                this.b.lambda$show$12(k80Var2);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                k80Var2.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new e0(23, context2, k0Var), false);
                int i12 = R.drawable.msg_block2;
                String string = LocaleController.getString(R.string.ReportAd);
                v0 v0Var = new v0(this, context2, tL_sponsoredMessage, k80Var2, 5);
                k80Var2 = k80Var2;
                k80Var2.c(i12, string, v0Var, false);
                if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                    k80Var2.k();
                    final int i13 = 0;
                    k80Var2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    this.b.lambda$show$15(k80Var2);
                                    break;
                                default:
                                    this.b.lambda$show$12(k80Var2);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (k80Var2.x() > 0) {
                return;
            }
            this.currentMenu = k80Var2;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            callback.run(Boolean.TRUE);
            k80Var2.p = new e0(22, this, callback);
            k80Var2.Z();
            checkPopupShownCallback();
            return;
        }
        k80 J = k80Var2.J();
        g1 g1Var = new g1(0, context, k0Var, true, false);
        context2 = context;
        g1Var.setItemHeight(44);
        g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
        g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
        final int i14 = 2;
        g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) k80Var2, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) k80Var2, view2);
                        break;
                    default:
                        ((k80) k80Var2).s();
                        break;
                }
            }
        });
        J.r(g1Var, gb1.r(-1, -2));
        J.r(new l1(context2, k0Var), gb1.r(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 == null || TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(this.currentAccount).linkPrefix)) {
            k80Var = J;
        } else {
            TextView textView = new TextView(context2);
            f7.V(textView, y6.gc, k0Var);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView.setMaxWidth(AndroidUtilities.dp(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null));
            int i15 = y6.I5;
            y Z = y6.Z(k0Var.g(i15), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            b7 N = f7.N(i15);
            textView.setBackground(Z);
            f7.k(textView, Z, null, N, k0Var);
            k80Var = J;
            textView.setOnClickListener(new c4(this, k80Var2, tL_sponsoredMessage, context2, 4));
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
            f7.V(textView2, y6.E8, k0Var);
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            int i16 = y6.I5;
            y Z2 = y6.Z(k0Var.g(i16), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0);
            b7 N2 = f7.N(i16);
            textView2.setBackground(Z2);
            f7.k(textView2, Z2, null, N2, k0Var);
            final int i17 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
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
                            ((k80) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            f7.V(textView3, y6.E8, k0Var);
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            int i18 = y6.I5;
            y Z3 = y6.Z(y6.w0(i18, u6Var), 0, 6);
            b7 N3 = f7.N(i18);
            textView3.setBackground(Z3);
            f7.k(textView3, Z3, null, N3, u6Var);
            final int i19 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i19) {
                        case 0:
                            VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        case 1:
                            VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        default:
                            ((k80) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView3);
        }
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            View view2 = (View) arrayList.get(i20);
            if (i20 > 0) {
                FrameLayout frameLayout = new FrameLayout(context2);
                f7.i(y6.d7, frameLayout, k0Var);
                i10 = -1;
                LinearLayout.LayoutParams r6 = gb1.r(-1, 1);
                r6.height = 1;
                k80Var.r(frameLayout, r6);
            } else {
                i10 = -1;
            }
            k80Var.r(view2, gb1.r(i10, -2));
        }
        k80Var2.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new o2(k80Var2, k80Var, 3), false);
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            final int i112 = 1;
            k80Var2.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i112) {
                        case 0:
                            this.b.lambda$show$15(k80Var2);
                            break;
                        default:
                            this.b.lambda$show$12(k80Var2);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (k80Var2.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        qf.d.q(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            qc qcVar = this.bulletin;
            if (qcVar != null) {
                qcVar.b();
                return;
            }
            return;
        }
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        qc qcVar2 = this.bulletin;
        if (qcVar2 != null) {
            qcVar2.b();
            this.bulletin = null;
        }
        MessagesController.getInstance(this.currentAccount).disableAds(true);
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(qc qcVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        qc qcVar2 = this.bulletin;
        if (qcVar2 == null || qcVar2 != qcVar) {
            return;
        }
        qcVar2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * MediaDataController.MAX_STYLE_RUNS_COUNT;
        qcVar2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(qc qcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        qc qcVar2 = this.bulletin;
        if (qcVar2 == null || qcVar2 != qcVar || bool.booleanValue() == zArr[0]) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        zArr[0] = booleanValue;
        closeDrawable.setPaused(booleanValue);
        if (zArr[0]) {
            this.bulletin.i(false);
            jArr[0] = System.currentTimeMillis();
            AndroidUtilities.cancelRunOnUIThread(runnable);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        jArr2[0] = (System.currentTimeMillis() - jArr[0]) + jArr2[0];
        long currentTimeMillis = (System.currentTimeMillis() - j10) - jArr2[0];
        long j11 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
        long j12 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
        if (j12 <= 0) {
            qc qcVar3 = this.bulletin;
            if (qcVar3 != null) {
                qcVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j11 > 0) {
            AndroidUtilities.runOnUIThread(runnable, j11);
            return;
        }
        qc qcVar4 = this.bulletin;
        qcVar4.j = (int) j12;
        qcVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(qc qcVar, boolean[] zArr) {
        qc qcVar2 = this.bulletin;
        if (qcVar2 == null || qcVar2 != qcVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        k80 k80Var = this.currentMenu;
        if (k80Var != null) {
            k80Var.u();
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
    public /* synthetic */ void lambda$show$7(k80 k80Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        k80Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        qf.d.q(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$show$8(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.url);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$9(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.sponsor_info);
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
        if (UserConfig.getInstance(this.currentAccount).isPremium() && MessagesController.getInstance(this.currentAccount).isSponsoredDisabled()) {
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_messages_getSponsoredMessages.flags = 1 | tL_messages_getSponsoredMessages.flags;
        tL_messages_getSponsoredMessages.msg_id = this.msg_id;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() { // from class: org.telegram.messenger.video.g
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VideoAds.this.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public static VideoAds make(int i10, long j10, int i11, wc wcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j10);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i11 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i11);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i10, j10, i11, wcVar, videoAdsCache);
    }

    private void schedule() {
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (!this.loaded || this.ads.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.showRunnable, Math.max(0L, ((this.first ? this.start_delay : this.between_delay) * 1000) - (System.currentTimeMillis() - this.lastTime)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void show() {
        if (this.ads.isEmpty()) {
            return;
        }
        final TLRPC.TL_sponsoredMessage tL_sponsoredMessage = this.ads.get(0);
        final long currentTimeMillis = System.currentTimeMillis() - this.currentBulletinPassedTime;
        this.bulletinShowTime = currentTimeMillis;
        qc qcVar = this.bulletin;
        if (qcVar != null) {
            qcVar.b();
            this.bulletin = null;
        }
        Context X = this.bulletinFactory.X();
        u6 u6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(X, u6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.ub
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }

            @Override // org.telegram.messenger.video.VideoAds.AdLayout, org.telegram.ui.Components.ub, org.telegram.ui.ActionBar.p6
            public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        b6 b6Var = adLayout.titleTextView;
        Context X2 = this.bulletinFactory.X();
        int i10 = y6.Oh;
        b6Var.i(new AdOptionsDrawable(X2, y6.w0(i10, this.bulletinFactory.c)));
        adLayout.subtitleTextView.setText(tL_sponsoredMessage.message);
        TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                adLayout.imageView.k(ImageLocation.getForDocument(tL_sponsoredMessage.media.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), tL_sponsoredMessage.media.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    adLayout.imageView.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_sponsoredMessage.media.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.media.photo.sizes, 48, true, closestPhotoSizeWithSize, false), tL_sponsoredMessage.media.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = tL_sponsoredMessage.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
                adLayout.imageView.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, tL_sponsoredMessage.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_sponsoredMessage.photo.sizes, 48, true, closestPhotoSizeWithSize2, false), tL_sponsoredMessage.photo), "48_48", 0L, null, null, 0);
            } else {
                adLayout.hideImage();
            }
        }
        final CloseDrawable closeDrawable = new CloseDrawable(adLayout.buttonView, tL_sponsoredMessage.min_display_duration, tL_sponsoredMessage.max_display_duration, this.currentBulletinPassedTime);
        closeDrawable.setColor(y6.w0(i10, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new q(24, this, closeDrawable));
        final qc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * MediaDataController.MAX_STYLE_RUNS_COUNT);
        this.bulletin = b10;
        b10.v = false;
        b10.i(false);
        final f1 f1Var = new f1(this, b10, tL_sponsoredMessage, 15);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.messenger.video.e
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, f1Var, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(f1Var, tL_sponsoredMessage.min_display_duration * 1000);
        qc qcVar2 = this.bulletin;
        qcVar2.s = false;
        qcVar2.w = new f1(this, b10, new boolean[1], 16);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, X, u6Var, adLayout, callback, 0));
        qc qcVar3 = this.bulletin;
        q qVar = new q(25, this, tL_sponsoredMessage);
        ub ubVar = qcVar3.e;
        if (ubVar != null) {
            ubVar.setOnClickListener(qVar);
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
        y0 y0Var2 = new y0(new r2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.r2
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.I1);
            }

            @Override // org.telegram.ui.ActionBar.r2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.r2
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return findActivity == null ? LaunchActivity.I1 : findActivity;
            }
        }, 3, true);
        this.premiumSheet = y0Var2;
        y0Var2.setOnDismissListener(new e0(20, this, y0Var2));
        y0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        k80 k80Var = this.currentMenu;
        if (k80Var != null && k80Var.D()) {
            return true;
        }
        y0 y0Var = this.premiumSheet;
        return y0Var != null && y0Var.isShown();
    }

    public void logSponsoredClicked(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        tL_messages_clickSponsoredMessage.media = false;
        tL_messages_clickSponsoredMessage.fullscreen = false;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public void logSponsoredShown(TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        if (tL_sponsoredMessage == null) {
            return;
        }
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredMessage.random_id;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
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
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
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
        k80 k80Var = this.currentMenu;
        if (k80Var != null) {
            k80Var.u();
            this.currentMenu = null;
        }
        this.bulletin = null;
        if (this.loading) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = 0;
            this.loading = false;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        setWaitingPaused(true);
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static class AdLayout extends nb {
        public final ImageView buttonView;
        public final y9 imageView;
        private final LinearLayout linearLayout;
        public final z90 subtitleTextView;
        public final b6 titleTextView;

        public AdLayout(Context context, u6 u6Var) {
            super(context, u6Var);
            setBackground(getThemedColor(y6.Fi));
            y9 y9Var = new y9(context);
            this.imageView = y9Var;
            y9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(y9Var, gb1.m(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int i10 = y6.Hi;
            getThemedColor(i10);
            int i11 = y6.Gi;
            getThemedColor(i11);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, gb1.m(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            b6 b6Var = new b6(context);
            this.titleTextView = b6Var;
            b6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            f7.Y(b6Var, i10, u6Var);
            b6Var.setTextSize(14);
            b6Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(b6Var);
            z90 z90Var = new z90(context, null);
            this.subtitleTextView = z90Var;
            z90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            f7.V(z90Var, i10, u6Var);
            f7.H(z90Var, i11, u6Var);
            z90Var.setTypeface(Typeface.SANS_SERIF);
            z90Var.setTextSize(1, 13.0f);
            linearLayout.addView(z90Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = y6.Oh;
            y g02 = y6.g0(y6.o1(0.15f, getThemedColor(i12)), 7, -1);
            b7 L = f7.L(0.15f, i12);
            imageView.setBackground(g02);
            f7.k(imageView, g02, null, L, u6Var);
            addView(imageView, gb1.m(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.ub
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(gb1.m(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.ub
        public void onShow() {
            super.onShow();
        }

        @Override // org.telegram.ui.Components.ub, org.telegram.ui.ActionBar.p6
        public /* bridge */ /* synthetic */ void addColorKeys(HashSet hashSet) {
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final q11 text = new q11(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i10) {
            this.color = i10;
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            this.icon = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            rectF.left += AndroidUtilities.dp(4.0f);
            this.backgroundPaint.setColor(y6.o1(this.alpha * 0.2f, this.color));
            canvas.drawRoundRect(rectF, rectF.height(), rectF.height(), this.backgroundPaint);
            this.text.c(rectF.left + AndroidUtilities.dp(5.0f), rectF.centerY(), this.alpha, this.color, canvas);
            this.icon.setBounds(getBounds().right - AndroidUtilities.dp(12.99f), getBounds().centerY() - AndroidUtilities.dp(5.665f), getBounds().right - AndroidUtilities.dp(1.66f), AndroidUtilities.dp(5.665f) + getBounds().centerY());
            this.icon.setAlpha((int) (this.alpha * 255.0f));
            this.icon.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(16.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return (int) (this.text.l() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(18.0f));
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            this.alpha = i10 / 255.0f;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
