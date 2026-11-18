package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u6 extends View {
    public final w3 a;
    public boolean b;
    public final org.telegram.ui.Components.c6 c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.o5 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public u6(Context context, w3 w3Var) {
        super(context);
        this.c = new org.telegram.ui.Components.c6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = w3Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.e.P();
        this.s = true;
        org.telegram.ui.Components.o5 o5Var = this.f;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.e.R();
        this.s = false;
        org.telegram.ui.Components.o5 o5Var = this.f;
        if (o5Var != null) {
            o5Var.n(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        if (this.n) {
            float e10 = this.c.e(false, this.b ? 1.0f : 0.0f);
            w3 w3Var = this.a;
            if (e10 < 1.0f) {
                Drawable drawable = w3Var.o;
                Drawable drawable2 = w3Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(ks.e4);
                drawable2.draw(canvas);
            }
            if (e10 > 0.0f) {
                Drawable drawable3 = w3Var.p;
                Drawable drawable4 = w3Var.p;
                drawable3.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable4.setAlpha((int) (e10 * 255.0f));
                drawable4.draw(canvas);
                return;
            }
            return;
        }
        if (!this.h) {
            return;
        }
        org.telegram.ui.Components.o5 o5Var = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = o5Var != null ? o5Var.k : imageReceiver;
        if (this.r) {
            ImageReceiver imageReceiver3 = this.e;
            if (imageReceiver3.n() != null) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                float f10 = measuredWidth / 2.0f;
                float f11 = measuredWidth * 2;
                imageReceiver3.y0(getPaddingLeft() - f10, getPaddingTop() - f10, f11, f11);
                if (imageReceiver3.B() != null && imageReceiver3.B().A()) {
                    this.r = false;
                    imageReceiver.l1 = (byte) 0;
                }
                imageReceiver2 = imageReceiver3;
                if (imageReceiver2 == null) {
                    imageReceiver2.h(canvas, null);
                    return;
                }
                return;
            }
        }
        if (imageReceiver2 != null) {
            imageReceiver2.y0(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        }
        if (imageReceiver2 == null) {
        }
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(ch.p0 p0Var) {
        String str;
        String str2;
        this.n = p0Var == null || ((str2 = p0Var.f) != null && str2.equals("❤"));
        if (p0Var == null || (str = p0Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        org.telegram.ui.Components.o5 o5Var = this.f;
        if (o5Var != null) {
            o5Var.n(this);
        }
        this.f = null;
        if (p0Var != null) {
            if (p0Var.g != 0) {
                org.telegram.ui.Components.o5 o5Var2 = new org.telegram.ui.Components.o5(3, j10.t0, p0Var.g);
                this.f = o5Var2;
                if (this.s) {
                    o5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.t0).r.get(p0Var.f);
                if (tL_availableReaction != null) {
                    this.d.q0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.n6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
