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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gu extends org.telegram.ui.ActionBar.f3 {
    public static gu O;
    public int[] A;
    public eu B;
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
    public zt N;
    public au b;
    public g81 c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f;
    public View h;
    public RadialProgressView n;
    public Activity r;
    public LinearLayout s;
    public TextView v;
    public fh.d2 w;
    public ImageView x;
    public boolean y;

    public static void I(org.telegram.ui.ActionBar.o2 o2Var, MessageObject messageObject, org.telegram.ui.rt0 rt0Var, String str, String str2, String str3, String str4, int i9, int i10, int i11, boolean z10) {
        float f10;
        TLRPC.MessageMedia messageMedia;
        gu guVar = O;
        if (guVar != null) {
            guVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : g81.e(str4)) != null) {
            PhotoViewer.t1().K2(null, o2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, rt0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        final gu guVar2 = new gu(parentActivity, false);
        guVar2.A = new int[2];
        guVar2.H = -2;
        guVar2.N = new zt(guVar2);
        guVar2.fullWidth = true;
        guVar2.setApplyTopPadding(false);
        guVar2.setApplyBottomPadding(false);
        guVar2.M = i11;
        if (parentActivity != null) {
            guVar2.r = parentActivity;
        }
        guVar2.G = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        guVar2.F = z11;
        guVar2.E = str3;
        guVar2.C = i9;
        guVar2.D = i10;
        if (i9 == 0 || i10 == 0) {
            Point point = AndroidUtilities.displaySize;
            guVar2.C = point.x;
            guVar2.D = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        guVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new jh.d(17));
        guVar2.container.addView(frameLayout, g7.e6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        fh.d2 d2Var = new fh.d2(guVar2, parentActivity, 15);
        guVar2.w = d2Var;
        d2Var.setOnTouchListener(new jh.d(17));
        guVar2.setCustomView(d2Var);
        au auVar = new au(guVar2, parentActivity, parentActivity, 0);
        guVar2.b = auVar;
        auVar.getSettings().setJavaScriptEnabled(true);
        auVar.getSettings().setDomStorageEnabled(true);
        auVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        auVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(auVar, true);
        auVar.setWebChromeClient(new org.telegram.ui.r1(guVar2, 1));
        auVar.setWebViewClient(new bu(guVar2));
        d2Var.addView(auVar, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        g81 g81Var = new g81(parentActivity, true, new cu(guVar2));
        guVar2.c = g81Var;
        g81Var.setVisibility(4);
        d2Var.addView(g81Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        guVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        d2Var.addView(view, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        guVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        d2Var.addView(radialProgressView, g7.e6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            d2Var.addView(textView, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        d2Var.addView(textView2, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.K5, false));
        d2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
        d2Var.addView(frameLayout2, g7.e6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, g7.e6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.f6.o5;
        j3.r0.w(i12, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i13 = org.telegram.ui.ActionBar.f6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, g7.e6.q(-2, -1, 51));
        final int i14 = 0;
        textView3.setOnClickListener(new View.OnClickListener(guVar2) { // from class: org.telegram.ui.Components.xt
            public final /* synthetic */ gu b;

            {
                this.b = guVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        gu.m(this.b, view3);
                        break;
                    case 2:
                        gu guVar3 = this.b;
                        guVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar3.dismiss();
                        break;
                    default:
                        gu guVar4 = this.b;
                        ve.e.s(guVar4.r, guVar4.E);
                        guVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        guVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, g7.e6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        guVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        linearLayout2.addView(imageView, g7.e6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i15 = 1;
        imageView.setOnClickListener(new View.OnClickListener(guVar2) { // from class: org.telegram.ui.Components.xt
            public final /* synthetic */ gu b;

            {
                this.b = guVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        gu.m(this.b, view3);
                        break;
                    case 2:
                        gu guVar3 = this.b;
                        guVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar3.dismiss();
                        break;
                    default:
                        gu guVar4 = this.b;
                        ve.e.s(guVar4.r, guVar4.E);
                        guVar4.dismiss();
                        break;
                }
            }
        });
        final int i16 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(guVar2) { // from class: org.telegram.ui.Components.xt
            public final /* synthetic */ gu b;

            {
                this.b = guVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        gu.m(this.b, view3);
                        break;
                    case 2:
                        gu guVar3 = this.b;
                        guVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar3.dismiss();
                        break;
                    default:
                        gu guVar4 = this.b;
                        ve.e.s(guVar4.r, guVar4.E);
                        guVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i12, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        linearLayout2.addView(imageView2, g7.e6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        guVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        j3.r0.w(i12, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, g7.e6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        j3.r0.w(i12, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, g7.e6.e(-2, -1, 51));
        final int i17 = 3;
        textView5.setOnClickListener(new View.OnClickListener(guVar2) { // from class: org.telegram.ui.Components.xt
            public final /* synthetic */ gu b;

            {
                this.b = guVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        gu.m(this.b, view3);
                        break;
                    case 2:
                        gu guVar3 = this.b;
                        guVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", guVar3.E));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        Activity activity = guVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new g2(15));
                        }
                        guVar3.dismiss();
                        break;
                    default:
                        gu guVar4 = this.b;
                        ve.e.s(guVar4.r, guVar4.E);
                        guVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = g81.a(str4) || g81.a(str3);
        g81Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            c81 c81Var = g81Var.b0;
            c81Var.setVisibility(4);
            c81Var.d(false, false);
            g81Var.j(true, false);
        }
        guVar2.setDelegate(new du(guVar2, z12));
        guVar2.B = new eu(guVar2, ApplicationLoader.applicationContext);
        String e10 = g81.e(str4);
        if (e10 != null || !z12) {
            radialProgressView.setVisibility(0);
            auVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e10 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            auVar.setKeepScreenOn(true);
            g81Var.setVisibility(4);
            g81Var.getControlsView().setVisibility(4);
            g81Var.getTextureView().setVisibility(4);
            if (g81Var.getTextureImageView() != null) {
                g81Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(MessagesController.getInstance(guVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (guVar2.B.canDetectOrientation()) {
            guVar2.B.enable();
        } else {
            guVar2.B.disable();
            guVar2.B = null;
        }
        O = guVar2;
        guVar2.setCalcMandatoryInsets(z10);
        guVar2.show();
    }

    public static void m(gu guVar, View view) {
        pf0 pf0Var = pf0.l0;
        if (pf0Var.L) {
            pf0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new yt(0, view), 300L);
            return;
        }
        boolean z10 = guVar.y && "inapp".equals(MessagesController.getInstance(guVar.currentAccount).youtubePipType);
        if ((z10 || guVar.F()) && guVar.n.getVisibility() != 0) {
            if (pf0.x(z10, guVar.r, null, guVar.b, guVar.C, guVar.D, false)) {
                pf0Var.Q = guVar;
            }
            if (guVar.y) {
                guVar.b.evaluateJavascript("hideControls();", null);
            }
            guVar.containerView.setTranslationY(0.0f);
            guVar.dismissInternal();
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
        y4.B(activity, null, false);
        return false;
    }

    public final void G() {
        au auVar = this.b;
        if (auVar != null && auVar.getVisibility() == 0) {
            this.w.removeView(auVar);
            auVar.stopLoading();
            auVar.loadUrl("about:blank");
            auVar.destroy();
        }
        pf0.j(false);
        g81 g81Var = this.c;
        if (g81Var != null) {
            g81Var.b();
        }
        O = null;
        dismissInternal();
    }

    public final void H() {
        if (this.b == null || !pf0.l0.L) {
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        if (this.y) {
            this.b.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.b);
        }
        this.w.addView(this.b, 0, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.F ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        pf0.j(true);
    }

    public final void J() {
        g81 g81Var = this.c;
        View aspectRatioView = g81Var.getAspectRatioView();
        int[] iArr = this.A;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!g81Var.f() && !this.K) {
            TextureView textureView = g81Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = g81Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = g81Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        g81 g81Var = this.c;
        return (g81Var.getVisibility() == 0 && g81Var.P) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        eu euVar = this.B;
        if (euVar != null) {
            euVar.disable();
            this.B = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        g81 g81Var = this.c;
        if (g81Var.getVisibility() == 0 && g81Var.w && !g81Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = g81Var.P;
                if (z10 || z10) {
                    return;
                }
                g81Var.P = true;
                g81Var.m();
                g81Var.l(false);
                return;
            }
            boolean z11 = g81Var.P;
            if (z11 && z11) {
                g81Var.P = false;
                g81Var.m();
                g81Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerDraw(Canvas canvas) {
        int i9 = this.L;
        if (i9 != 0) {
            int i10 = i9 - 1;
            this.L = i10;
            if (i10 != 0) {
                this.container.invalidate();
                return;
            }
            g81 g81Var = this.c;
            TextureView textureView = g81Var.d;
            ImageView imageView = g81Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    g81Var.h = createBitmap;
                    g81Var.n.getBitmap(createBitmap);
                } catch (Throwable th) {
                    Bitmap bitmap = g81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        g81Var.h = null;
                    }
                    FileLog.e(th);
                }
                if (g81Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(g81Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            pf0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f10) {
        J();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i9, int i10, int i11, int i12) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        J();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i9, int i10) {
        g81 g81Var = this.c;
        if (view == g81Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = g81Var.getMeasuredWidth();
            layoutParams.height = g81Var.getAspectRatioView().getMeasuredHeight() + (g81Var.P ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
