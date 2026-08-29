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
import android.os.Build;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mu extends org.telegram.ui.ActionBar.f3 {
    public static mu O;
    public int[] A;
    public ku B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public fu N;
    public gu b;
    public s81 c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f;
    public View h;
    public RadialProgressView n;
    public Activity r;
    public LinearLayout s;
    public TextView v;
    public bg.x2 w;
    public ImageView x;
    public boolean y;

    public static void I(org.telegram.ui.ActionBar.o2 o2Var, MessageObject messageObject, org.telegram.ui.pt0 pt0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f9;
        TLRPC.MessageMedia messageMedia;
        mu muVar = O;
        if (muVar != null) {
            muVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : s81.e(str4)) != null) {
            PhotoViewer.t1().K2(null, o2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, pt0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        final mu muVar2 = new mu(parentActivity, false);
        muVar2.A = new int[2];
        muVar2.H = -2;
        muVar2.N = new fu(muVar2);
        muVar2.fullWidth = true;
        muVar2.setApplyTopPadding(false);
        muVar2.setApplyBottomPadding(false);
        muVar2.M = i12;
        if (parentActivity != null) {
            muVar2.r = parentActivity;
        }
        muVar2.G = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        muVar2.F = z11;
        muVar2.E = str3;
        muVar2.C = i10;
        muVar2.D = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            muVar2.C = point.x;
            muVar2.D = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        muVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new mh.d(17));
        muVar2.container.addView(frameLayout, i7.f6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        bg.x2 x2Var = new bg.x2(muVar2, parentActivity, 20);
        muVar2.w = x2Var;
        x2Var.setOnTouchListener(new mh.d(17));
        muVar2.setCustomView(x2Var);
        gu guVar = new gu(muVar2, parentActivity, parentActivity, 0);
        muVar2.b = guVar;
        guVar.getSettings().setJavaScriptEnabled(true);
        guVar.getSettings().setDomStorageEnabled(true);
        guVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        guVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(guVar, true);
        guVar.setWebChromeClient(new org.telegram.ui.s1(muVar2, 1));
        guVar.setWebViewClient(new hu(muVar2));
        x2Var.addView(guVar, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        s81 s81Var = new s81(parentActivity, true, new iu(muVar2));
        muVar2.c = s81Var;
        s81Var.setVisibility(4);
        x2Var.addView(s81Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        muVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        x2Var.addView(view, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        muVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        x2Var.addView(radialProgressView, i7.f6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f9 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            x2Var.addView(textView, i7.f6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f9 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(f9), 0);
        x2Var.addView(textView2, i7.f6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K5, false));
        x2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
        x2Var.addView(frameLayout2, i7.f6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, i7.f6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.g6.o5;
        org.telegram.ui.th.s(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.g6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(f9), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, i7.f6.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(muVar2) { // from class: org.telegram.ui.Components.du
            public final /* synthetic */ mu b;

            {
                this.b = muVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        mu.m(this.b, view3);
                        break;
                    case 2:
                        mu muVar3 = this.b;
                        muVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", muVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = muVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new r2(9));
                        }
                        muVar3.dismiss();
                        break;
                    default:
                        mu muVar4 = this.b;
                        ye.d.s(muVar4.r, muVar4.E);
                        muVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        muVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, i7.f6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        muVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, i7.f6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(muVar2) { // from class: org.telegram.ui.Components.du
            public final /* synthetic */ mu b;

            {
                this.b = muVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        mu.m(this.b, view3);
                        break;
                    case 2:
                        mu muVar3 = this.b;
                        muVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", muVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = muVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new r2(9));
                        }
                        muVar3.dismiss();
                        break;
                    default:
                        mu muVar4 = this.b;
                        ye.d.s(muVar4.r, muVar4.E);
                        muVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(muVar2) { // from class: org.telegram.ui.Components.du
            public final /* synthetic */ mu b;

            {
                this.b = muVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        mu.m(this.b, view3);
                        break;
                    case 2:
                        mu muVar3 = this.b;
                        muVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", muVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = muVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new r2(9));
                        }
                        muVar3.dismiss();
                        break;
                    default:
                        mu muVar4 = this.b;
                        ye.d.s(muVar4.r, muVar4.E);
                        muVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, i7.f6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        muVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.th.s(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(f9), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, i7.f6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.th.s(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(f9), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, i7.f6.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(muVar2) { // from class: org.telegram.ui.Components.du
            public final /* synthetic */ mu b;

            {
                this.b = muVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        mu.m(this.b, view3);
                        break;
                    case 2:
                        mu muVar3 = this.b;
                        muVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", muVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = muVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new r2(9));
                        }
                        muVar3.dismiss();
                        break;
                    default:
                        mu muVar4 = this.b;
                        ye.d.s(muVar4.r, muVar4.E);
                        muVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = s81.a(str4) || s81.a(str3);
        s81Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            o81 o81Var = s81Var.b0;
            o81Var.setVisibility(4);
            o81Var.d(false, false);
            s81Var.j(true, false);
        }
        muVar2.setDelegate(new ju(muVar2, z12));
        muVar2.B = new ku(muVar2, ApplicationLoader.applicationContext);
        String e10 = s81.e(str4);
        if (e10 != null || !z12) {
            radialProgressView.setVisibility(0);
            guVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e10 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            guVar.setKeepScreenOn(true);
            s81Var.setVisibility(4);
            s81Var.getControlsView().setVisibility(4);
            s81Var.getTextureView().setVisibility(4);
            if (s81Var.getTextureImageView() != null) {
                s81Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(MessagesController.getInstance(muVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (muVar2.B.canDetectOrientation()) {
            muVar2.B.enable();
        } else {
            muVar2.B.disable();
            muVar2.B = null;
        }
        O = muVar2;
        muVar2.setCalcMandatoryInsets(z10);
        muVar2.show();
    }

    public static void m(mu muVar, View view) {
        bg0 bg0Var = bg0.l0;
        if (bg0Var.L) {
            bg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new eu(0, view), 300L);
            return;
        }
        boolean z10 = muVar.y && "inapp".equals(MessagesController.getInstance(muVar.currentAccount).youtubePipType);
        if ((z10 || muVar.F()) && muVar.n.getVisibility() != 0) {
            if (bg0.x(z10, muVar.r, null, muVar.b, muVar.C, muVar.D, false)) {
                bg0Var.Q = muVar;
            }
            if (muVar.y) {
                muVar.b.evaluateJavascript("hideControls();", null);
            }
            muVar.containerView.setTranslationY(0.0f);
            muVar.dismissInternal();
        }
    }

    public final boolean F() {
        Activity activity = this.r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(activity)) {
            return true;
        }
        c5.B(activity, null, false);
        return false;
    }

    public final void G() {
        gu guVar = this.b;
        if (guVar != null && guVar.getVisibility() == 0) {
            this.w.removeView(guVar);
            guVar.stopLoading();
            guVar.loadUrl("about:blank");
            guVar.destroy();
        }
        bg0.j(false);
        s81 s81Var = this.c;
        if (s81Var != null) {
            s81Var.b();
        }
        O = null;
        dismissInternal();
    }

    public final void H() {
        if (this.b == null || !bg0.l0.L) {
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
        this.w.addView(this.b, 0, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.F ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        bg0.j(true);
    }

    public final void J() {
        s81 s81Var = this.c;
        View aspectRatioView = s81Var.getAspectRatioView();
        int[] iArr = this.A;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!s81Var.f() && !this.K) {
            TextureView textureView = s81Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = s81Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = s81Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        s81 s81Var = this.c;
        return (s81Var.getVisibility() == 0 && s81Var.P) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        ku kuVar = this.B;
        if (kuVar != null) {
            kuVar.disable();
            this.B = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        s81 s81Var = this.c;
        if (s81Var.getVisibility() == 0 && s81Var.w && !s81Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = s81Var.P;
                if (z10 || z10) {
                    return;
                }
                s81Var.P = true;
                s81Var.m();
                s81Var.l(false);
                return;
            }
            boolean z11 = s81Var.P;
            if (z11 && z11) {
                s81Var.P = false;
                s81Var.m();
                s81Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.L;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.L = i11;
            if (i11 != 0) {
                this.container.invalidate();
                return;
            }
            s81 s81Var = this.c;
            TextureView textureView = s81Var.d;
            ImageView imageView = s81Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    s81Var.h = createBitmap;
                    s81Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = s81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        s81Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (s81Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(s81Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            bg0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f9) {
        J();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        J();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        s81 s81Var = this.c;
        if (view == s81Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = s81Var.getMeasuredWidth();
            layoutParams.height = s81Var.getAspectRatioView().getMeasuredHeight() + (s81Var.P ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
