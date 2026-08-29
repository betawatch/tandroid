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
import cg.p1;
import i7.f6;
import ih.u3;
import ih.z2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import lh.h0;
import nh.b6;
import nh.r7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class VideoAds {
    private static HashMap<VideoAdsLocation, VideoAds> cached = new HashMap<>();
    private int between_delay;
    private mc bulletin;
    private tc bulletinFactory;
    private long bulletinShowTime;
    private final int currentAccount;
    private long currentBulletinPassedTime;
    private j70 currentMenu;
    private float currentMenuTranslationY;
    private final long dialogId;
    private boolean lastPopupShown;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private final int msg_id;
    private Runnable onPopupCallback;
    private p1 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 0);

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class AdLayout extends jb {
        public final ImageView buttonView;
        public final t9 imageView;
        private final LinearLayout linearLayout;
        public final y80 subtitleTextView;
        public final h5 titleTextView;

        public AdLayout(Context context, c6 c6Var) {
            super(context, c6Var);
            setBackground(getThemedColor(g6.Fi));
            t9 t9Var = new t9(context);
            this.imageView = t9Var;
            t9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(t9Var, f6.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(g6.Hi);
            int themedColor2 = getThemedColor(g6.Gi);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, f6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            h5 h5Var = new h5(context);
            this.titleTextView = h5Var;
            h5Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h5Var.setTextColor(themedColor);
            h5Var.setTextSize(14);
            h5Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(h5Var);
            y80 y80Var = new y80(context, null);
            this.subtitleTextView = y80Var;
            y80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            y80Var.setTextColor(themedColor);
            y80Var.setLinkTextColor(themedColor2);
            y80Var.setTypeface(Typeface.SANS_SERIF);
            y80Var.setTextSize(1, 13.0f);
            linearLayout.addView(y80Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(g6.f0(g6.l1(0.15f, getThemedColor(g6.Oh)), 7, -1));
            addView(imageView, f6.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.rb
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(f6.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.rb
        public void onShow() {
            super.onShow();
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final d6 showCrossAnimated;
        private final d6 showTimerAnimated;
        private final long startTime;
        private final n6 timer;
        private final d6 timerScaleAnimated;

        public CloseDrawable(View view, int i10, int i11, long j10) {
            n6 n6Var = new n6(false, true, true, false);
            this.timer = n6Var;
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
            n6Var.setCallback(view);
            n6Var.b = 17;
            n6Var.t(AndroidUtilities.dp(12.0f));
            n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
            n6Var.G = AndroidUtilities.displaySize.x;
            n6Var.r(-1);
            jr jrVar = jr.h;
            this.showCrossAnimated = new d6(view, 0L, 420L, jrVar);
            this.showTimerAnimated = new d6(view, 0L, 420L, jrVar);
            this.timerScaleAnimated = new d6(view, 0L, 420L, jrVar);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j10 = this.min_display_duration;
            float f9 = max / j10;
            float e10 = this.showTimerAnimated.e(currentTimeMillis < j10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float d = this.timerScaleAnimated.d(str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.q(str, true, true);
            this.timer.l(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            n6 n6Var = this.timer;
            n6Var.w = (int) (this.alpha * e10);
            n6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e10));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f9 * (-360.0f), false, this.paint);
            float e11 = this.showCrossAnimated.e((1.0f - f9) * 360.0f > 75.0f);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e10);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e10);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e11) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e10);
            this.paint.setAlpha((int) (this.alpha * e11));
            float f10 = lerp - lerp3;
            float f11 = lerp2 - lerp3;
            float f12 = lerp + lerp3;
            float f13 = lerp3 + lerp2;
            canvas.drawLine(f10, f11, f12, f13, this.paint);
            canvas.drawLine(f10, f13, f12, f11, this.paint);
            if (e10 > 0.0f) {
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

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    private VideoAds(int i10, long j10, int i11, tc tcVar) {
        this.lastTime = 0L;
        this.currentAccount = i10;
        this.dialogId = j10;
        this.msg_id = i11;
        this.lastTime = System.currentTimeMillis();
        init(tcVar);
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

    private void init(tc tcVar) {
        this.bulletinFactory = tcVar;
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
        AndroidUtilities.runOnUIThread(new b6(17, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$12(j70 j70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        j70Var.u();
        mc mcVar = this.bulletin;
        if (mcVar != null) {
            mcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, j70 j70Var) {
        int i10 = this.currentAccount;
        long j10 = this.dialogId;
        tc tcVar = this.bulletinFactory;
        h0 h0Var = new h0();
        int i11 = 1;
        d dVar = new d(this, i11);
        Objects.requireNonNull(j70Var);
        a aVar = new a(j70Var, i11);
        int i12 = y21.v;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reportSponsoredMessage, new k70(context, h0Var, j10, bArr, aVar, tcVar, dVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$15(j70 j70Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        j70Var.u();
        mc mcVar = this.bulletin;
        if (mcVar != null) {
            mcVar.i(true);
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
    public void lambda$show$17(mc mcVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, c6 c6Var, AdLayout adLayout, Utilities.Callback callback, View view) {
        ViewGroup viewGroup;
        Context context2;
        final j70 j70Var;
        int i10;
        mc mcVar2 = this.bulletin;
        if (mcVar2 == null || mcVar2 != mcVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) mcVar2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        h0 h0Var = new h0();
        final j70 j70Var2 = new j70(viewGroup, h0Var, this.bulletin.e, true, false, false);
        j70Var2.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j70Var2.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        j70Var2.I = true;
        j70Var2.s = 0;
        j70Var2.t = false;
        j70Var2.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            j70Var = j70Var2;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !tL_sponsoredMessage.can_report) {
                final int i11 = 1;
                j70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                    public final /* synthetic */ VideoAds b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.lambda$show$15(j70Var);
                                break;
                            default:
                                this.b.lambda$show$12(j70Var);
                                break;
                        }
                    }
                }, false);
            }
            if (tL_sponsoredMessage.can_report) {
                j70Var.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new b6(19, context2, h0Var), false);
                Context context3 = context2;
                j70 j70Var3 = j70Var;
                j70Var = j70Var3;
                j70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new androidx.car.app.utils.c(this, context3, tL_sponsoredMessage, j70Var3, 21), false);
                if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                    j70Var.k();
                    final int i12 = 0;
                    j70Var.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable(this) { // from class: org.telegram.messenger.video.c
                        public final /* synthetic */ VideoAds b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    this.b.lambda$show$15(j70Var);
                                    break;
                                default:
                                    this.b.lambda$show$12(j70Var);
                                    break;
                            }
                        }
                    }, false);
                }
            }
            if (j70Var.x() > 0) {
                return;
            }
            this.currentMenu = j70Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            callback.run(Boolean.TRUE);
            j70Var.p = new b6(this, callback);
            j70Var.Z();
            checkPopupShownCallback();
            return;
        }
        j70 J = j70Var2.J();
        g1 g1Var = new g1(0, context, h0Var, true, false);
        context2 = context;
        g1Var.setItemHeight(44);
        g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
        g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
        final int i13 = 2;
        g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) j70Var2, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) j70Var2, view2);
                        break;
                    default:
                        ((j70) j70Var2).s();
                        break;
                }
            }
        });
        J.r(g1Var, f6.n(-1, -2));
        J.r(new l1(context2, h0Var), f6.n(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 == null || TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(this.currentAccount).linkPrefix)) {
            j70Var = j70Var2;
        } else {
            TextView textView = new TextView(context2);
            textView.setTextColor(h0Var.C0(g6.gc));
            textView.setTextSize(1, 14.0f);
            textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView.setMaxWidth(AndroidUtilities.dp(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null));
            textView.setBackground(g6.Y(h0Var.C0(g6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
            j70Var = j70Var2;
            textView.setOnClickListener(new u3(this, j70Var, tL_sponsoredMessage, context2, 2));
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
            textView2.setTextColor(h0Var.C0(g6.E8));
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            textView2.setBackground(g6.Y(h0Var.C0(g6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
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
                            ((j70) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView2);
        }
        if (tL_sponsoredMessage.additional_info != null) {
            TextView textView3 = new TextView(context2);
            textView3.setTextColor(h0Var.C0(g6.E8));
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            textView3.setBackground(g6.Y(g6.v0(g6.I5, c6Var), 0, 6));
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
                            ((j70) tL_sponsoredMessage).s();
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
                frameLayout.setBackgroundColor(h0Var.C0(g6.d7));
                i10 = -1;
                LinearLayout.LayoutParams n10 = f6.n(-1, 1);
                n10.height = 1;
                J.r(frameLayout, n10);
            } else {
                i10 = -1;
            }
            J.r(view2, f6.n(i10, -2));
        }
        j70Var.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new z2(j70Var, J, 1), false);
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            final int i112 = 1;
            j70Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
                public final /* synthetic */ VideoAds b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i112) {
                        case 0:
                            this.b.lambda$show$15(j70Var);
                            break;
                        default:
                            this.b.lambda$show$12(j70Var);
                            break;
                    }
                }
            }, false);
        }
        if (tL_sponsoredMessage.can_report) {
        }
        if (j70Var.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        ye.d.r(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            mc mcVar = this.bulletin;
            if (mcVar != null) {
                mcVar.b();
                return;
            }
            return;
        }
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        mc mcVar2 = this.bulletin;
        if (mcVar2 != null) {
            mcVar2.b();
            this.bulletin = null;
        }
        MessagesController.getInstance(this.currentAccount).disableAds(true);
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(mc mcVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        mc mcVar2 = this.bulletin;
        if (mcVar2 == null || mcVar2 != mcVar) {
            return;
        }
        mcVar2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * MediaDataController.MAX_STYLE_RUNS_COUNT;
        mcVar2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(mc mcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        mc mcVar2 = this.bulletin;
        if (mcVar2 == null || mcVar2 != mcVar || bool.booleanValue() == zArr[0]) {
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
            mc mcVar3 = this.bulletin;
            if (mcVar3 != null) {
                mcVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j11 > 0) {
            AndroidUtilities.runOnUIThread(runnable, j11);
            return;
        }
        mc mcVar4 = this.bulletin;
        mcVar4.j = (int) j12;
        mcVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(mc mcVar, boolean[] zArr) {
        mc mcVar2 = this.bulletin;
        if (mcVar2 == null || mcVar2 != mcVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        j70 j70Var = this.currentMenu;
        if (j70Var != null) {
            j70Var.u();
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
    public /* synthetic */ void lambda$show$7(j70 j70Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        j70Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        ye.d.r(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
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
    public /* synthetic */ void lambda$showPremium$19(p1 p1Var) {
        if (p1Var == this.premiumSheet) {
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

    public static VideoAds make(int i10, long j10, int i11, tc tcVar) {
        tc tcVar2;
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i10, j10);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds == null || ((videoAds.msg_id != i11 || System.currentTimeMillis() - videoAds.lastTime > 180000) && videoAds.ads.isEmpty())) {
            HashMap<VideoAdsLocation, VideoAds> hashMap = cached;
            tcVar2 = tcVar;
            VideoAds videoAds2 = new VideoAds(i10, j10, i11, tcVar2);
            hashMap.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        } else {
            tcVar2 = tcVar;
        }
        videoAds.init(tcVar2);
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
        mc mcVar = this.bulletin;
        if (mcVar != null) {
            mcVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        c6 c6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(W, c6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.rb
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
        int i10 = g6.Oh;
        h5Var.i(new AdOptionsDrawable(W2, g6.v0(i10, this.bulletinFactory.c)));
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
        closeDrawable.setColor(g6.v0(i10, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new r7(2, this, closeDrawable));
        final mc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * MediaDataController.MAX_STYLE_RUNS_COUNT);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final l3.m mVar = new l3.m(this, b10, tL_sponsoredMessage, 19);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.messenger.video.e
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, mVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(mVar, tL_sponsoredMessage.min_display_duration * 1000);
        mc mcVar2 = this.bulletin;
        mcVar2.r = false;
        mcVar2.v = new l3.m(this, b10, new boolean[1], 20);
        adLayout.titleTextView.setRightDrawableOnClick(new f(this, b10, tL_sponsoredMessage, W, c6Var, adLayout, callback, 0));
        mc mcVar3 = this.bulletin;
        r7 r7Var = new r7(3, this, tL_sponsoredMessage);
        rb rbVar = mcVar3.e;
        if (rbVar != null) {
            rbVar.setOnClickListener(r7Var);
        }
        this.bulletin.j();
        logSponsoredShown(tL_sponsoredMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremium() {
        p1 p1Var = this.premiumSheet;
        if (p1Var != null) {
            p1Var.dismiss();
            this.premiumSheet = null;
        }
        p1 p1Var2 = new p1(new o2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.o2
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.C1);
            }

            @Override // org.telegram.ui.ActionBar.o2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.l50
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return findActivity == null ? LaunchActivity.C1 : findActivity;
            }
        }, 3, true);
        this.premiumSheet = p1Var2;
        p1Var2.setOnDismissListener(new b6(16, this, p1Var2));
        p1Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        j70 j70Var = this.currentMenu;
        if (j70Var != null && j70Var.D()) {
            return true;
        }
        p1 p1Var = this.premiumSheet;
        return p1Var != null && p1Var.isShown();
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
        j70 j70Var = this.currentMenu;
        if (j70Var != null) {
            j70Var.u();
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

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final zz0 text = new zz0(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
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
            this.backgroundPaint.setColor(g6.l1(this.alpha * 0.2f, this.color));
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
