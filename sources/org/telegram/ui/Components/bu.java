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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bu implements f81 {
    public final /* synthetic */ fu a;

    public bu(fu fuVar) {
        this.a = fuVar;
    }

    @Override // org.telegram.ui.Components.f81
    public final TextureView a(View view, boolean z10, float f10, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        fu fuVar = this.a;
        FrameLayout frameLayout = fuVar.e;
        Activity activity = fuVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            fuVar.I = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.e3) fuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(fuVar.H);
                return null;
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(fuVar.c.getAspectRatioView());
        fuVar.J = false;
        fuVar.I = z11;
        if (activity == null) {
            return null;
        }
        try {
            fuVar.H = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) fuVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.f81
    public final void b() {
        fu fuVar = this.a;
        if (fuVar.c.f()) {
            fuVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.f81
    public final void d() {
        fu fuVar = this.a;
        zt ztVar = fuVar.b;
        ztVar.setVisibility(0);
        fuVar.s.setVisibility(0);
        fuVar.v.setVisibility(4);
        ztVar.setKeepScreenOn(true);
        i81 i81Var = fuVar.c;
        i81Var.setVisibility(4);
        i81Var.getControlsView().setVisibility(4);
        i81Var.getTextureView().setVisibility(4);
        if (i81Var.getTextureImageView() != null) {
            i81Var.getTextureImageView().setVisibility(4);
        }
        fuVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            ztVar.loadUrl(fuVar.G, hashMap);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.f81
    public final void e(i81 i81Var, boolean z10) {
        Activity activity = this.a.r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.f81
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.d3 d3Var;
        fu fuVar = this.a;
        i81 i81Var = fuVar.c;
        int[] iArr = fuVar.A;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(fuVar.r);
            if (!sf0.x(false, fuVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            sf0.l0.Q = fuVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) fuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        fuVar.K = true;
        i81Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - fuVar.getLeftInset();
        float f10 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.e3) fuVar).containerView;
        iArr[1] = (int) (f10 - viewGroup2.getTranslationY());
        TextureView textureView2 = i81Var.getTextureView();
        ImageView textureImageView = i81Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.e3) fuVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        d3Var = ((org.telegram.ui.ActionBar.e3) fuVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(d3Var, m6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new org.telegram.ui.am(this, 25));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.f81
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.f81
    public final boolean h() {
        return this.a.G();
    }

    @Override // org.telegram.ui.Components.f81
    public final void i(boolean z10, a81 a81Var, float f10, boolean z11) {
        org.telegram.ui.ActionBar.d3 d3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.d3 d3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.d3 d3Var3;
        if (!z10) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.a.r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (z11) {
                fu fuVar = this.a;
                fuVar.setOnShowListener(fuVar.N);
                yj0 o10 = sf0.o(f10, false);
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
                sf0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                fu fuVar2 = this.a;
                fuVar2.L = 4;
                d3Var = ((org.telegram.ui.ActionBar.e3) fuVar2).backDrawable;
                d3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        fu fuVar3 = this.a;
        if (fuVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) fuVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                fu fuVar4 = this.a;
                int i10 = fuVar4.H;
                if (i10 != -2) {
                    fuVar4.r.setRequestedOrientation(i10);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (this.a.e.getVisibility() == 0) {
            viewGroup6 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
            viewGroup7 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
            viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
            d3Var3 = ((org.telegram.ui.ActionBar.e3) this.a).backDrawable;
            d3Var3.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        if (!z11) {
            if (this.a.e.getVisibility() == 0) {
                this.a.e.setAlpha(1.0f);
                this.a.e.setVisibility(4);
            }
            a81Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        yj0 o11 = sf0.o(f10, true);
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
        viewGroup4 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        d3Var2 = ((org.telegram.ui.ActionBar.e3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(d3Var2, m6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ag.x1(23, this, a81Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.f81
    public final void c(float f10, int i10) {
    }
}
