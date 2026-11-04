package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class su extends ru {
    public k4.j d0;
    public org.telegram.ui.Components.gc e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public su(cv cvVar, Rect rect, int i3, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3, spannableStringBuilder);
        this.l0 = k2.p1.g(t0.b, R.drawable.arrow_more);
        boolean z10 = pageblockblockquote.collapsed;
        this.h0 = z10;
        this.i0 = z10;
    }

    @Override // org.telegram.messenger.ru, org.telegram.messenger.xt
    public final int I() {
        if (!this.h0) {
            return super.I();
        }
        Rect rect = this.b;
        return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.I());
    }

    @Override // org.telegram.messenger.ru, org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.gc gcVar = this.e0;
        float a10 = gcVar != null ? gcVar.a(0.01f) : 1.0f;
        int i3 = this.c;
        if (a10 != 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, i3 / 2.0f, I() / 2.0f);
        }
        boolean z10 = this.j0 > 0.0f;
        int i10 = (this.k0 - this.b.bottom) - this.b0;
        canvas.save();
        canvas.clipRect(0, 0, i3, i10);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i3, i10, null);
        }
        super.W(canvas);
        if (z10) {
            if (this.d0 == null) {
                this.d0 = new k4.j(24);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i10 - g0.L(24.0f), i3, i10 + 1);
            this.d0.w(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        cv cvVar = this.a;
        int i11 = cvVar.y.i();
        int i12 = this.m0;
        Drawable drawable = this.l0;
        if (i11 != i12) {
            int i13 = cvVar.y.i();
            this.m0 = i13;
            drawable.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
        }
        cg.r.e(this.l0, cvVar.C - g0.L(24.0f), g0.L(8.0f) + ((i10 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.j0, hs.K2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.ru, org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.Y(motionEvent);
        }
        cv cvVar = this.a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.g0 = Y;
            if (!Y) {
                this.f0 = true;
                if (this.e0 == null && (view = cvVar.Q) != null) {
                    this.e0 = new org.telegram.ui.Components.gc(view);
                }
                org.telegram.ui.Components.gc gcVar = this.e0;
                if (gcVar != null) {
                    gcVar.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f0 = false;
                    org.telegram.ui.Components.gc gcVar2 = this.e0;
                    if (gcVar2 != null) {
                        gcVar2.c(false);
                    }
                }
                return this.f0;
            }
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            org.telegram.ui.Components.gc gcVar3 = this.e0;
            if (gcVar3 != null) {
                gcVar3.c(false);
            }
            View view2 = cvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            cvVar.X();
            this.h0 = !this.h0;
            cvVar.u = true;
            cvVar.Q();
            View view3 = cvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = cvVar.E;
            org.telegram.ui.Cells.l1 l1Var = cvVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.r1(q1Var, true, true);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.xt
    public final void d0() {
        super.d0();
        this.i0 = this.h0;
    }

    @Override // org.telegram.messenger.xt
    public final float z() {
        org.telegram.ui.Components.gc gcVar = this.e0;
        if (gcVar != null) {
            return gcVar.a(0.01f);
        }
        return 1.0f;
    }
}
