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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class du implements j81 {
    public final /* synthetic */ hu a;

    public du(hu huVar) {
        this.a = huVar;
    }

    @Override // org.telegram.ui.Components.j81
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        hu huVar = this.a;
        FrameLayout frameLayout = huVar.l1;
        Activity activity = huVar.p1;
        if (!z10) {
            frameLayout.setVisibility(4);
            huVar.D1 = false;
            if (activity == null) {
                return null;
            }
            try {
                huVar.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(huVar.C1);
                return null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(huVar.j1.getAspectRatioView());
        huVar.E1 = false;
        huVar.D1 = z11;
        if (activity == null) {
            return null;
        }
        try {
            huVar.C1 = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            huVar.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void b() {
        hu huVar = this.a;
        if (huVar.j1.f()) {
            huVar.L();
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void d() {
        hu huVar = this.a;
        cu cuVar = huVar.i1;
        cuVar.setVisibility(0);
        huVar.q1.setVisibility(0);
        huVar.r1.setVisibility(4);
        cuVar.setKeepScreenOn(true);
        m81 m81Var = huVar.j1;
        m81Var.setVisibility(4);
        m81Var.getControlsView().setVisibility(4);
        m81Var.getTextureView().setVisibility(4);
        if (m81Var.getTextureImageView() != null) {
            m81Var.getTextureImageView().setVisibility(4);
        }
        huVar.j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            cuVar.loadUrl(huVar.B1, hashMap);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void e(m81 m81Var, boolean z10) {
        Activity activity = this.a.p1;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        hu huVar = this.a;
        m81 m81Var = huVar.j1;
        int[] iArr = huVar.v1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(huVar.p1);
            if (!jf0.x(false, huVar.p1, null, textureView, i10, i11, false)) {
                return null;
            }
            jf0.p0.U = huVar;
            return textureView;
        }
        if (!z11) {
            huVar.b.setTranslationY(0.0f);
            return null;
        }
        huVar.F1 = true;
        m81Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - huVar.T();
        iArr[1] = (int) (iArr[1] - huVar.b.getTranslationY());
        TextureView textureView2 = m81Var.getTextureView();
        ImageView textureImageView = m81Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(huVar.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(huVar.Y, i6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new w5(this, 22));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.j81
    public final ViewGroup g() {
        return this.a.c;
    }

    @Override // org.telegram.ui.Components.j81
    public final boolean h() {
        Activity activity = this.a.p1;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        s4.A(activity, null, false);
        return false;
    }

    @Override // org.telegram.ui.Components.j81
    public final void i(boolean z10, e81 e81Var, float f7, boolean z11) {
        if (!z10) {
            if (org.telegram.messenger.w0.x) {
                try {
                    this.a.p1.startService(new Intent(org.telegram.messenger.w0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
            }
            if (z11) {
                hu huVar = this.a;
                huVar.setOnShowListener(huVar.I1);
                oj0 j10 = jf0.j(false, f7);
                TextureView textureView = this.a.j1.getTextureView();
                ImageView textureImageView = this.a.j1.getTextureImageView();
                float f10 = j10.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f10);
                textureImageView.setScaleY(f10);
                textureImageView.setTranslationX(j10.a);
                textureImageView.setTranslationY(j10.b);
                textureView.setScaleX(f10);
                textureView.setScaleY(f10);
                textureView.setTranslationX(j10.a);
                textureView.setTranslationY(j10.b);
            } else {
                jf0.b(false);
            }
            hu huVar2 = this.a;
            huVar2.e0 = true;
            huVar2.show();
            if (z11) {
                hu huVar3 = this.a;
                huVar3.G1 = 4;
                huVar3.Y.setAlpha(1);
                this.a.b.setTranslationY(org.telegram.messenger.i0.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        hu huVar4 = this.a;
        if (huVar4.p1 != null) {
            try {
                huVar4.b.setSystemUiVisibility(0);
                hu huVar5 = this.a;
                int i10 = huVar5.C1;
                if (i10 != -2) {
                    huVar5.p1.setRequestedOrientation(i10);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (this.a.l1.getVisibility() == 0) {
            this.a.b.setTranslationY(org.telegram.messenger.i0.L(10.0f) + r0.getMeasuredHeight());
            this.a.Y.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z11) {
            if (this.a.l1.getVisibility() == 0) {
                this.a.l1.setAlpha(1.0f);
                this.a.l1.setVisibility(4);
            }
            e81Var.run();
            this.a.L();
            return;
        }
        TextureView textureView2 = this.a.j1.getTextureView();
        View controlsView = this.a.j1.getControlsView();
        ImageView textureImageView2 = this.a.j1.getTextureImageView();
        oj0 j11 = jf0.j(true, f7);
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
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.a.b, (Property<ViewGroup, Float>) property4, org.telegram.messenger.i0.L(10.0f) + r2.getMeasuredHeight());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Y, i6.d, 0);
        FrameLayout frameLayout = this.a.l1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new bg.f(21, this, e81Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.j81
    public final void c(float f7) {
    }
}
