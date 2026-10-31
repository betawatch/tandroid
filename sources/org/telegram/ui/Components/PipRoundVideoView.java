package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class PipRoundVideoView implements org.telegram.messenger.us {
    public static PipRoundVideoView F;
    public DecelerateInterpolator D;
    public final RectF E = new RectF();
    public ze0 a;
    public int b;
    public TextureView c;
    public ImageView d;
    public af0 e;
    public Bitmap f;
    public int h;
    public int n;
    public AnimatorSet r;
    public Runnable s;
    public WindowManager.LayoutParams w;
    public WindowManager x;
    public SharedPreferences y;

    public static int b(float f7, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i12 = org.telegram.messenger.i0.q.x;
        } else {
            i12 = org.telegram.messenger.i0.q.y - i11;
            i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int L = i10 == 0 ? org.telegram.messenger.i0.L(10.0f) : i10 == 1 ? (i12 - i11) - org.telegram.messenger.i0.L(10.0f) : Math.round((r0 - org.telegram.messenger.i0.L(20.0f)) * f7) + org.telegram.messenger.i0.L(10.0f);
        return !z10 ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + L : L;
    }

    public final void a(boolean z10) {
        if (!z10) {
            if (this.f != null) {
                this.d.setImageDrawable(null);
                this.f.recycle();
                this.f = null;
            }
            try {
                this.x.removeView(this.a);
            } catch (Exception unused) {
            }
            if (F == this) {
                F = null;
            }
            org.telegram.messenger.zs.f(this.b).n(this, org.telegram.messenger.zs.e2);
            return;
        }
        TextureView textureView = this.c;
        if (textureView == null || textureView.getParent() == null) {
            return;
        }
        if (this.c.getWidth() > 0 && this.c.getHeight() > 0) {
            int width = this.c.getWidth();
            int height = this.c.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            this.f = org.telegram.messenger.js.b(width, height);
        }
        try {
            this.c.getBitmap(this.f);
        } catch (Throwable unused2) {
            this.f = null;
        }
        this.d.setImageBitmap(this.f);
        try {
            this.e.removeView(this.c);
        } catch (Exception unused3) {
        }
        this.d.setVisibility(0);
        c(false);
    }

    public final void c(boolean z10) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, (Property<ze0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.a, (Property<ze0, Float>) View.SCALE_X, z10 ? 1.0f : 0.8f);
        int i10 = 3;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(this.a, (Property<ze0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.r.addListener(new ha0(i10, this, z10));
        this.r.setInterpolator(this.D);
        this.r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        F = this;
        this.s = runnable;
        ze0 ze0Var = new ze0(this, launchActivity);
        this.a = ze0Var;
        ze0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.i0.L(126.0f);
        this.n = org.telegram.messenger.i0.L(126.0f);
        af0 af0Var = new af0(this, launchActivity, 0);
        this.e = af0Var;
        af0Var.setOutlineProvider(new bi.d2(13));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.a.addView(this.e, w7.b6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.a.setAlpha(1.0f);
        this.a.setScaleX(0.8f);
        this.a.setScaleY(0.8f);
        this.c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.i0.N(2.0f) + org.telegram.messenger.i0.N(120.0f)) / org.telegram.messenger.i0.N(120.0f);
        this.c.setScaleX(N);
        this.c.setScaleY(N);
        this.e.addView(this.c, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.e.addView(imageView, w7.b6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("pipconfig", 0);
        this.y = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.y.getInt("sidey", 0);
        float f7 = this.y.getFloat("px", 0.0f);
        float f10 = this.y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.w = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.n;
            layoutParams.x = b(f7, i10, i12, true);
            this.w.y = b(f10, i11, this.n, false);
            WindowManager.LayoutParams layoutParams2 = this.w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.i0.x3(this.x, this.a, layoutParams2);
            this.x.addView(this.a, this.w);
            int i13 = org.telegram.messenger.d20.s0;
            this.b = i13;
            org.telegram.messenger.zs.f(i13).c(this, org.telegram.messenger.zs.e2);
            c(true);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        af0 af0Var;
        if (i10 != org.telegram.messenger.zs.e2 || (af0Var = this.e) == null) {
            return;
        }
        af0Var.invalidate();
    }

    public final void e(boolean z10) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.a, (Property<ze0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.a, (Property<ze0, Float>) View.SCALE_X, z10 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.a, (Property<ze0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.r.addListener(new bf0(this, 0));
        this.r.setInterpolator(this.D);
        this.r.start();
    }

    public int getX() {
        return this.w.x;
    }

    public int getY() {
        return this.w.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.w;
        layoutParams.x = i10;
        try {
            this.x.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.w;
        layoutParams.y = i10;
        try {
            this.x.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
