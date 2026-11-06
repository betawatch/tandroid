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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class PipRoundVideoView implements org.telegram.messenger.ls {
    public static PipRoundVideoView F;
    public DecelerateInterpolator D;
    public final RectF E = new RectF();
    public ee0 a;
    public int b;
    public TextureView c;
    public ImageView d;
    public fe0 e;
    public Bitmap f;
    public int h;
    public int n;
    public AnimatorSet r;
    public Runnable s;
    public WindowManager.LayoutParams w;
    public WindowManager x;
    public SharedPreferences y;

    public static int b(float f10, int i7, int i10, boolean z9) {
        int i11;
        if (z9) {
            i11 = org.telegram.messenger.g0.q.x;
        } else {
            i11 = org.telegram.messenger.g0.q.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int L = i7 == 0 ? org.telegram.messenger.g0.L(10.0f) : i7 == 1 ? (i11 - i10) - org.telegram.messenger.g0.L(10.0f) : Math.round((r0 - org.telegram.messenger.g0.L(20.0f)) * f10) + org.telegram.messenger.g0.L(10.0f);
        return !z9 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + L : L;
    }

    public final void a(boolean z9) {
        if (!z9) {
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
            org.telegram.messenger.qs.f(this.b).n(this, org.telegram.messenger.qs.e2);
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
            this.f = org.telegram.messenger.as.c(width, height);
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

    public final void c(boolean z9) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.a, (Property<ee0, Float>) View.ALPHA, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.a, (Property<ee0, Float>) View.SCALE_X, z9 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.a, (Property<ee0, Float>) View.SCALE_Y, z9 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.r.addListener(new t9(17, this, z9));
        this.r.setInterpolator(this.D);
        this.r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        F = this;
        this.s = runnable;
        ee0 ee0Var = new ee0(this, launchActivity);
        this.a = ee0Var;
        ee0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.n = org.telegram.messenger.g0.L(126.0f);
        fe0 fe0Var = new fe0(0, launchActivity, this);
        this.e = fe0Var;
        fe0Var.setOutlineProvider(new bg.q0(13));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.a.addView(this.e, c8.ha.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.a.setAlpha(1.0f);
        this.a.setScaleX(0.8f);
        this.a.setScaleY(0.8f);
        this.c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.c.setScaleX(N);
        this.c.setScaleY(N);
        this.e.addView(this.c, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.e.addView(imageView, c8.ha.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("pipconfig", 0);
        this.y = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.y.getInt("sidey", 0);
        float f10 = this.y.getFloat("px", 0.0f);
        float f11 = this.y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.n;
            layoutParams.x = b(f10, i7, i11, true);
            this.w.y = b(f11, i10, this.n, false);
            WindowManager.LayoutParams layoutParams2 = this.w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.y3(this.x, this.a, layoutParams2);
            this.x.addView(this.a, this.w);
            int i12 = org.telegram.messenger.p10.s0;
            this.b = i12;
            org.telegram.messenger.qs.f(i12).c(this, org.telegram.messenger.qs.e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fe0 fe0Var;
        if (i7 != org.telegram.messenger.qs.e2 || (fe0Var = this.e) == null) {
            return;
        }
        fe0Var.invalidate();
    }

    public final void e(boolean z9) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.a, (Property<ee0, Float>) View.ALPHA, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.a, (Property<ee0, Float>) View.SCALE_X, z9 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.a, (Property<ee0, Float>) View.SCALE_Y, z9 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.r.addListener(new ge0(this, 0));
        this.r.setInterpolator(this.D);
        this.r.start();
    }

    public int getX() {
        return this.w.x;
    }

    public int getY() {
        return this.w.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.w;
        layoutParams.x = i7;
        try {
            this.x.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.w;
        layoutParams.y = i7;
        try {
            this.x.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
