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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class iu implements p81 {
    public final /* synthetic */ mu a;

    public iu(mu muVar) {
        this.a = muVar;
    }

    @Override // org.telegram.ui.Components.p81
    public final TextureView a(View view, boolean z10, float f9, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        mu muVar = this.a;
        FrameLayout frameLayout = muVar.e;
        Activity activity = muVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            muVar.I = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(muVar.H);
                return null;
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(muVar.c.getAspectRatioView());
        muVar.J = false;
        muVar.I = z11;
        if (activity == null) {
            return null;
        }
        try {
            muVar.H = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e11) {
            FileLog.e(e11);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.p81
    public final void b() {
        mu muVar = this.a;
        if (muVar.c.f()) {
            muVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.p81
    public final void d() {
        mu muVar = this.a;
        gu guVar = muVar.b;
        guVar.setVisibility(0);
        muVar.s.setVisibility(0);
        muVar.v.setVisibility(4);
        guVar.setKeepScreenOn(true);
        s81 s81Var = muVar.c;
        s81Var.setVisibility(4);
        s81Var.getControlsView().setVisibility(4);
        s81Var.getTextureView().setVisibility(4);
        if (s81Var.getTextureImageView() != null) {
            s81Var.getTextureImageView().setVisibility(4);
        }
        muVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            guVar.loadUrl(muVar.G, hashMap);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.p81
    public final void e(s81 s81Var, boolean z10) {
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

    @Override // org.telegram.ui.Components.p81
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.e3 e3Var;
        mu muVar = this.a;
        s81 s81Var = muVar.c;
        int[] iArr = muVar.A;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(muVar.r);
            if (!bg0.x(false, muVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            bg0.l0.Q = muVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        muVar.K = true;
        s81Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - muVar.getLeftInset();
        float f9 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
        iArr[1] = (int) (f9 - viewGroup2.getTranslationY());
        TextureView textureView2 = s81Var.getTextureView();
        ImageView textureImageView = s81Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        e3Var = ((org.telegram.ui.ActionBar.f3) muVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, r6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new org.telegram.ui.bm(this, 25));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.p81
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.p81
    public final boolean h() {
        return this.a.F();
    }

    @Override // org.telegram.ui.Components.p81
    public final void i(boolean z10, k81 k81Var, float f9, boolean z11) {
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
                mu muVar = this.a;
                muVar.setOnShowListener(muVar.N);
                hk0 o10 = bg0.o(f9, false);
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
                bg0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                mu muVar2 = this.a;
                muVar2.L = 4;
                e3Var = ((org.telegram.ui.ActionBar.f3) muVar2).backDrawable;
                e3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        mu muVar3 = this.a;
        if (muVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) muVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                mu muVar4 = this.a;
                int i10 = muVar4.H;
                if (i10 != -2) {
                    muVar4.r.setRequestedOrientation(i10);
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
            k81Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        hk0 o11 = bg0.o(f9, true);
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
        viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        e3Var2 = ((org.telegram.ui.ActionBar.f3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, r6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new bg.c3(24, this, k81Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.p81
    public final void c(float f9, int i10) {
    }
}
