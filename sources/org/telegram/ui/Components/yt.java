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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yt implements j71 {
    public final /* synthetic */ bu a;

    public yt(bu buVar) {
        this.a = buVar;
    }

    @Override // org.telegram.ui.Components.j71
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        bu buVar = this.a;
        FrameLayout frameLayout = buVar.p1;
        Activity activity = buVar.t1;
        if (!z10) {
            frameLayout.setVisibility(4);
            buVar.H1 = false;
            if (activity == null) {
                return null;
            }
            try {
                buVar.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(buVar.G1);
                return null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(buVar.n1.getAspectRatioView());
        buVar.I1 = false;
        buVar.H1 = z11;
        if (activity == null) {
            return null;
        }
        try {
            buVar.G1 = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            buVar.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void b() {
        bu buVar = this.a;
        if (buVar.n1.f()) {
            buVar.L();
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void d() {
        bu buVar = this.a;
        xt xtVar = buVar.m1;
        xtVar.setVisibility(0);
        buVar.u1.setVisibility(0);
        buVar.v1.setVisibility(4);
        xtVar.setKeepScreenOn(true);
        m71 m71Var = buVar.n1;
        m71Var.setVisibility(4);
        m71Var.getControlsView().setVisibility(4);
        m71Var.getTextureView().setVisibility(4);
        if (m71Var.getTextureImageView() != null) {
            m71Var.getTextureImageView().setVisibility(4);
        }
        buVar.n1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            xtVar.loadUrl(buVar.F1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void e(m71 m71Var, boolean z10) {
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

    @Override // org.telegram.ui.Components.j71
    public final TextureView f(View view, boolean z10, int i7, int i10, boolean z11) {
        bu buVar = this.a;
        m71 m71Var = buVar.n1;
        int[] iArr = buVar.z1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(buVar.t1);
            buVar.O0(textureView, i7, i10);
            return textureView;
        }
        if (!z11) {
            buVar.b.setTranslationY(0.0f);
            return null;
        }
        buVar.J1 = true;
        m71Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - buVar.T();
        iArr[1] = (int) (iArr[1] - buVar.b.getTranslationY());
        TextureView textureView2 = m71Var.getTextureView();
        ImageView textureImageView = m71Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(buVar.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(buVar.Z, k6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new x5(this, 22));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.j71
    public final ViewGroup g() {
        return this.a.c;
    }

    @Override // org.telegram.ui.Components.j71
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.j71
    public final void i(boolean z10, e71 e71Var, float f10, boolean z11) {
        if (!z10) {
            if (org.telegram.messenger.t0.x) {
                try {
                    this.a.t1.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (z11) {
                bu buVar = this.a;
                buVar.setOnShowListener(buVar.M1);
                pi0 I0 = bu.I0(this.a, false, f10);
                TextureView textureView = this.a.n1.getTextureView();
                ImageView textureImageView = this.a.n1.getTextureImageView();
                float f11 = I0.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f11);
                textureImageView.setScaleY(f11);
                textureImageView.setTranslationX(I0.a);
                textureImageView.setTranslationY(I0.b);
                textureView.setScaleX(f11);
                textureView.setScaleY(f11);
                textureView.setTranslationX(I0.a);
                textureView.setTranslationY(I0.b);
            } else {
                this.a.J0();
            }
            bu buVar2 = this.a;
            buVar2.f0 = true;
            buVar2.show();
            if (z11) {
                bu buVar3 = this.a;
                buVar3.K1 = 4;
                buVar3.Z.setAlpha(1);
                this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        bu buVar4 = this.a;
        if (buVar4.t1 != null) {
            try {
                buVar4.b.setSystemUiVisibility(0);
                bu buVar5 = this.a;
                int i7 = buVar5.G1;
                if (i7 != -2) {
                    buVar5.t1.setRequestedOrientation(i7);
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
            e71Var.run();
            this.a.L();
            return;
        }
        TextureView textureView2 = this.a.n1.getTextureView();
        View controlsView = this.a.n1.getControlsView();
        ImageView textureImageView2 = this.a.n1.getTextureImageView();
        pi0 I02 = bu.I0(this.a, true, f10);
        float width = I02.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, I02.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, I02.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, I02.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, I02.b);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.a.b, (Property<ViewGroup, Float>) property4, org.telegram.messenger.g0.L(10.0f) + r2.getMeasuredHeight());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Z, k6.d, 0);
        FrameLayout frameLayout = this.a.p1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ah.l(26, this, e71Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.j71
    public final void c(float f10) {
    }
}
