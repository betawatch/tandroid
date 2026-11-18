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
import org.telegram.messenger.ks;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class g extends wt {
    public org.telegram.ui.Components.ga W;
    public fh.g a0;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 b0;
    public final /* synthetic */ org.telegram.ui.Components.ca c0;
    public final /* synthetic */ n d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, Context context, au0 au0Var, int i7, fi.b bVar, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ca caVar) {
        super(context, au0Var, null, i7, true, bVar);
        this.d0 = nVar;
        this.b0 = i6Var;
        this.c0 = caVar;
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n nVar = this.d0;
        if ((nVar instanceof s) && ((s) nVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        if (emojiView != null) {
            n nVar = this.d0;
            if (nVar.getEditTextStyle() == 2 || nVar.getEditTextStyle() == 3) {
                emojiView.x0 = false;
                emojiView.y2 = false;
                emojiView.setShouldDrawBackground(false);
                if (nVar instanceof yc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.M2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.q0(2));
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void g(Canvas canvas, st stVar) {
        Bitmap bitmap;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        View view = stVar;
        n nVar = this.d0;
        dh.j jVar = nVar.d;
        RectF rectF = nVar.z0;
        rectF.set(0.0f, 0.0f, view.getWidth(), org.telegram.messenger.g0.L(29.0f) + view.getHeight());
        if (nVar.h0 != null) {
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
                fh.g c10 = nVar.h0.c(view, null, false);
                c10.p(c8.i0.j(this.b0));
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
        if (nVar.g()) {
            if (this.W == null) {
                this.W = new org.telegram.ui.Components.ga(this.c0, view, 7, false);
            }
            nVar.h(this.W, canvas, nVar.z0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -view.getY(), false);
            jVar.m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
            return;
        }
        Paint paint = nVar.e;
        FrameLayout frameLayout = nVar.K;
        if (nVar.o0 > 0.0f && nVar.u0 != null && nVar.s0 != null && (bitmap = nVar.r0) != null && !bitmap.isRecycled()) {
            nVar.t0.reset();
            nVar.t0.postScale(frameLayout.getWidth() / nVar.r0.getWidth(), frameLayout.getHeight() / nVar.r0.getHeight());
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i11 = 0; i11 < 8 && view != null; i11++) {
                f10 += view.getX();
                f11 += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            nVar.t0.postTranslate(-f10, -f11);
            nVar.s0.setLocalMatrix(nVar.t0);
            nVar.u0.setAlpha((int) (nVar.o0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, nVar.u0);
        }
        paint.setAlpha((int) (nVar.u0 == null ? 128.0f : org.telegram.messenger.g0.W1(nVar.o0, 128, ks.j2) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.wt
    public final void p() {
        this.d0.M.a();
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i7, int i10) {
        this.d0.s(i7, i10);
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean t(int i7) {
        n nVar = this.d0;
        g gVar = nVar.f;
        ObjectAnimator objectAnimator = nVar.g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == nVar.c0) {
            return false;
        }
        nVar.invalidate();
        if (!nVar.a0) {
            return true;
        }
        nVar.a0 = false;
        if (nVar.b0 == i7) {
            return true;
        }
        ObjectAnimator objectAnimator2 = nVar.g0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i7 == nVar.c0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = nVar.g0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gVar.getEditText().setScrollY(nVar.b0);
        mt editText = gVar.getEditText();
        int i10 = nVar.b0;
        nVar.c0 = i7;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
        nVar.g0 = ofInt;
        ofInt.setDuration(240L);
        nVar.g0.setInterpolator(lr.h);
        nVar.g0.addListener(new ai.j0(this, 18));
        nVar.g0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.wt
    public final void u() {
        this.d0.M.e = true;
    }

    @Override // org.telegram.ui.Components.wt
    public final void y() {
        this.d0.M.a();
    }
}
