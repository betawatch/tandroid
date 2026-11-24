// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m4b extends View {
    public final y48 a;
    public boolean b;
    public final ln c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public vm f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public m4b(Context context, y48 y48Var) {
        super(context);
        this.c = new ln(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = y48Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.e.I();
        this.s = true;
        vm vmVar = this.f;
        if (vmVar != null) {
            vmVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.e.K();
        this.s = false;
        vm vmVar = this.f;
        if (vmVar != null) {
            vmVar.o(this);
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
            float e = this.c.e(false, this.b ? 1.0f : 0.0f);
            y48 y48Var = this.a;
            if (e < 1.0f) {
                Drawable drawable = y48Var.o;
                Drawable drawable2 = y48Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(nm7.d4);
                drawable2.draw(canvas);
            }
            if (e > 0.0f) {
                Drawable drawable3 = y48Var.p;
                Drawable drawable4 = y48Var.p;
                drawable3.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable4.setAlpha((int) (e * 255.0f));
                drawable4.draw(canvas);
                return;
            }
            return;
        }
        if (!this.h) {
            return;
        }
        vm vmVar = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = vmVar != null ? vmVar.k : imageReceiver;
        if (this.r) {
            ImageReceiver imageReceiver3 = this.e;
            if (imageReceiver3.n() != null) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                float f = measuredWidth / 2.0f;
                float f2 = measuredWidth << 1;
                imageReceiver3.i0(getPaddingLeft() - f, getPaddingTop() - f, f2, f2);
                if (imageReceiver3.y() != null && imageReceiver3.y().v()) {
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
            imageReceiver2.i0(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        }
        if (imageReceiver2 == null) {
        }
    }

    public void setAllowDrawReaction(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        invalidate();
    }

    public void setReaction(k39 k39Var) {
        String str;
        String str2;
        this.n = k39Var == null || ((str2 = k39Var.f) != null && str2.equals("❤"));
        if (k39Var == null || (str = k39Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        vm vmVar = this.f;
        if (vmVar != null) {
            vmVar.o(this);
        }
        this.f = null;
        if (k39Var != null) {
            if (k39Var.g != 0) {
                vm vmVar2 = new vm(3, z8c.t0, k39Var.g);
                this.f = vmVar2;
                if (this.s) {
                    vmVar2.b(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(z8c.t0).r.get(k39Var.f);
                if (tL_availableReaction != null) {
                    this.d.d0(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
