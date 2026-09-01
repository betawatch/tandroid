package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nu implements c91 {
    public final /* synthetic */ ru a;

    public nu(ru ruVar) {
        this.a = ruVar;
    }

    @Override // org.telegram.ui.Components.c91
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ru ruVar = this.a;
        FrameLayout frameLayout = ruVar.e;
        Activity activity = ruVar.r;
        if (!z4) {
            frameLayout.setVisibility(4);
            ruVar.J = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(ruVar.I);
                return null;
            } catch (Exception e6) {
                FileLog.e(e6);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(ruVar.c.getAspectRatioView());
        ruVar.K = false;
        ruVar.J = z10;
        if (activity == null) {
            return null;
        }
        try {
            ruVar.I = activity.getRequestedOrientation();
            if (z10) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void b() {
        ru ruVar = this.a;
        if (ruVar.c.f()) {
            ruVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void d() {
        ru ruVar = this.a;
        lu luVar = ruVar.b;
        luVar.setVisibility(0);
        ruVar.s.setVisibility(0);
        ruVar.v.setVisibility(4);
        luVar.setKeepScreenOn(true);
        f91 f91Var = ruVar.c;
        f91Var.setVisibility(4);
        f91Var.getControlsView().setVisibility(4);
        f91Var.getTextureView().setVisibility(4);
        if (f91Var.getTextureImageView() != null) {
            f91Var.getTextureImageView().setVisibility(4);
        }
        ruVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            luVar.loadUrl(ruVar.H, hashMap);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void e(f91 f91Var, boolean z4) {
        Activity activity = this.a.r;
        if (z4) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.g3 g3Var;
        ru ruVar = this.a;
        f91 f91Var = ruVar.c;
        int[] iArr = ruVar.B;
        if (z4) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(ruVar.r);
            if (!ng0.x(false, ruVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            ng0.m0.R = ruVar;
            return textureView;
        }
        if (!z10) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        ruVar.L = true;
        f91Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - ruVar.getLeftInset();
        float f10 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
        iArr[1] = (int) (f10 - viewGroup2.getTranslationY());
        TextureView textureView2 = f91Var.getTextureView();
        ImageView textureImageView = f91Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        g3Var = ((org.telegram.ui.ActionBar.h3) ruVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(g3Var, n6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new a9(this, 16));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.c91
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.c91
    public final boolean h() {
        return this.a.F();
    }

    @Override // org.telegram.ui.Components.c91
    public final void i(boolean z4, x81 x81Var, float f10, boolean z10) {
        org.telegram.ui.ActionBar.g3 g3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.g3 g3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.g3 g3Var3;
        if (!z4) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.a.r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (z10) {
                ru ruVar = this.a;
                ruVar.setOnShowListener(ruVar.O);
                tk0 o10 = ng0.o(f10, false);
                TextureView textureView = this.a.c.getTextureView();
                ImageView textureImageView = this.a.c.getTextureImageView();
                float f11 = o10.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f11);
                textureImageView.setScaleY(f11);
                textureImageView.setTranslationX(o10.a);
                textureImageView.setTranslationY(o10.b);
                textureView.setScaleX(f11);
                textureView.setScaleY(f11);
                textureView.setTranslationX(o10.a);
                textureView.setTranslationY(o10.b);
            } else {
                ng0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z10) {
                ru ruVar2 = this.a;
                ruVar2.M = 4;
                g3Var = ((org.telegram.ui.ActionBar.h3) ruVar2).backDrawable;
                g3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        ru ruVar3 = this.a;
        if (ruVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ruVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                ru ruVar4 = this.a;
                int i10 = ruVar4.I;
                if (i10 != -2) {
                    ruVar4.r.setRequestedOrientation(i10);
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        if (this.a.e.getVisibility() == 0) {
            viewGroup6 = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
            viewGroup7 = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
            viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
            g3Var3 = ((org.telegram.ui.ActionBar.h3) this.a).backDrawable;
            g3Var3.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z10) {
            if (this.a.e.getVisibility() == 0) {
                this.a.e.setAlpha(1.0f);
                this.a.e.setVisibility(4);
            }
            x81Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        tk0 o11 = ng0.o(f10, true);
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
        viewGroup4 = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        g3Var2 = ((org.telegram.ui.ActionBar.h3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var2, n6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new eg.w2(20, this, x81Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.c91
    public final void c(float f10, int i10) {
    }
}
