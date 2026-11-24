// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l2b extends View {
    public final w28 a;
    public boolean b;
    public final lm c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public vl f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public l2b(Context context, w28 w28Var) {
        super(context);
        this.c = new lm(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = w28Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.e.I();
        this.s = true;
        vl vlVar = this.f;
        if (vlVar != null) {
            vlVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.e.K();
        this.s = false;
        vl vlVar = this.f;
        if (vlVar != null) {
            vlVar.o(this);
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
            w28 w28Var = this.a;
            if (e < 1.0f) {
                Drawable drawable = w28Var.o;
                Drawable drawable2 = w28Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(kk7.d4);
                drawable2.draw(canvas);
            }
            if (e > 0.0f) {
                Drawable drawable3 = w28Var.p;
                Drawable drawable4 = w28Var.p;
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
        vl vlVar = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = vlVar != null ? vlVar.k : imageReceiver;
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

    public void setReaction(h19 h19Var) {
        String str;
        String str2;
        this.n = h19Var == null || ((str2 = h19Var.f) != null && str2.equals("❤"));
        if (h19Var == null || (str = h19Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        vl vlVar = this.f;
        if (vlVar != null) {
            vlVar.o(this);
        }
        this.f = null;
        if (h19Var != null) {
            if (h19Var.g != 0) {
                vl vlVar2 = new vl(3, y6c.t0, h19Var.g);
                this.f = vlVar2;
                if (this.s) {
                    vlVar2.b(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(h19Var.f);
                if (tL_availableReaction != null) {
                    this.d.d0(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", uo3.f(tL_availableReaction.static_icon, bkb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
