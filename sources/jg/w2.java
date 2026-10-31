package jg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.t5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class w2 extends j {
    public final TLRPC.Document q0;
    public final Object r0;
    public final int s0;
    public boolean t0;
    public final t5 u0;
    public final pu0 v0;
    public final l0 w0;
    public final ImageReceiver x0;

    public w2(Context context, PointF pointF, float f7, float f10, pu0 pu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = new ImageReceiver(null);
        setRotation(f7);
        setScale(f10);
        this.q0 = document;
        this.v0 = pu0Var;
        this.r0 = obj;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.s0 = tL_maskCoords.n;
                }
            } else {
                i10++;
            }
        }
        l0 l0Var = new l0(this, context);
        this.w0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        this.u0 = new t5(l0Var, 0L, 500L, gr.h);
        ImageReceiver imageReceiver = this.x0;
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(l0Var);
        this.x0.t0(ic.b(document), null, ic.c(b8.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.x0.g1 = new ig.c0(this, 16);
        k();
    }

    @Override // jg.j
    public final i a() {
        g2 g2Var = new g2(this, getContext(), 2);
        g2Var.r = new RectF();
        return g2Var;
    }

    public int getAnchor() {
        return this.s0;
    }

    public pu0 getBaseSize() {
        return this.v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.x0;
        bi0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        if (imageReceiver.m() != null) {
            return r0.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.r0;
    }

    @Override // jg.j
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new oj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new oj0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.q0;
    }

    @Override // jg.j
    public final void k() {
        pu0 pu0Var = this.v0;
        float f7 = pu0Var.a / 2.0f;
        float f10 = pu0Var.b / 2.0f;
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0.R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pu0 pu0Var = this.v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) pu0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) pu0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        this.w0.invalidate();
    }

    public void q(bi0 bi0Var) {
    }

    public w2(Context context, w2 w2Var, PointF pointF) {
        this(context, pointF, w2Var.getRotation(), w2Var.getScale(), w2Var.v0, w2Var.q0, w2Var.r0);
        if (w2Var.t0) {
            r(false);
        }
    }
}
