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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zu implements ka1 {
    public final /* synthetic */ dv a;

    public zu(dv dvVar) {
        this.a = dvVar;
    }

    @Override // org.telegram.ui.Components.ka1
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        dv dvVar = this.a;
        FrameLayout frameLayout = dvVar.e;
        Activity activity = dvVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            dvVar.M = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(dvVar.L);
                return null;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(dvVar.c.getAspectRatioView());
        dvVar.N = false;
        dvVar.M = z11;
        if (activity == null) {
            return null;
        }
        try {
            dvVar.L = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.ka1
    public final void b() {
        dv dvVar = this.a;
        if (dvVar.c.f()) {
            dvVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.ka1
    public final void d() {
        dv dvVar = this.a;
        xu xuVar = dvVar.b;
        xuVar.setVisibility(0);
        dvVar.s.setVisibility(0);
        dvVar.v.setVisibility(4);
        xuVar.setKeepScreenOn(true);
        na1 na1Var = dvVar.c;
        na1Var.setVisibility(4);
        na1Var.getControlsView().setVisibility(4);
        na1Var.getTextureView().setVisibility(4);
        if (na1Var.getTextureImageView() != null) {
            na1Var.getTextureImageView().setVisibility(4);
        }
        dvVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            xuVar.loadUrl(dvVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ka1
    public final void e(na1 na1Var, boolean z10) {
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.ka1
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.j3 j3Var;
        dv dvVar = this.a;
        na1 na1Var = dvVar.c;
        int[] iArr = dvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(dvVar.r);
            if (!dh0.x(false, dvVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            dh0.p0.U = dvVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        dvVar.O = true;
        na1Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - dvVar.getLeftInset();
        float f7 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
        iArr[1] = (int) (f7 - viewGroup2.getTranslationY());
        TextureView textureView2 = na1Var.getTextureView();
        ImageView textureImageView = na1Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        j3Var = ((org.telegram.ui.ActionBar.k3) dvVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(j3Var, v6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new org.telegram.ui.sp(this, 24));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.ka1
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.ka1
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

    @Override // org.telegram.ui.Components.ka1
    public final void i(boolean z10, fa1 fa1Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.j3 j3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.j3 j3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.j3 j3Var3;
        if (!z10) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.a.r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (z11) {
                dv dvVar = this.a;
                dvVar.setOnShowListener(dvVar.R);
                il0 o10 = dh0.o(f7, false);
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
                dh0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                dv dvVar2 = this.a;
                dvVar2.P = 4;
                j3Var = ((org.telegram.ui.ActionBar.k3) dvVar2).backDrawable;
                j3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        dv dvVar3 = this.a;
        if (dvVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.k3) dvVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                dv dvVar4 = this.a;
                int i10 = dvVar4.L;
                if (i10 != -2) {
                    dvVar4.r.setRequestedOrientation(i10);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (this.a.e.getVisibility() == 0) {
            viewGroup6 = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
            viewGroup7 = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
            viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
            j3Var3 = ((org.telegram.ui.ActionBar.k3) this.a).backDrawable;
            j3Var3.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z11) {
            if (this.a.e.getVisibility() == 0) {
                this.a.e.setAlpha(1.0f);
                this.a.e.setVisibility(4);
            }
            fa1Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        il0 o11 = dh0.o(f7, true);
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
        viewGroup4 = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        j3Var2 = ((org.telegram.ui.ActionBar.k3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(j3Var2, v6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new bi.ce(24, this, fa1Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.ka1
    public final void c(float f7) {
    }
}
