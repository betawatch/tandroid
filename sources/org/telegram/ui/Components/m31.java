package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m31 extends h71 {
    public final org.telegram.ui.p20 d3;
    public final g6 e3;
    public final g6 f3;
    public final RectF g3;
    public final Paint h3;
    public final g6 i3;
    public Drawable j3;
    public int k3;
    public final Paint l3;
    public final /* synthetic */ y31 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m31(y31 y31Var, Context context, int i10, l31 l31Var, d31 d31Var, d31 d31Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, l31Var, d31Var, d31Var2, c6Var);
        this.m3 = y31Var;
        this.d3 = new org.telegram.ui.p20();
        es esVar = es.h;
        this.e3 = new g6(this, 320L, esVar);
        this.f3 = new g6(this, 320L, esVar);
        this.g3 = new RectF();
        this.h3 = new Paint(1);
        this.i3 = new g6(this, 420L, esVar);
        this.l3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.h71, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z10;
        float e = this.e3.e(canScrollHorizontally(-1));
        float e7 = this.f3.e(canScrollHorizontally(1));
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        boolean z11 = i11 > 0 || e7 > 0.0f;
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f12 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof t31) {
                t31 t31Var = (t31) childAt;
                if (t31Var.s) {
                    if (width > t31Var.getX()) {
                        width = t31Var.getX();
                        RecyclerView.R(t31Var);
                    }
                    if (f12 < t31Var.getX() + t31Var.getWidth()) {
                        f12 = t31Var.getX() + t31Var.getWidth();
                        RecyclerView.R(t31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.n2;
        if (f12 > width) {
            int m12 = org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            Paint paint = this.l3;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.j3 == null) {
                this.j3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.b9, c6Var);
            if (this.k3 != w02) {
                Drawable drawable = this.j3;
                this.k3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.j3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.j3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        y31 y31Var = this.m3;
        long j10 = y31Var.H;
        long j11 = y31Var.V;
        g6 g6Var = this.i3;
        if (j10 != j11) {
            y31Var.I = j10;
            g6Var.d(0.0f, true);
        }
        y31Var.H = y31Var.V;
        t31 t31Var2 = null;
        t31 t31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof t31) {
                t31 t31Var4 = (t31) childAt2;
                if (!t31Var4.x) {
                    i10 = i11;
                    if (t31Var4.getTopicId() == y31Var.V) {
                        t31Var2 = t31Var4;
                    }
                    z10 = z11;
                    if (t31Var4.getTopicId() == y31Var.I) {
                        t31Var3 = t31Var4;
                    }
                    i13++;
                    i11 = i10;
                    z11 = z10;
                }
            }
            i10 = i11;
            z10 = z11;
            i13++;
            i11 = i10;
            z11 = z10;
        }
        int i14 = i11;
        boolean z12 = z11;
        if (t31Var2 != null) {
            float x10 = t31Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = t31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (t31Var2.getX() + t31Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (t31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.g3;
            rectF2.set(x10, y3, x11, y10);
            if (t31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(t31Var3.getX() + AndroidUtilities.dp(f7), t31Var3.getY() + AndroidUtilities.dp(4.0f), (t31Var3.getX() + t31Var3.getWidth()) - AndroidUtilities.dp(f7), (t31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, g6Var.d(f7, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var), 31);
            Paint paint2 = this.h3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.p20 p20Var = this.d3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                p20Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (e7 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                p20Var.b(canvas2, rectF5, 2, e7);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
