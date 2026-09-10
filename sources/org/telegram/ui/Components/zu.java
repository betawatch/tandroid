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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zu extends org.telegram.ui.ActionBar.h3 {
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
    public o91 c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f;
    public View h;
    public RadialProgressView n;
    public Activity r;
    public LinearLayout s;
    public TextView v;
    public bi.ld w;
    public ImageView x;
    public boolean y;

    public static void J(org.telegram.ui.ActionBar.p2 p2Var, MessageObject messageObject, org.telegram.ui.tu0 tu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        zu zuVar = S;
        if (zuVar != null) {
            zuVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : o91.e(str4)) != null) {
            PhotoViewer.t1().K2(null, p2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, tu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
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
        frameLayout.setOnTouchListener(new ai.h(17));
        zuVar2.container.addView(frameLayout, w7.a6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        bi.ld ldVar = new bi.ld(zuVar2, parentActivity, 10);
        zuVar2.w = ldVar;
        ldVar.setOnTouchListener(new ai.h(17));
        zuVar2.setCustomView(ldVar);
        tu tuVar = new tu(zuVar2, parentActivity, parentActivity, 0);
        zuVar2.b = tuVar;
        tuVar.getSettings().setJavaScriptEnabled(true);
        tuVar.getSettings().setDomStorageEnabled(true);
        tuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        tuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(tuVar, true);
        tuVar.setWebChromeClient(new org.telegram.ui.q1(zuVar2, 1));
        tuVar.setWebViewClient(new uu(zuVar2));
        ldVar.addView(tuVar, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        o91 o91Var = new o91(parentActivity, true, new vu(zuVar2));
        zuVar2.c = o91Var;
        o91Var.setVisibility(4);
        ldVar.addView(o91Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        zuVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        ldVar.addView(view, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        zuVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        ldVar.addView(radialProgressView, w7.a6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            ldVar.addView(textView, w7.a6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        ldVar.addView(textView2, w7.a6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K5, false));
        ldVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
        ldVar.addView(frameLayout2, w7.a6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.a6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.j6.o5;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.a6.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.qu
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new q2(11));
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
        frameLayout2.addView(linearLayout2, w7.a6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        zuVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.a6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.qu
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new q2(11));
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
        View.OnClickListener onClickListener = new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.qu
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new q2(11));
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
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.a6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        zuVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.a6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.a6.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(zuVar2) { // from class: org.telegram.ui.Components.qu
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = zuVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new q2(11));
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
        boolean z12 = o91.a(str4) || o91.a(str3);
        o91Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            k91 k91Var = o91Var.f0;
            k91Var.setVisibility(4);
            k91Var.d(false, false);
            o91Var.j(true, false);
        }
        zuVar2.setDelegate(new wu(zuVar2, z12));
        zuVar2.F = new xu(zuVar2, ApplicationLoader.applicationContext);
        String e = o91.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            tuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            tuVar.setKeepScreenOn(true);
            o91Var.setVisibility(4);
            o91Var.getControlsView().setVisibility(4);
            o91Var.getTextureView().setVisibility(4);
            if (o91Var.getTextureImageView() != null) {
                o91Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(zuVar2.currentAccount).youtubePipType)) {
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
        og0 og0Var = og0.p0;
        if (og0Var.P) {
            og0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new ru(0, view), 300L);
            return;
        }
        boolean z10 = zuVar.y && "inapp".equals(MessagesController.getInstance(zuVar.currentAccount).youtubePipType);
        if ((z10 || zuVar.F()) && zuVar.n.getVisibility() != 0) {
            if (og0.x(z10, zuVar.r, null, zuVar.b, zuVar.G, zuVar.H, false)) {
                og0Var.U = zuVar;
            }
            if (zuVar.y) {
                zuVar.b.evaluateJavascript("hideControls();", null);
            }
            zuVar.containerView.setTranslationY(0.0f);
            zuVar.dismissInternal();
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
        d5.B(activity, null, false);
        return false;
    }

    public final void H() {
        tu tuVar = this.b;
        if (tuVar != null && tuVar.getVisibility() == 0) {
            this.w.removeView(tuVar);
            tuVar.stopLoading();
            tuVar.loadUrl("about:blank");
            tuVar.destroy();
        }
        og0.j(false);
        o91 o91Var = this.c;
        if (o91Var != null) {
            o91Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        if (this.b == null || !og0.p0.P) {
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
        this.w.addView(this.b, 0, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.J ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        og0.j(true);
    }

    public final void K() {
        o91 o91Var = this.c;
        View aspectRatioView = o91Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!o91Var.f() && !this.O) {
            TextureView textureView = o91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = o91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = o91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        o91 o91Var = this.c;
        return (o91Var.getVisibility() == 0 && o91Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        xu xuVar = this.F;
        if (xuVar != null) {
            xuVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onConfigurationChanged(Configuration configuration) {
        o91 o91Var = this.c;
        if (o91Var.getVisibility() == 0 && o91Var.w && !o91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = o91Var.T;
                if (z10 || z10) {
                    return;
                }
                o91Var.T = true;
                o91Var.m();
                o91Var.l(false);
                return;
            }
            boolean z11 = o91Var.T;
            if (z11 && z11) {
                o91Var.T = false;
                o91Var.m();
                o91Var.l(false);
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
            o91 o91Var = this.c;
            TextureView textureView = o91Var.d;
            ImageView imageView = o91Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    o91Var.h = createBitmap;
                    o91Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = o91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        o91Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (o91Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(o91Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            og0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f7) {
        K();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        K();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        o91 o91Var = this.c;
        if (view == o91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = o91Var.getMeasuredWidth();
            layoutParams.height = o91Var.getAspectRatioView().getMeasuredHeight() + (o91Var.T ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
