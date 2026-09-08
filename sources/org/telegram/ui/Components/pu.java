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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pu implements y81 {
    public final /* synthetic */ tu a;

    public pu(tu tuVar) {
        this.a = tuVar;
    }

    @Override // org.telegram.ui.Components.y81
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        tu tuVar = this.a;
        FrameLayout frameLayout = tuVar.e;
        Activity activity = tuVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            tuVar.M = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(tuVar.L);
                return null;
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(tuVar.c.getAspectRatioView());
        tuVar.N = false;
        tuVar.M = z11;
        if (activity == null) {
            return null;
        }
        try {
            tuVar.L = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final void b() {
        tu tuVar = this.a;
        if (tuVar.c.f()) {
            tuVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final void d() {
        tu tuVar = this.a;
        nu nuVar = tuVar.b;
        nuVar.setVisibility(0);
        tuVar.s.setVisibility(0);
        tuVar.v.setVisibility(4);
        nuVar.setKeepScreenOn(true);
        b91 b91Var = tuVar.c;
        b91Var.setVisibility(4);
        b91Var.getControlsView().setVisibility(4);
        b91Var.getTextureView().setVisibility(4);
        if (b91Var.getTextureImageView() != null) {
            b91Var.getTextureImageView().setVisibility(4);
        }
        tuVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            nuVar.loadUrl(tuVar.K, hashMap);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final void e(b91 b91Var, boolean z10) {
        Activity activity = this.a.r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.e3 e3Var;
        tu tuVar = this.a;
        b91 b91Var = tuVar.c;
        int[] iArr = tuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(tuVar.r);
            if (!eg0.x(false, tuVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            eg0.p0.U = tuVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        tuVar.O = true;
        b91Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - tuVar.getLeftInset();
        float f7 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
        iArr[1] = (int) (f7 - viewGroup2.getTranslationY());
        TextureView textureView2 = b91Var.getTextureView();
        ImageView textureImageView = b91Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        e3Var = ((org.telegram.ui.ActionBar.f3) tuVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, t6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new j6(this, 20));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.y81
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.y81
    public final boolean h() {
        return this.a.G();
    }

    @Override // org.telegram.ui.Components.y81
    public final void i(boolean z10, t81 t81Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.e3 e3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.e3 e3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.e3 e3Var3;
        if (!z10) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.a.r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (z11) {
                tu tuVar = this.a;
                tuVar.setOnShowListener(tuVar.R);
                hk0 o9 = eg0.o(f7, false);
                TextureView textureView = this.a.c.getTextureView();
                ImageView textureImageView = this.a.c.getTextureImageView();
                float f10 = o9.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f10);
                textureImageView.setScaleY(f10);
                textureImageView.setTranslationX(o9.a);
                textureImageView.setTranslationY(o9.b);
                textureView.setScaleX(f10);
                textureView.setScaleY(f10);
                textureView.setTranslationX(o9.a);
                textureView.setTranslationY(o9.b);
            } else {
                eg0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                tu tuVar2 = this.a;
                tuVar2.P = 4;
                e3Var = ((org.telegram.ui.ActionBar.f3) tuVar2).backDrawable;
                e3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        tu tuVar3 = this.a;
        if (tuVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) tuVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                tu tuVar4 = this.a;
                int i10 = tuVar4.L;
                if (i10 != -2) {
                    tuVar4.r.setRequestedOrientation(i10);
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (this.a.e.getVisibility() == 0) {
            viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
            viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
            viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
            e3Var3 = ((org.telegram.ui.ActionBar.f3) this.a).backDrawable;
            e3Var3.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z11) {
            if (this.a.e.getVisibility() == 0) {
                this.a.e.setAlpha(1.0f);
                this.a.e.setVisibility(4);
            }
            t81Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        hk0 o10 = eg0.o(f7, true);
        float width = o10.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, o10.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, o10.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, o10.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, o10.b);
        viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        e3Var2 = ((org.telegram.ui.ActionBar.f3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, t6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new bi.t(23, this, t81Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.y81
    public final void c(float f7) {
    }
}
