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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class e31 extends b71 {
    public final org.telegram.ui.s10 d3;
    public final f6 e3;
    public final f6 f3;
    public final RectF g3;
    public final Paint h3;
    public final f6 i3;
    public Drawable j3;
    public int k3;
    public final Paint l3;
    public final /* synthetic */ r31 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e31(r31 r31Var, Context context, int i10, d31 d31Var, y21 y21Var, y21 y21Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, d31Var, y21Var, y21Var2, d6Var);
        this.m3 = r31Var;
        this.d3 = new org.telegram.ui.s10();
        bs bsVar = bs.h;
        this.e3 = new f6(this, 320L, bsVar);
        this.f3 = new f6(this, 320L, bsVar);
        this.g3 = new RectF();
        this.h3 = new Paint(1);
        this.i3 = new f6(this, 420L, bsVar);
        this.l3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.im0
    public final Integer W0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.b71, org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
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
            if (childAt instanceof l31) {
                l31 l31Var = (l31) childAt;
                if (l31Var.s) {
                    if (width > l31Var.getX()) {
                        width = l31Var.getX();
                        RecyclerView.R(l31Var);
                    }
                    if (f12 < l31Var.getX() + l31Var.getWidth()) {
                        f12 = l31Var.getX() + l31Var.getWidth();
                        RecyclerView.R(l31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.n2;
        if (f12 > width) {
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
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
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.b9, d6Var);
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
        r31 r31Var = this.m3;
        long j10 = r31Var.H;
        long j11 = r31Var.V;
        f6 f6Var = this.i3;
        if (j10 != j11) {
            r31Var.I = j10;
            f6Var.d(0.0f, true);
        }
        r31Var.H = r31Var.V;
        l31 l31Var2 = null;
        l31 l31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof l31) {
                l31 l31Var4 = (l31) childAt2;
                if (!l31Var4.x) {
                    i10 = i11;
                    if (l31Var4.getTopicId() == r31Var.V) {
                        l31Var2 = l31Var4;
                    }
                    z10 = z11;
                    if (l31Var4.getTopicId() == r31Var.I) {
                        l31Var3 = l31Var4;
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
        if (l31Var2 != null) {
            float x10 = l31Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = l31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (l31Var2.getX() + l31Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (l31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.g3;
            rectF2.set(x10, y3, x11, y10);
            if (l31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(l31Var3.getX() + AndroidUtilities.dp(f7), l31Var3.getY() + AndroidUtilities.dp(4.0f), (l31Var3.getX() + l31Var3.getWidth()) - AndroidUtilities.dp(f7), (l31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, f6Var.d(f7, false), rectF2);
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), 31);
            Paint paint2 = this.h3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.s10 s10Var = this.d3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                s10Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (e7 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                s10Var.b(canvas2, rectF5, 2, e7);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
