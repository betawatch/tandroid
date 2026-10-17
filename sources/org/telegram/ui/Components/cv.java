package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class cv extends org.telegram.ui.ActionBar.f3 {
    public static cv S;
    public int[] E;
    public av F;
    public int G;
    public int H;
    public String I;
    public boolean J;
    public String K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public vu R;
    public wu b;
    public u91 c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f;
    public View h;
    public RadialProgressView n;
    public Activity r;
    public LinearLayout s;
    public TextView v;
    public ah.x w;
    public ImageView x;
    public boolean y;

    public static void J(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.bu0 bu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        cv cvVar = S;
        if (cvVar != null) {
            cvVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : u91.e(str4)) != null) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, bu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final cv cvVar2 = new cv(parentActivity, false);
        cvVar2.E = new int[2];
        cvVar2.L = -2;
        cvVar2.R = new vu(cvVar2);
        cvVar2.fullWidth = true;
        cvVar2.setApplyTopPadding(false);
        cvVar2.setApplyBottomPadding(false);
        cvVar2.Q = i12;
        if (parentActivity != null) {
            cvVar2.r = parentActivity;
        }
        cvVar2.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        cvVar2.J = z11;
        cvVar2.I = str3;
        cvVar2.G = i10;
        cvVar2.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            cvVar2.G = point.x;
            cvVar2.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        cvVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new di.d(17));
        cvVar2.container.addView(frameLayout, w7.z5.d(-1.0f, -1));
        frameLayout.setVisibility(4);
        ah.x xVar = new ah.x(cvVar2, parentActivity, 15);
        cvVar2.w = xVar;
        xVar.setOnTouchListener(new di.d(17));
        cvVar2.setCustomView(xVar);
        wu wuVar = new wu(cvVar2, parentActivity, parentActivity, 0);
        cvVar2.b = wuVar;
        wuVar.getSettings().setJavaScriptEnabled(true);
        wuVar.getSettings().setDomStorageEnabled(true);
        wuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        wuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(wuVar, true);
        wuVar.setWebChromeClient(new org.telegram.ui.r1(cvVar2, 1));
        wuVar.setWebViewClient(new xu(cvVar2));
        xVar.addView(wuVar, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        u91 u91Var = new u91(parentActivity, true, new yu(cvVar2));
        cvVar2.c = u91Var;
        u91Var.setVisibility(4);
        xVar.addView(u91Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74, -1, 51));
        View view = new View(parentActivity);
        cvVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        xVar.addView(view, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        cvVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        xVar.addView(radialProgressView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2, -2, 17));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            xVar.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 77.0f, -1, 83));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        xVar.addView(textView2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 57.0f, -1, 83));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K5, false));
        xVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
        xVar.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.h6.o5;
        com.google.android.gms.internal.cast.a6.o(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.h6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.z5.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(cvVar2) { // from class: org.telegram.ui.Components.tu
            public final /* synthetic */ cv b;

            {
                this.b = cvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        cv.n(this.b, view3);
                        break;
                    case 2:
                        cv cvVar3 = this.b;
                        cvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar3.dismiss();
                        break;
                    default:
                        cv cvVar4 = this.b;
                        pf.d.r(cvVar4.r, cvVar4.I);
                        cvVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        cvVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        cvVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.z5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 51));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(cvVar2) { // from class: org.telegram.ui.Components.tu
            public final /* synthetic */ cv b;

            {
                this.b = cvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        cv.n(this.b, view3);
                        break;
                    case 2:
                        cv cvVar3 = this.b;
                        cvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar3.dismiss();
                        break;
                    default:
                        cv cvVar4 = this.b;
                        pf.d.r(cvVar4.r, cvVar4.I);
                        cvVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(cvVar2) { // from class: org.telegram.ui.Components.tu
            public final /* synthetic */ cv b;

            {
                this.b = cvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        cv.n(this.b, view3);
                        break;
                    case 2:
                        cv cvVar3 = this.b;
                        cvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar3.dismiss();
                        break;
                    default:
                        cv cvVar4 = this.b;
                        pf.d.r(cvVar4.r, cvVar4.I);
                        cvVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        cvVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.cast.a6.o(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        com.google.android.gms.internal.cast.a6.o(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(cvVar2) { // from class: org.telegram.ui.Components.tu
            public final /* synthetic */ cv b;

            {
                this.b = cvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        cv.n(this.b, view3);
                        break;
                    case 2:
                        cv cvVar3 = this.b;
                        cvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", cvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = cvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).H0(new k2(15));
                        }
                        cvVar3.dismiss();
                        break;
                    default:
                        cv cvVar4 = this.b;
                        pf.d.r(cvVar4.r, cvVar4.I);
                        cvVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = u91.a(str4) || u91.a(str3);
        u91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            q91 q91Var = u91Var.f0;
            q91Var.setVisibility(4);
            q91Var.d(false, false);
            u91Var.j(true, false);
        }
        cvVar2.setDelegate(new zu(cvVar2, z12));
        cvVar2.F = new av(cvVar2, ApplicationLoader.applicationContext);
        String e = u91.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            wuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            wuVar.setKeepScreenOn(true);
            u91Var.setVisibility(4);
            u91Var.getControlsView().setVisibility(4);
            u91Var.getTextureView().setVisibility(4);
            if (u91Var.getTextureImageView() != null) {
                u91Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(cvVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (cvVar2.F.canDetectOrientation()) {
            cvVar2.F.enable();
        } else {
            cvVar2.F.disable();
            cvVar2.F = null;
        }
        S = cvVar2;
        cvVar2.setCalcMandatoryInsets(z10);
        cvVar2.show();
    }

    public static void n(cv cvVar, View view) {
        zg0 zg0Var = zg0.p0;
        if (zg0Var.P) {
            zg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new uu(0, view), 300L);
            return;
        }
        boolean z10 = cvVar.y && "inapp".equals(MessagesController.getInstance(cvVar.currentAccount).youtubePipType);
        if (!z10) {
            Activity activity = cvVar.r;
            if (activity == null) {
                return;
            }
            if (!Settings.canDrawOverlays(activity)) {
                f5.A(activity, null, false);
                return;
            }
        }
        if (cvVar.n.getVisibility() == 0) {
            return;
        }
        if (zg0.x(z10, cvVar.r, null, cvVar.b, cvVar.G, cvVar.H, false)) {
            zg0Var.U = cvVar;
        }
        if (cvVar.y) {
            cvVar.b.evaluateJavascript("hideControls();", null);
        }
        cvVar.containerView.setTranslationY(0.0f);
        cvVar.dismissInternal();
    }

    public final void H() {
        wu wuVar = this.b;
        if (wuVar != null && wuVar.getVisibility() == 0) {
            this.w.removeView(wuVar);
            wuVar.stopLoading();
            wuVar.loadUrl("about:blank");
            wuVar.destroy();
        }
        zg0.j(false);
        u91 u91Var = this.c;
        if (u91Var != null) {
            u91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        if (this.b == null || !zg0.p0.P) {
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (this.y) {
            this.b.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.b);
        }
        this.w.addView(this.b, 0, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (this.J ? 22 : 0) + 84, -1, 51));
        setShowWithoutAnimation(true);
        show();
        zg0.j(true);
    }

    public final void K() {
        u91 u91Var = this.c;
        View aspectRatioView = u91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!u91Var.f() && !this.O) {
            TextureView textureView = u91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = u91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = u91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        u91 u91Var = this.c;
        return (u91Var.getVisibility() == 0 && u91Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        av avVar = this.F;
        if (avVar != null) {
            avVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        u91 u91Var = this.c;
        if (u91Var.getVisibility() == 0 && u91Var.w && !u91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = u91Var.T;
                if (z10 || z10) {
                    return;
                }
                u91Var.T = true;
                u91Var.m();
                u91Var.l(false);
                return;
            }
            boolean z11 = u91Var.T;
            if (z11 && z11) {
                u91Var.T = false;
                u91Var.m();
                u91Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.P;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.P = i11;
            if (i11 != 0) {
                this.container.invalidate();
                return;
            }
            u91 u91Var = this.c;
            TextureView textureView = u91Var.d;
            ImageView imageView = u91Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    u91Var.h = createBitmap;
                    u91Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = u91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        u91Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (u91Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(u91Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            zg0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        K();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        K();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        u91 u91Var = this.c;
        if (view == u91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = u91Var.getMeasuredWidth();
            layoutParams.height = u91Var.getAspectRatioView().getMeasuredHeight() + (u91Var.T ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
