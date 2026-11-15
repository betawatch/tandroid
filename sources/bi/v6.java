package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import di.lb;
import di.u8;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v6 extends View {
    public final di.e6 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public float c;
    public float d;
    public Drawable e;

    public v6(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = e6Var;
        di.e6 e6Var2 = new di.e6(i7, this, e6Var);
        this.a = e6Var2;
        e6Var2.y.setCallback(this);
        ns.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        di.e6 e6Var = this.a;
        org.telegram.ui.Components.e5 e5Var = e6Var.e;
        l2 l2Var = e6Var.j;
        ImageReceiver imageReceiver = e6Var.d;
        e6Var.N = false;
        e6Var.Q = null;
        e6Var.R = null;
        e6Var.p = false;
        e6Var.k = (TL_stars.starGiftAttributeBackdrop) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e6Var.l = (TL_stars.starGiftAttributePattern) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = e6Var.m;
        e6Var.m = (TL_stars.starGiftAttributeModel) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = e6Var.f;
        e6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = e6Var.l;
        if (stargiftattributepattern != null) {
            e5Var.i(stargiftattributepattern.document, false);
        } else {
            e5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = e6Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            lb.c1(imageReceiver, e6Var.m.document, ns.v1);
        }
        boolean z11 = tL_starGiftUnique.burned;
        e6Var.L = z11;
        if (z11) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q7, e6Var.c);
            Paint paint2 = (Paint) l2Var.b;
            paint2.setShader(null);
            paint2.setColor(w02);
            e6Var.M = org.telegram.ui.ActionBar.q6.b;
            l2Var.f(11, hd.M0(2131749893, null), true);
        } else {
            l2Var.e(e6Var.k, true, false);
            l2Var.f(11, hd.M0(2131749894, null), true);
        }
        if (e6Var.S) {
            imageReceiver.P();
            e5Var.a();
            e6Var.y.d.P();
        }
        e6Var.O = i20.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            e6Var.O = (int) (e6Var.O * 1.2f);
        }
        e6Var.O -= org.telegram.messenger.g0.L(8.0f);
        e6Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = e6Var.T;
        if (z10) {
            int round = Math.round(cVar.h ? cVar.g : cVar.f);
            int i7 = e6Var.O;
            if (round != i7) {
                cVar.a(i7);
            }
        } else {
            cVar.c(e6Var.O);
        }
        requestLayout();
        invalidate();
    }

    public di.e6 getLayout() {
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
        di.e6 e6Var = this.a;
        e6Var.S = false;
        e6Var.d.R();
        e6Var.e.b();
        g1 g1Var = e6Var.y;
        g1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, g1Var.q);
        g1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (e6Var != null) {
            e6Var.b(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            org.telegram.ui.ActionBar.j6.r(0.0f, getY(), getMeasuredWidth(), height);
        }
        di.e6 e6Var2 = this.a;
        this.c = (getWidth() - ((int) e6Var2.T.f)) / 2.0f;
        float L = e6Var2.T.f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, e6Var2.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        e6Var2.b(canvas);
        e6Var2.c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
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
