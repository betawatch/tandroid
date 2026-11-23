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
import org.telegram.messenger.ls;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yt;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class h extends yt {
    public org.telegram.ui.Components.ga W;
    public fh.g a0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 b0;
    public final /* synthetic */ org.telegram.ui.Components.ca c0;
    public final /* synthetic */ o d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, Context context, du0 du0Var, int i7, fi.b bVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar) {
        super(context, du0Var, null, i7, true, bVar);
        this.d0 = oVar;
        this.b0 = h6Var;
        this.c0 = caVar;
    }

    @Override // org.telegram.ui.Components.yt
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o oVar = this.d0;
        if ((oVar instanceof t) && ((t) oVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.yt
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        if (emojiView != null) {
            o oVar = this.d0;
            if (oVar.getEditTextStyle() == 2 || oVar.getEditTextStyle() == 3) {
                emojiView.x0 = false;
                emojiView.y2 = false;
                emojiView.setShouldDrawBackground(false);
                if (oVar instanceof yc) {
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

    @Override // org.telegram.ui.Components.yt
    public final void g(Canvas canvas, ut utVar) {
        Bitmap bitmap;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        View view = utVar;
        o oVar = this.d0;
        dh.j jVar = oVar.d;
        RectF rectF = oVar.z0;
        rectF.set(0.0f, 0.0f, view.getWidth(), org.telegram.messenger.g0.L(29.0f) + view.getHeight());
        if (oVar.h0 != null) {
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
                fh.g c10 = oVar.h0.c(view, null, false);
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
        if (oVar.g()) {
            if (this.W == null) {
                this.W = new org.telegram.ui.Components.ga(this.c0, view, 7, false);
            }
            oVar.h(this.W, canvas, oVar.z0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -view.getY(), false);
            jVar.m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
            return;
        }
        Paint paint = oVar.e;
        FrameLayout frameLayout = oVar.K;
        if (oVar.o0 > 0.0f && oVar.u0 != null && oVar.s0 != null && (bitmap = oVar.r0) != null && !bitmap.isRecycled()) {
            oVar.t0.reset();
            oVar.t0.postScale(frameLayout.getWidth() / oVar.r0.getWidth(), frameLayout.getHeight() / oVar.r0.getHeight());
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i11 = 0; i11 < 8 && view != null; i11++) {
                f10 += view.getX();
                f11 += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            oVar.t0.postTranslate(-f10, -f11);
            oVar.s0.setLocalMatrix(oVar.t0);
            oVar.u0.setAlpha((int) (oVar.o0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, oVar.u0);
        }
        paint.setAlpha((int) (oVar.u0 == null ? 128.0f : org.telegram.messenger.g0.W1(oVar.o0, 128, ls.j2) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.yt
    public final void p() {
        this.d0.M.a();
    }

    @Override // org.telegram.ui.Components.yt
    public final void q(int i7, int i10) {
        this.d0.s(i7, i10);
    }

    @Override // org.telegram.ui.Components.yt
    public final boolean t(int i7) {
        o oVar = this.d0;
        h hVar = oVar.f;
        ObjectAnimator objectAnimator = oVar.g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == oVar.c0) {
            return false;
        }
        oVar.invalidate();
        if (!oVar.a0) {
            return true;
        }
        oVar.a0 = false;
        if (oVar.b0 == i7) {
            return true;
        }
        ObjectAnimator objectAnimator2 = oVar.g0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i7 == oVar.c0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = oVar.g0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        hVar.getEditText().setScrollY(oVar.b0);
        ot editText = hVar.getEditText();
        int i10 = oVar.b0;
        oVar.c0 = i7;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
        oVar.g0 = ofInt;
        ofInt.setDuration(240L);
        oVar.g0.setInterpolator(nr.h);
        oVar.g0.addListener(new ai.k0(this, 18));
        oVar.g0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.yt
    public final void u() {
        this.d0.M.e = true;
    }

    @Override // org.telegram.ui.Components.yt
    public final void y() {
        this.d0.M.a();
    }
}
