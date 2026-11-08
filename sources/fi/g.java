package fi;

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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g extends lt {
    public org.telegram.ui.Components.ca V;
    public fh.g W;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a0;
    public final /* synthetic */ org.telegram.ui.Components.y9 b0;
    public final /* synthetic */ m c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Context context, rt0 rt0Var, int i7, di.b bVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.y9 y9Var) {
        super(context, rt0Var, null, i7, true, bVar);
        this.c0 = mVar;
        this.a0 = f6Var;
        this.b0 = y9Var;
    }

    @Override // org.telegram.ui.Components.lt
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.c0;
        if ((mVar instanceof r) && ((r) mVar).N1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.lt
    public final void f() {
        super.f();
        hy emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.w0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof uc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.q0(2));
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void g(Canvas canvas, gt gtVar) {
        Bitmap bitmap;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        View view = gtVar;
        m mVar = this.c0;
        dh.j jVar = mVar.d;
        RectF rectF = mVar.y0;
        rectF.set(0.0f, 0.0f, view.getWidth(), org.telegram.messenger.g0.L(29.0f) + view.getHeight());
        if (mVar.g0 != null) {
            if (this.W == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i7 = 0;
                    i10 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i10 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i7 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                fh.g c10 = mVar.g0.c(view, null, false);
                c10.p(c8.g0.i(this.a0));
                this.W = c10;
                c10.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i7, i10, true);
                fh.g gVar = this.W;
                gVar.S = true;
                gVar.u(org.telegram.messenger.g0.L(32.0f));
                fh.g gVar2 = this.W;
                gVar2.Q.g = 0.4f;
                gVar2.n();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
            return;
        }
        if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.ca(this.b0, view, 7, false);
            }
            mVar.h(this.V, canvas, mVar.y0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -view.getY(), false);
            jVar.m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
            return;
        }
        Paint paint = mVar.e;
        FrameLayout frameLayout = mVar.J;
        if (mVar.n0 > 0.0f && mVar.t0 != null && mVar.r0 != null && (bitmap = mVar.q0) != null && !bitmap.isRecycled()) {
            mVar.s0.reset();
            mVar.s0.postScale(frameLayout.getWidth() / mVar.q0.getWidth(), frameLayout.getHeight() / mVar.q0.getHeight());
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i11 = 0; i11 < 8 && view != null; i11++) {
                f10 += view.getX();
                f11 += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            mVar.s0.postTranslate(-f10, -f11);
            mVar.r0.setLocalMatrix(mVar.s0);
            mVar.t0.setAlpha((int) (mVar.n0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.t0);
        }
        paint.setAlpha((int) (mVar.t0 == null ? 128.0f : org.telegram.messenger.g0.W1(mVar.n0, 128, qs.j2) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.lt
    public final void p() {
        this.c0.L.a();
    }

    @Override // org.telegram.ui.Components.lt
    public final void q(int i7, int i10) {
        this.c0.s(i7, i10);
    }

    @Override // org.telegram.ui.Components.lt
    public final boolean t(int i7) {
        m mVar = this.c0;
        g gVar = mVar.f;
        ObjectAnimator objectAnimator = mVar.f0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == mVar.b0) {
            return false;
        }
        mVar.invalidate();
        if (!mVar.W) {
            return true;
        }
        mVar.W = false;
        if (mVar.a0 == i7) {
            return true;
        }
        ObjectAnimator objectAnimator2 = mVar.f0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i7 == mVar.b0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = mVar.f0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gVar.getEditText().setScrollY(mVar.a0);
        zs editText = gVar.getEditText();
        int i10 = mVar.a0;
        mVar.b0 = i7;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
        mVar.f0 = ofInt;
        ofInt.setDuration(240L);
        mVar.f0.setInterpolator(xq.h);
        mVar.f0.addListener(new bi.t5(this, 16));
        mVar.f0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.lt
    public final void u() {
        this.c0.L.e = true;
    }

    @Override // org.telegram.ui.Components.lt
    public final void y() {
        this.c0.L.a();
    }
}
