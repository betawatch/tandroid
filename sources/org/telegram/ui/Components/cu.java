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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cu implements d81 {
    public final /* synthetic */ gu a;

    public cu(gu guVar) {
        this.a = guVar;
    }

    @Override // org.telegram.ui.Components.d81
    public final TextureView a(View view, boolean z10, float f10, int i9, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        gu guVar = this.a;
        FrameLayout frameLayout = guVar.e;
        Activity activity = guVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            guVar.I = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(guVar.H);
                return null;
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(guVar.c.getAspectRatioView());
        guVar.J = false;
        guVar.I = z11;
        if (activity == null) {
            return null;
        }
        try {
            guVar.H = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e11) {
            FileLog.e(e11);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.d81
    public final void b() {
        gu guVar = this.a;
        if (guVar.c.f()) {
            guVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.d81
    public final void d() {
        gu guVar = this.a;
        au auVar = guVar.b;
        auVar.setVisibility(0);
        guVar.s.setVisibility(0);
        guVar.v.setVisibility(4);
        auVar.setKeepScreenOn(true);
        g81 g81Var = guVar.c;
        g81Var.setVisibility(4);
        g81Var.getControlsView().setVisibility(4);
        g81Var.getTextureView().setVisibility(4);
        if (g81Var.getTextureImageView() != null) {
            g81Var.getTextureImageView().setVisibility(4);
        }
        guVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            auVar.loadUrl(guVar.G, hashMap);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.d81
    public final void e(g81 g81Var, boolean z10) {
        Activity activity = this.a.r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override // org.telegram.ui.Components.d81
    public final TextureView f(View view, boolean z10, int i9, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.e3 e3Var;
        gu guVar = this.a;
        g81 g81Var = guVar.c;
        int[] iArr = guVar.A;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(guVar.r);
            if (!pf0.x(false, guVar.r, null, textureView, i9, i10, false)) {
                return null;
            }
            pf0.l0.Q = guVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        guVar.K = true;
        g81Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - guVar.getLeftInset();
        float f10 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
        iArr[1] = (int) (f10 - viewGroup2.getTranslationY());
        TextureView textureView2 = g81Var.getTextureView();
        ImageView textureImageView = g81Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        e3Var = ((org.telegram.ui.ActionBar.f3) guVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, m6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new org.telegram.ui.xp(this, 23));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.d81
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.d81
    public final boolean h() {
        return this.a.F();
    }

    @Override // org.telegram.ui.Components.d81
    public final void i(boolean z10, y71 y71Var, float f10, boolean z11) {
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
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (z11) {
                gu guVar = this.a;
                guVar.setOnShowListener(guVar.N);
                wj0 o6 = pf0.o(f10, false);
                TextureView textureView = this.a.c.getTextureView();
                ImageView textureImageView = this.a.c.getTextureImageView();
                float f11 = o6.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f11);
                textureImageView.setScaleY(f11);
                textureImageView.setTranslationX(o6.a);
                textureImageView.setTranslationY(o6.b);
                textureView.setScaleX(f11);
                textureView.setScaleY(f11);
                textureView.setTranslationX(o6.a);
                textureView.setTranslationY(o6.b);
            } else {
                pf0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                gu guVar2 = this.a;
                guVar2.L = 4;
                e3Var = ((org.telegram.ui.ActionBar.f3) guVar2).backDrawable;
                e3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        gu guVar3 = this.a;
        if (guVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) guVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                gu guVar4 = this.a;
                int i9 = guVar4.H;
                if (i9 != -2) {
                    guVar4.r.setRequestedOrientation(i9);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
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
            y71Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        wj0 o9 = pf0.o(f10, true);
        float width = o9.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, o9.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, o9.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, o9.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, o9.b);
        viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        e3Var2 = ((org.telegram.ui.ActionBar.f3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, m6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new fg.j(21, this, y71Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.d81
    public final void c(float f10, int i9) {
    }
}
