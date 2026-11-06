package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d7 extends View {
    public final f4 a;
    public boolean b;
    public final org.telegram.ui.Components.w5 c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.i5 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public d7(Context context, f4 f4Var) {
        super(context);
        this.c = new org.telegram.ui.Components.w5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = f4Var;
        imageReceiver.z1 = true;
        imageReceiver.y = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.e.P();
        this.s = true;
        org.telegram.ui.Components.i5 i5Var = this.f;
        if (i5Var != null) {
            i5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.e.R();
        this.s = false;
        org.telegram.ui.Components.i5 i5Var = this.f;
        if (i5Var != null) {
            i5Var.n(this);
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
            f4 f4Var = this.a;
            if (e10 < 1.0f) {
                Drawable drawable = f4Var.o;
                Drawable drawable2 = f4Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(qs.e4);
                drawable2.draw(canvas);
            }
            if (e10 > 0.0f) {
                Drawable drawable3 = f4Var.p;
                Drawable drawable4 = f4Var.p;
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
        org.telegram.ui.Components.i5 i5Var = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = i5Var != null ? i5Var.k : imageReceiver;
        if (this.r) {
            ImageReceiver imageReceiver3 = this.e;
            if (imageReceiver3.n() != null) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                float f10 = measuredWidth / 2.0f;
                float f11 = measuredWidth * 2;
                imageReceiver3.y0(getPaddingLeft() - f10, getPaddingTop() - f10, f11, f11);
                if (imageReceiver3.B() != null && imageReceiver3.B().A()) {
                    this.r = false;
                    imageReceiver.k1 = (byte) 0;
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

    public void setAllowDrawReaction(boolean z9) {
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        invalidate();
    }

    public void setReaction(ch.o0 o0Var) {
        String str;
        String str2;
        this.n = o0Var == null || ((str2 = o0Var.f) != null && str2.equals("❤"));
        if (o0Var == null || (str = o0Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        org.telegram.ui.Components.i5 i5Var = this.f;
        if (i5Var != null) {
            i5Var.n(this);
        }
        this.f = null;
        if (o0Var != null) {
            if (o0Var.g != 0) {
                org.telegram.ui.Components.i5 i5Var2 = new org.telegram.ui.Components.i5(3, p10.s0, o0Var.g);
                this.f = i5Var2;
                if (this.s) {
                    i5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(p10.s0).r.get(o0Var.f);
                if (tL_availableReaction != null) {
                    this.d.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
