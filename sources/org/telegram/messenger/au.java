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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class au extends View implements org.telegram.ui.Cells.h9 {
    public boolean D;
    public ds E;
    public final int a;
    public org.telegram.ui.ActionBar.f6 b;
    public ij c;
    public TL_iv.RichMessage d;
    public kv e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public org.telegram.ui.Cells.i9 w;
    public int x;
    public int y;

    public au(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = -1;
        this.y = -1;
        this.D = true;
        this.a = i7;
        this.b = f6Var;
        qs.i(this);
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        if (this.e != null) {
            int i7 = this.f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.e.n.size(); i11++) {
                arrayList.add(new li.b5((org.telegram.ui.Cells.t9) this.e.n.get(i11), i7, i10, 3));
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kv kvVar = this.e;
        if (kvVar != null) {
            kvVar.b(this);
            this.e.b0(0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kv kvVar = this.e;
        if (kvVar != null) {
            kvVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e == null) {
            return;
        }
        float height = (getHeight() - this.h) - this.r;
        boolean z9 = this.e.t() > (getHeight() - this.h) - this.r;
        canvas.save();
        if (z9) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
        }
        canvas.translate(this.f, this.h);
        kv kvVar = this.e;
        kvVar.S(this.f, Math.max(0, (getWidth() - this.e.C) - this.f));
        kvVar.w.linkColor = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, kvVar.D);
        kvVar.h(canvas, null, height > 0.0f, 0.0f, height);
        if (this.e.C()) {
            this.e.i(canvas, null);
        }
        if (z9) {
            canvas.translate(-this.f, -this.h);
            canvas.save();
            RectF rectF = g0.P;
            rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
            this.e.z.m(canvas, rectF, 3, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
        org.telegram.ui.Cells.i9 i9Var = this.w;
        if (i9Var == null || !i9Var.x()) {
            return;
        }
        int i7 = this.f;
        int i10 = this.h;
        for (int i11 = 0; i11 < this.e.n.size(); i11++) {
            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) this.e.n.get(i11);
            canvas.save();
            canvas.translate(t9Var.getX() + i7, t9Var.getY() + i10);
            this.w.Z(canvas, this, i11);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = (size - this.f) - this.n;
        if (i11 <= 0 || (richMessage = this.d) == null) {
            this.e = null;
        } else {
            kv kvVar = this.e;
            if (kvVar == null || kvVar.L(richMessage, i11)) {
                kv kvVar2 = this.e;
                if (kvVar2 != null) {
                    kvVar2.f(this);
                }
                kv kvVar3 = new kv(this.c, i11, (kv) null);
                this.e = kvVar3;
                kvVar3.O = this.s;
                kvVar3.D = this.b;
                kvVar3.v = true;
                kvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.b0(0);
                }
            }
        }
        kv kvVar4 = this.e;
        int t6 = (kvVar4 != null ? kvVar4.t() : 0) + this.h + this.r;
        int i12 = this.y;
        if (i12 > 0 && t6 > i12) {
            t6 = i12;
        }
        int i13 = this.x;
        if (i13 > 0 && t6 < i13) {
            t6 = i13;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            t6 = Math.min(t6, View.MeasureSpec.getSize(i10));
        } else if (mode == 1073741824) {
            t6 = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(size, t6);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ds dsVar;
        if (!this.D) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.w != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.E == null) {
                    this.E = new ds(this, 4);
                }
                removeCallbacks(this.E);
                postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
            } else if ((action == 1 || action == 2 || action == 3) && (dsVar = this.E) != null) {
                removeCallbacks(dsVar);
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
            this.c = new ij(this.a, tL_message, false, false);
        }
        this.c.k.rich_message = richMessage;
        kv kvVar = this.e;
        if (kvVar != null) {
            kvVar.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z9) {
        this.D = z9;
    }

    public void setMaxHeight(int i7) {
        this.y = i7;
    }

    public void setMinHeight(int i7) {
        this.x = i7;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        if (this.f == i7 && this.h == i10 && this.n == i11 && this.r == i12) {
            return;
        }
        this.f = i7;
        this.h = i10;
        this.n = i11;
        this.r = i12;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = f6Var;
        kv kvVar = this.e;
        if (kvVar != null) {
            kvVar.D = f6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.i9 i9Var) {
        this.w = i9Var;
    }

    public void setTranslationLoading(boolean z9) {
        this.s = z9;
        kv kvVar = this.e;
        if (kvVar != null) {
            kvVar.O = z9;
        }
        invalidate();
    }
}
