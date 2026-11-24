// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ig9 extends View implements eib {
    public boolean E;
    public sr8 F;
    public final int a;
    public wjb b;
    public k27 c;
    public TL_iv.RichMessage d;
    public rh9 e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public fib w;
    public int x;
    public int y;

    public ig9(int i, wjb wjbVar, Context context) {
        super(context);
        this.x = -1;
        this.y = -1;
        this.E = true;
        this.a = i;
        this.b = wjbVar;
        kk7.i(this);
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        if (this.e != null) {
            int i = this.f;
            int i2 = this.h;
            for (int i3 = 0; i3 < this.e.n.size(); i3++) {
                arrayList.add(new xh9((pib) this.e.n.get(i3), i, i2, (byte) 3));
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.b(this);
            this.e.a0(0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e != null) {
            float height = (getHeight() - this.h) - this.r;
            boolean z = this.e.t() > (getHeight() - this.h) - this.r;
            canvas.save();
            if (z) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
            }
            canvas.translate(this.f, this.h);
            rh9 rh9Var = this.e;
            rh9Var.R(this.f, Math.max(0, (getWidth() - this.e.C) - this.f));
            rh9Var.w.linkColor = bkb.v0(rh9Var.D() ? bkb.Xc : bkb.Wc, rh9Var.D);
            rh9Var.h(canvas, null, height > 0.0f, 0.0f, height);
            if (this.e.B()) {
                this.e.i(canvas, null);
            }
            if (z) {
                canvas.translate(-this.f, -this.h);
                canvas.save();
                RectF rectF = gl.P;
                rectF.set(0.0f, getHeight() - gl.L(24.0f), getWidth(), getHeight());
                this.e.z.s(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            fib fibVar = this.w;
            if (fibVar == null || !fibVar.w()) {
                return;
            }
            int i = this.f;
            int i2 = this.h;
            for (int i3 = 0; i3 < this.e.n.size(); i3++) {
                pib pibVar = (pib) this.e.n.get(i3);
                canvas.save();
                canvas.translate(pibVar.getX() + i, pibVar.getY() + i2);
                this.w.Y(canvas, this, i3);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i);
        int i3 = (size - this.f) - this.n;
        if (i3 <= 0 || (richMessage = this.d) == null) {
            this.e = null;
        } else {
            rh9 rh9Var = this.e;
            if (rh9Var == null || rh9Var.K(richMessage, i3)) {
                rh9 rh9Var2 = this.e;
                if (rh9Var2 != null) {
                    rh9Var2.f(this);
                }
                rh9 rh9Var3 = new rh9(this.c, i3, (rh9) null);
                this.e = rh9Var3;
                rh9Var3.O = this.s;
                rh9Var3.D = this.b;
                rh9Var3.v = true;
                rh9Var3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.a0(0);
                }
            }
        }
        rh9 rh9Var4 = this.e;
        int t = (rh9Var4 != null ? rh9Var4.t() : 0) + this.h + this.r;
        int i4 = this.y;
        if (i4 > 0 && t > i4) {
            t = i4;
        }
        int i5 = this.x;
        if (i5 > 0 && t < i5) {
            t = i5;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            t = Math.min(t, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            t = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, t);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.w != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.w.j0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                sr8 sr8Var = this.F;
                if (sr8Var == null) {
                    sr8Var = new sr8(this, (byte) 23);
                    this.F = sr8Var;
                }
                removeCallbacks(sr8Var);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            } else if ((action == 1 || action == 2 || action == 3) && (runnable = this.F) != null) {
                removeCallbacks(runnable);
            }
        }
        if (this.e != null) {
            motionEvent.offsetLocation(-this.f, -this.h);
            boolean L = this.e.L(motionEvent);
            motionEvent.offsetLocation(this.f, this.h);
            if (L) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void set(TL_iv.RichMessage richMessage) {
        if (this.d == richMessage) {
            return;
        }
        this.d = richMessage;
        k27 k27Var = this.c;
        if (k27Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            k27 k27Var2 = new k27(this.a, tL_message, false, false);
            this.c = k27Var2;
            k27Var = k27Var2;
        }
        k27Var.k.rich_message = richMessage;
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z) {
        this.E = z;
    }

    public void setMaxHeight(int i) {
        this.y = i;
    }

    public void setMinHeight(int i) {
        this.x = i;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (this.f == i && this.h == i2 && this.n == i3 && this.r == i4) {
            return;
        }
        this.f = i;
        this.h = i2;
        this.n = i3;
        this.r = i4;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(wjb wjbVar) {
        this.b = wjbVar;
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.D = wjbVar;
        }
    }

    public void setTextSelectionHelper(fib fibVar) {
        this.w = fibVar;
    }

    public void setTranslationLoading(boolean z) {
        this.s = z;
        rh9 rh9Var = this.e;
        if (rh9Var != null) {
            rh9Var.O = z;
        }
        invalidate();
    }
}
