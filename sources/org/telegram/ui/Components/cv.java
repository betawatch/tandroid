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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cv extends org.telegram.ui.ActionBar.h3 {
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
    public da1 c;
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

    public static void I(org.telegram.ui.ActionBar.o2 o2Var, MessageObject messageObject, org.telegram.ui.cu0 cu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        cv cvVar = S;
        if (cvVar != null) {
            cvVar.F();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : da1.e(str4)) != null) {
            PhotoViewer.u1().M2(null, o2Var, null);
            PhotoViewer.u1().g2(messageObject, null, null, null, null, null, null, 0, cu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
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
        cvVar2.container.addView(frameLayout, w7.z5.c(-1.0f, -1));
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
        wuVar.setWebChromeClient(new org.telegram.ui.q1(cvVar2, 1));
        wuVar.setWebViewClient(new xu(cvVar2));
        xVar.addView(wuVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        da1 da1Var = new da1(parentActivity, true, new yu(cvVar2));
        cvVar2.c = da1Var;
        da1Var.setVisibility(4);
        xVar.addView(da1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        cvVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        xVar.addView(view, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        cvVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        xVar.addView(radialProgressView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            xVar.addView(textView, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        xVar.addView(textView2, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.K5, view2, null);
        xVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout2, null);
        xVar.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.k6.o5;
        org.telegram.ui.ActionBar.r6.W(textView3, i13, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        textView3.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(textView3, g02, null, O, null);
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
                        cv.m(this.b, view3);
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
                            ((LaunchActivity) activity).I0(new e2(21));
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
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, null, mode);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        imageView.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(imageView, g03, null, O2, null);
        linearLayout2.addView(imageView, w7.z5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
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
                        cv.m(this.b, view3);
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
                            ((LaunchActivity) activity).I0(new e2(21));
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
                        cv.m(this.b, view3);
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
                            ((LaunchActivity) activity).I0(new e2(21));
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
        org.telegram.ui.ActionBar.r6.t(imageView2, i13, null, mode);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i14);
        imageView2.setBackground(g04);
        org.telegram.ui.ActionBar.r6.k(imageView2, g04, null, O3, null);
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        cvVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView4, i13, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i14);
        textView4.setBackground(g05);
        org.telegram.ui.ActionBar.r6.k(textView4, g05, null, O4, null);
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView5, i13, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i14);
        textView5.setBackground(g06);
        org.telegram.ui.ActionBar.r6.k(textView5, g06, null, O5, null);
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
                        cv.m(this.b, view3);
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
                            ((LaunchActivity) activity).I0(new e2(21));
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
        boolean z12 = da1.a(str4) || da1.a(str3);
        da1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            z91 z91Var = da1Var.f0;
            z91Var.setVisibility(4);
            z91Var.d(false, false);
            da1Var.j(true, false);
        }
        cvVar2.setDelegate(new zu(cvVar2, z12));
        cvVar2.F = new av(cvVar2, ApplicationLoader.applicationContext);
        String e = da1.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            wuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            wuVar.setKeepScreenOn(true);
            da1Var.setVisibility(4);
            da1Var.getControlsView().setVisibility(4);
            da1Var.getTextureView().setVisibility(4);
            if (da1Var.getTextureImageView() != null) {
                da1Var.getTextureImageView().setVisibility(4);
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

    public static void m(cv cvVar, View view) {
        dh0 dh0Var = dh0.p0;
        if (dh0Var.P) {
            dh0.j(false);
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
                f5.B(activity, null, false);
                return;
            }
        }
        if (cvVar.n.getVisibility() == 0) {
            return;
        }
        if (dh0.x(z10, cvVar.r, null, cvVar.b, cvVar.G, cvVar.H, false)) {
            dh0Var.U = cvVar;
        }
        if (cvVar.y) {
            cvVar.b.evaluateJavascript("hideControls();", null);
        }
        cvVar.containerView.setTranslationY(0.0f);
        cvVar.dismissInternal();
    }

    public final void F() {
        wu wuVar = this.b;
        if (wuVar != null && wuVar.getVisibility() == 0) {
            this.w.removeView(wuVar);
            wuVar.stopLoading();
            wuVar.loadUrl("about:blank");
            wuVar.destroy();
        }
        dh0.j(false);
        da1 da1Var = this.c;
        if (da1Var != null) {
            da1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void G() {
        if (this.b == null || !dh0.p0.P) {
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
        this.w.addView(this.b, 0, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.J ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        dh0.j(true);
    }

    public final void J() {
        da1 da1Var = this.c;
        View aspectRatioView = da1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!da1Var.f() && !this.O) {
            TextureView textureView = da1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = da1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = da1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        da1 da1Var = this.c;
        return (da1Var.getVisibility() == 0 && da1Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        av avVar = this.F;
        if (avVar != null) {
            avVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onConfigurationChanged(Configuration configuration) {
        da1 da1Var = this.c;
        if (da1Var.getVisibility() == 0 && da1Var.w && !da1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = da1Var.T;
                if (z10 || z10) {
                    return;
                }
                da1Var.T = true;
                da1Var.m();
                da1Var.l(false);
                return;
            }
            boolean z11 = da1Var.T;
            if (z11 && z11) {
                da1Var.T = false;
                da1Var.m();
                da1Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.P;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.P = i11;
            if (i11 != 0) {
                this.container.invalidate();
                return;
            }
            da1 da1Var = this.c;
            TextureView textureView = da1Var.d;
            ImageView imageView = da1Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    da1Var.h = createBitmap;
                    da1Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = da1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        da1Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (da1Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(da1Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            dh0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f7) {
        J();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        J();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        da1 da1Var = this.c;
        if (view == da1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = da1Var.getMeasuredWidth();
            layoutParams.height = da1Var.getAspectRatioView().getMeasuredHeight() + (da1Var.T ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
