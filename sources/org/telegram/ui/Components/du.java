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
import org.telegram.messenger.BringAppForegroundService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class du implements x71 {
    public final /* synthetic */ gu a;

    public du(gu guVar) {
        this.a = guVar;
    }

    @Override // org.telegram.ui.Components.x71
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        gu guVar = this.a;
        FrameLayout frameLayout = guVar.p1;
        Activity activity = guVar.t1;
        if (!z10) {
            frameLayout.setVisibility(4);
            guVar.H1 = false;
            if (activity == null) {
                return null;
            }
            try {
                guVar.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(guVar.G1);
                return null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(guVar.n1.getAspectRatioView());
        guVar.I1 = false;
        guVar.H1 = z11;
        if (activity == null) {
            return null;
        }
        try {
            guVar.G1 = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            guVar.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public final void b() {
        gu guVar = this.a;
        if (guVar.n1.f()) {
            guVar.L();
        }
    }

    @Override // org.telegram.ui.Components.x71
    public final void d() {
        gu guVar = this.a;
        cu cuVar = guVar.m1;
        cuVar.setVisibility(0);
        guVar.u1.setVisibility(0);
        guVar.v1.setVisibility(4);
        cuVar.setKeepScreenOn(true);
        a81 a81Var = guVar.n1;
        a81Var.setVisibility(4);
        a81Var.getControlsView().setVisibility(4);
        a81Var.getTextureView().setVisibility(4);
        if (a81Var.getTextureImageView() != null) {
            a81Var.getTextureImageView().setVisibility(4);
        }
        guVar.n1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            cuVar.loadUrl(guVar.F1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public final void e(a81 a81Var, boolean z10) {
        Activity activity = this.a.t1;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public final TextureView f(View view, boolean z10, int i7, int i10, boolean z11) {
        gu guVar = this.a;
        a81 a81Var = guVar.n1;
        int[] iArr = guVar.z1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(guVar.t1);
            guVar.P0(textureView, i7, i10);
            return textureView;
        }
        if (!z11) {
            guVar.b.setTranslationY(0.0f);
            return null;
        }
        guVar.J1 = true;
        a81Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - guVar.T();
        iArr[1] = (int) (iArr[1] - guVar.b.getTranslationY());
        TextureView textureView2 = a81Var.getTextureView();
        ImageView textureImageView = a81Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(guVar.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(guVar.Z, q6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new x(this, 23));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.x71
    public final ViewGroup g() {
        return this.a.c;
    }

    @Override // org.telegram.ui.Components.x71
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.x71
    public final void i(boolean z10, s71 s71Var, float f10, boolean z11) {
        if (!z10) {
            if (org.telegram.messenger.t0.x) {
                try {
                    this.a.t1.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (z11) {
                gu guVar = this.a;
                guVar.setOnShowListener(guVar.M1);
                aj0 J0 = gu.J0(this.a, false, f10);
                TextureView textureView = this.a.n1.getTextureView();
                ImageView textureImageView = this.a.n1.getTextureImageView();
                float f11 = J0.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f11);
                textureImageView.setScaleY(f11);
                textureImageView.setTranslationX(J0.a);
                textureImageView.setTranslationY(J0.b);
                textureView.setScaleX(f11);
                textureView.setScaleY(f11);
                textureView.setTranslationX(J0.a);
                textureView.setTranslationY(J0.b);
            } else {
                this.a.K0();
            }
            gu guVar2 = this.a;
            guVar2.f0 = true;
            guVar2.show();
            if (z11) {
                gu guVar3 = this.a;
                guVar3.K1 = 4;
                guVar3.Z.setAlpha(1);
                this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        gu guVar4 = this.a;
        if (guVar4.t1 != null) {
            try {
                guVar4.b.setSystemUiVisibility(0);
                gu guVar5 = this.a;
                int i7 = guVar5.G1;
                if (i7 != -2) {
                    guVar5.t1.setRequestedOrientation(i7);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.a.p1.getVisibility() == 0) {
            this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
            this.a.Z.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z11) {
            if (this.a.p1.getVisibility() == 0) {
                this.a.p1.setAlpha(1.0f);
                this.a.p1.setVisibility(4);
            }
            s71Var.run();
            this.a.L();
            return;
        }
        TextureView textureView2 = this.a.n1.getTextureView();
        View controlsView = this.a.n1.getControlsView();
        ImageView textureImageView2 = this.a.n1.getTextureImageView();
        aj0 J02 = gu.J0(this.a, true, f10);
        float width = J02.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, J02.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, J02.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, J02.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, J02.b);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.a.b, (Property<ViewGroup, Float>) property4, org.telegram.messenger.g0.L(10.0f) + r2.getMeasuredHeight());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Z, q6.d, 0);
        FrameLayout frameLayout = this.a.p1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ah.l(27, this, s71Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.x71
    public final void c(float f10) {
    }
}
