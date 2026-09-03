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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ru extends org.telegram.ui.ActionBar.h3 {
    public static ru P;
    public int[] B;
    public pu C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public ku O;
    public lu b;
    public e91 c;
    public View d;
    public FrameLayout e;
    public WebChromeClient.CustomViewCallback f;
    public View h;
    public RadialProgressView n;
    public Activity r;
    public LinearLayout s;
    public TextView v;
    public eg.s2 w;
    public ImageView x;
    public boolean y;

    public static void I(org.telegram.ui.ActionBar.p2 p2Var, MessageObject messageObject, org.telegram.ui.fu0 fu0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z4) {
        float f10;
        TLRPC.MessageMedia messageMedia;
        ru ruVar = P;
        if (ruVar != null) {
            ruVar.G();
        }
        if (((messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) ? null : e91.e(str4)) != null) {
            PhotoViewer.t1().K2(null, p2Var, null);
            PhotoViewer.t1().e2(messageObject, null, null, null, null, null, null, 0, fu0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        final ru ruVar2 = new ru(parentActivity, false);
        ruVar2.B = new int[2];
        ruVar2.I = -2;
        ruVar2.O = new ku(ruVar2);
        ruVar2.fullWidth = true;
        ruVar2.setApplyTopPadding(false);
        ruVar2.setApplyBottomPadding(false);
        ruVar2.N = i12;
        if (parentActivity != null) {
            ruVar2.r = parentActivity;
        }
        ruVar2.H = str4;
        boolean z10 = str2 != null && str2.length() > 0;
        ruVar2.G = z10;
        ruVar2.F = str3;
        ruVar2.D = i10;
        ruVar2.E = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = AndroidUtilities.displaySize;
            ruVar2.D = point.x;
            ruVar2.E = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        ruVar2.e = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new org.telegram.ui.ActionBar.s2(16));
        ruVar2.container.addView(frameLayout, k7.c6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        eg.s2 s2Var = new eg.s2(ruVar2, parentActivity, 18);
        ruVar2.w = s2Var;
        s2Var.setOnTouchListener(new org.telegram.ui.ActionBar.s2(16));
        ruVar2.setCustomView(s2Var);
        lu luVar = new lu(ruVar2, parentActivity, parentActivity, 0);
        ruVar2.b = luVar;
        luVar.getSettings().setJavaScriptEnabled(true);
        luVar.getSettings().setDomStorageEnabled(true);
        luVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        luVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(luVar, true);
        luVar.setWebChromeClient(new org.telegram.ui.q1(ruVar2, 1));
        luVar.setWebViewClient(new mu(ruVar2));
        s2Var.addView(luVar, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z10 ? 22 : 0) + 84));
        e91 e91Var = new e91(parentActivity, true, new nu(ruVar2));
        ruVar2.c = e91Var;
        e91Var.setVisibility(4);
        s2Var.addView(e91Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z10 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        ruVar2.h = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        s2Var.addView(view, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z10 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        ruVar2.n = radialProgressView;
        radialProgressView.setVisibility(4);
        s2Var.addView(radialProgressView, k7.c6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z10 ? 22 : 0) + 84) / 2));
        if (z10) {
            TextView textView = new TextView(parentActivity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            s2Var.addView(textView, k7.c6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p5, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        s2Var.addView(textView2, k7.c6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.K5, false));
        s2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
        s2Var.addView(frameLayout2, k7.c6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, k7.c6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.k6.o5;
        org.telegram.ui.yh.t(i13, null, false, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.k6.I5;
        textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i14, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, k7.c6.q(-2, -1, 51));
        final int i15 = 0;
        textView3.setOnClickListener(new View.OnClickListener(ruVar2) { // from class: org.telegram.ui.Components.iu
            public final /* synthetic */ ru b;

            {
                this.b = ruVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ru.m(this.b, view3);
                        break;
                    case 2:
                        ru ruVar3 = this.b;
                        ruVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ruVar3.F));
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        Activity activity = ruVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ruVar3.dismiss();
                        break;
                    default:
                        ru ruVar4 = this.b;
                        af.g.s(ruVar4.r, ruVar4.F);
                        ruVar4.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        ruVar2.s = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, k7.c6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        ruVar2.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView, k7.c6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 1;
        imageView.setOnClickListener(new View.OnClickListener(ruVar2) { // from class: org.telegram.ui.Components.iu
            public final /* synthetic */ ru b;

            {
                this.b = ruVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ru.m(this.b, view3);
                        break;
                    case 2:
                        ru ruVar3 = this.b;
                        ruVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ruVar3.F));
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        Activity activity = ruVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ruVar3.dismiss();
                        break;
                    default:
                        ru ruVar4 = this.b;
                        af.g.s(ruVar4.r, ruVar4.F);
                        ruVar4.dismiss();
                        break;
                }
            }
        });
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(ruVar2) { // from class: org.telegram.ui.Components.iu
            public final /* synthetic */ ru b;

            {
                this.b = ruVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ru.m(this.b, view3);
                        break;
                    case 2:
                        ru ruVar3 = this.b;
                        ruVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ruVar3.F));
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        Activity activity = ruVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ruVar3.dismiss();
                        break;
                    default:
                        ru ruVar4 = this.b;
                        af.g.s(ruVar4.r, ruVar4.F);
                        ruVar4.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i13, false), mode));
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i14, false), 0, -1));
        linearLayout2.addView(imageView2, k7.c6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        ruVar2.v = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.yh.t(i13, null, false, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i14, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, k7.c6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.yh.t(i13, null, false, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i14, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, k7.c6.e(-2, -1, 51));
        final int i18 = 3;
        textView5.setOnClickListener(new View.OnClickListener(ruVar2) { // from class: org.telegram.ui.Components.iu
            public final /* synthetic */ ru b;

            {
                this.b = ruVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ru.m(this.b, view3);
                        break;
                    case 2:
                        ru ruVar3 = this.b;
                        ruVar3.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ruVar3.F));
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        Activity activity = ruVar3.r;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).D0(new k2(14));
                        }
                        ruVar3.dismiss();
                        break;
                    default:
                        ru ruVar4 = this.b;
                        af.g.s(ruVar4.r, ruVar4.F);
                        ruVar4.dismiss();
                        break;
                }
            }
        });
        boolean z11 = e91.a(str4) || e91.a(str3);
        e91Var.setVisibility(z11 ? 0 : 4);
        if (z11) {
            a91 a91Var = e91Var.c0;
            a91Var.setVisibility(4);
            a91Var.d(false, false);
            e91Var.j(true, false);
        }
        ruVar2.setDelegate(new ou(ruVar2, z11));
        ruVar2.C = new pu(ruVar2, ApplicationLoader.applicationContext);
        String e6 = e91.e(str4);
        if (e6 != null || !z11) {
            radialProgressView.setVisibility(0);
            luVar.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (e6 != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            luVar.setKeepScreenOn(true);
            e91Var.setVisibility(4);
            e91Var.getControlsView().setVisibility(4);
            e91Var.getTextureView().setVisibility(4);
            if (e91Var.getTextureImageView() != null) {
                e91Var.getTextureImageView().setVisibility(4);
            }
            if (e6 != null && "disabled".equals(MessagesController.getInstance(ruVar2.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (ruVar2.C.canDetectOrientation()) {
            ruVar2.C.enable();
        } else {
            ruVar2.C.disable();
            ruVar2.C = null;
        }
        P = ruVar2;
        ruVar2.setCalcMandatoryInsets(z4);
        ruVar2.show();
    }

    public static void m(ru ruVar, View view) {
        ng0 ng0Var = ng0.m0;
        if (ng0Var.M) {
            ng0.j(false);
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new ju(0, view), 300L);
            return;
        }
        boolean z4 = ruVar.y && "inapp".equals(MessagesController.getInstance(ruVar.currentAccount).youtubePipType);
        if ((z4 || ruVar.F()) && ruVar.n.getVisibility() != 0) {
            if (ng0.x(z4, ruVar.r, null, ruVar.b, ruVar.D, ruVar.E, false)) {
                ng0Var.R = ruVar;
            }
            if (ruVar.y) {
                ruVar.b.evaluateJavascript("hideControls();", null);
            }
            ruVar.containerView.setTranslationY(0.0f);
            ruVar.dismissInternal();
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
        z4.B(activity, null, false);
        return false;
    }

    public final void G() {
        lu luVar = this.b;
        if (luVar != null && luVar.getVisibility() == 0) {
            this.w.removeView(luVar);
            luVar.stopLoading();
            luVar.loadUrl("about:blank");
            luVar.destroy();
        }
        ng0.j(false);
        e91 e91Var = this.c;
        if (e91Var != null) {
            e91Var.b();
        }
        P = null;
        dismissInternal();
    }

    public final void H() {
        if (this.b == null || !ng0.m0.M) {
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
        this.w.addView(this.b, 0, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.G ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        ng0.j(true);
    }

    public final void J() {
        e91 e91Var = this.c;
        View aspectRatioView = e91Var.getAspectRatioView();
        int[] iArr = this.B;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!e91Var.f() && !this.L) {
            TextureView textureView = e91Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = e91Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = e91Var.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        e91 e91Var = this.c;
        return (e91Var.getVisibility() == 0 && e91Var.Q) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        return this.e.getVisibility() != 0;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        pu puVar = this.C;
        if (puVar != null) {
            puVar.disable();
            this.C = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onConfigurationChanged(Configuration configuration) {
        e91 e91Var = this.c;
        if (e91Var.getVisibility() == 0 && e91Var.w && !e91Var.f()) {
            if (configuration.orientation == 2) {
                boolean z4 = e91Var.Q;
                if (z4 || z4) {
                    return;
                }
                e91Var.Q = true;
                e91Var.m();
                e91Var.l(false);
                return;
            }
            boolean z10 = e91Var.Q;
            if (z10 && z10) {
                e91Var.Q = false;
                e91Var.m();
                e91Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerDraw(Canvas canvas) {
        int i10 = this.M;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.M = i11;
            if (i11 != 0) {
                this.container.invalidate();
                return;
            }
            e91 e91Var = this.c;
            TextureView textureView = e91Var.d;
            ImageView imageView = e91Var.e;
            if (imageView != null) {
                try {
                    Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    e91Var.h = createBitmap;
                    e91Var.n.getBitmap(createBitmap);
                } catch (Throwable th2) {
                    Bitmap bitmap = e91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        e91Var.h = null;
                    }
                    FileLog.e(th2);
                }
                if (e91Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(e91Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            ng0.j(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f10) {
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
        e91 e91Var = this.c;
        if (view == e91Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = e91Var.getMeasuredWidth();
            layoutParams.height = e91Var.getAspectRatioView().getMeasuredHeight() + (e91Var.Q ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }
}
