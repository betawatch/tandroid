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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dv extends org.telegram.ui.ActionBar.k3 {
    public static dv S;
    public int[] E;
    public bv F;
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
    public wu R;
    public xu b;
    public ma1 c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f;
    public View h;
    public RadialProgressView n;
    public Activity r;
    public LinearLayout s;
    public TextView v;
    public bh.r w;
    public ImageView x;
    public boolean y;

    public static void I(org.telegram.ui.ActionBar.r2 r2Var, MessageObject messageObject, org.telegram.ui.gu0 gu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        dv dvVar = S;
        if (dvVar != null) {
            dvVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : ma1.e(str4)) != null) {
            PhotoViewer.u1().M2(null, r2Var, null);
            PhotoViewer.u1().g2(messageObject, null, null, null, null, null, null, 0, gu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = r2Var.getParentActivity();
        final dv dvVar2 = new dv(parentActivity, false);
        dvVar2.E = new int[2];
        dvVar2.L = -2;
        dvVar2.R = new wu(dvVar2);
        dvVar2.fullWidth = true;
        dvVar2.setApplyTopPadding(false);
        dvVar2.setApplyBottomPadding(false);
        dvVar2.Q = i12;
        if (parentActivity != null) {
            dvVar2.r = parentActivity;
        }
        dvVar2.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        dvVar2.J = z11;
        dvVar2.I = str3;
        dvVar2.G = i10;
        dvVar2.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            dvVar2.G = point.x;
            dvVar2.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        dvVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new ei.d(17));
        dvVar2.container.addView(frameLayout, gb1.g(-1.0f, -1));
        frameLayout.setVisibility(4);
        bh.r rVar = new bh.r(dvVar2, parentActivity, 15);
        dvVar2.w = rVar;
        rVar.setOnTouchListener(new ei.d(17));
        dvVar2.setCustomView(rVar);
        xu xuVar = new xu(dvVar2, parentActivity, parentActivity, 0);
        dvVar2.b = xuVar;
        xuVar.getSettings().setJavaScriptEnabled(true);
        xuVar.getSettings().setDomStorageEnabled(true);
        xuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        xuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(xuVar, true);
        xuVar.setWebChromeClient(new org.telegram.ui.o1(dvVar2, 1));
        xuVar.setWebViewClient(new yu(dvVar2));
        rVar.addView(xuVar, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        ma1 ma1Var = new ma1(parentActivity, true, new zu(dvVar2));
        dvVar2.c = ma1Var;
        ma1Var.setVisibility(4);
        rVar.addView(ma1Var, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        dvVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        rVar.addView(view, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        dvVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        rVar.addView(radialProgressView, gb1.h(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            rVar.addView(textView, gb1.h(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        rVar.addView(textView2, gb1.h(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.K5, view2, null);
        rVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, frameLayout2, null);
        rVar.addView(frameLayout2, gb1.i(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, gb1.i(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.y6.o5;
        org.telegram.ui.ActionBar.f7.V(textView3, i13, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.y6.I5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        textView3.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(textView3, g02, null, N, null);
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, gb1.u(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(dvVar2) { // from class: org.telegram.ui.Components.uu
            public final /* synthetic */ dv b;

            {
                this.b = dvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        dv.m(this.b, view3);
                        break;
                    case 2:
                        dv dvVar3 = this.b;
                        dvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", dvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = dvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new f2(25));
                        }
                        dvVar3.dismiss();
                        break;
                    default:
                        dv dvVar4 = this.b;
                        qf.d.r(dvVar4.r, dvVar4.I);
                        dvVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        dvVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, gb1.i(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        dvVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i13, null, mode);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
        imageView.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(imageView, g03, null, N2, null);
        linearLayout2.addView(imageView, gb1.h(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(dvVar2) { // from class: org.telegram.ui.Components.uu
            public final /* synthetic */ dv b;

            {
                this.b = dvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        dv.m(this.b, view3);
                        break;
                    case 2:
                        dv dvVar3 = this.b;
                        dvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", dvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = dvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new f2(25));
                        }
                        dvVar3.dismiss();
                        break;
                    default:
                        dv dvVar4 = this.b;
                        qf.d.r(dvVar4.r, dvVar4.I);
                        dvVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(dvVar2) { // from class: org.telegram.ui.Components.uu
            public final /* synthetic */ dv b;

            {
                this.b = dvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        dv.m(this.b, view3);
                        break;
                    case 2:
                        dv dvVar3 = this.b;
                        dvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", dvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = dvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new f2(25));
                        }
                        dvVar3.dismiss();
                        break;
                    default:
                        dv dvVar4 = this.b;
                        qf.d.r(dvVar4.r, dvVar4.I);
                        dvVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        org.telegram.ui.ActionBar.f7.t(imageView2, i13, null, mode);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i14);
        imageView2.setBackground(g04);
        org.telegram.ui.ActionBar.f7.k(imageView2, g04, null, N3, null);
        linearLayout2.addView(imageView2, gb1.i(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        dvVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView4, i13, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i14);
        textView4.setBackground(g05);
        org.telegram.ui.ActionBar.f7.k(textView4, g05, null, N4, null);
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, gb1.i(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView5, i13, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 0, -1);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i14);
        textView5.setBackground(g06);
        org.telegram.ui.ActionBar.f7.k(textView5, g06, null, N5, null);
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, gb1.i(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(dvVar2) { // from class: org.telegram.ui.Components.uu
            public final /* synthetic */ dv b;

            {
                this.b = dvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        dv.m(this.b, view3);
                        break;
                    case 2:
                        dv dvVar3 = this.b;
                        dvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", dvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = dvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).I0(new f2(25));
                        }
                        dvVar3.dismiss();
                        break;
                    default:
                        dv dvVar4 = this.b;
                        qf.d.r(dvVar4.r, dvVar4.I);
                        dvVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = ma1.a(str4) || ma1.a(str3);
        ma1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            ia1 ia1Var = ma1Var.f0;
            ia1Var.setVisibility(4);
            ia1Var.d(false, false);
            ma1Var.j(true, false);
        }
        dvVar2.setDelegate(new av(dvVar2, z12));
        dvVar2.F = new bv(dvVar2, ApplicationLoader.applicationContext);
        String e = ma1.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            xuVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            xuVar.setKeepScreenOn(true);
            ma1Var.setVisibility(4);
            ma1Var.getControlsView().setVisibility(4);
            ma1Var.getTextureView().setVisibility(4);
            if (ma1Var.getTextureImageView() != null) {
                ma1Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(dvVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (dvVar2.F.canDetectOrientation()) {
            dvVar2.F.enable();
        } else {
            dvVar2.F.disable();
            dvVar2.F = null;
        }
        S = dvVar2;
        dvVar2.setCalcMandatoryInsets(z10);
        dvVar2.show();
    }

    public static void m(dv dvVar, View view) {
        ch0 ch0Var = ch0.p0;
        if (ch0Var.P) {
            ch0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new vu(0, view), 300L);
            return;
        }
        boolean z10 = dvVar.y && "inapp".equals(MessagesController.getInstance(dvVar.currentAccount).youtubePipType);
        if (!z10) {
            Activity activity = dvVar.r;
            if (activity == null) {
                return;
            }
            if (!Settings.canDrawOverlays(activity)) {
                g5.A(activity, null, false);
                return;
            }
        }
        if (dvVar.n.getVisibility() == 0) {
            return;
        }
        if (ch0.x(z10, dvVar.r, null, dvVar.b, dvVar.G, dvVar.H, false)) {
            ch0Var.U = dvVar;
        }
        if (dvVar.y) {
            dvVar.b.evaluateJavascript("hideControls();", null);
        }
        dvVar.containerView.setTranslationY(0.0f);
        dvVar.dismissInternal();
    }

    public final void G() {
        xu xuVar = this.b;
        if (xuVar != null && xuVar.getVisibility() == 0) {
            this.w.removeView(xuVar);
            xuVar.stopLoading();
            xuVar.loadUrl("about:blank");
            xuVar.destroy();
        }
        ch0.j(false);
        ma1 ma1Var = this.c;
        if (ma1Var != null) {
            ma1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void H() {
        if (this.b == null || !ch0.p0.P) {
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
        this.w.addView(this.b, 0, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.J ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        ch0.j(true);
    }

    public final void J() {
        ma1 ma1Var = this.c;
        View aspectRatioView = ma1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!ma1Var.f() && !this.O) {
            TextureView textureView = ma1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = ma1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = ma1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        ma1 ma1Var = this.c;
        return (ma1Var.getVisibility() == 0 && ma1Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        bv bvVar = this.F;
        if (bvVar != null) {
            bvVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onConfigurationChanged(Configuration configuration) {
        ma1 ma1Var = this.c;
        if (ma1Var.getVisibility() == 0 && ma1Var.w && !ma1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = ma1Var.T;
                if (z10 || z10) {
                    return;
                }
                ma1Var.T = true;
                ma1Var.m();
                ma1Var.l(false);
                return;
            }
            boolean z11 = ma1Var.T;
            if (z11 && z11) {
                ma1Var.T = false;
                ma1Var.m();
                ma1Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.P;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.P = i11;
            if (i11 != 0) {
                this.container.invalidate();
                return;
            }
            ma1 ma1Var = this.c;
            TextureView textureView = ma1Var.d;
            ImageView imageView = ma1Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    ma1Var.h = createBitmap;
                    ma1Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = ma1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ma1Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (ma1Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(ma1Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            ch0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerTranslationYChanged(float f7) {
        J();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        J();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ma1 ma1Var = this.c;
        if (view == ma1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = ma1Var.getMeasuredWidth();
            layoutParams.height = ma1Var.getAspectRatioView().getMeasuredHeight() + (ma1Var.T ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
