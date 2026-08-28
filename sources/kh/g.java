package kh;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g extends ut {
    public org.telegram.ui.Components.fa R;
    public kg.d S;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 T;
    public final /* synthetic */ org.telegram.ui.Components.ba U;
    public final /* synthetic */ m V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Context context, xu0 xu0Var, int i9, ih.b bVar, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar) {
        super(context, xu0Var, null, i9, true, bVar);
        this.V = mVar;
        this.T = b6Var;
        this.U = baVar;
    }

    @Override // org.telegram.ui.Components.ut
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

    @Override // org.telegram.ui.Components.ut
    public final void f() {
        super.f();
        wy emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.V;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.s0 = false;
                emojiView.t2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof ad) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.c = 3;
                }
                emojiView.T();
            }
        }
        if (emojiView != null) {
            emojiView.E2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.q1(5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [android.view.View] */
    @Override // org.telegram.ui.Components.ut
    public final void g(Canvas canvas, qt qtVar) {
        Bitmap bitmap;
        int i9;
        int i10;
        WindowInsets rootWindowInsets;
        m mVar = this.V;
        ig.i iVar = mVar.d;
        RectF rectF = mVar.v0;
        rectF.set(0.0f, 0.0f, qtVar.getWidth(), AndroidUtilities.dp(29.0f) + qtVar.getHeight());
        int i11 = 0;
        if (mVar.d0 != null) {
            if (this.S == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i9 = 0;
                    i10 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i10 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i9 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                kg.d c10 = mVar.d0.c(qtVar, null, false);
                c10.n(mg.c.i(this.T));
                this.S = c10;
                c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i9, i10);
                kg.d dVar = this.S;
                dVar.k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                kg.d dVar2 = this.S;
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
                this.R = new org.telegram.ui.Components.fa(this.U, qtVar, 7, false);
            }
            mVar.h(this.R, canvas, mVar.v0, AndroidUtilities.dp(29.0f), false, 0.0f, -qtVar.getY(), false);
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
            qt qtVar2 = qtVar;
            while (i11 < 8 && qtVar2 != null) {
                f10 += qtVar2.getX();
                f11 += qtVar2.getY();
                Object parent = qtVar2.getParent();
                i11++;
                qtVar2 = parent instanceof View ? (View) parent : 0;
            }
            mVar.p0.postTranslate(-f10, -f11);
            mVar.o0.setLocalMatrix(mVar.p0);
            mVar.q0.setAlpha((int) (mVar.k0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.q0);
        }
        paint.setAlpha((int) (mVar.q0 == null ? 128.0f : AndroidUtilities.lerp(128, 153, mVar.k0) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.ut
    public final void p() {
        this.V.H.a();
    }

    @Override // org.telegram.ui.Components.ut
    public final void q(int i9, int i10) {
        this.V.s(i9, i10);
    }

    @Override // org.telegram.ui.Components.ut
    public final boolean t(int i9) {
        m mVar = this.V;
        g gVar = mVar.f;
        ObjectAnimator objectAnimator = mVar.c0;
        if (objectAnimator != null && objectAnimator.isRunning() && i9 == mVar.U) {
            return false;
        }
        mVar.invalidate();
        if (!mVar.S) {
            return true;
        }
        mVar.S = false;
        if (mVar.T == i9) {
            return true;
        }
        ObjectAnimator objectAnimator2 = mVar.c0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i9 == mVar.U) {
            return true;
        }
        ObjectAnimator objectAnimator3 = mVar.c0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gVar.getEditText().setScrollY(mVar.T);
        mt editText = gVar.getEditText();
        int i10 = mVar.T;
        mVar.U = i9;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i9);
        mVar.c0 = ofInt;
        ofInt.setDuration(240L);
        mVar.c0.setInterpolator(gr.h);
        mVar.c0.addListener(new ag.e(this, 20));
        mVar.c0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.ut
    public final void u() {
        this.V.H.e = true;
    }

    @Override // org.telegram.ui.Components.ut
    public final void y() {
        this.V.H.a();
    }
}
