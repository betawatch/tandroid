// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h6b extends View {
    public final m68 a;
    public boolean b;
    public final mm c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public wl f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public h6b(Context context, m68 m68Var) {
        super(context);
        this.c = new mm(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = m68Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.e.I();
        this.s = true;
        wl wlVar = this.f;
        if (wlVar != null) {
            wlVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.e.K();
        this.s = false;
        wl wlVar = this.f;
        if (wlVar != null) {
            wlVar.o(this);
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
            m68 m68Var = this.a;
            if (e < 1.0f) {
                Drawable drawable = m68Var.o;
                Drawable drawable2 = m68Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(jn7.d4);
                drawable2.draw(canvas);
            }
            if (e > 0.0f) {
                Drawable drawable3 = m68Var.p;
                Drawable drawable4 = m68Var.p;
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
        wl wlVar = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = wlVar != null ? wlVar.k : imageReceiver;
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

    public void setReaction(w49 w49Var) {
        String str;
        String str2;
        this.n = w49Var == null || ((str2 = w49Var.f) != null && str2.equals("❤"));
        if (w49Var == null || (str = w49Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        wl wlVar = this.f;
        if (wlVar != null) {
            wlVar.o(this);
        }
        this.f = null;
        if (w49Var != null) {
            if (w49Var.g != 0) {
                wl wlVar2 = new wl(3, yac.t0, w49Var.g);
                this.f = wlVar2;
                if (this.s) {
                    wlVar2.b(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(yac.t0).r.get(w49Var.f);
                if (tL_availableReaction != null) {
                    this.d.d0(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", lp3.f(tL_availableReaction.static_icon, aob.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
