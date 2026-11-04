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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class st extends View implements org.telegram.ui.Cells.g9 {
    public boolean E;
    public vs F;
    public final int a;
    public org.telegram.ui.ActionBar.e6 b;
    public zi c;
    public TL_iv.RichMessage d;
    public cv e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public org.telegram.ui.Cells.h9 w;
    public int x;
    public int y;

    public st(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.x = -1;
        this.y = -1;
        this.E = true;
        this.a = i3;
        this.b = e6Var;
        hs.i(this);
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        if (this.e != null) {
            int i3 = this.f;
            int i10 = this.h;
            for (int i11 = 0; i11 < this.e.n.size(); i11++) {
                arrayList.add(new mi.c5((org.telegram.ui.Cells.s9) this.e.n.get(i11), i3, i10, 3));
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cv cvVar = this.e;
        if (cvVar != null) {
            cvVar.b(this);
            this.e.b0(0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cv cvVar = this.e;
        if (cvVar != null) {
            cvVar.f(this);
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
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), hs.e4, 31);
        }
        canvas.translate(this.f, this.h);
        cv cvVar = this.e;
        cvVar.S(this.f, Math.max(0, (getWidth() - this.e.C) - this.f));
        cvVar.w.linkColor = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, cvVar.D);
        cvVar.h(canvas, null, height > 0.0f, 0.0f, height);
        if (this.e.C()) {
            this.e.i(canvas, null);
        }
        if (z10) {
            canvas.translate(-this.f, -this.h);
            canvas.save();
            RectF rectF = g0.P;
            rectF.set(0.0f, getHeight() - g0.L(24.0f), getWidth(), getHeight());
            this.e.z.w(canvas, rectF, 3, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
        org.telegram.ui.Cells.h9 h9Var = this.w;
        if (h9Var == null || !h9Var.x()) {
            return;
        }
        int i3 = this.f;
        int i10 = this.h;
        for (int i11 = 0; i11 < this.e.n.size(); i11++) {
            org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.e.n.get(i11);
            canvas.save();
            canvas.translate(s9Var.getX() + i3, s9Var.getY() + i10);
            this.w.Z(canvas, this, i11);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i3);
        int i11 = (size - this.f) - this.n;
        if (i11 <= 0 || (richMessage = this.d) == null) {
            this.e = null;
        } else {
            cv cvVar = this.e;
            if (cvVar == null || cvVar.L(richMessage, i11)) {
                cv cvVar2 = this.e;
                if (cvVar2 != null) {
                    cvVar2.f(this);
                }
                cv cvVar3 = new cv(this.c, i11, (cv) null);
                this.e = cvVar3;
                cvVar3.O = this.s;
                cvVar3.D = this.b;
                cvVar3.v = true;
                cvVar3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.b0(0);
                }
            }
        }
        cv cvVar4 = this.e;
        int t10 = (cvVar4 != null ? cvVar4.t() : 0) + this.h + this.r;
        int i12 = this.y;
        if (i12 > 0 && t10 > i12) {
            t10 = i12;
        }
        int i13 = this.x;
        if (i13 > 0 && t10 < i13) {
            t10 = i13;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            t10 = Math.min(t10, View.MeasureSpec.getSize(i10));
        } else if (mode == 1073741824) {
            t10 = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(size, t10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vs vsVar;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.w != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.w.k0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.F == null) {
                    this.F = new vs(this, 4);
                }
                removeCallbacks(this.F);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            } else if ((action == 1 || action == 2 || action == 3) && (vsVar = this.F) != null) {
                removeCallbacks(vsVar);
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
            this.c = new zi(this.a, tL_message, false, false);
        }
        this.c.k.rich_message = richMessage;
        cv cvVar = this.e;
        if (cvVar != null) {
            cvVar.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z10) {
        this.E = z10;
    }

    public void setMaxHeight(int i3) {
        this.y = i3;
    }

    public void setMinHeight(int i3) {
        this.x = i3;
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        if (this.f == i3 && this.h == i10 && this.n == i11 && this.r == i12) {
            return;
        }
        this.f = i3;
        this.h = i10;
        this.n = i11;
        this.r = i12;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = e6Var;
        cv cvVar = this.e;
        if (cvVar != null) {
            cvVar.D = e6Var;
        }
    }

    public void setTextSelectionHelper(org.telegram.ui.Cells.h9 h9Var) {
        this.w = h9Var;
    }

    public void setTranslationLoading(boolean z10) {
        this.s = z10;
        cv cvVar = this.e;
        if (cvVar != null) {
            cvVar.O = z10;
        }
        invalidate();
    }
}
