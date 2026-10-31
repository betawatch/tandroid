package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class lu extends View implements org.telegram.ui.Cells.j9 {
    public boolean D;
    public ms E;
    public final int a;
    public org.telegram.ui.ActionBar.p6 b;
    public jj c;
    public TL_iv.RichMessage d;
    public vv e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public org.telegram.ui.Cells.k9 w;
    public int x;
    public int y;

    public lu(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.x = -1;
        this.y = -1;
        this.D = true;
        this.a = i10;
        this.b = p6Var;
        zs.i(this);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        if (this.e != null) {
            int i10 = this.f;
            int i11 = this.h;
            for (int i12 = 0; i12 < this.e.n.size(); i12++) {
                arrayList.add(new bi.o5((org.telegram.ui.Cells.u9) this.e.n.get(i12), i10, i11, 3));
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.b(this);
            this.e.b0(0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e == null) {
            return;
        }
        float height = (getHeight() - this.h) - this.r;
        boolean z10 = this.e.t() > (getHeight() - this.h) - this.r;
        canvas.save();
        if (z10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
        }
        canvas.translate(this.f, this.h);
        vv vvVar = this.e;
        vvVar.S(this.f, Math.max(0, (getWidth() - this.e.C) - this.f));
        vvVar.w.linkColor = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc, vvVar.D);
        vvVar.h(canvas, null, height > 0.0f, 0.0f, height);
        if (this.e.C()) {
            this.e.i(canvas, null);
        }
        if (z10) {
            canvas.translate(-this.f, -this.h);
            canvas.save();
            RectF rectF = i0.P;
            rectF.set(0.0f, getHeight() - i0.L(24.0f), getWidth(), getHeight());
            this.e.z.o(canvas, rectF, 3, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
        org.telegram.ui.Cells.k9 k9Var = this.w;
        if (k9Var == null || !k9Var.x()) {
            return;
        }
        int i10 = this.f;
        int i11 = this.h;
        for (int i12 = 0; i12 < this.e.n.size(); i12++) {
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) this.e.n.get(i12);
            canvas.save();
            canvas.translate(u9Var.getX() + i10, u9Var.getY() + i11);
            this.w.Z(canvas, this, i12);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = (size - this.f) - this.n;
        if (i12 <= 0 || (richMessage = this.d) == null) {
            this.e = null;
        } else {
            vv vvVar = this.e;
            if (vvVar == null || vvVar.L(richMessage, i12)) {
                vv vvVar2 = this.e;
                if (vvVar2 != null) {
                    vvVar2.f(this);
                }
                vv vvVar3 = new vv(this.c, i12, (vv) null);
                this.e = vvVar3;
                vvVar3.O = this.s;
                vvVar3.D = this.b;
                vvVar3.v = true;
                vvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.b0(0);
                }
            }
        }
        vv vvVar4 = this.e;
        int t10 = (vvVar4 != null ? vvVar4.t() : 0) + this.h + this.r;
        int i13 = this.y;
        if (i13 > 0 && t10 > i13) {
            t10 = i13;
        }
        int i14 = this.x;
        if (i14 > 0 && t10 < i14) {
            t10 = i14;
        }
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            t10 = Math.min(t10, View.MeasureSpec.getSize(i11));
        } else if (mode == 1073741824) {
            t10 = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, t10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ms msVar;
        if (!this.D) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.w != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.E == null) {
                    this.E = new ms(this, 5);
                }
                removeCallbacks(this.E);
                postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
            } else if ((action == 1 || action == 2 || action == 3) && (msVar = this.E) != null) {
                removeCallbacks(msVar);
            }
        }
        if (this.e != null) {
            motionEvent.offsetLocation(-this.f, -this.h);
            boolean M = this.e.M(motionEvent);
            motionEvent.offsetLocation(this.f, this.h);
            if (M) {
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
        if (this.c == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            this.c = new jj(this.a, tL_message, false, false);
        }
        this.c.k.rich_message = richMessage;
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.D = z10;
    }

    public void setMaxHeight(int i10) {
        this.y = i10;
    }

    public void setMinHeight(int i10) {
        this.x = i10;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        if (this.f == i10 && this.h == i11 && this.n == i12 && this.r == i13) {
            return;
        }
        this.f = i10;
        this.h = i11;
        this.n = i12;
        this.r = i13;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.b = p6Var;
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.D = p6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.k9 k9Var) {
        this.w = k9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.s = z10;
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.O = z10;
        }
        invalidate();
    }
}
