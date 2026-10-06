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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class vu implements x91 {
    public final /* synthetic */ zu a;

    public vu(zu zuVar) {
        this.a = zuVar;
    }

    @Override // org.telegram.ui.Components.x91
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zu zuVar = this.a;
        FrameLayout frameLayout = zuVar.e;
        Activity activity = zuVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            zuVar.M = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(zuVar.L);
                return null;
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(zuVar.c.getAspectRatioView());
        zuVar.N = false;
        zuVar.M = z11;
        if (activity == null) {
            return null;
        }
        try {
            zuVar.L = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.x91
    public final void b() {
        zu zuVar = this.a;
        if (zuVar.c.f()) {
            zuVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.x91
    public final void d() {
        zu zuVar = this.a;
        tu tuVar = zuVar.b;
        tuVar.setVisibility(0);
        zuVar.s.setVisibility(0);
        zuVar.v.setVisibility(4);
        tuVar.setKeepScreenOn(true);
        aa1 aa1Var = zuVar.c;
        aa1Var.setVisibility(4);
        aa1Var.getControlsView().setVisibility(4);
        aa1Var.getTextureView().setVisibility(4);
        if (aa1Var.getTextureImageView() != null) {
            aa1Var.getTextureImageView().setVisibility(4);
        }
        zuVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            tuVar.loadUrl(zuVar.K, hashMap);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.x91
    public final void e(aa1 aa1Var, boolean z10) {
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

    @Override // org.telegram.ui.Components.x91
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.e3 e3Var;
        zu zuVar = this.a;
        aa1 aa1Var = zuVar.c;
        int[] iArr = zuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(zuVar.r);
            if (!rg0.x(false, zuVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            rg0.p0.U = zuVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        zuVar.O = true;
        aa1Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - zuVar.getLeftInset();
        float f7 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
        iArr[1] = (int) (f7 - viewGroup2.getTranslationY());
        TextureView textureView2 = aa1Var.getTextureView();
        ImageView textureImageView = aa1Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        e3Var = ((org.telegram.ui.ActionBar.f3) zuVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, s6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new r8(this, 17));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.x91
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.x91
    public final boolean h() {
        return this.a.E();
    }

    @Override // org.telegram.ui.Components.x91
    public final void i(boolean z10, s91 s91Var, float f7, boolean z11) {
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
                zu zuVar = this.a;
                zuVar.setOnShowListener(zuVar.R);
                uk0 o9 = rg0.o(f7, false);
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
                rg0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                zu zuVar2 = this.a;
                zuVar2.P = 4;
                e3Var = ((org.telegram.ui.ActionBar.f3) zuVar2).backDrawable;
                e3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        zu zuVar3 = this.a;
        if (zuVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) zuVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                zu zuVar4 = this.a;
                int i10 = zuVar4.L;
                if (i10 != -2) {
                    zuVar4.r.setRequestedOrientation(i10);
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
            s91Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        uk0 o10 = rg0.o(f7, true);
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
        ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, s6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ai.z(23, this, s91Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.x91
    public final void c(float f7) {
    }
}
