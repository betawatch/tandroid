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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hv extends org.telegram.ui.ActionBar.e3 {
    public static hv S;
    public int[] E;
    public fv F;
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
    public av R;
    public bv b;
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

    public static void J(org.telegram.ui.ActionBar.m2 m2Var, MessageObject messageObject, org.telegram.ui.zu0 zu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        hv hvVar = S;
        if (hvVar != null) {
            hvVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : da1.e(str4)) != null) {
            PhotoViewer.t1().K2(null, m2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, zu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = m2Var.getParentActivity();
        final hv hvVar2 = new hv(parentActivity, false);
        hvVar2.E = new int[2];
        hvVar2.L = -2;
        hvVar2.R = new av(hvVar2);
        hvVar2.fullWidth = true;
        hvVar2.setApplyTopPadding(false);
        hvVar2.setApplyBottomPadding(false);
        hvVar2.Q = i12;
        if (parentActivity != null) {
            hvVar2.r = parentActivity;
        }
        hvVar2.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        hvVar2.J = z11;
        hvVar2.I = str3;
        hvVar2.G = i10;
        hvVar2.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            hvVar2.G = point.x;
            hvVar2.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        hvVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new ci.d(17));
        hvVar2.container.addView(frameLayout, w7.z5.d(-1.0f, -1));
        frameLayout.setVisibility(4);
        ah.x xVar = new ah.x(hvVar2, parentActivity, 13);
        hvVar2.w = xVar;
        xVar.setOnTouchListener(new ci.d(17));
        hvVar2.setCustomView(xVar);
        bv bvVar = new bv(hvVar2, parentActivity, parentActivity, 0);
        hvVar2.b = bvVar;
        bvVar.getSettings().setJavaScriptEnabled(true);
        bvVar.getSettings().setDomStorageEnabled(true);
        bvVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        bvVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(bvVar, true);
        bvVar.setWebChromeClient(new org.telegram.ui.r1(hvVar2, 1));
        bvVar.setWebViewClient(new cv(hvVar2));
        xVar.addView(bvVar, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        da1 da1Var = new da1(parentActivity, true, new dv(hvVar2));
        hvVar2.c = da1Var;
        da1Var.setVisibility(4);
        xVar.addView(da1Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74, -1, 51));
        View view = new View(parentActivity);
        hvVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        xVar.addView(view, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        hvVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        xVar.addView(radialProgressView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2, -2, 17));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        xVar.addView(textView2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 57.0f, -1, 83));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.K5, false));
        xVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
        xVar.addView(frameLayout2, w7.z5.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.g6.o5;
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.g6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.z5.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(hvVar2) { // from class: org.telegram.ui.Components.yu
            public final /* synthetic */ hv b;

            {
                this.b = hvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hv.n(this.b, view3);
                        break;
                    case 2:
                        hv hvVar3 = this.b;
                        hvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar3.dismiss();
                        break;
                    default:
                        hv hvVar4 = this.b;
                        pf.d.r(hvVar4.r, hvVar4.I);
                        hvVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        hvVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.z5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        hvVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.z5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 51));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(hvVar2) { // from class: org.telegram.ui.Components.yu
            public final /* synthetic */ hv b;

            {
                this.b = hvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hv.n(this.b, view3);
                        break;
                    case 2:
                        hv hvVar3 = this.b;
                        hvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar3.dismiss();
                        break;
                    default:
                        hv hvVar4 = this.b;
                        pf.d.r(hvVar4.r, hvVar4.I);
                        hvVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(hvVar2) { // from class: org.telegram.ui.Components.yu
            public final /* synthetic */ hv b;

            {
                this.b = hvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hv.n(this.b, view3);
                        break;
                    case 2:
                        hv hvVar3 = this.b;
                        hvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar3.dismiss();
                        break;
                    default:
                        hv hvVar4 = this.b;
                        pf.d.r(hvVar4.r, hvVar4.I);
                        hvVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.z5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        hvVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, w7.z5.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.z5.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(hvVar2) { // from class: org.telegram.ui.Components.yu
            public final /* synthetic */ hv b;

            {
                this.b = hvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hv.n(this.b, view3);
                        break;
                    case 2:
                        hv hvVar3 = this.b;
                        hvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hvVar3.I));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity = hvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new n2(13));
                        }
                        hvVar3.dismiss();
                        break;
                    default:
                        hv hvVar4 = this.b;
                        pf.d.r(hvVar4.r, hvVar4.I);
                        hvVar4.dismiss();
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
        hvVar2.setDelegate(new ev(hvVar2, z12));
        hvVar2.F = new fv(hvVar2, ApplicationLoader.applicationContext);
        String e = da1.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(0);
            bvVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            bvVar.setKeepScreenOn(true);
            da1Var.setVisibility(4);
            da1Var.getControlsView().setVisibility(4);
            da1Var.getTextureView().setVisibility(4);
            if (da1Var.getTextureImageView() != null) {
                da1Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(MessagesController.getInstance(hvVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (hvVar2.F.canDetectOrientation()) {
            hvVar2.F.enable();
        } else {
            hvVar2.F.disable();
            hvVar2.F = null;
        }
        S = hvVar2;
        hvVar2.setCalcMandatoryInsets(z10);
        hvVar2.show();
    }

    public static void n(hv hvVar, View view) {
        fh0 fh0Var = fh0.p0;
        if (fh0Var.P) {
            fh0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new zu(0, view), 300L);
            return;
        }
        boolean z10 = hvVar.y && "inapp".equals(MessagesController.getInstance(hvVar.currentAccount).youtubePipType);
        if (!z10) {
            Activity activity = hvVar.r;
            if (activity == null) {
                return;
            }
            if (!Settings.canDrawOverlays(activity)) {
                g5.A(activity, null, false);
                return;
            }
        }
        if (hvVar.n.getVisibility() == 0) {
            return;
        }
        if (fh0.x(z10, hvVar.r, null, hvVar.b, hvVar.G, hvVar.H, false)) {
            fh0Var.U = hvVar;
        }
        if (hvVar.y) {
            hvVar.b.evaluateJavascript("hideControls();", null);
        }
        hvVar.containerView.setTranslationY(0.0f);
        hvVar.dismissInternal();
    }

    public final void H() {
        bv bvVar = this.b;
        if (bvVar != null && bvVar.getVisibility() == 0) {
            this.w.removeView(bvVar);
            bvVar.stopLoading();
            bvVar.loadUrl("about:blank");
            bvVar.destroy();
        }
        fh0.j(false);
        da1 da1Var = this.c;
        if (da1Var != null) {
            da1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        if (this.b == null || !fh0.p0.P) {
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
        fh0.j(true);
    }

    public final void K() {
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

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        da1 da1Var = this.c;
        return (da1Var.getVisibility() == 0 && da1Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        fv fvVar = this.F;
        if (fvVar != null) {
            fvVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
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

    @Override // org.telegram.ui.ActionBar.e3
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
            fh0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onContainerTranslationYChanged(float f7) {
        K();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        if (view != this.c.getControlsView()) {
            return false;
        }
        K();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
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
