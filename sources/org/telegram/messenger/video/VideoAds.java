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
import fh.g4;
import fh.k3;
import g7.e6;
import ih.j0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import kh.o8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y21;
import zf.x0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class VideoAds {
    private static HashMap<VideoAdsLocation, VideoAds> cached = new HashMap<>();
    private int between_delay;
    private gc bulletin;
    private oc bulletinFactory;
    private long bulletinShowTime;
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
    private x0 premiumSheet;
    private int requestId;
    private int start_delay;
    public boolean videoWasPlaying;
    private boolean waitingPaused;
    private long waitingTimeSince;
    private final ArrayList<TLRPC.TL_sponsoredMessage> ads = new ArrayList<>();
    private boolean first = true;
    private final Runnable showRunnable = new d(this, 0);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class AdLayout extends eb {
        public final ImageView buttonView;
        public final o9 imageView;
        private final LinearLayout linearLayout;
        public final l80 subtitleTextView;
        public final h5 titleTextView;

        public AdLayout(Context context, b6 b6Var) {
            super(context, b6Var);
            setBackground(getThemedColor(f6.Fi));
            o9 o9Var = new o9(context);
            this.imageView = o9Var;
            o9Var.setRoundRadius(AndroidUtilities.dp(48.0f));
            addView(o9Var, e6.i(36.0f, 36.0f, 8388627, 9.0f, 0.0f, 0.0f, 0.0f));
            int themedColor = getThemedColor(f6.Hi);
            int themedColor2 = getThemedColor(f6.Gi);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, e6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 54.0f, 8.0f));
            h5 h5Var = new h5(context);
            this.titleTextView = h5Var;
            h5Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h5Var.setTextColor(themedColor);
            h5Var.setTextSize(14);
            h5Var.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(h5Var);
            l80 l80Var = new l80(context, null);
            this.subtitleTextView = l80Var;
            l80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l80Var.setTextColor(themedColor);
            l80Var.setLinkTextColor(themedColor2);
            l80Var.setTypeface(Typeface.SANS_SERIF);
            l80Var.setTextSize(1, 13.0f);
            linearLayout.addView(l80Var);
            ImageView imageView = new ImageView(context);
            this.buttonView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(f6.f0(f6.l1(0.15f, getThemedColor(f6.Oh)), 7, -1));
            addView(imageView, e6.i(32.0f, 32.0f, 8388629, 0.0f, 0.0f, 11.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.lb
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            this.linearLayout.setLayoutParams(e6.i(-2.0f, -2.0f, 8388627, 10.0f, 8.0f, 54.0f, 8.0f));
        }

        @Override // org.telegram.ui.Components.lb
        public void onShow() {
            super.onShow();
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class CloseDrawable extends Drawable {
        private int alpha;
        private final long max_display_duration;
        private final long min_display_duration;
        private long minusTime;
        private final Paint paint;
        private final View parentView;
        private boolean paused;
        private long pausedTime;
        private final y5 showCrossAnimated;
        private final y5 showTimerAnimated;
        private final long startTime;
        private final i6 timer;
        private final y5 timerScaleAnimated;

        public CloseDrawable(View view, int i9, int i10, long j10) {
            i6 i6Var = new i6(false, true, true, false);
            this.timer = i6Var;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paused = false;
            this.alpha = 255;
            this.parentView = view;
            this.startTime = System.currentTimeMillis() - j10;
            this.min_display_duration = i9 * 1000;
            this.max_display_duration = i10 * 1000;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setColor(-1);
            i6Var.setCallback(view);
            i6Var.b = 17;
            i6Var.t(AndroidUtilities.dp(12.0f));
            i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
            i6Var.G = AndroidUtilities.displaySize.x;
            i6Var.r(-1);
            gr grVar = gr.h;
            this.showCrossAnimated = new y5(view, 0L, 420L, grVar);
            this.showTimerAnimated = new y5(view, 0L, 420L, grVar);
            this.timerScaleAnimated = new y5(view, 0L, 420L, grVar);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            long currentTimeMillis = ((this.paused ? this.pausedTime : System.currentTimeMillis()) - this.minusTime) - this.startTime;
            long max = Math.max(0L, this.min_display_duration - currentTimeMillis);
            long j10 = this.min_display_duration;
            float f10 = max / j10;
            float e10 = this.showTimerAnimated.e(currentTimeMillis < j10);
            String str = "" + ((int) Math.ceil(max / 1000.0d));
            float d = this.timerScaleAnimated.d(str.length() >= 3 ? 0.825f : str.length() >= 2 ? 0.875f : 1.0f, false);
            canvas.save();
            canvas.scale(d, d, centerX, centerY);
            this.timer.q(str, true, true);
            this.timer.l(centerX - 1.0f, centerY - 1.0f, centerX + 1.0f, centerY + 1.0f);
            i6 i6Var = this.timer;
            i6Var.w = (int) (this.alpha * e10);
            i6Var.draw(canvas);
            canvas.restore();
            this.paint.setAlpha((int) (this.alpha * e10));
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(centerX - AndroidUtilities.dp(9.0f), centerY - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + centerX, AndroidUtilities.dp(9.0f) + centerY);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, this.paint);
            float e11 = this.showCrossAnimated.e((1.0f - f10) * 360.0f > 75.0f);
            float lerp = AndroidUtilities.lerp(centerX, AndroidUtilities.dp(8.0f) + centerX, e10);
            float lerp2 = AndroidUtilities.lerp(centerY, centerY - AndroidUtilities.dp(8.0f), e10);
            float lerp3 = AndroidUtilities.lerp(0.35f, 1.0f, e11) * AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), e10);
            this.paint.setAlpha((int) (this.alpha * e11));
            float f11 = lerp - lerp3;
            float f12 = lerp2 - lerp3;
            float f13 = lerp + lerp3;
            float f14 = lerp3 + lerp2;
            canvas.drawLine(f11, f12, f13, f14, this.paint);
            canvas.drawLine(f11, f14, f13, f12, this.paint);
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
        public void setAlpha(int i9) {
            this.alpha = i9;
        }

        public void setColor(int i9) {
            this.timer.r(i9);
            this.paint.setColor(i9);
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class VideoAdsLocation {
        int currentAccount;
        long dialogId;

        public VideoAdsLocation(int i9, long j10) {
            this.currentAccount = i9;
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

    private VideoAds(int i9, long j10, int i10, oc ocVar) {
        this.lastTime = 0L;
        this.currentAccount = i9;
        this.dialogId = j10;
        this.msg_id = i10;
        this.lastTime = System.currentTimeMillis();
        init(ocVar);
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

    private void init(oc ocVar) {
        this.bulletinFactory = ocVar;
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
        AndroidUtilities.runOnUIThread(new o8(20, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$10(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        AndroidUtilities.addToClipboard(tL_sponsoredMessage.additional_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$12(x60 x60Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        x60Var.u();
        gc gcVar = this.bulletin;
        if (gcVar != null) {
            gcVar.i(true);
            this.bulletin.b();
        }
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
        MessagesController.getInstance(this.currentAccount).disableAds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$14(Context context, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, x60 x60Var) {
        int i9 = this.currentAccount;
        long j10 = this.dialogId;
        oc ocVar = this.bulletinFactory;
        j0 j0Var = new j0();
        int i10 = 1;
        d dVar = new d(this, i10);
        Objects.requireNonNull(x60Var);
        a aVar = new a(x60Var, i10);
        int i11 = y21.v;
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_reportSponsoredMessage, new y60(context, j0Var, j10, bArr, aVar, ocVar, dVar, i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$15(x60 x60Var) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        x60Var.u();
        gc gcVar = this.bulletin;
        if (gcVar != null) {
            gcVar.i(true);
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
    public void lambda$show$17(gc gcVar, final TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, b6 b6Var, AdLayout adLayout, Utilities.Callback callback, View view) {
        ViewGroup viewGroup;
        Context context2;
        final x60 x60Var;
        int i9;
        gc gcVar2 = this.bulletin;
        if (gcVar2 == null || gcVar2 != gcVar) {
            return;
        }
        try {
            viewGroup = (ViewGroup) gcVar2.e.getParent().getParent();
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        j0 j0Var = new j0();
        final x60 x60Var2 = new x60(viewGroup, j0Var, this.bulletin.e, true, false, false);
        x60Var2.H = true;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x60Var2.D;
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
        x60Var2.I = true;
        x60Var2.s = 0;
        x60Var2.t = false;
        x60Var2.J = false;
        if (tL_sponsoredMessage.sponsor_info == null && tL_sponsoredMessage.additional_info == null) {
            String str = tL_sponsoredMessage.url;
            if (str != null) {
            }
            context2 = context;
            x60Var = x60Var2;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !tL_sponsoredMessage.can_report) {
                final int i10 = 1;
                x60Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
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
                x60Var.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new o8(22, context2, j0Var), false);
                Context context3 = context2;
                x60 x60Var3 = x60Var;
                x60Var = x60Var3;
                x60Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new androidx.car.app.utils.c(this, context3, tL_sponsoredMessage, x60Var3, 27), false);
                if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                    x60Var.k();
                    final int i11 = 0;
                    x60Var.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable(this) { // from class: org.telegram.messenger.video.c
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
            if (x60Var.x() > 0) {
                return;
            }
            this.currentMenu = x60Var;
            this.currentMenuTranslationY = adLayout.getTranslationY();
            callback.run(Boolean.TRUE);
            x60Var.p = new o8(21, this, callback);
            x60Var.Z();
            checkPopupShownCallback();
            return;
        }
        x60 J = x60Var2.J();
        g1 g1Var = new g1(0, context, j0Var, true, false);
        context2 = context;
        g1Var.setItemHeight(44);
        g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
        g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
        final int i12 = 2;
        g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        VideoAds.lambda$show$9((TLRPC.TL_sponsoredMessage) x60Var2, view2);
                        break;
                    case 1:
                        VideoAds.lambda$show$10((TLRPC.TL_sponsoredMessage) x60Var2, view2);
                        break;
                    default:
                        ((x60) x60Var2).s();
                        break;
                }
            }
        });
        J.r(g1Var, e6.n(-1, -2));
        J.r(new l1(context2, j0Var), e6.n(-1, 8));
        ArrayList arrayList = new ArrayList();
        String str2 = tL_sponsoredMessage.url;
        if (str2 == null || TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(this.currentAccount).linkPrefix)) {
            x60Var = x60Var2;
        } else {
            TextView textView = new TextView(context2);
            textView.setTextColor(j0Var.N0(f6.gc));
            textView.setTextSize(1, 14.0f);
            textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView.setMaxWidth(AndroidUtilities.dp(300.0f));
            Uri parse = Uri.parse(tL_sponsoredMessage.url);
            textView.setText(ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null));
            textView.setBackground(f6.Y(j0Var.N0(f6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
            x60Var = x60Var2;
            textView.setOnClickListener(new g4(this, x60Var, tL_sponsoredMessage, context2, 5));
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
            textView2.setTextColor(j0Var.N0(f6.E8));
            textView2.setTextSize(1, 14.0f);
            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView2.setText(tL_sponsoredMessage.sponsor_info);
            textView2.setBackground(f6.Y(j0Var.N0(f6.I5), 0, tL_sponsoredMessage.additional_info == null ? 6 : 0));
            final int i13 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
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
            textView3.setTextColor(j0Var.N0(f6.E8));
            textView3.setTextSize(1, 14.0f);
            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
            textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
            textView3.setText(tL_sponsoredMessage.additional_info);
            textView3.setBackground(f6.Y(f6.v0(f6.I5, b6Var), 0, 6));
            final int i14 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.video.j
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
                            ((x60) tL_sponsoredMessage).s();
                            break;
                    }
                }
            });
            arrayList.add(textView3);
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            View view2 = (View) arrayList.get(i15);
            if (i15 > 0) {
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setBackgroundColor(j0Var.N0(f6.d7));
                i9 = -1;
                LinearLayout.LayoutParams n10 = e6.n(-1, 1);
                n10.height = 1;
                J.r(frameLayout, n10);
            } else {
                i9 = -1;
            }
            J.r(view2, e6.n(i9, -2));
        }
        x60Var.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new k3(x60Var, J, 2), false);
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            final int i102 = 1;
            x60Var.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable(this) { // from class: org.telegram.messenger.video.c
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
        if (x60Var.x() > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$18(TLRPC.TL_sponsoredMessage tL_sponsoredMessage, View view) {
        logSponsoredClicked(tL_sponsoredMessage);
        ve.e.r(view.getContext(), Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(CloseDrawable closeDrawable, View view) {
        if (closeDrawable.isCrossAvailable()) {
            gc gcVar = this.bulletin;
            if (gcVar != null) {
                gcVar.b();
                return;
            }
            return;
        }
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            showPremium();
            return;
        }
        gc gcVar2 = this.bulletin;
        if (gcVar2 != null) {
            gcVar2.b();
            this.bulletin = null;
        }
        MessagesController.getInstance(this.currentAccount).disableAds(true);
        this.bulletinFactory.c(LocaleController.getString(R.string.AdHidden)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$3(gc gcVar, TLRPC.TL_sponsoredMessage tL_sponsoredMessage) {
        gc gcVar2 = this.bulletin;
        if (gcVar2 == null || gcVar2 != gcVar) {
            return;
        }
        gcVar2.j = (tL_sponsoredMessage.max_display_duration - tL_sponsoredMessage.min_display_duration) * MediaDataController.MAX_STYLE_RUNS_COUNT;
        gcVar2.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$show$4(gc gcVar, boolean[] zArr, CloseDrawable closeDrawable, long[] jArr, Runnable runnable, long[] jArr2, long j10, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Boolean bool) {
        gc gcVar2 = this.bulletin;
        if (gcVar2 == null || gcVar2 != gcVar || bool.booleanValue() == zArr[0]) {
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
            gc gcVar3 = this.bulletin;
            if (gcVar3 != null) {
                gcVar3.b();
                this.bulletin = null;
                return;
            }
            return;
        }
        if (j11 > 0) {
            AndroidUtilities.runOnUIThread(runnable, j11);
            return;
        }
        gc gcVar4 = this.bulletin;
        gcVar4.j = (int) j12;
        gcVar4.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$5(gc gcVar, boolean[] zArr) {
        gc gcVar2 = this.bulletin;
        if (gcVar2 == null || gcVar2 != gcVar || zArr[0]) {
            return;
        }
        zArr[0] = true;
        x60 x60Var = this.currentMenu;
        if (x60Var != null) {
            x60Var.u();
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
    public /* synthetic */ void lambda$show$7(x60 x60Var, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, Context context, View view) {
        x60Var.u();
        logSponsoredClicked(tL_sponsoredMessage);
        ve.e.r(context, Uri.parse(tL_sponsoredMessage.url), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
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
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() { // from class: org.telegram.messenger.video.h
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VideoAds.this.lambda$load$1(tLObject, tL_error);
            }
        });
    }

    public static VideoAds make(int i9, long j10, int i10, oc ocVar) {
        oc ocVar2;
        VideoAdsLocation videoAdsLocation = new VideoAdsLocation(i9, j10);
        VideoAds videoAds = cached.get(videoAdsLocation);
        if (videoAds == null || ((videoAds.msg_id != i10 || System.currentTimeMillis() - videoAds.lastTime > 180000) && videoAds.ads.isEmpty())) {
            HashMap<VideoAdsLocation, VideoAds> hashMap = cached;
            ocVar2 = ocVar;
            VideoAds videoAds2 = new VideoAds(i9, j10, i10, ocVar2);
            hashMap.put(videoAdsLocation, videoAds2);
            videoAds = videoAds2;
        } else {
            ocVar2 = ocVar;
        }
        videoAds.init(ocVar2);
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
        gc gcVar = this.bulletin;
        if (gcVar != null) {
            gcVar.b();
            this.bulletin = null;
        }
        Context W = this.bulletinFactory.W();
        b6 b6Var = this.bulletinFactory.c;
        AdLayout adLayout = new AdLayout(W, b6Var) { // from class: org.telegram.messenger.video.VideoAds.1
            @Override // org.telegram.ui.Components.lb
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
        int i9 = f6.Oh;
        h5Var.i(new AdOptionsDrawable(W2, f6.v0(i9, this.bulletinFactory.c)));
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
        closeDrawable.setColor(f6.v0(i9, this.bulletinFactory.c));
        adLayout.buttonView.setImageDrawable(closeDrawable);
        adLayout.buttonView.setOnClickListener(new mh.k3(1, this, closeDrawable));
        final gc b10 = this.bulletinFactory.b(adLayout, tL_sponsoredMessage.max_display_duration * MediaDataController.MAX_STYLE_RUNS_COUNT);
        this.bulletin = b10;
        b10.u = false;
        b10.i(false);
        final e eVar = new e(this, b10, tL_sponsoredMessage, 0);
        final long[] jArr = new long[1];
        final long[] jArr2 = new long[1];
        final boolean[] zArr = new boolean[1];
        Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.messenger.video.f
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                VideoAds.this.lambda$show$4(b10, zArr, closeDrawable, jArr2, eVar, jArr, currentTimeMillis, tL_sponsoredMessage, (Boolean) obj);
            }
        };
        AndroidUtilities.runOnUIThread(eVar, tL_sponsoredMessage.min_display_duration * 1000);
        gc gcVar2 = this.bulletin;
        gcVar2.r = false;
        gcVar2.v = new e(this, b10, new boolean[1], 1);
        adLayout.titleTextView.setRightDrawableOnClick(new g(this, b10, tL_sponsoredMessage, W, b6Var, adLayout, callback, 0));
        gc gcVar3 = this.bulletin;
        mh.k3 k3Var = new mh.k3(2, this, tL_sponsoredMessage);
        lb lbVar = gcVar3.e;
        if (lbVar != null) {
            lbVar.setOnClickListener(k3Var);
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
        x0 x0Var2 = new x0(new o2() { // from class: org.telegram.messenger.video.VideoAds.2
            @Override // org.telegram.ui.ActionBar.o2
            public Context getContext() {
                return AndroidUtilities.findActivity(LaunchActivity.C1);
            }

            @Override // org.telegram.ui.ActionBar.o2
            public int getCurrentAccount() {
                return VideoAds.this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.o2
            public Activity getParentActivity() {
                Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                return findActivity == null ? LaunchActivity.C1 : findActivity;
            }
        }, 3, true);
        this.premiumSheet = x0Var2;
        x0Var2.setOnDismissListener(new o8(19, this, x0Var2));
        x0Var2.show();
        checkPopupShownCallback();
    }

    public boolean isPopupShown() {
        x60 x60Var = this.currentMenu;
        if (x60Var != null && x60Var.D()) {
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
        x60 x60Var = this.currentMenu;
        if (x60Var != null) {
            x60Var.u();
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class AdOptionsDrawable extends Drawable {
        public final int color;
        public final Drawable icon;
        public final Paint backgroundPaint = new Paint(1);
        public final nz0 text = new nz0(LocaleController.getString(R.string.SponsoredMessageAd), 11.0f, AndroidUtilities.bold());
        private float alpha = 1.0f;

        public AdOptionsDrawable(Context context, int i9) {
            this.color = i9;
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            this.icon = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            rectF.left += AndroidUtilities.dp(4.0f);
            this.backgroundPaint.setColor(f6.l1(this.alpha * 0.2f, this.color));
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
        public void setAlpha(int i9) {
            this.alpha = i9 / 255.0f;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
