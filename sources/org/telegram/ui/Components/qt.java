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
import org.telegram.messenger.BringAppForegroundService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qt implements a71 {
    public final /* synthetic */ ut a;

    public qt(ut utVar) {
        this.a = utVar;
    }

    @Override // org.telegram.ui.Components.a71
    public final TextureView a(View view, boolean z10, float f10, int i3, boolean z11) {
        ut utVar = this.a;
        FrameLayout frameLayout = utVar.m1;
        Activity activity = utVar.q1;
        if (!z10) {
            frameLayout.setVisibility(4);
            utVar.E1 = false;
            if (activity == null) {
                return null;
            }
            try {
                utVar.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(utVar.D1);
                return null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(utVar.k1.getAspectRatioView());
        utVar.F1 = false;
        utVar.E1 = z11;
        if (activity == null) {
            return null;
        }
        try {
            utVar.D1 = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            utVar.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.a71
    public final void b() {
        ut utVar = this.a;
        if (utVar.k1.f()) {
            utVar.K();
        }
    }

    @Override // org.telegram.ui.Components.a71
    public final void d() {
        ut utVar = this.a;
        pt ptVar = utVar.j1;
        ptVar.setVisibility(0);
        utVar.r1.setVisibility(0);
        utVar.s1.setVisibility(4);
        ptVar.setKeepScreenOn(true);
        d71 d71Var = utVar.k1;
        d71Var.setVisibility(4);
        d71Var.getControlsView().setVisibility(4);
        d71Var.getTextureView().setVisibility(4);
        if (d71Var.getTextureImageView() != null) {
            d71Var.getTextureImageView().setVisibility(4);
        }
        utVar.k1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            ptVar.loadUrl(utVar.C1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.a71
    public final void e(d71 d71Var, boolean z10) {
        Activity activity = this.a.q1;
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

    @Override // org.telegram.ui.Components.a71
    public final TextureView f(View view, boolean z10, int i3, int i10, boolean z11) {
        ut utVar = this.a;
        d71 d71Var = utVar.k1;
        int[] iArr = utVar.w1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(utVar.q1);
            if (!ie0.x(false, utVar.q1, null, textureView, i3, i10, false)) {
                return null;
            }
            ie0.q0.V = utVar;
            return textureView;
        }
        if (!z11) {
            utVar.b.setTranslationY(0.0f);
            return null;
        }
        utVar.G1 = true;
        d71Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - utVar.S();
        iArr[1] = (int) (iArr[1] - utVar.b.getTranslationY());
        TextureView textureView2 = d71Var.getTextureView();
        ImageView textureImageView = d71Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(utVar.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(utVar.Z, k6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new x5(this, 22));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.a71
    public final ViewGroup g() {
        return this.a.c;
    }

    @Override // org.telegram.ui.Components.a71
    public final boolean h() {
        Activity activity = this.a.q1;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        t4.A(activity, null, false);
        return false;
    }

    @Override // org.telegram.ui.Components.a71
    public final void i(boolean z10, v61 v61Var, float f10, boolean z11) {
        if (!z10) {
            if (org.telegram.messenger.t0.x) {
                try {
                    this.a.q1.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (z11) {
                ut utVar = this.a;
                utVar.setOnShowListener(utVar.J1);
                ni0 j10 = ie0.j(false, f10);
                TextureView textureView = this.a.k1.getTextureView();
                ImageView textureImageView = this.a.k1.getTextureImageView();
                float f11 = j10.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f11);
                textureImageView.setScaleY(f11);
                textureImageView.setTranslationX(j10.a);
                textureImageView.setTranslationY(j10.b);
                textureView.setScaleX(f11);
                textureView.setScaleY(f11);
                textureView.setTranslationX(j10.a);
                textureView.setTranslationY(j10.b);
            } else {
                ie0.b(false);
            }
            ut utVar2 = this.a;
            utVar2.f0 = true;
            utVar2.show();
            if (z11) {
                ut utVar3 = this.a;
                utVar3.H1 = 4;
                utVar3.Z.setAlpha(1);
                this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        ut utVar4 = this.a;
        if (utVar4.q1 != null) {
            try {
                utVar4.b.setSystemUiVisibility(0);
                ut utVar5 = this.a;
                int i3 = utVar5.D1;
                if (i3 != -2) {
                    utVar5.q1.setRequestedOrientation(i3);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.a.m1.getVisibility() == 0) {
            this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
            this.a.Z.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z11) {
            if (this.a.m1.getVisibility() == 0) {
                this.a.m1.setAlpha(1.0f);
                this.a.m1.setVisibility(4);
            }
            v61Var.run();
            this.a.K();
            return;
        }
        TextureView textureView2 = this.a.k1.getTextureView();
        View controlsView = this.a.k1.getControlsView();
        ImageView textureImageView2 = this.a.k1.getTextureImageView();
        ni0 j11 = ie0.j(true, f10);
        float width = j11.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, j11.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, j11.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, j11.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, j11.b);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.a.b, (Property<ViewGroup, Float>) property4, org.telegram.messenger.g0.L(10.0f) + r2.getMeasuredHeight());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Z, k6.d, 0);
        FrameLayout frameLayout = this.a.m1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new bh.j(25, this, v61Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.a71
    public final void c(float f10) {
    }
}
