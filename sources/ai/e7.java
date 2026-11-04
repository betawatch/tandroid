package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ci.e9;
import ci.wb;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e7 extends View {
    public final ci.n6 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public float c;
    public float d;
    public Drawable e;

    public e7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = e6Var;
        ci.n6 n6Var = new ci.n6(i3, this, e6Var);
        this.a = n6Var;
        n6Var.y.setCallback(this);
        hs.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        ci.n6 n6Var = this.a;
        org.telegram.ui.Components.e5 e5Var = n6Var.e;
        t2 t2Var = n6Var.j;
        ImageReceiver imageReceiver = n6Var.d;
        n6Var.N = false;
        n6Var.Q = null;
        n6Var.R = null;
        n6Var.p = false;
        n6Var.k = (TL_stars.starGiftAttributeBackdrop) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        n6Var.l = (TL_stars.starGiftAttributePattern) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = n6Var.m;
        n6Var.m = (TL_stars.starGiftAttributeModel) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = n6Var.f;
        n6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = n6Var.l;
        if (stargiftattributepattern != null) {
            e5Var.i(stargiftattributepattern.document, false);
        } else {
            e5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = n6Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            wb.c1(imageReceiver, n6Var.m.document, hs.v1);
        }
        boolean z11 = tL_starGiftUnique.burned;
        n6Var.L = z11;
        if (z11) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, n6Var.c);
            Paint paint2 = (Paint) t2Var.b;
            paint2.setShader(null);
            paint2.setColor(w02);
            n6Var.M = org.telegram.ui.ActionBar.r6.b;
            t2Var.f(11, bd.M0(2131749901, null), true);
        } else {
            t2Var.e(n6Var.k, true, false);
            t2Var.f(11, bd.M0(2131749902, null), true);
        }
        if (n6Var.S) {
            imageReceiver.P();
            e5Var.a();
            n6Var.y.d.P();
        }
        n6Var.O = org.telegram.messenger.camera.q.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            n6Var.O = (int) (n6Var.O * 1.2f);
        }
        n6Var.O -= org.telegram.messenger.g0.L(8.0f);
        n6Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        qe.c cVar = n6Var.T;
        if (z10) {
            int round = Math.round(cVar.h ? cVar.g : cVar.f);
            int i3 = n6Var.O;
            if (round != i3) {
                cVar.a(i3);
            }
        } else {
            cVar.c(n6Var.O);
        }
        requestLayout();
        invalidate();
    }

    public ci.n6 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ci.n6 n6Var = this.a;
        n6Var.S = false;
        n6Var.d.R();
        n6Var.e.b();
        j1 j1Var = n6Var.y;
        j1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, j1Var.q);
        j1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (e6Var != null) {
            e6Var.b(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, getY(), getMeasuredWidth(), height);
        }
        ci.n6 n6Var = this.a;
        this.c = (getWidth() - ((int) n6Var.T.f)) / 2.0f;
        float L = n6Var.T.f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, n6Var.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        n6Var.b(canvas);
        n6Var.c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int i11 = (int) this.a.T.f;
        this.c = (size - i11) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + r4.P);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.e(this.c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a.y;
    }
}
