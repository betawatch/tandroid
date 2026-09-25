package org.telegram.messenger.video;

import ai.a1;
import ai.f2;
import ai.o5;
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
import ei.m2;
import gg.t;
import j$.util.Objects;
import java.util.ArrayList;
import ki.h0;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j1;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t31;
import rg.x0;
import w7.y5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class VideoAds {
    private static final LruCache<VideoAdsLocation, VideoAdsCache> cached = new LruCache<>(3);
    private int between_delay;
    private qc bulletin;
    private xc bulletinFactory;
    private long bulletinShowTime;
    private final VideoAdsCache cache;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private y70 currentMenu;
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

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public static class AdLayout extends nb {
        public final ImageView buttonView;
        public final w9 imageView;
        private final LinearLayout linearLayout;
        public final n90 subtitleTextView;
        public final h5 titleTextView;

        public AdLayout(Context context, d6 d6Var) {
            super(context, d6Var);
            setBackground(getThemedColor(h6.Fi));
            w9 w9Var = new w9(context);
            this.imageView = w9Var;
            w9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(w9Var, y5.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(h6.Hi);
            int themedColor2 = getThemedColor(h6.Gi);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            h5 h5Var = new h5(context);
            this.titleTextView = h5Var;
            h5Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h5Var.setTextColor(themedColor);
            h5Var.setTextSize(14);
            h5Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(h5Var);
            n90 n90Var = new n90(context, null);
            this.subtitleTextView = n90Var;
            n90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            n90Var.setTextColor(themedColor);
            n90Var.setLinkTextColor(themedColor2);
            n90Var.setTypeface(Typeface.SANS_SERIF);
            n90Var.setTextSize(1, 13.0f);
            linearLayout.addView(n90Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(h6.f0(h6.l1(0.15f, getThemedColor(h6.Oh)), 7, -1));
            addView(imageView, y5.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.ub
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(y5.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.ub
        public void onShow() {
            super.onShow();
        }
    }

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final e6 showCrossAnimated;
        private final e6 showTimerAnimated;
        private final long startTime;
        private final o6 timer;
        private final e6 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j3) {
            o6 o6Var = new o6(false, true, true, false);
            this.timer = o6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j3;
            this.min_display_duration = i10 * 1000;
            this.max_display_duration = i11 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            o6Var.setCallback(view);
            o6Var.b = 17;
            o6Var.t(AndroidUtilities.dp(12.0f));
            o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
            o6Var.G = AndroidUtilities.displaySize.x;
            o6Var.r(-1);
            rr rrVar = rr.h;
            this.showCrossAnimated = new e6(view, 0L, 420L, rrVar);
            this.showTimerAnimated = new e6(view, 0L, 420L, rrVar);
            this.timerScaleAnimated = new e6(view, 0L, 420L, rrVar);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j3 = this.min_display_duration;
            float f7 = max / j3;
            float e = this.showTimerAnimated.e(currentTimeMillis < j3);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float d = this.timerScaleAnimated.d(str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.q(str, true, true);
            this.timer.l(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            o6 o6Var = this.timer;
            o6Var.w = (int) (this.alpha * e);
            o6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f7 * (-360.0f), false, this.paint);
            float e7 = this.showCrossAnimated.e((1.0f - f7) * 360.0f > 75.0f);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e7) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e);
            this.paint.setAlpha((int) (this.alpha * e7));
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
            this.timer.r(i10);
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

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i10, long j3) {
            this.currentAccount = i10;
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

    private VideoAds(int i10, long j3, int i11, xc xcVar, VideoAdsCache videoAdsCache) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j3;
        this.msg_id = i11;
        this.cache = videoAdsCache;
        this.lastTime = System.currentTimeMillis();
        init(xcVar);
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

    private void init(xc xcVar) {
        this.bulletinFactory = xcVar;
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
        AndroidUtilities.runOnUIThread(new h0(14, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$12(y70 y70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        y70Var.u();
        qc qcVar = this.bulletin;
        if (qcVar != null) {
            qcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, y70 y70Var) {
        int i10 = this.currentAccount;
        long j3 = this.dialogId;
        xc xcVar = this.bulletinFactory;
        a1 a1Var = new a1();
        d dVar = new d(this, 0);
        Objects.requireNonNull(y70Var);
        a aVar = new a(y70Var, 1);
        int i11 = t31.v;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new z70(context, a1Var, j3, bArr, aVar, xcVar, dVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$15(y70 y70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        y70Var.u();
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
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r19.currentAccount).linkPrefix) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$show$17(qc qcVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, d6 d6Var, AdLayout adLayout, Utilities.Callback callback, View view) {
        ViewGroup viewGroup;
        Context context2;
        final y70 y70Var;
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
        a1 a1Var = new a1();
        final y70 y70Var2 = new y70(viewGroup, a1Var, this.bulletin.e, true, false, false);
        y70Var2.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y70Var2.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        y70Var2.I = true;
        y70Var2.s = 0;
        y70Var2.t = false;
        y70Var2.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            y70Var = y70Var2;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !tL_sponsoredMessage.can_report) {
                final int i11 = 1;
                y70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.lambda$show$15(y70Var);
                                break;
                            default:
                                this.b.lambda$show$12(y70Var);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                y70Var.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new h0(16, context2, a1Var), false);
                Context context3 = context2;
                y70 y70Var3 = y70Var;
                y70Var = y70Var3;
                y70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ai.h5(this, context3, tL_sponsoredMessage, y70Var3, 29), false);
                if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                    y70Var.k();
                    final int i12 = 0;
                    y70Var.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    this.b.lambda$show$15(y70Var);
                                    break;
                                default:
                                    this.b.lambda$show$12(y70Var);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (y70Var.x() > 0) {
                return;
            }
            this.currentMenu = y70Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            callback.run(Boolean.TRUE);
            y70Var.p = new h0(15, this, callback);
            y70Var.Z();
            checkPopupShownCallback();
            return;
        }
        y70 J = y70Var2.J();
        e1 e1Var = new e1(0, context, a1Var, true, false);
        context2 = context;
        e1Var.setItemHeight(44);
        e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
        e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
        final int i13 = 2;
        e1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) y70Var2, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) y70Var2, view2);
                        break;
                    default:
                        ((y70) y70Var2).s();
                        break;
                }
            }
        });
        J.r(e1Var, y5.n(-1, -2));
        J.r(new j1(context2, a1Var), y5.n(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 == null || TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(this.currentAccount).linkPrefix)) {
            y70Var = y70Var2;
        } else {
            TextView textView = new TextView(context2);
            textView.setTextColor(a1Var.G0(h6.gc));
            textView.setTextSize(1, 14.0f);
            textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView.setMaxWidth(AndroidUtilities.dp(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null));
            textView.setBackground(h6.Y(a1Var.G0(h6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
            y70Var = y70Var2;
            textView.setOnClickListener(new o5(this, y70Var, tL_sponsoredMessage, context2, 4));
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
            textView2.setTextColor(a1Var.G0(h6.E8));
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            textView2.setBackground(h6.Y(a1Var.G0(h6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
            final int i14 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        case 1:
                            VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) tL_sponsoredMessage, view2);
                            break;
                        default:
                            ((y70) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            textView3.setTextColor(a1Var.G0(h6.E8));
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            textView3.setBackground(h6.Y(h6.v0(h6.I5, d6Var), 0, 6));
            final int i15 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
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
                            ((y70) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView3);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            View view2 = (View) arrayList.get(i16);
            if (i16 > 0) {
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setBackgroundColor(a1Var.G0(h6.d7));
                i10 = -1;
                LinearLayout.LayoutParams n10 = y5.n(-1, 1);
                n10.height = 1;
                J.r(frameLayout, n10);
            } else {
                i10 = -1;
            }
            J.r(view2, y5.n(i10, -2));
        }
        y70Var.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new m2(y70Var, J, 3), false);
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            final int i112 = 1;
            y70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i112) {
                        case 0:
                            this.b.lambda$show$15(y70Var);
                            break;
                        default:
                            this.b.lambda$show$12(y70Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (y70Var.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        nf.f.r(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
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
    public void lambda$show$4(qc qcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j3, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
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
        long currentTimeMillis = (System.currentTimeMillis() - j3) - jArr2[0];
        long j10 = (tL_sponsoredMessage.min_display_duration * 1000) - currentTimeMillis;
        long j11 = (tL_sponsoredMessage.max_display_duration * 1000) - currentTimeMillis;
        if (j11 <= 0) {
            qc qcVar3 = this.bulletin;
            if (qcVar3 != null) {
                qcVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(runnable, j10);
            return;
        }
        qc qcVar4 = this.bulletin;
        qcVar4.j = (int) j11;
        qcVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(qc qcVar, boolean[] zArr) {
        qc qcVar2 = this.bulletin;
        if (qcVar2 == null || qcVar2 != qcVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        y70 y70Var = this.currentMenu;
        if (y70Var != null) {
            y70Var.u();
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
    public /* synthetic */ void lambda$show$7(y70 y70Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        y70Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        nf.f.r(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
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

    public static VideoAds make(int i10, long j3, int i11, xc xcVar) {
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j3);
        LruCache<VideoAdsLocation, VideoAdsCache> lruCache = cached;
        VideoAdsCache videoAdsCache = lruCache.get(videoAdsLocation);
        if (videoAdsCache == null || videoAdsCache.msgId != i11 || System.currentTimeMillis() - videoAdsCache.loadTime > 180000) {
            videoAdsCache = new VideoAdsCache(i11);
            lruCache.put(videoAdsLocation, videoAdsCache);
        }
        return new VideoAds(i10, j3, i11, xcVar, videoAdsCache);
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
        Context W = this.bulletinFactory.W();
        d6 d6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(W, d6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.ub
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        h5 h5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i10 = h6.Oh;
        h5Var.i(new AdOptionsDrawable(W2, h6.v0(i10, this.bulletinFactory.c)));
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
        closeDrawable.setColor(h6.v0(i10, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new f2(14, this, closeDrawable));
        final qc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * MediaDataController.MAX_STYLE_RUNS_COUNT);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final t tVar = new t(this, b10, tL_sponsoredMessage, 28);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.messenger.video.e
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, tVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(tVar, tL_sponsoredMessage.min_display_duration * 1000);
        qc qcVar2 = this.bulletin;
        qcVar2.r = false;
        qcVar2.v = new t(this, b10, new boolean[1], 29);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, d6Var, adLayout, callback, 0));
        qc qcVar3 = this.bulletin;
        f2 f2Var = new f2(15, this, tL_sponsoredMessage);
        ub ubVar = qcVar3.e;
        if (ubVar != null) {
            ubVar.setOnClickListener(f2Var);
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
        x0 x0Var2 = new x0(new org.telegram.ui.ActionBar.m2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.m2
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.G1);
            }

            @Override // org.telegram.ui.ActionBar.m2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.m2
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return findActivity == null ? LaunchActivity.G1 : findActivity;
            }
        }, 3, true);
        this.premiumSheet = x0Var2;
        x0Var2.setOnDismissListener(new h0(13, this, x0Var2));
        x0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        y70 y70Var = this.currentMenu;
        if (y70Var != null && y70Var.D()) {
            return true;
        }
        x0 x0Var = this.premiumSheet;
        return x0Var != null && x0Var.isShown();
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
        y70 y70Var = this.currentMenu;
        if (y70Var != null) {
            y70Var.u();
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

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final t01 text = new t01(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
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
            this.backgroundPaint.setColor(h6.l1(this.alpha * 0.2f, this.color));
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
