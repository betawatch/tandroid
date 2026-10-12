package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dv implements z91 {
    public final /* synthetic */ hv a;

    public dv(hv hvVar) {
        this.a = hvVar;
    }

    @Override // org.telegram.ui.Components.z91
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        hv hvVar = this.a;
        FrameLayout frameLayout = hvVar.e;
        Activity activity = hvVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            hvVar.M = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(hvVar.L);
                return null;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(hvVar.c.getAspectRatioView());
        hvVar.N = false;
        hvVar.M = z11;
        if (activity == null) {
            return null;
        }
        try {
            hvVar.L = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.z91
    public final void b() {
        hv hvVar = this.a;
        if (hvVar.c.f()) {
            hvVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.z91
    public final void d() {
        hv hvVar = this.a;
        bv bvVar = hvVar.b;
        bvVar.setVisibility(0);
        hvVar.s.setVisibility(0);
        hvVar.v.setVisibility(4);
        bvVar.setKeepScreenOn(true);
        ca1 ca1Var = hvVar.c;
        ca1Var.setVisibility(4);
        ca1Var.getControlsView().setVisibility(4);
        ca1Var.getTextureView().setVisibility(4);
        if (ca1Var.getTextureImageView() != null) {
            ca1Var.getTextureImageView().setVisibility(4);
        }
        hvVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            bvVar.loadUrl(hvVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.z91
    public final void e(ca1 ca1Var, boolean z10) {
        Activity activity = this.a.r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.z91
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.d3 d3Var;
        hv hvVar = this.a;
        ca1 ca1Var = hvVar.c;
        int[] iArr = hvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(hvVar.r);
            if (!fh0.x(false, hvVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            fh0.p0.U = hvVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        hvVar.O = true;
        ca1Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - hvVar.getLeftInset();
        float f7 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
        iArr[1] = (int) (f7 - viewGroup2.getTranslationY());
        TextureView textureView2 = ca1Var.getTextureView();
        ImageView textureImageView = ca1Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]);
        viewGroup3 = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        d3Var = ((org.telegram.ui.ActionBar.e3) hvVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(d3Var, v6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new l6(this, 20));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.z91
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.z91
    public final boolean h() {
        Activity activity = this.a.r;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        g5.A(activity, null, false);
        return false;
    }

    @Override // org.telegram.ui.Components.z91
    public final void i(boolean z10, u91 u91Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.d3 d3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.d3 d3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.d3 d3Var3;
        if (!z10) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.a.r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (z11) {
                hv hvVar = this.a;
                hvVar.setOnShowListener(hvVar.R);
                il0 o10 = fh0.o(f7, false);
                TextureView textureView = this.a.c.getTextureView();
                ImageView textureImageView = this.a.c.getTextureImageView();
                float f10 = o10.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f10);
                textureImageView.setScaleY(f10);
                textureImageView.setTranslationX(o10.a);
                textureImageView.setTranslationY(o10.b);
                textureView.setScaleX(f10);
                textureView.setScaleY(f10);
                textureView.setTranslationX(o10.a);
                textureView.setTranslationY(o10.b);
            } else {
                fh0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                hv hvVar2 = this.a;
                hvVar2.P = 4;
                d3Var = ((org.telegram.ui.ActionBar.e3) hvVar2).backDrawable;
                d3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        hv hvVar3 = this.a;
        if (hvVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) hvVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                hv hvVar4 = this.a;
                int i10 = hvVar4.L;
                if (i10 != -2) {
                    hvVar4.r.setRequestedOrientation(i10);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (this.a.e.getVisibility() == 0) {
            viewGroup6 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
            viewGroup7 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
            viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
            d3Var3 = ((org.telegram.ui.ActionBar.e3) this.a).backDrawable;
            d3Var3.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z11) {
            if (this.a.e.getVisibility() == 0) {
                this.a.e.setAlpha(1.0f);
                this.a.e.setVisibility(4);
            }
            u91Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        il0 o11 = fh0.o(f7, true);
        float width = o11.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, o11.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, o11.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, o11.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, o11.b);
        viewGroup4 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        d3Var2 = ((org.telegram.ui.ActionBar.e3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(d3Var2, v6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new bi.t(23, this, u91Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.z91
    public final void c(float f7) {
    }
}
