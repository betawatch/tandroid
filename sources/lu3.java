// default package

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
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lu3 implements ptc {
    public final /* synthetic */ ou3 a;

    public lu3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    @Override // ptc
    public final void a(boolean z, ltc ltcVar, float f, boolean z2) {
        if (!z) {
            if (a.x) {
                try {
                    this.a.s1.startService(new Intent(a.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
            ou3 ou3Var = this.a;
            if (z2) {
                ou3Var.setOnShowListener(ou3Var.L1);
                l29 G0 = this.a.G0(false, f);
                TextureView textureView = this.a.m1.getTextureView();
                ImageView textureImageView = this.a.m1.getTextureImageView();
                float f2 = G0.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f2);
                textureImageView.setScaleY(f2);
                textureImageView.setTranslationX(G0.a);
                textureImageView.setTranslationY(G0.b);
                textureView.setScaleX(f2);
                textureView.setScaleY(f2);
                textureView.setTranslationX(G0.a);
                textureView.setTranslationY(G0.b);
            } else {
                ou3Var.D0();
            }
            ou3 ou3Var2 = this.a;
            ou3Var2.f0 = true;
            ou3Var2.show();
            if (z2) {
                ou3 ou3Var3 = this.a;
                ou3Var3.J1 = 4;
                ou3Var3.Z.setAlpha(1);
                this.a.b.setTranslationY(gl.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        ou3 ou3Var4 = this.a;
        if (ou3Var4.s1 != null) {
            try {
                ou3Var4.b.setSystemUiVisibility(0);
                ou3 ou3Var5 = this.a;
                int i = ou3Var5.F1;
                if (i != -2) {
                    ou3Var5.s1.setRequestedOrientation(i);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (this.a.o1.getVisibility() == 0) {
            this.a.b.setTranslationY(gl.L(10.0f) + r0.getMeasuredHeight());
            this.a.Z.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        ou3 ou3Var6 = this.a;
        if (!z2) {
            if (ou3Var6.o1.getVisibility() == 0) {
                this.a.o1.setAlpha(1.0f);
                this.a.o1.setVisibility(4);
            }
            ltcVar.run();
            this.a.I();
            return;
        }
        TextureView textureView2 = ou3Var6.m1.getTextureView();
        View controlsView = this.a.m1.getControlsView();
        ImageView textureImageView2 = this.a.m1.getTextureImageView();
        l29 G02 = this.a.G0(true, f);
        float width = G02.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, G02.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, G02.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, G02.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, G02.b);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.a.b, (Property<ViewGroup, Float>) property4, gl.L(10.0f) + r2.getMeasuredHeight());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Z, rn.d, 0);
        FrameLayout frameLayout = this.a.o1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new u5(this, ltcVar, (byte) 19));
        animatorSet.start();
    }

    @Override // ptc
    public final TextureView b(View view, boolean z, float f, int i, boolean z2) {
        ou3 ou3Var = this.a;
        Activity activity = ou3Var.s1;
        FrameLayout frameLayout = ou3Var.o1;
        if (!z) {
            frameLayout.setVisibility(4);
            ou3Var.G1 = false;
            if (activity == null) {
                return null;
            }
            try {
                ou3Var.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(ou3Var.F1);
                return null;
            } catch (Exception e) {
                fa4.g(e, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(ou3Var.m1.getAspectRatioView());
        ou3Var.H1 = false;
        ou3Var.G1 = z2;
        if (activity == null) {
            return null;
        }
        try {
            ou3Var.F1 = activity.getRequestedOrientation();
            if (z2) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            ou3Var.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return null;
        }
    }

    @Override // ptc
    public final void c() {
        ou3 ou3Var = this.a;
        if (ou3Var.m1.f()) {
            ou3Var.I();
        }
    }

    @Override // ptc
    public final void e() {
        ou3 ou3Var = this.a;
        ku3 ku3Var = ou3Var.l1;
        ku3Var.setVisibility(0);
        ou3Var.t1.setVisibility(0);
        ou3Var.u1.setVisibility(4);
        ku3Var.setKeepScreenOn(true);
        stc stcVar = ou3Var.m1;
        stcVar.setVisibility(4);
        stcVar.getControlsView().setVisibility(4);
        stcVar.getTextureView().setVisibility(4);
        if (stcVar.getTextureImageView() != null) {
            stcVar.getTextureImageView().setVisibility(4);
        }
        ou3Var.m1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            ku3Var.loadUrl(ou3Var.E1, hashMap);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // ptc
    public final TextureView f(View view, boolean z, int i, int i2, boolean z2) {
        ou3 ou3Var = this.a;
        stc stcVar = ou3Var.m1;
        int[] iArr = ou3Var.y1;
        if (z) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(ou3Var.s1);
            ou3Var.J0(textureView, i, i2);
            return textureView;
        }
        if (!z2) {
            ou3Var.b.setTranslationY(0.0f);
            return null;
        }
        ou3Var.I1 = true;
        stcVar.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - ou3Var.R();
        iArr[1] = (int) (iArr[1] - ou3Var.b.getTranslationY());
        TextureView textureView2 = stcVar.getTextureView();
        ImageView textureImageView = stcVar.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(ou3Var.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(ou3Var.Z, rn.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new im2(this, (byte) 15));
        animatorSet.start();
        return null;
    }

    @Override // ptc
    public final void g(stc stcVar, boolean z) {
        Activity activity = this.a.s1;
        if (z) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // ptc
    public final ViewGroup h() {
        return this.a.c;
    }

    @Override // ptc
    public final boolean i() {
        return true;
    }

    @Override // ptc
    public final void d(float f) {
    }
}
