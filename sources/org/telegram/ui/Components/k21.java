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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k21 extends d61 {
    public final org.telegram.ui.l20 f3;
    public final e6 g3;
    public final e6 h3;
    public final RectF i3;
    public final Paint j3;
    public final e6 k3;
    public Drawable l3;
    public int m3;
    public final Paint n3;
    public final /* synthetic */ w21 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k21(w21 w21Var, Context context, int i10, j21 j21Var, b21 b21Var, b21 b21Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, j21Var, b21Var, b21Var2, f6Var);
        this.o3 = w21Var;
        this.f3 = new org.telegram.ui.l20();
        pr prVar = pr.h;
        this.g3 = new e6(this, 320L, prVar);
        this.h3 = new e6(this, 320L, prVar);
        this.i3 = new RectF();
        this.j3 = new Paint(1);
        this.k3 = new e6(this, 420L, prVar);
        this.n3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.ll0
    public final Integer V0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.d61, org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float e7 = this.g3.e(canScrollHorizontally(-1));
        float e10 = this.h3.e(canScrollHorizontally(1));
        int i11 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        boolean z10 = i11 > 0 || e10 > 0.0f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f13 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof r21) {
                r21 r21Var = (r21) childAt;
                if (r21Var.s) {
                    if (width > r21Var.getX()) {
                        width = r21Var.getX();
                        RecyclerView.R(r21Var);
                    }
                    if (f13 < r21Var.getX() + r21Var.getWidth()) {
                        f13 = r21Var.getX() + r21Var.getWidth();
                        RecyclerView.R(r21Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.p2;
        if (f13 > width) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            Paint paint = this.n3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f13 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.l3 == null) {
                this.l3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.b9, f6Var);
            if (this.m3 != v02) {
                Drawable drawable = this.l3;
                this.m3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.l3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f13), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f13 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.l3.draw(canvas2);
        } else {
            f7 = 14.0f;
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        w21 w21Var = this.o3;
        long j3 = w21Var.H;
        long j10 = w21Var.V;
        e6 e6Var = this.k3;
        if (j3 != j10) {
            w21Var.I = j3;
            e6Var.d(0.0f, true);
        }
        w21Var.H = w21Var.V;
        r21 r21Var2 = null;
        r21 r21Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof r21) {
                r21 r21Var4 = (r21) childAt2;
                if (!r21Var4.x) {
                    i10 = i11;
                    if (r21Var4.getTopicId() == w21Var.V) {
                        r21Var2 = r21Var4;
                    }
                    f12 = e10;
                    if (r21Var4.getTopicId() == w21Var.I) {
                        r21Var3 = r21Var4;
                    }
                    i13++;
                    i11 = i10;
                    e10 = f12;
                }
            }
            f12 = e10;
            i10 = i11;
            i13++;
            i11 = i10;
            e10 = f12;
        }
        float f14 = e10;
        int i14 = i11;
        if (r21Var2 != null) {
            float x10 = r21Var2.getX() + AndroidUtilities.dp(f10);
            float y3 = r21Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (r21Var2.getX() + r21Var2.getWidth()) - AndroidUtilities.dp(f10);
            float y10 = (r21Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.i3;
            rectF2.set(x10, y3, x11, y10);
            if (r21Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(r21Var3.getX() + AndroidUtilities.dp(f10), r21Var3.getY() + AndroidUtilities.dp(4.0f), (r21Var3.getX() + r21Var3.getWidth()) - AndroidUtilities.dp(f10), (r21Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, e6Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), 31);
            Paint paint2 = this.j3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.l20 l20Var = this.f3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                l20Var.b(canvas2, rectF4, 0, e7);
            } else {
                f11 = 0.0f;
            }
            if (f14 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                l20Var.b(canvas2, rectF5, 2, f14);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
