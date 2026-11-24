// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cb1 extends rt3 {
    public wl0 W;
    public il0 a0;
    public final /* synthetic */ wjb b0;
    public final /* synthetic */ sl0 c0;
    public final /* synthetic */ ib1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb1(ib1 ib1Var, Context context, cja cjaVar, int i, f53 f53Var, wjb wjbVar, sl0 sl0Var) {
        super(context, cjaVar, null, i, true, f53Var);
        this.d0 = ib1Var;
        this.b0 = wjbVar;
        this.c0 = sl0Var;
    }

    @Override // rt3
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ib1 ib1Var = this.d0;
        if ((ib1Var instanceof rb1) && ((rb1) ib1Var).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // rt3
    public final void f() {
        super.f();
        t14 emojiView = getEmojiView();
        if (emojiView != null) {
            ib1 ib1Var = this.d0;
            if (ib1Var.getEditTextStyle() == 2 || ib1Var.getEditTextStyle() == 3) {
                emojiView.x0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (ib1Var instanceof mb1) {
                    emojiView.setPadding(0, 0, 0, gl.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new xi((byte) 1));
        }
    }

    @Override // rt3
    public final void g(Canvas canvas, nt3 nt3Var) {
        Bitmap bitmap;
        int i;
        int i2;
        WindowInsets rootWindowInsets;
        View view = nt3Var;
        ib1 ib1Var = this.d0;
        u9b u9bVar = ib1Var.d;
        RectF rectF = ib1Var.z0;
        rectF.set(0.0f, 0.0f, view.getWidth(), gl.L(29.0f) + view.getHeight());
        if (ib1Var.h0 != null) {
            if (this.a0 == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i = 0;
                    i2 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                il0 c = ib1Var.h0.c(view, null, false);
                c.p(nod.i(this.b0));
                this.a0 = c;
                c.t(gl.L(29.0f), gl.L(29.0f), i, i2, true);
                il0 il0Var = this.a0;
                il0Var.U = true;
                il0Var.u(gl.L(32.0f));
                il0 il0Var2 = this.a0;
                il0Var2.S.g = 0.4f;
                il0Var2.n();
            }
            Rect rect = gl.Q;
            rectF.round(rect);
            this.a0.setBounds(rect);
            this.a0.draw(canvas);
            return;
        }
        if (ib1Var.g()) {
            wl0 wl0Var = this.W;
            if (wl0Var == null) {
                wl0Var = new wl0(this.c0, view, 7, false);
                this.W = wl0Var;
            }
            ib1Var.h(wl0Var, canvas, ib1Var.z0, gl.L(29.0f), false, 0.0f, -view.getY(), false);
            u9bVar.m = gl.L(29.0f);
            u9bVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, gl.L(29.0f) + ((int) rectF.bottom));
            u9bVar.draw(canvas);
            return;
        }
        Paint paint = ib1Var.e;
        FrameLayout frameLayout = ib1Var.K;
        if (ib1Var.o0 > 0.0f && ib1Var.u0 != null && ib1Var.s0 != null && (bitmap = ib1Var.r0) != null && !bitmap.isRecycled()) {
            ib1Var.t0.reset();
            ib1Var.t0.postScale(frameLayout.getWidth() / ib1Var.r0.getWidth(), frameLayout.getHeight() / ib1Var.r0.getHeight());
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i3 = 0; i3 < 8 && view != null; i3++) {
                f += view.getX();
                f2 += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            ib1Var.t0.postTranslate(-f, -f2);
            ib1Var.s0.setLocalMatrix(ib1Var.t0);
            ib1Var.u0.setAlpha((int) (ib1Var.o0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, ib1Var.u0);
        }
        paint.setAlpha((int) (ib1Var.u0 == null ? 128.0f : gl.U1(ib1Var.o0, 128, kk7.i2) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // rt3
    public final void p() {
        this.d0.M.a();
    }

    @Override // rt3
    public final void q(int i, int i2) {
        this.d0.s(i, i2);
    }

    @Override // rt3
    public final boolean t(int i) {
        ib1 ib1Var = this.d0;
        cb1 cb1Var = ib1Var.f;
        ObjectAnimator objectAnimator = ib1Var.g0;
        byte b = 0;
        if (objectAnimator != null && objectAnimator.isRunning() && i == ib1Var.c0) {
            return false;
        }
        ib1Var.invalidate();
        if (!ib1Var.a0) {
            return true;
        }
        ib1Var.a0 = false;
        if (ib1Var.b0 == i) {
            return true;
        }
        ObjectAnimator objectAnimator2 = ib1Var.g0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i == ib1Var.c0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = ib1Var.g0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        cb1Var.getEditText().setScrollY(ib1Var.b0);
        gt3 editText = cb1Var.getEditText();
        int i2 = ib1Var.b0;
        ib1Var.c0 = i;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i2, i);
        ib1Var.g0 = ofInt;
        ofInt.setDuration(240L);
        ib1Var.g0.setInterpolator(s33.h);
        ib1Var.g0.addListener(new bb1(this, b));
        ib1Var.g0.start();
        return false;
    }

    @Override // rt3
    public final void u() {
        this.d0.M.e = true;
    }

    @Override // rt3
    public final void y() {
        this.d0.M.a();
    }
}
