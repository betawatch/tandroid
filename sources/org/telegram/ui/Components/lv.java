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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lv extends org.telegram.ui.ActionBar.f3 {
    public static lv S;
    public int[] E;
    public jv F;
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
    public ev R;
    public fv b;
    public ha1 c;
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

    public static void J(org.telegram.ui.ActionBar.n2 n2Var, MessageObject messageObject, org.telegram.ui.uu0 uu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        TLRPC.MessageMedia messageMedia;
        lv lvVar = S;
        if (lvVar != null) {
            lvVar.H();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : ha1.e(str4)) != null) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().f2(messageObject, null, null, null, null, null, null, 0, uu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        final lv lvVar2 = new lv(parentActivity, false);
        lvVar2.E = new int[2];
        lvVar2.L = -2;
        lvVar2.R = new ev(lvVar2);
        lvVar2.fullWidth = true;
        lvVar2.setApplyTopPadding(false);
        lvVar2.setApplyBottomPadding(false);
        lvVar2.Q = i12;
        if (parentActivity != null) {
            lvVar2.r = parentActivity;
        }
        lvVar2.K = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        lvVar2.J = z11;
        lvVar2.I = str3;
        lvVar2.G = i10;
        lvVar2.H = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            lvVar2.G = point.x;
            lvVar2.H = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        lvVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new bi.d(17));
        lvVar2.container.addView(frameLayout, w7.x5.d(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.f0 f0Var = new ai.f0(lvVar2, parentActivity, 12);
        lvVar2.w = f0Var;
        f0Var.setOnTouchListener(new bi.d(17));
        lvVar2.setCustomView(f0Var);
        fv fvVar = new fv(lvVar2, parentActivity, parentActivity, 0);
        lvVar2.b = fvVar;
        fvVar.getSettings().setJavaScriptEnabled(true);
        fvVar.getSettings().setDomStorageEnabled(true);
        fvVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        fvVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(fvVar, true);
        fvVar.setWebChromeClient(new org.telegram.ui.p1(lvVar2, 1));
        fvVar.setWebViewClient(new gv(lvVar2));
        f0Var.addView(fvVar, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        ha1 ha1Var = new ha1(parentActivity, true, new hv(lvVar2));
        lvVar2.c = ha1Var;
        ha1Var.setVisibility(4);
        f0Var.addView(ha1Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74, -1, 51));
        View view = new View(parentActivity);
        lvVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        f0Var.addView(view, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        lvVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        f0Var.addView(radialProgressView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2, -2, 17));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            f0Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 77.0f, -1, 83));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        f0Var.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 57.0f, -1, 83));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.K5, false));
        f0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false));
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
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, w7.x5.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(lvVar2) { // from class: org.telegram.ui.Components.cv
            public final /* synthetic */ lv b;

            {
                this.b = lvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        lv.o(this.b, view3);
                        break;
                    case 2:
                        lv lvVar3 = this.b;
                        lvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", lvVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = lvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        lvVar3.dismiss();
                        break;
                    default:
                        lv lvVar4 = this.b;
                        of.f.s(lvVar4.r, lvVar4.I);
                        lvVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        lvVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.x5.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        lvVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, w7.x5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 51));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(lvVar2) { // from class: org.telegram.ui.Components.cv
            public final /* synthetic */ lv b;

            {
                this.b = lvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        lv.o(this.b, view3);
                        break;
                    case 2:
                        lv lvVar3 = this.b;
                        lvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", lvVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = lvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        lvVar3.dismiss();
                        break;
                    default:
                        lv lvVar4 = this.b;
                        of.f.s(lvVar4.r, lvVar4.I);
                        lvVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(lvVar2) { // from class: org.telegram.ui.Components.cv
            public final /* synthetic */ lv b;

            {
                this.b = lvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        lv.o(this.b, view3);
                        break;
                    case 2:
                        lv lvVar3 = this.b;
                        lvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", lvVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = lvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        lvVar3.dismiss();
                        break;
                    default:
                        lv lvVar4 = this.b;
                        of.f.s(lvVar4.r, lvVar4.I);
                        lvVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, w7.x5.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        lvVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 0, -1));
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
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(lvVar2) { // from class: org.telegram.ui.Components.cv
            public final /* synthetic */ lv b;

            {
                this.b = lvVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        lv.o(this.b, view3);
                        break;
                    case 2:
                        lv lvVar3 = this.b;
                        lvVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", lvVar3.I));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        Activity activity = lvVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new f2(20));
                        }
                        lvVar3.dismiss();
                        break;
                    default:
                        lv lvVar4 = this.b;
                        of.f.s(lvVar4.r, lvVar4.I);
                        lvVar4.dismiss();
                        break;
                }
            }
        });
        boolean z12 = ha1.a(str4) || ha1.a(str3);
        ha1Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            ca1 ca1Var = ha1Var.f0;
            ca1Var.setVisibility(4);
            ca1Var.d(false, false);
            ha1Var.j(true, false);
        }
        lvVar2.setDelegate(new iv(lvVar2, z12));
        lvVar2.F = new jv(lvVar2, ApplicationLoader.applicationContext);
        String e7 = ha1.e(str4);
        if (e7 != null || !z12) {
            radialProgressView.setVisibility(0);
            fvVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e7 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            fvVar.setKeepScreenOn(true);
            ha1Var.setVisibility(4);
            ha1Var.getControlsView().setVisibility(4);
            ha1Var.getTextureView().setVisibility(4);
            if (ha1Var.getTextureImageView() != null) {
                ha1Var.getTextureImageView().setVisibility(4);
            }
            if (e7 != null && "disabled".equals(MessagesController.getInstance(lvVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (lvVar2.F.canDetectOrientation()) {
            lvVar2.F.enable();
        } else {
            lvVar2.F.disable();
            lvVar2.F = null;
        }
        S = lvVar2;
        lvVar2.setCalcMandatoryInsets(z10);
        lvVar2.show();
    }

    public static void o(lv lvVar, View view) {
        gh0 gh0Var = gh0.p0;
        if (gh0Var.P) {
            gh0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new dv(0, view), 300L);
            return;
        }
        boolean z10 = lvVar.y && "inapp".equals(MessagesController.getInstance(lvVar.currentAccount).youtubePipType);
        if (!z10) {
            Activity activity = lvVar.r;
            if (activity == null) {
                return;
            }
            if (!Settings.canDrawOverlays(activity)) {
                g5.A(activity, null, false);
                return;
            }
        }
        if (lvVar.n.getVisibility() == 0) {
            return;
        }
        if (gh0.x(z10, lvVar.r, null, lvVar.b, lvVar.G, lvVar.H, false)) {
            gh0Var.U = lvVar;
        }
        if (lvVar.y) {
            lvVar.b.evaluateJavascript("hideControls();", null);
        }
        lvVar.containerView.setTranslationY(0.0f);
        lvVar.dismissInternal();
    }

    public final void H() {
        fv fvVar = this.b;
        if (fvVar != null && fvVar.getVisibility() == 0) {
            this.w.removeView(fvVar);
            fvVar.stopLoading();
            fvVar.loadUrl("about:blank");
            fvVar.destroy();
        }
        gh0.j(false);
        ha1 ha1Var = this.c;
        if (ha1Var != null) {
            ha1Var.b();
        }
        S = null;
        dismissInternal();
    }

    public final void I() {
        if (this.b == null || !gh0.p0.P) {
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
        this.w.addView(this.b, 0, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, (this.J ? 22 : 0) + 84, -1, 51));
        setShowWithoutAnimation(true);
        show();
        gh0.j(true);
    }

    public final void K() {
        ha1 ha1Var = this.c;
        View aspectRatioView = ha1Var.getAspectRatioView();
        int[] iArr = this.E;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!ha1Var.f() && !this.O) {
            TextureView textureView = ha1Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = ha1Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = ha1Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        ha1 ha1Var = this.c;
        return (ha1Var.getVisibility() == 0 && ha1Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        jv jvVar = this.F;
        if (jvVar != null) {
            jvVar.disable();
            this.F = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        ha1 ha1Var = this.c;
        if (ha1Var.getVisibility() == 0 && ha1Var.w && !ha1Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = ha1Var.T;
                if (z10 || z10) {
                    return;
                }
                ha1Var.T = true;
                ha1Var.m();
                ha1Var.l(false);
                return;
            }
            boolean z11 = ha1Var.T;
            if (z11 && z11) {
                ha1Var.T = false;
                ha1Var.m();
                ha1Var.l(false);
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
            ha1 ha1Var = this.c;
            TextureView textureView = ha1Var.d;
            ImageView imageView = ha1Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    ha1Var.h = createBitmap;
                    ha1Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = ha1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ha1Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (ha1Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(ha1Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            gh0.j(false);
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
        ha1 ha1Var = this.c;
        if (view == ha1Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = ha1Var.getMeasuredWidth();
            layoutParams.height = ha1Var.getAspectRatioView().getMeasuredHeight() + (ha1Var.T ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
