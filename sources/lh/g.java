package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g extends tt {
    public org.telegram.ui.Components.da R;
    public lg.d S;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 T;
    public final /* synthetic */ org.telegram.ui.Components.z9 U;
    public final /* synthetic */ m V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Context context, zu0 zu0Var, int i10, jh.b bVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var) {
        super(context, zu0Var, null, i10, true, bVar);
        this.V = mVar;
        this.T = c6Var;
        this.U = z9Var;
    }

    @Override // org.telegram.ui.Components.tt
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.V;
        if ((mVar instanceof s) && ((s) mVar).K1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tt
    public final void f() {
        super.f();
        yy emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.V;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.s0 = false;
                emojiView.t2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof xc) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.E2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new cg.l1(5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [android.view.View] */
    @Override // org.telegram.ui.Components.tt
    public final void g(Canvas canvas, pt ptVar) {
        Bitmap bitmap;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.V;
        jg.i iVar = mVar.d;
        RectF rectF = mVar.v0;
        rectF.set(0.0f, 0.0f, ptVar.getWidth(), AndroidUtilities.dp(29.0f) + ptVar.getHeight());
        int i12 = 0;
        if (mVar.d0 != null) {
            if (this.S == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i10 = 0;
                    i11 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i11 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i10 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                lg.d c10 = mVar.d0.c(ptVar, null, false);
                c10.n(ng.c.i(this.T));
                this.S = c10;
                c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                lg.d dVar = this.S;
                dVar.k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                lg.d dVar2 = this.S;
                dVar2.h.g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.S.setBounds(rect);
            this.S.draw(canvas);
            return;
        }
        if (mVar.g()) {
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.da(this.U, ptVar, 7, false);
            }
            mVar.h(this.R, canvas, mVar.v0, AndroidUtilities.dp(29.0f), false, 0.0f, -ptVar.getY(), false);
            iVar.k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
            return;
        }
        Paint paint = mVar.e;
        FrameLayout frameLayout = mVar.F;
        if (mVar.k0 > 0.0f && mVar.q0 != null && mVar.o0 != null && (bitmap = mVar.n0) != null && !bitmap.isRecycled()) {
            mVar.p0.reset();
            mVar.p0.postScale(frameLayout.getWidth() / mVar.n0.getWidth(), frameLayout.getHeight() / mVar.n0.getHeight());
            float f10 = 0.0f;
            float f11 = 0.0f;
            pt ptVar2 = ptVar;
            while (i12 < 8 && ptVar2 != null) {
                f10 += ptVar2.getX();
                f11 += ptVar2.getY();
                Object parent = ptVar2.getParent();
                i12++;
                ptVar2 = parent instanceof View ? (View) parent : 0;
            }
            mVar.p0.postTranslate(-f10, -f11);
            mVar.o0.setLocalMatrix(mVar.p0);
            mVar.q0.setAlpha((int) (mVar.k0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.q0);
        }
        paint.setAlpha((int) (mVar.q0 == null ? 128.0f : AndroidUtilities.lerp(128, 153, mVar.k0) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.tt
    public final void p() {
        this.V.H.a();
    }

    @Override // org.telegram.ui.Components.tt
    public final void q(int i10, int i11) {
        this.V.s(i10, i11);
    }

    @Override // org.telegram.ui.Components.tt
    public final boolean t(int i10) {
        m mVar = this.V;
        g gVar = mVar.f;
        ObjectAnimator objectAnimator = mVar.c0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.U) {
            return false;
        }
        mVar.invalidate();
        if (!mVar.S) {
            return true;
        }
        mVar.S = false;
        if (mVar.T == i10) {
            return true;
        }
        ObjectAnimator objectAnimator2 = mVar.c0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i10 == mVar.U) {
            return true;
        }
        ObjectAnimator objectAnimator3 = mVar.c0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gVar.getEditText().setScrollY(mVar.T);
        lt editText = gVar.getEditText();
        int i11 = mVar.T;
        mVar.U = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
        mVar.c0 = ofInt;
        ofInt.setDuration(240L);
        mVar.c0.setInterpolator(er.h);
        mVar.c0.addListener(new ag.r1(this, 22));
        mVar.c0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.tt
    public final void u() {
        this.V.H.e = true;
    }

    @Override // org.telegram.ui.Components.tt
    public final void y() {
        this.V.H.a();
    }
}
