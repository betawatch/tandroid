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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class su implements l91 {
    public final /* synthetic */ wu a;

    public su(wu wuVar) {
        this.a = wuVar;
    }

    @Override // org.telegram.ui.Components.l91
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        wu wuVar = this.a;
        FrameLayout frameLayout = wuVar.e;
        Activity activity = wuVar.r;
        if (!z10) {
            frameLayout.setVisibility(4);
            wuVar.M = false;
            if (activity == null) {
                return null;
            }
            try {
                viewGroup = ((org.telegram.ui.ActionBar.e3) wuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(wuVar.L);
                return null;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(wuVar.c.getAspectRatioView());
        wuVar.N = false;
        wuVar.M = z11;
        if (activity == null) {
            return null;
        }
        try {
            wuVar.L = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) wuVar).containerView;
            viewGroup2.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final void b() {
        wu wuVar = this.a;
        if (wuVar.c.f()) {
            wuVar.dismissInternal();
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final void d() {
        wu wuVar = this.a;
        qu quVar = wuVar.b;
        quVar.setVisibility(0);
        wuVar.s.setVisibility(0);
        wuVar.v.setVisibility(4);
        quVar.setKeepScreenOn(true);
        o91 o91Var = wuVar.c;
        o91Var.setVisibility(4);
        o91Var.getControlsView().setVisibility(4);
        o91Var.getTextureView().setVisibility(4);
        if (o91Var.getTextureImageView() != null) {
            o91Var.getTextureImageView().setVisibility(4);
        }
        wuVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            quVar.loadUrl(wuVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final void e(o91 o91Var, boolean z10) {
        Activity activity = this.a.r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.d3 d3Var;
        wu wuVar = this.a;
        o91 o91Var = wuVar.c;
        int[] iArr = wuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(wuVar.r);
            if (!og0.x(false, wuVar.r, null, textureView, i10, i11, false)) {
                return null;
            }
            og0.p0.U = wuVar;
            return textureView;
        }
        if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) wuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        }
        wuVar.O = true;
        o91Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - wuVar.getLeftInset();
        float f7 = iArr[1];
        viewGroup2 = ((org.telegram.ui.ActionBar.e3) wuVar).containerView;
        iArr[1] = (int) (f7 - viewGroup2.getTranslationY());
        TextureView textureView2 = o91Var.getTextureView();
        ImageView textureImageView = o91Var.getTextureImageView();
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
        viewGroup3 = ((org.telegram.ui.ActionBar.e3) wuVar).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property4, 0.0f);
        d3Var = ((org.telegram.ui.ActionBar.e3) wuVar).backDrawable;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(d3Var, s6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new r8(this, 17));
        animatorSet.start();
        return null;
    }

    @Override // org.telegram.ui.Components.l91
    public final ViewGroup g() {
        return this.a.container;
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean h() {
        return this.a.G();
    }

    @Override // org.telegram.ui.Components.l91
    public final void i(boolean z10, g91 g91Var, float f7, boolean z11) {
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
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (z11) {
                wu wuVar = this.a;
                wuVar.setOnShowListener(wuVar.R);
                sk0 o9 = og0.o(f7, false);
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
                og0.j(false);
            }
            this.a.setShowWithoutAnimation(true);
            this.a.show();
            if (z11) {
                wu wuVar2 = this.a;
                wuVar2.P = 4;
                d3Var = ((org.telegram.ui.ActionBar.e3) wuVar2).backDrawable;
                d3Var.setAlpha(1);
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
                viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
                return;
            }
            return;
        }
        wu wuVar3 = this.a;
        if (wuVar3.r != null) {
            try {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) wuVar3).containerView;
                viewGroup3.setSystemUiVisibility(0);
                wu wuVar4 = this.a;
                int i10 = wuVar4.L;
                if (i10 != -2) {
                    wuVar4.r.setRequestedOrientation(i10);
                }
            } catch (Exception e) {
                FileLog.e(e);
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
            g91Var.run();
            this.a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.a.c.getTextureView();
        View controlsView = this.a.c.getControlsView();
        ImageView textureImageView2 = this.a.c.getTextureImageView();
        sk0 o10 = og0.o(f7, true);
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
        viewGroup4 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        viewGroup5 = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
        d3Var2 = ((org.telegram.ui.ActionBar.e3) this.a).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(d3Var2, s6.d, 0);
        FrameLayout frameLayout = this.a.e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ai.z(23, this, g91Var));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.l91
    public final void c(float f7) {
    }
}
