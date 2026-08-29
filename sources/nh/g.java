package nh;

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
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.wt;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g extends au {
    public org.telegram.ui.Components.ka R;
    public ng.d S;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 T;
    public final /* synthetic */ org.telegram.ui.Components.ga U;
    public final /* synthetic */ m V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Context context, hv0 hv0Var, int i10, lh.b bVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar) {
        super(context, hv0Var, null, i10, true, bVar);
        this.V = mVar;
        this.T = c6Var;
        this.U = gaVar;
    }

    @Override // org.telegram.ui.Components.au
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.V;
        if ((mVar instanceof r) && ((r) mVar).K1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.au
    public final void f() {
        super.f();
        fz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.V;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.s0 = false;
                emojiView.t2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof ed) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.E2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new eg.k1(5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [android.view.View] */
    @Override // org.telegram.ui.Components.au
    public final void g(Canvas canvas, wt wtVar) {
        Bitmap bitmap;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.V;
        lg.i iVar = mVar.d;
        RectF rectF = mVar.v0;
        rectF.set(0.0f, 0.0f, wtVar.getWidth(), AndroidUtilities.dp(29.0f) + wtVar.getHeight());
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
                ng.d c3 = mVar.d0.c(wtVar, null, false);
                c3.n(pg.a.i(this.T));
                this.S = c3;
                c3.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                ng.d dVar = this.S;
                dVar.k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                ng.d dVar2 = this.S;
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
                this.R = new org.telegram.ui.Components.ka(this.U, wtVar, 7, false);
            }
            mVar.h(this.R, canvas, mVar.v0, AndroidUtilities.dp(29.0f), false, 0.0f, -wtVar.getY(), false);
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
            float f9 = 0.0f;
            float f10 = 0.0f;
            wt wtVar2 = wtVar;
            while (i12 < 8 && wtVar2 != null) {
                f9 += wtVar2.getX();
                f10 += wtVar2.getY();
                Object parent = wtVar2.getParent();
                i12++;
                wtVar2 = parent instanceof View ? (View) parent : 0;
            }
            mVar.p0.postTranslate(-f9, -f10);
            mVar.o0.setLocalMatrix(mVar.p0);
            mVar.q0.setAlpha((int) (mVar.k0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.q0);
        }
        paint.setAlpha((int) (mVar.q0 == null ? 128.0f : AndroidUtilities.lerp(128, 153, mVar.k0) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.au
    public final void p() {
        this.V.H.a();
    }

    @Override // org.telegram.ui.Components.au
    public final void q(int i10, int i11) {
        this.V.s(i10, i11);
    }

    @Override // org.telegram.ui.Components.au
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
        st editText = gVar.getEditText();
        int i11 = mVar.T;
        mVar.U = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
        mVar.c0 = ofInt;
        ofInt.setDuration(240L);
        mVar.c0.setInterpolator(jr.h);
        mVar.c0.addListener(new ag.m0(this, 26));
        mVar.c0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.au
    public final void u() {
        this.V.H.e = true;
    }

    @Override // org.telegram.ui.Components.au
    public final void y() {
        this.V.H.a();
    }
}
