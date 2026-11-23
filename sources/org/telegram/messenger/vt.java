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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class vt extends View implements org.telegram.ui.Cells.i9 {
    public boolean E;
    public yr F;
    public final int a;
    public org.telegram.ui.ActionBar.h6 b;
    public gj c;
    public TL_iv.RichMessage d;
    public fv e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public org.telegram.ui.Cells.j9 w;
    public int x;
    public int y;

    public vt(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.x = -1;
        this.y = -1;
        this.E = true;
        this.a = i7;
        this.b = h6Var;
        ls.i(this);
    }

    @Override // org.telegram.ui.Cells.i9
    public final void k(ArrayList arrayList) {
        if (this.e != null) {
            int i7 = this.f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.e.n.size(); i11++) {
                arrayList.add(new oi.b5((org.telegram.ui.Cells.u9) this.e.n.get(i11), i7, i10, 3));
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fv fvVar = this.e;
        if (fvVar != null) {
            fvVar.b(this);
            this.e.b0(0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fv fvVar = this.e;
        if (fvVar != null) {
            fvVar.f(this);
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
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ls.e4, 31);
        }
        canvas.translate(this.f, this.h);
        fv fvVar = this.e;
        fvVar.S(this.f, Math.max(0, (getWidth() - this.e.C) - this.f));
        fvVar.w.linkColor = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.Yc : org.telegram.ui.ActionBar.m6.Xc, fvVar.D);
        fvVar.h(canvas, null, height > 0.0f, 0.0f, height);
        if (this.e.C()) {
            this.e.i(canvas, null);
        }
        if (z10) {
            canvas.translate(-this.f, -this.h);
            canvas.save();
            RectF rectF = g0.P;
            rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
            this.e.z.n(canvas, rectF, 3, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
        org.telegram.ui.Cells.j9 j9Var = this.w;
        if (j9Var == null || !j9Var.x()) {
            return;
        }
        int i7 = this.f;
        int i10 = this.h;
        for (int i11 = 0; i11 < this.e.n.size(); i11++) {
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) this.e.n.get(i11);
            canvas.save();
            canvas.translate(u9Var.getX() + i7, u9Var.getY() + i10);
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
            fv fvVar = this.e;
            if (fvVar == null || fvVar.L(richMessage, i11)) {
                fv fvVar2 = this.e;
                if (fvVar2 != null) {
                    fvVar2.f(this);
                }
                fv fvVar3 = new fv(this.c, i11, (fv) null);
                this.e = fvVar3;
                fvVar3.O = this.s;
                fvVar3.D = this.b;
                fvVar3.v = true;
                fvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.b0(0);
                }
            }
        }
        fv fvVar4 = this.e;
        int t6 = (fvVar4 != null ? fvVar4.t() : 0) + this.h + this.r;
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
        yr yrVar;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.w != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.F == null) {
                    this.F = new yr(this, 4);
                }
                removeCallbacks(this.F);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            } else if ((action == 1 || action == 2 || action == 3) && (yrVar = this.F) != null) {
                removeCallbacks(yrVar);
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
            this.c = new gj(this.a, tL_message, false, false);
        }
        this.c.k.rich_message = richMessage;
        fv fvVar = this.e;
        if (fvVar != null) {
            fvVar.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.E = z10;
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

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.b = h6Var;
        fv fvVar = this.e;
        if (fvVar != null) {
            fvVar.D = h6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.j9 j9Var) {
        this.w = j9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.s = z10;
        fv fvVar = this.e;
        if (fvVar != null) {
            fvVar.O = z10;
        }
        invalidate();
    }
}
