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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fu implements w71 {
    public final /* synthetic */ iu a;

    public fu(iu iuVar) {
        this.a = iuVar;
    }

    @Override // org.telegram.ui.Components.w71
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        iu iuVar = this.a;
        FrameLayout frameLayout = iuVar.p1;
        Activity activity = iuVar.t1;
        if (!z10) {
            frameLayout.setVisibility(4);
            iuVar.H1 = false;
            if (activity == null) {
                return null;
            }
            try {
                iuVar.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(iuVar.G1);
                return null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(iuVar.n1.getAspectRatioView());
        iuVar.I1 = false;
        iuVar.H1 = z11;
        if (activity == null) {
            return null;
        }
        try {
            iuVar.G1 = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            iuVar.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.w71
    public final void b() {
        iu iuVar = this.a;
        if (iuVar.n1.f()) {
            iuVar.L();
        }
    }

    @Override // org.telegram.ui.Components.w71
    public final void d() {
        iu iuVar = this.a;
        eu euVar = iuVar.m1;
        euVar.setVisibility(0);
        iuVar.u1.setVisibility(0);
        iuVar.v1.setVisibility(4);
        euVar.setKeepScreenOn(true);
        z71 z71Var = iuVar.n1;
        z71Var.setVisibility(4);
        z71Var.getControlsView().setVisibility(4);
        z71Var.getTextureView().setVisibility(4);
        if (z71Var.getTextureImageView() != null) {
            z71Var.getTextureImageView().setVisibility(4);
        }
        iuVar.n1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            euVar.loadUrl(iuVar.F1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.w71
    public final void e(z71 z71Var, boolean z10) {
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

    @Override // org.telegram.ui.Components.w71
    public final TextureView f(View view, boolean z10, int i7, int i10, boolean z11) {
        iu iuVar = this.a;
        z71 z71Var = iuVar.n1;
        int[] iArr = iuVar.z1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(iuVar.t1);
            iuVar.P0(textureView, i7, i10);
            return textureView;
        }
        if (!z11) {
            iuVar.b.setTranslationY(0.0f);
            return null;
        }
        iuVar.J1 = true;
        z71Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - iuVar.T();
        iArr[1] = (int) (iArr[1] - iuVar.b.getTranslationY());
        TextureView textureView2 = z71Var.getTextureView();
        ImageView textureImageView = z71Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(iuVar.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(iuVar.Z, r6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new y(this, 23));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.w71
    public final ViewGroup g() {
        return this.a.c;
    }

    @Override // org.telegram.ui.Components.w71
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.w71
    public final void i(boolean z10, r71 r71Var, float f10, boolean z11) {
        if (!z10) {
            if (org.telegram.messenger.t0.x) {
                try {
                    this.a.t1.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (z11) {
                iu iuVar = this.a;
                iuVar.setOnShowListener(iuVar.M1);
                aj0 J0 = iu.J0(this.a, false, f10);
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
            iu iuVar2 = this.a;
            iuVar2.f0 = true;
            iuVar2.show();
            if (z11) {
                iu iuVar3 = this.a;
                iuVar3.K1 = 4;
                iuVar3.Z.setAlpha(1);
                this.a.b.setTranslationY(org.telegram.messenger.g0.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        iu iuVar4 = this.a;
        if (iuVar4.t1 != null) {
            try {
                iuVar4.b.setSystemUiVisibility(0);
                iu iuVar5 = this.a;
                int i7 = iuVar5.G1;
                if (i7 != -2) {
                    iuVar5.t1.setRequestedOrientation(i7);
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
            r71Var.run();
            this.a.L();
            return;
        }
        TextureView textureView2 = this.a.n1.getTextureView();
        View controlsView = this.a.n1.getControlsView();
        ImageView textureImageView2 = this.a.n1.getTextureImageView();
        aj0 J02 = iu.J0(this.a, true, f10);
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
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Z, r6.d, 0);
        FrameLayout frameLayout = this.a.p1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ah.l(27, this, r71Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.w71
    public final void c(float f10) {
    }
}
