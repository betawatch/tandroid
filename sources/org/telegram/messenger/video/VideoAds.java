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
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.s0;
import bi.u1;
import bi.z4;
import fi.m2;
import hg.t;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import ji.b5;
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
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e41;
import sg.a1;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class VideoAds {
    private static HashMap<VideoAdsLocation, VideoAds> cached = new HashMap<>();
    private int between_delay;
    private qc bulletin;
    private yc bulletinFactory;
    private long bulletinShowTime;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private n70 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private a1 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 0);

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class AdLayout extends nb {
        public final ImageView buttonView;
        public final x9 imageView;
        private final LinearLayout linearLayout;
        public final d90 subtitleTextView;
        public final j5 titleTextView;

        public AdLayout(Context context, f6 f6Var) {
            super(context, f6Var);
            setBackground(getThemedColor(j6.Fi));
            x9 x9Var = new x9(context);
            this.imageView = x9Var;
            x9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(x9Var, x5.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(j6.Hi);
            int themedColor2 = getThemedColor(j6.Gi);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            j5 j5Var = new j5(context);
            this.titleTextView = j5Var;
            j5Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            j5Var.setTextColor(themedColor);
            j5Var.setTextSize(14);
            j5Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(j5Var);
            d90 d90Var = new d90(context, null);
            this.subtitleTextView = d90Var;
            d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            d90Var.setTextColor(themedColor);
            d90Var.setLinkTextColor(themedColor2);
            d90Var.setTypeface(Typeface.SANS_SERIF);
            d90Var.setTextSize(1, 13.0f);
            linearLayout.addView(d90Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(j6.f0(j6.l1(0.15f, getThemedColor(j6.Oh)), 7, -1));
            addView(imageView, x5.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.ub
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(x5.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.ub
        public void onShow() {
            super.onShow();
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        private final p6 timer;
        private final e6 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j3) {
            p6 p6Var = new p6(false, true, true, false);
            this.timer = p6Var;
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
            p6Var.setCallback(view);
            p6Var.b = 17;
            p6Var.t(AndroidUtilities.dp(12.0f));
            p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
            p6Var.G = AndroidUtilities.displaySize.x;
            p6Var.r(-1);
            pr prVar = pr.h;
            this.showCrossAnimated = new e6(view, 0L, 420L, prVar);
            this.showTimerAnimated = new e6(view, 0L, 420L, prVar);
            this.timerScaleAnimated = new e6(view, 0L, 420L, prVar);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j3 = this.min_display_duration;
            float f7 = max / j3;
            float e7 = this.showTimerAnimated.e(currentTimeMillis < j3);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float d = this.timerScaleAnimated.d(str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.q(str, true, true);
            this.timer.l(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            p6 p6Var = this.timer;
            p6Var.w = (int) (this.alpha * e7);
            p6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e7));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f7 * (-360.0f), false, this.paint);
            float e10 = this.showCrossAnimated.e((1.0f - f7) * 360.0f > 75.0f);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e7);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e7);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e10) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e7);
            this.paint.setAlpha((int) (this.alpha * e10));
            float f10 = lerp - lerp3;
            float f11 = lerp2 - lerp3;
            float f12 = lerp + lerp3;
            float f13 = lerp3 + lerp2;
            canvas.drawLine(f10, f11, f12, f13, this.paint);
            canvas.drawLine(f10, f13, f12, f11, this.paint);
            if (e7 > 0.0f) {
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    private VideoAds(int i10, long j3, int i11, yc ycVar) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j3;
        this.msg_id = i11;
        this.lastTime = System.currentTimeMillis();
        init(ycVar);
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
        cached.clear();
    }

    private void init(yc ycVar) {
        this.bulletinFactory = ycVar;
        if (this.currentBulletinPassedTime <= 0) {
            this.lastTime = System.currentTimeMillis();
            if (this.waitingPaused) {
                this.waitingTimeSince = System.currentTimeMillis();
            }
            this.first = true;
        }
        if (this.loaded) {
            schedule();
        } else {
            load();
        }
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
            }
            this.loaded = true;
            this.loading = false;
            schedule();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new b5(15, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$12(n70 n70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        n70Var.u();
        qc qcVar = this.bulletin;
        if (qcVar != null) {
            qcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, n70 n70Var) {
        int i10 = this.currentAccount;
        long j3 = this.dialogId;
        yc ycVar = this.bulletinFactory;
        s0 s0Var = new s0();
        int i11 = 1;
        d dVar = new d(this, i11);
        Objects.requireNonNull(n70Var);
        a aVar = new a(n70Var, i11);
        int i12 = e41.v;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new o70(context, s0Var, j3, bArr, aVar, ycVar, dVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$15(n70 n70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        n70Var.u();
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
    public void lambda$show$17(qc qcVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, f6 f6Var, AdLayout adLayout, Utilities.Callback callback, View view) {
        ViewGroup viewGroup;
        Context context2;
        final n70 n70Var;
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
        s0 s0Var = new s0();
        final n70 n70Var2 = new n70(viewGroup, s0Var, this.bulletin.e, true, false, false);
        n70Var2.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n70Var2.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        n70Var2.I = true;
        n70Var2.s = 0;
        n70Var2.t = false;
        n70Var2.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            n70Var = n70Var2;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !tL_sponsoredMessage.can_report) {
                final int i11 = 1;
                n70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.lambda$show$15(n70Var);
                                break;
                            default:
                                this.b.lambda$show$12(n70Var);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                n70Var.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new b5(17, context2, s0Var), false);
                Context context3 = context2;
                n70 n70Var3 = n70Var;
                n70Var = n70Var3;
                n70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new androidx.car.app.utils.b(this, context3, tL_sponsoredMessage, n70Var3, 28), false);
                if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                    n70Var.k();
                    final int i12 = 0;
                    n70Var.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    this.b.lambda$show$15(n70Var);
                                    break;
                                default:
                                    this.b.lambda$show$12(n70Var);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (n70Var.x() > 0) {
                return;
            }
            this.currentMenu = n70Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            callback.run(Boolean.TRUE);
            n70Var.p = new b5(16, this, callback);
            n70Var.Z();
            checkPopupShownCallback();
            return;
        }
        n70 J = n70Var2.J();
        f1 f1Var = new f1(0, context, s0Var, true, false);
        context2 = context;
        f1Var.setItemHeight(44);
        f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
        f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
        final int i13 = 2;
        f1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) n70Var2, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) n70Var2, view2);
                        break;
                    default:
                        ((n70) n70Var2).s();
                        break;
                }
            }
        });
        J.r(f1Var, x5.n(-1, -2));
        J.r(new k1(context2, s0Var), x5.n(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 == null || TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(this.currentAccount).linkPrefix)) {
            n70Var = n70Var2;
        } else {
            TextView textView = new TextView(context2);
            textView.setTextColor(s0Var.G0(j6.gc));
            textView.setTextSize(1, 14.0f);
            textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView.setMaxWidth(AndroidUtilities.dp(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(of.f.v(parse, null, null, of.f.a(parse.getHost()), null));
            textView.setBackground(j6.Y(s0Var.G0(j6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
            n70Var = n70Var2;
            textView.setOnClickListener(new z4(this, n70Var, tL_sponsoredMessage, context2, 4));
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
            textView2.setTextColor(s0Var.G0(j6.E8));
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            textView2.setBackground(j6.Y(s0Var.G0(j6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
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
                            ((n70) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            textView3.setTextColor(s0Var.G0(j6.E8));
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            textView3.setBackground(j6.Y(j6.v0(j6.I5, f6Var), 0, 6));
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
                            ((n70) tL_sponsoredMessage).s();
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
                frameLayout.setBackgroundColor(s0Var.G0(j6.d7));
                i10 = -1;
                LinearLayout.LayoutParams n10 = x5.n(-1, 1);
                n10.height = 1;
                J.r(frameLayout, n10);
            } else {
                i10 = -1;
            }
            J.r(view2, x5.n(i10, -2));
        }
        n70Var.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new m2(n70Var, J, 3), false);
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            final int i112 = 1;
            n70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i112) {
                        case 0:
                            this.b.lambda$show$15(n70Var);
                            break;
                        default:
                            this.b.lambda$show$12(n70Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (n70Var.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        of.f.r(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
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
        n70 n70Var = this.currentMenu;
        if (n70Var != null) {
            n70Var.u();
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
    public /* synthetic */ void lambda$show$7(n70 n70Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        n70Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        of.f.r(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
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
    public /* synthetic */ void lambda$showPremium$19(a1 a1Var) {
        if (a1Var == this.premiumSheet) {
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

    public static VideoAds make(int i10, long j3, int i11, yc ycVar) {
        yc ycVar2;
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j3);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds == null || ((videoAds.msg_id != i11 || System.currentTimeMillis() - videoAds.lastTime > 180000) && videoAds.ads.isEmpty())) {
            HashMap<VideoAdsLocation, VideoAds> hashMap = cached;
            ycVar2 = ycVar;
            VideoAds videoAds2 = new VideoAds(i10, j3, i11, ycVar2);
            hashMap.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        } else {
            ycVar2 = ycVar;
        }
        videoAds.init(ycVar2);
        return videoAds;
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
        f6 f6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(W, f6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.ub
            public void updatePosition() {
                super.updatePosition();
                if (VideoAds.this.currentMenu != null) {
                    VideoAds.this.currentMenu.X(getTranslationY() - VideoAds.this.currentMenuTranslationY);
                }
            }
        };
        adLayout.titleTextView.k(tL_sponsoredMessage.title);
        j5 j5Var = adLayout.titleTextView;
        Context W2 = this.bulletinFactory.W();
        int i10 = j6.Oh;
        j5Var.i(new AdOptionsDrawable(W2, j6.v0(i10, this.bulletinFactory.c)));
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
        closeDrawable.setColor(j6.v0(i10, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new u1(14, this, closeDrawable));
        final qc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * MediaDataController.MAX_STYLE_RUNS_COUNT);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final t tVar = new t(this, b10, tL_sponsoredMessage, 25);
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
        qcVar2.v = new t(this, b10, new boolean[1], 26);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, f6Var, adLayout, callback, 0));
        qc qcVar3 = this.bulletin;
        u1 u1Var = new u1(15, this, tL_sponsoredMessage);
        ub ubVar = qcVar3.e;
        if (ubVar != null) {
            ubVar.setOnClickListener(u1Var);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        a1 a1Var = this.premiumSheet;
        if (a1Var != null) {
            a1Var.dismiss();
            this.premiumSheet = null;
        }
        a1 a1Var2 = new a1(new n2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.n2
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.G1);
            }

            @Override // org.telegram.ui.ActionBar.n2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.n2
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return findActivity == null ? LaunchActivity.G1 : findActivity;
            }
        }, 3, true);
        this.premiumSheet = a1Var2;
        a1Var2.setOnDismissListener(new b5(14, this, a1Var2));
        a1Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        n70 n70Var = this.currentMenu;
        if (n70Var != null && n70Var.D()) {
            return true;
        }
        a1 a1Var = this.premiumSheet;
        return a1Var != null && a1Var.isShown();
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
        n70 n70Var = this.currentMenu;
        if (n70Var != null) {
            n70Var.u();
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final f01 text = new f01(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
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
            this.backgroundPaint.setColor(j6.l1(this.alpha * 0.2f, this.color));
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
