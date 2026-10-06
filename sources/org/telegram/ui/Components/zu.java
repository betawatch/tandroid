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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zu extends org.telegram.ui.ActionBar.f3 {
    public static zu S;
    public int[] E;
    public xu F;
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
    public su R;
    public tu b;
    public aa1 c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f;
    public View h;
    public RadialProgressView n;
    public Activity r;
    public LinearLayout s;
    public TextView v;
    public ai.f0 w;
    public ImageView x;
    public boolean y;

    public static void H(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.ou0 ou0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        zu zuVar = S;
        if (zuVar != null) {
            zuVar.F();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : aa1.e(str4)) != null) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, ou0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final zu zuVar2 = new zu(parentActivity, false);
        zuVar2.E = new int[2];
        zuVar2.L = -2;
        zuVar2.R = new su(zuVar2);
        zuVar2.fullWidth = true;
        zuVar2.setApplyTopPadding(false);
        zuVar2.setApplyBottomPadding(false);
        zuVar2.Q = i12;
        if (parentActivity != null) {
            zuVar2.r = parentActivity;
        }
        zuVar2.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        zuVar2.J = z11;
        zuVar2.I = str3;
        zuVar2.G = i10;
        zuVar2.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            zuVar2.G = point.x;
            zuVar2.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        zuVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        zuVar2.container.addView(frameLayout, w7.z5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0(zuVar2, parentActivity, 12);
        zuVar2.w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        zuVar2.setCustomView(f0Var);
        tu tuVar = new tu(zuVar2, parentActivity, parentActivity, 0);
        zuVar2.b = tuVar;
        tuVar.getSettings().setJavaScriptEnabled(true);
        tuVar.getSettings().setDomStorageEnabled(true);
        tuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        tuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(tuVar, true);
        tuVar.setWebChromeClient(new org.telegram.ui.p1(zuVar2, 1));
        tuVar.setWebViewClient(new uu(zuVar2));
        f0Var.addView(tuVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        aa1 aa1Var = new aa1(parentActivity, true, new vu(zuVar2));
        zuVar2.c = aa1Var;
        aa1Var.setVisibility(4);
        f0Var.addView(aa1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        zuVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        zuVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            f0Var.addView(textView, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        f0Var.addView(textView2, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
        f0Var.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.i6.o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.i6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.z5.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.pu
            public final /* synthetic */ zu b;

            {
                this.b = zuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        zu.m(this.b, view3);
                        break;
                    case 2:
                        zu zuVar3 = this.b;
                        zuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar3.dismiss();
                        break;
                    default:
                        zu zuVar4 = this.b;
                        nf.f.s(zuVar4.r, zuVar4.I);
                        zuVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        zuVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        zuVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.z5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.pu
            public final /* synthetic */ zu b;

            {
                this.b = zuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        zu.m(this.b, view3);
                        break;
                    case 2:
                        zu zuVar3 = this.b;
                        zuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar3.dismiss();
                        break;
                    default:
                        zu zuVar4 = this.b;
                        nf.f.s(zuVar4.r, zuVar4.I);
                        zuVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.pu
            public final /* synthetic */ zu b;

            {
                this.b = zuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        zu.m(this.b, view3);
                        break;
                    case 2:
                        zu zuVar3 = this.b;
                        zuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar3.dismiss();
                        break;
                    default:
                        zu zuVar4 = this.b;
                        nf.f.s(zuVar4.r, zuVar4.I);
                        zuVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        zuVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.pu
            public final /* synthetic */ zu b;

            {
                this.b = zuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        zu.m(this.b, view3);
                        break;
                    case 2:
                        zu zuVar3 = this.b;
                        zuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zuVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new ru(0));
                        }
                        zuVar3.dismiss();
                        break;
                    default:
                        zu zuVar4 = this.b;
                        nf.f.s(zuVar4.r, zuVar4.I);
                        zuVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = aa1.a(str4) || aa1.a(str3);
        aa1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            w91 w91Var = aa1Var.f0;
            w91Var.setVisibility(4);
            w91Var.d(false, false);
            aa1Var.j(true, false);
        }
        zuVar2.setDelegate(new wu(zuVar2, z12));
        zuVar2.F = new xu(zuVar2, ApplicationLoader.applicationContext);
        String e7 = aa1.e(str4);
        if (e7 != null || !z12) {
            radialProgressView.setVisibility(0);
            tuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e7 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            tuVar.setKeepScreenOn(true);
            aa1Var.setVisibility(4);
            aa1Var.getControlsView().setVisibility(4);
            aa1Var.getTextureView().setVisibility(4);
            if (aa1Var.getTextureImageView() != null) {
                aa1Var.getTextureImageView().setVisibility(4);
            }
            if (e7 != null && "disabled".equals(MessagesController.getInstance(zuVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (zuVar2.F.canDetectOrientation()) {
            zuVar2.F.enable();
        } else {
            zuVar2.F.disable();
            zuVar2.F = null;
        }
        S = zuVar2;
        zuVar2.setCalcMandatoryInsets(z10);
        zuVar2.show();
    }

    public static void m(zu zuVar, View view) {
        rg0 rg0Var = rg0.p0;
        if (rg0Var.P) {
            rg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new qu(0, view), 300L);
            return;
        }
        boolean z10 = zuVar.y && "inapp".equals(MessagesController.getInstance(zuVar.currentAccount).youtubePipType);
        if ((z10 || zuVar.E()) && zuVar.n.getVisibility() != 0) {
            if (rg0.x(z10, zuVar.r, null, zuVar.b, zuVar.G, zuVar.H, false)) {
                rg0Var.U = zuVar;
            }
            if (zuVar.y) {
                zuVar.b.evaluateJavascript("hideControls();", null);
            }
            zuVar.containerView.setTranslationY(0.0f);
            zuVar.dismissInternal();
        }
    }

    public final boolean E() {
        Activity activity = this.r;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(activity)) {
            return true;
        }
        e5.B(activity, null, false);
        return false;
    }

    public final void F() {
        tu tuVar = this.b;
        if (tuVar != null && tuVar.getVisibility() == 0) {
            this.w.removeView(tuVar);
            tuVar.stopLoading();
            tuVar.loadUrl("about:blank");
            tuVar.destroy();
        }
        rg0.j(false);
        aa1 aa1Var = this.c;
        if (aa1Var != null) {
            aa1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void G() {
        if (this.b == null || !rg0.p0.P) {
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
        rg0.j(true);
    }

    public final void I() {
        aa1 aa1Var = this.c;
        View aspectRatioView = aa1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!aa1Var.f() && !this.O) {
            TextureView textureView = aa1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = aa1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = aa1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        aa1 aa1Var = this.c;
        return (aa1Var.getVisibility() == 0 && aa1Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        xu xuVar = this.F;
        if (xuVar != null) {
            xuVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        aa1 aa1Var = this.c;
        if (aa1Var.getVisibility() == 0 && aa1Var.w && !aa1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = aa1Var.T;
                if (z10 || z10) {
                    return;
                }
                aa1Var.T = true;
                aa1Var.m();
                aa1Var.l(false);
                return;
            }
            boolean z11 = aa1Var.T;
            if (z11 && z11) {
                aa1Var.T = false;
                aa1Var.m();
                aa1Var.l(false);
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
            aa1 aa1Var = this.c;
            TextureView textureView = aa1Var.d;
            ImageView imageView = aa1Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    aa1Var.h = createBitmap;
                    aa1Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = aa1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        aa1Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (aa1Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(aa1Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            rg0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        I();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        I();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        aa1 aa1Var = this.c;
        if (view == aa1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = aa1Var.getMeasuredWidth();
            layoutParams.height = aa1Var.getAspectRatioView().getMeasuredHeight() + (aa1Var.T ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
