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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kb1 extends iu3 {
    public xl0 W;
    public jl0 a0;
    public final /* synthetic */ vnb b0;
    public final /* synthetic */ tl0 c0;
    public final /* synthetic */ qb1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(qb1 qb1Var, Context context, wma wmaVar, int i, x53 x53Var, vnb vnbVar, tl0 tl0Var) {
        super(context, wmaVar, null, i, true, x53Var);
        this.d0 = qb1Var;
        this.b0 = vnbVar;
        this.c0 = tl0Var;
    }

    @Override // iu3
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qb1 qb1Var = this.d0;
        if ((qb1Var instanceof zb1) && ((zb1) qb1Var).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // iu3
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
        if (emojiView != null) {
            qb1 qb1Var = this.d0;
            if (qb1Var.getEditTextStyle() == 2 || qb1Var.getEditTextStyle() == 3) {
                emojiView.x0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (qb1Var instanceof ub1) {
                    emojiView.setPadding(0, 0, 0, hl.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new yi((byte) 1));
        }
    }

    @Override // iu3
    public final void g(Canvas canvas, eu3 eu3Var) {
        Bitmap bitmap;
        int i;
        int i2;
        WindowInsets rootWindowInsets;
        View view = eu3Var;
        qb1 qb1Var = this.d0;
        sdb sdbVar = qb1Var.d;
        RectF rectF = qb1Var.z0;
        rectF.set(0.0f, 0.0f, view.getWidth(), hl.L(29.0f) + view.getHeight());
        if (qb1Var.h0 != null) {
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
                jl0 c = qb1Var.h0.c(view, null, false);
                c.p(dtd.i(this.b0));
                this.a0 = c;
                c.t(hl.L(29.0f), hl.L(29.0f), i, i2, true);
                jl0 jl0Var = this.a0;
                jl0Var.U = true;
                jl0Var.u(hl.L(32.0f));
                jl0 jl0Var2 = this.a0;
                jl0Var2.S.g = 0.4f;
                jl0Var2.n();
            }
            Rect rect = hl.Q;
            rectF.round(rect);
            this.a0.setBounds(rect);
            this.a0.draw(canvas);
            return;
        }
        if (qb1Var.g()) {
            xl0 xl0Var = this.W;
            if (xl0Var == null) {
                xl0Var = new xl0(this.c0, view, 7, false);
                this.W = xl0Var;
            }
            qb1Var.h(xl0Var, canvas, qb1Var.z0, hl.L(29.0f), false, 0.0f, -view.getY(), false);
            sdbVar.m = hl.L(29.0f);
            sdbVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, hl.L(29.0f) + ((int) rectF.bottom));
            sdbVar.draw(canvas);
            return;
        }
        Paint paint = qb1Var.e;
        FrameLayout frameLayout = qb1Var.K;
        if (qb1Var.o0 > 0.0f && qb1Var.u0 != null && qb1Var.s0 != null && (bitmap = qb1Var.r0) != null && !bitmap.isRecycled()) {
            qb1Var.t0.reset();
            qb1Var.t0.postScale(frameLayout.getWidth() / qb1Var.r0.getWidth(), frameLayout.getHeight() / qb1Var.r0.getHeight());
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i3 = 0; i3 < 8 && view != null; i3++) {
                f += view.getX();
                f2 += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            qb1Var.t0.postTranslate(-f, -f2);
            qb1Var.s0.setLocalMatrix(qb1Var.t0);
            qb1Var.u0.setAlpha((int) (qb1Var.o0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, qb1Var.u0);
        }
        paint.setAlpha((int) (qb1Var.u0 == null ? 128.0f : hl.U1(qb1Var.o0, 128, jn7.i2) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // iu3
    public final void p() {
        this.d0.M.a();
    }

    @Override // iu3
    public final void q(int i, int i2) {
        this.d0.s(i, i2);
    }

    @Override // iu3
    public final boolean t(int i) {
        qb1 qb1Var = this.d0;
        kb1 kb1Var = qb1Var.f;
        ObjectAnimator objectAnimator = qb1Var.g0;
        byte b = 0;
        if (objectAnimator != null && objectAnimator.isRunning() && i == qb1Var.c0) {
            return false;
        }
        qb1Var.invalidate();
        if (!qb1Var.a0) {
            return true;
        }
        qb1Var.a0 = false;
        if (qb1Var.b0 == i) {
            return true;
        }
        ObjectAnimator objectAnimator2 = qb1Var.g0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i == qb1Var.c0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = qb1Var.g0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        kb1Var.getEditText().setScrollY(qb1Var.b0);
        xt3 editText = kb1Var.getEditText();
        int i2 = qb1Var.b0;
        qb1Var.c0 = i;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i2, i);
        qb1Var.g0 = ofInt;
        ofInt.setDuration(240L);
        qb1Var.g0.setInterpolator(k43.h);
        qb1Var.g0.addListener(new jb1(this, b));
        qb1Var.g0.start();
        return false;
    }

    @Override // iu3
    public final void u() {
        this.d0.M.e = true;
    }

    @Override // iu3
    public final void y() {
        this.d0.M.a();
    }
}
