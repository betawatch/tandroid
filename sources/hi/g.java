package hi;

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
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g extends rt {
    public org.telegram.ui.Components.y9 W;
    public fh.g a0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 b0;
    public final /* synthetic */ org.telegram.ui.Components.u9 c0;
    public final /* synthetic */ m d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Context context, st0 st0Var, int i7, fi.b bVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var) {
        super(context, st0Var, null, i7, true, bVar);
        this.d0 = mVar;
        this.b0 = e6Var;
        this.c0 = u9Var;
    }

    @Override // org.telegram.ui.Components.rt
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.d0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rt
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.d0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.x0 = false;
                emojiView.y2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof pc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.M2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.p0(2));
        }
    }

    @Override // org.telegram.ui.Components.rt
    public final void g(Canvas canvas, nt ntVar) {
        Bitmap bitmap;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        View view = ntVar;
        m mVar = this.d0;
        dh.j jVar = mVar.d;
        RectF rectF = mVar.z0;
        rectF.set(0.0f, 0.0f, view.getWidth(), org.telegram.messenger.g0.L(29.0f) + view.getHeight());
        if (mVar.h0 != null) {
            if (this.a0 == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i7 = 0;
                    i10 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i10 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i7 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                fh.g c10 = mVar.h0.c(view, null, false);
                c10.p(c8.g0.i(this.b0));
                this.a0 = c10;
                c10.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i7, i10, true);
                fh.g gVar = this.a0;
                gVar.T = true;
                gVar.u(org.telegram.messenger.g0.L(32.0f));
                fh.g gVar2 = this.a0;
                gVar2.R.g = 0.4f;
                gVar2.n();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            this.a0.setBounds(rect);
            this.a0.draw(canvas);
            return;
        }
        if (mVar.g()) {
            if (this.W == null) {
                this.W = new org.telegram.ui.Components.y9(this.c0, view, 7, false);
            }
            mVar.h(this.W, canvas, mVar.z0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -view.getY(), false);
            jVar.m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
            return;
        }
        Paint paint = mVar.e;
        FrameLayout frameLayout = mVar.K;
        if (mVar.o0 > 0.0f && mVar.u0 != null && mVar.s0 != null && (bitmap = mVar.r0) != null && !bitmap.isRecycled()) {
            mVar.t0.reset();
            mVar.t0.postScale(frameLayout.getWidth() / mVar.r0.getWidth(), frameLayout.getHeight() / mVar.r0.getHeight());
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i11 = 0; i11 < 8 && view != null; i11++) {
                f10 += view.getX();
                f11 += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            mVar.t0.postTranslate(-f10, -f11);
            mVar.s0.setLocalMatrix(mVar.t0);
            mVar.u0.setAlpha((int) (mVar.o0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.u0);
        }
        paint.setAlpha((int) (mVar.u0 == null ? 128.0f : org.telegram.messenger.g0.W1(mVar.o0, 128, ns.j2) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.rt
    public final void p() {
        this.d0.M.a();
    }

    @Override // org.telegram.ui.Components.rt
    public final void q(int i7, int i10) {
        this.d0.s(i7, i10);
    }

    @Override // org.telegram.ui.Components.rt
    public final boolean t(int i7) {
        m mVar = this.d0;
        g gVar = mVar.f;
        ObjectAnimator objectAnimator = mVar.g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == mVar.c0) {
            return false;
        }
        mVar.invalidate();
        if (!mVar.a0) {
            return true;
        }
        mVar.a0 = false;
        if (mVar.b0 == i7) {
            return true;
        }
        ObjectAnimator objectAnimator2 = mVar.g0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i7 == mVar.c0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = mVar.g0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gVar.getEditText().setScrollY(mVar.b0);
        ft editText = gVar.getEditText();
        int i10 = mVar.b0;
        mVar.c0 = i7;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
        mVar.g0 = ofInt;
        ofInt.setDuration(240L);
        mVar.g0.setInterpolator(er.h);
        mVar.g0.addListener(new ai.j0(this, 18));
        mVar.g0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.rt
    public final void u() {
        this.d0.M.e = true;
    }

    @Override // org.telegram.ui.Components.rt
    public final void y() {
        this.d0.M.a();
    }
}
