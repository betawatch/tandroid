package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import di.pb;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b9 extends View {
    public final di.h6 a;
    public final org.telegram.ui.ActionBar.i6 b;
    public float c;
    public float d;
    public Drawable e;

    public b9(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.b = i6Var;
        di.h6 h6Var = new di.h6(i7, this, i6Var);
        this.a = h6Var;
        h6Var.y.setCallback(this);
        ks.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        di.h6 h6Var = this.a;
        org.telegram.ui.Components.m5 m5Var = h6Var.e;
        f3 f3Var = h6Var.j;
        ImageReceiver imageReceiver = h6Var.d;
        h6Var.N = false;
        h6Var.Q = null;
        h6Var.R = null;
        h6Var.p = false;
        h6Var.k = (TL_stars.starGiftAttributeBackdrop) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        h6Var.l = (TL_stars.starGiftAttributePattern) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = h6Var.m;
        h6Var.m = (TL_stars.starGiftAttributeModel) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = h6Var.f;
        h6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = h6Var.l;
        if (stargiftattributepattern != null) {
            m5Var.i(stargiftattributepattern.document, false);
        } else {
            m5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = h6Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            pb.d1(imageReceiver, h6Var.m.document, ks.v1);
        }
        boolean z11 = tL_starGiftUnique.burned;
        h6Var.L = z11;
        if (z11) {
            f3Var.f(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q7, h6Var.c));
            h6Var.M = org.telegram.ui.ActionBar.u6.b;
            f3Var.g(11, gd.M0(2131749877, null), true);
        } else {
            f3Var.e(h6Var.k, true, false);
            f3Var.g(11, gd.M0(2131749878, null), true);
        }
        if (h6Var.S) {
            imageReceiver.P();
            m5Var.a();
            h6Var.y.d.P();
        }
        h6Var.O = n10.D(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            h6Var.O = (int) (h6Var.O * 1.2f);
        }
        h6Var.O -= org.telegram.messenger.g0.L(8.0f);
        h6Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = h6Var.T;
        if (z10) {
            int round = Math.round(cVar.h ? cVar.g : cVar.f);
            int i7 = h6Var.O;
            if (round != i7) {
                cVar.a(i7);
            }
        } else {
            cVar.c(h6Var.O);
        }
        requestLayout();
        invalidate();
    }

    public di.h6 getLayout() {
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
        di.h6 h6Var = this.a;
        h6Var.S = false;
        h6Var.d.R();
        h6Var.e.b();
        h1 h1Var = h6Var.y;
        h1Var.d.R();
        org.telegram.ui.Components.x5.release((View) null, h1Var.q);
        h1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (i6Var != null) {
            i6Var.e(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, getY(), getMeasuredWidth(), height);
        }
        di.h6 h6Var = this.a;
        this.c = (getWidth() - ((int) h6Var.T.f)) / 2.0f;
        float L = h6Var.T.f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, h6Var.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        h6Var.b(canvas);
        h6Var.c(canvas);
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
