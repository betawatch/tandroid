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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class st implements i71 {
    public final /* synthetic */ vt a;

    public st(vt vtVar) {
        this.a = vtVar;
    }

    @Override // org.telegram.ui.Components.i71
    public final TextureView a(View view, boolean z9, float f10, int i7, boolean z10) {
        vt vtVar = this.a;
        FrameLayout frameLayout = vtVar.l1;
        Activity activity = vtVar.p1;
        if (!z9) {
            frameLayout.setVisibility(4);
            vtVar.D1 = false;
            if (activity == null) {
                return null;
            }
            try {
                vtVar.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(vtVar.C1);
                return null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(vtVar.j1.getAspectRatioView());
        vtVar.E1 = false;
        vtVar.D1 = z10;
        if (activity == null) {
            return null;
        }
        try {
            vtVar.C1 = activity.getRequestedOrientation();
            if (z10) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            vtVar.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.i71
    public final void b() {
        vt vtVar = this.a;
        if (vtVar.j1.f()) {
            vtVar.K();
        }
    }

    @Override // org.telegram.ui.Components.i71
    public final void d() {
        vt vtVar = this.a;
        rt rtVar = vtVar.i1;
        rtVar.setVisibility(0);
        vtVar.q1.setVisibility(0);
        vtVar.r1.setVisibility(4);
        rtVar.setKeepScreenOn(true);
        l71 l71Var = vtVar.j1;
        l71Var.setVisibility(4);
        l71Var.getControlsView().setVisibility(4);
        l71Var.getTextureView().setVisibility(4);
        if (l71Var.getTextureImageView() != null) {
            l71Var.getTextureImageView().setVisibility(4);
        }
        vtVar.j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            rtVar.loadUrl(vtVar.B1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.i71
    public final void e(l71 l71Var, boolean z9) {
        Activity activity = this.a.p1;
        if (z9) {
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

    @Override // org.telegram.ui.Components.i71
    public final TextureView f(View view, boolean z9, int i7, int i10, boolean z10) {
        vt vtVar = this.a;
        l71 l71Var = vtVar.j1;
        int[] iArr = vtVar.v1;
        if (z9) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(vtVar.p1);
            vtVar.O0(textureView, i7, i10);
            return textureView;
        }
        if (!z10) {
            vtVar.b.setTranslationY(0.0f);
            return null;
        }
        vtVar.F1 = true;
        l71Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - vtVar.S();
        iArr[1] = (int) (iArr[1] - vtVar.b.getTranslationY());
        TextureView textureView2 = l71Var.getTextureView();
        ImageView textureImageView = l71Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(vtVar.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(vtVar.Y, m6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new z5(this, 22));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.i71
    public final ViewGroup g() {
        return this.a.c;
    }

    @Override // org.telegram.ui.Components.i71
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.i71
    public final void i(boolean z9, d71 d71Var, float f10, boolean z10) {
        if (!z9) {
            if (org.telegram.messenger.t0.x) {
                try {
                    this.a.p1.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (z10) {
                vt vtVar = this.a;
                vtVar.setOnShowListener(vtVar.I1);
                ki0 I0 = vt.I0(this.a, false, f10);
                TextureView textureView = this.a.j1.getTextureView();
                ImageView textureImageView = this.a.j1.getTextureImageView();
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
            vt vtVar2 = this.a;
            vtVar2.e0 = true;
            vtVar2.show();
            if (z10) {
                vt vtVar3 = this.a;
                vtVar3.G1 = 4;
                vtVar3.Y.setAlpha(1);
                this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        vt vtVar4 = this.a;
        if (vtVar4.p1 != null) {
            try {
                vtVar4.b.setSystemUiVisibility(0);
                vt vtVar5 = this.a;
                int i7 = vtVar5.C1;
                if (i7 != -2) {
                    vtVar5.p1.setRequestedOrientation(i7);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.a.l1.getVisibility() == 0) {
            this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
            this.a.Y.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z10) {
            if (this.a.l1.getVisibility() == 0) {
                this.a.l1.setAlpha(1.0f);
                this.a.l1.setVisibility(4);
            }
            d71Var.run();
            this.a.K();
            return;
        }
        TextureView textureView2 = this.a.j1.getTextureView();
        View controlsView = this.a.j1.getControlsView();
        ImageView textureImageView2 = this.a.j1.getTextureImageView();
        ki0 I02 = vt.I0(this.a, true, f10);
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
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Y, m6.d, 0);
        FrameLayout frameLayout = this.a.l1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ah.l(26, this, d71Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.i71
    public final void c(float f10) {
    }
}
