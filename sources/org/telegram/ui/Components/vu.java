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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.ActionBar.f3 {
    public static vu S;
    public int[] E;
    public tu F;
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
    public ou R;
    public pu b;
    public c91 c;
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

    public static void J(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.tu0 tu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        vu vuVar = S;
        if (vuVar != null) {
            vuVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : c91.e(str4)) != null) {
            PhotoViewer.t1().J2(null, n2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, tu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final vu vuVar2 = new vu(parentActivity, false);
        vuVar2.E = new int[2];
        vuVar2.L = -2;
        vuVar2.R = new ou(vuVar2);
        vuVar2.fullWidth = true;
        vuVar2.setApplyTopPadding(false);
        vuVar2.setApplyBottomPadding(false);
        vuVar2.Q = i12;
        if (parentActivity != null) {
            vuVar2.r = parentActivity;
        }
        vuVar2.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        vuVar2.J = z11;
        vuVar2.I = str3;
        vuVar2.G = i10;
        vuVar2.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            vuVar2.G = point.x;
            vuVar2.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        vuVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        vuVar2.container.addView(frameLayout, w7.x5.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0(vuVar2, parentActivity, 12);
        vuVar2.w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        vuVar2.setCustomView(f0Var);
        pu puVar = new pu(vuVar2, parentActivity, parentActivity, 0);
        vuVar2.b = puVar;
        puVar.getSettings().setJavaScriptEnabled(true);
        puVar.getSettings().setDomStorageEnabled(true);
        puVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        puVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(puVar, true);
        puVar.setWebChromeClient(new org.telegram.ui.o1(vuVar2, 1));
        puVar.setWebViewClient(new qu(vuVar2));
        f0Var.addView(puVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        c91 c91Var = new c91(parentActivity, true, new ru(vuVar2));
        vuVar2.c = c91Var;
        c91Var.setVisibility(4);
        f0Var.addView(c91Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        vuVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        vuVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
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
            f0Var.addView(textView, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
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
        f0Var.addView(textView2, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
        f0Var.addView(frameLayout2, w7.x5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.x5.e(-2, -1, 53));
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
        frameLayout2.addView(textView3, w7.x5.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(vuVar2) { // from class: org.telegram.ui.Components.mu
            public final /* synthetic */ vu b;

            {
                this.b = vuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        vu.m(this.b, view3);
                        break;
                    case 2:
                        vu vuVar3 = this.b;
                        vuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new o2(12));
                        }
                        vuVar3.dismiss();
                        break;
                    default:
                        vu vuVar4 = this.b;
                        nf.f.s(vuVar4.r, vuVar4.I);
                        vuVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        vuVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.x5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        vuVar2.x = imageView;
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
        linearLayout2.addView(imageView, w7.x5.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(vuVar2) { // from class: org.telegram.ui.Components.mu
            public final /* synthetic */ vu b;

            {
                this.b = vuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        vu.m(this.b, view3);
                        break;
                    case 2:
                        vu vuVar3 = this.b;
                        vuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new o2(12));
                        }
                        vuVar3.dismiss();
                        break;
                    default:
                        vu vuVar4 = this.b;
                        nf.f.s(vuVar4.r, vuVar4.I);
                        vuVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(vuVar2) { // from class: org.telegram.ui.Components.mu
            public final /* synthetic */ vu b;

            {
                this.b = vuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        vu.m(this.b, view3);
                        break;
                    case 2:
                        vu vuVar3 = this.b;
                        vuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new o2(12));
                        }
                        vuVar3.dismiss();
                        break;
                    default:
                        vu vuVar4 = this.b;
                        nf.f.s(vuVar4.r, vuVar4.I);
                        vuVar4.dismiss();
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
        linearLayout2.addView(imageView2, w7.x5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        vuVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.x5.e(-2, -1, 51));
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
        linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(vuVar2) { // from class: org.telegram.ui.Components.mu
            public final /* synthetic */ vu b;

            {
                this.b = vuVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        vu.m(this.b, view3);
                        break;
                    case 2:
                        vu vuVar3 = this.b;
                        vuVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vuVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = vuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new o2(12));
                        }
                        vuVar3.dismiss();
                        break;
                    default:
                        vu vuVar4 = this.b;
                        nf.f.s(vuVar4.r, vuVar4.I);
                        vuVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = c91.a(str4) || c91.a(str3);
        c91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            y81 y81Var = c91Var.f0;
            y81Var.setVisibility(4);
            y81Var.d(false, false);
            c91Var.j(true, false);
        }
        vuVar2.setDelegate(new su(vuVar2, z12));
        vuVar2.F = new tu(vuVar2, ApplicationLoader.applicationContext);
        String e = c91.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            puVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            puVar.setKeepScreenOn(true);
            c91Var.setVisibility(4);
            c91Var.getControlsView().setVisibility(4);
            c91Var.getTextureView().setVisibility(4);
            if (c91Var.getTextureImageView() != null) {
                c91Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(vuVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (vuVar2.F.canDetectOrientation()) {
            vuVar2.F.enable();
        } else {
            vuVar2.F.disable();
            vuVar2.F = null;
        }
        S = vuVar2;
        vuVar2.setCalcMandatoryInsets(z10);
        vuVar2.show();
    }

    public static void m(vu vuVar, View view) {
        eg0 eg0Var = eg0.p0;
        if (eg0Var.P) {
            eg0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new nu(0, view), 300L);
            return;
        }
        boolean z10 = vuVar.y && "inapp".equals(MessagesController.getInstance(vuVar.currentAccount).youtubePipType);
        if ((z10 || vuVar.G()) && vuVar.n.getVisibility() != 0) {
            if (eg0.x(z10, vuVar.r, null, vuVar.b, vuVar.G, vuVar.H, false)) {
                eg0Var.U = vuVar;
            }
            if (vuVar.y) {
                vuVar.b.evaluateJavascript("hideControls();", null);
            }
            vuVar.containerView.setTranslationY(0.0f);
            vuVar.dismissInternal();
        }
    }

    public final boolean G() {
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

    public final void H() {
        pu puVar = this.b;
        if (puVar != null && puVar.getVisibility() == 0) {
            this.w.removeView(puVar);
            puVar.stopLoading();
            puVar.loadUrl("about:blank");
            puVar.destroy();
        }
        eg0.j(false);
        c91 c91Var = this.c;
        if (c91Var != null) {
            c91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        if (this.b == null || !eg0.p0.P) {
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
        this.w.addView(this.b, 0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.J ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        eg0.j(true);
    }

    public final void K() {
        c91 c91Var = this.c;
        View aspectRatioView = c91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!c91Var.f() && !this.O) {
            TextureView textureView = c91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = c91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = c91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        c91 c91Var = this.c;
        return (c91Var.getVisibility() == 0 && c91Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        tu tuVar = this.F;
        if (tuVar != null) {
            tuVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        c91 c91Var = this.c;
        if (c91Var.getVisibility() == 0 && c91Var.w && !c91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = c91Var.T;
                if (z10 || z10) {
                    return;
                }
                c91Var.T = true;
                c91Var.m();
                c91Var.l(false);
                return;
            }
            boolean z11 = c91Var.T;
            if (z11 && z11) {
                c91Var.T = false;
                c91Var.m();
                c91Var.l(false);
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
            c91 c91Var = this.c;
            TextureView textureView = c91Var.d;
            ImageView imageView = c91Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    c91Var.h = createBitmap;
                    c91Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = c91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c91Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (c91Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(c91Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            eg0.j(false);
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
        c91 c91Var = this.c;
        if (view == c91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = c91Var.getMeasuredWidth();
            layoutParams.height = c91Var.getAspectRatioView().getMeasuredHeight() + (c91Var.T ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
