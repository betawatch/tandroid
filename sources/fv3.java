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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fv3 implements eyc {
    public final /* synthetic */ iv3 a;

    public fv3(iv3 iv3Var) {
        this.a = iv3Var;
    }

    @Override // eyc
    public final void a(boolean z, ayc aycVar, float f, boolean z2) {
        if (!z) {
            if (a.x) {
                try {
                    this.a.s1.startService(new Intent(a.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            iv3 iv3Var = this.a;
            if (z2) {
                iv3Var.setOnShowListener(iv3Var.L1);
                a69 H0 = this.a.H0(false, f);
                TextureView textureView = this.a.m1.getTextureView();
                ImageView textureImageView = this.a.m1.getTextureImageView();
                float f2 = H0.c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f2);
                textureImageView.setScaleY(f2);
                textureImageView.setTranslationX(H0.a);
                textureImageView.setTranslationY(H0.b);
                textureView.setScaleX(f2);
                textureView.setScaleY(f2);
                textureView.setTranslationX(H0.a);
                textureView.setTranslationY(H0.b);
            } else {
                iv3Var.E0();
            }
            iv3 iv3Var2 = this.a;
            iv3Var2.f0 = true;
            iv3Var2.show();
            if (z2) {
                iv3 iv3Var3 = this.a;
                iv3Var3.J1 = 4;
                iv3Var3.Z.setAlpha(1);
                this.a.b.setTranslationY(hl.L(10.0f) + r0.getMeasuredHeight());
                return;
            }
            return;
        }
        iv3 iv3Var4 = this.a;
        if (iv3Var4.s1 != null) {
            try {
                iv3Var4.b.setSystemUiVisibility(0);
                iv3 iv3Var5 = this.a;
                int i = iv3Var5.F1;
                if (i != -2) {
                    iv3Var5.s1.setRequestedOrientation(i);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (this.a.o1.getVisibility() == 0) {
            this.a.b.setTranslationY(hl.L(10.0f) + r0.getMeasuredHeight());
            this.a.Z.setAlpha(0);
        }
        this.a.setOnShowListener(null);
        iv3 iv3Var6 = this.a;
        if (!z2) {
            if (iv3Var6.o1.getVisibility() == 0) {
                this.a.o1.setAlpha(1.0f);
                this.a.o1.setVisibility(4);
            }
            aycVar.run();
            this.a.H();
            return;
        }
        TextureView textureView2 = iv3Var6.m1.getTextureView();
        View controlsView = this.a.m1.getControlsView();
        ImageView textureImageView2 = this.a.m1.getTextureImageView();
        a69 H02 = this.a.H0(true, f);
        float width = H02.c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, H02.a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, H02.b);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, H02.a);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, H02.b);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.a.b, (Property<ViewGroup, Float>) property4, hl.L(10.0f) + r2.getMeasuredHeight());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Z, sn.d, 0);
        FrameLayout frameLayout = this.a.o1;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new v5(this, aycVar, (byte) 19));
        animatorSet.start();
    }

    @Override // eyc
    public final TextureView b(View view, boolean z, float f, int i, boolean z2) {
        iv3 iv3Var = this.a;
        Activity activity = iv3Var.s1;
        FrameLayout frameLayout = iv3Var.o1;
        if (!z) {
            frameLayout.setVisibility(4);
            iv3Var.G1 = false;
            if (activity == null) {
                return null;
            }
            try {
                iv3Var.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(iv3Var.F1);
                return null;
            } catch (Exception e) {
                cc4.g(e, true);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(iv3Var.m1.getAspectRatioView());
        iv3Var.H1 = false;
        iv3Var.G1 = z2;
        if (activity == null) {
            return null;
        }
        try {
            iv3Var.F1 = activity.getRequestedOrientation();
            if (z2) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            iv3Var.b.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e2) {
            cc4.g(e2, true);
            return null;
        }
    }

    @Override // eyc
    public final void c() {
        iv3 iv3Var = this.a;
        if (iv3Var.m1.f()) {
            iv3Var.H();
        }
    }

    @Override // eyc
    public final void e() {
        iv3 iv3Var = this.a;
        ev3 ev3Var = iv3Var.l1;
        ev3Var.setVisibility(0);
        iv3Var.t1.setVisibility(0);
        iv3Var.u1.setVisibility(4);
        ev3Var.setKeepScreenOn(true);
        hyc hycVar = iv3Var.m1;
        hycVar.setVisibility(4);
        hycVar.getControlsView().setVisibility(4);
        hycVar.getTextureView().setVisibility(4);
        if (hycVar.getTextureImageView() != null) {
            hycVar.getTextureImageView().setVisibility(4);
        }
        iv3Var.m1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            ev3Var.loadUrl(iv3Var.E1, hashMap);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // eyc
    public final TextureView f(View view, boolean z, int i, int i2, boolean z2) {
        iv3 iv3Var = this.a;
        hyc hycVar = iv3Var.m1;
        int[] iArr = iv3Var.y1;
        if (z) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(iv3Var.s1);
            iv3Var.K0(textureView, i, i2);
            return textureView;
        }
        if (!z2) {
            iv3Var.b.setTranslationY(0.0f);
            return null;
        }
        iv3Var.I1 = true;
        hycVar.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - iv3Var.Q();
        iArr[1] = (int) (iArr[1] - iv3Var.b.getTranslationY());
        TextureView textureView2 = hycVar.getTextureView();
        ImageView textureImageView = hycVar.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(iv3Var.b, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(iv3Var.Z, sn.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new cn2(this, (byte) 15));
        animatorSet.start();
        return null;
    }

    @Override // eyc
    public final void g(hyc hycVar, boolean z) {
        Activity activity = this.a.s1;
        if (z) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // eyc
    public final ViewGroup h() {
        return this.a.c;
    }

    @Override // eyc
    public final boolean i() {
        return true;
    }

    @Override // eyc
    public final void d(float f) {
    }
}
