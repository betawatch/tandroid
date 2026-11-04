package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e7 extends View {
    public final g4 a;
    public boolean b;
    public final org.telegram.ui.Components.u5 c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.g5 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public e7(Context context, g4 g4Var) {
        super(context);
        this.c = new org.telegram.ui.Components.u5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = g4Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.e.P();
        this.s = true;
        org.telegram.ui.Components.g5 g5Var = this.f;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.e.R();
        this.s = false;
        org.telegram.ui.Components.g5 g5Var = this.f;
        if (g5Var != null) {
            g5Var.n(this);
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
            g4 g4Var = this.a;
            if (e10 < 1.0f) {
                Drawable drawable = g4Var.o;
                Drawable drawable2 = g4Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(hs.e4);
                drawable2.draw(canvas);
            }
            if (e10 > 0.0f) {
                Drawable drawable3 = g4Var.p;
                Drawable drawable4 = g4Var.p;
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
        org.telegram.ui.Components.g5 g5Var = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = g5Var != null ? g5Var.k : imageReceiver;
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

    public void setReaction(dh.n0 n0Var) {
        String str;
        String str2;
        this.n = n0Var == null || ((str2 = n0Var.f) != null && str2.equals("❤"));
        if (n0Var == null || (str = n0Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        org.telegram.ui.Components.g5 g5Var = this.f;
        if (g5Var != null) {
            g5Var.n(this);
        }
        this.f = null;
        if (n0Var != null) {
            if (n0Var.g != 0) {
                org.telegram.ui.Components.g5 g5Var2 = new org.telegram.ui.Components.g5(3, h10.t0, n0Var.g);
                this.f = g5Var2;
                if (this.s) {
                    g5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(h10.t0).r.get(n0Var.f);
                if (tL_availableReaction != null) {
                    this.d.q0(ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
