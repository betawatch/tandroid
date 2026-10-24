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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j31 extends j71 {
    public final org.telegram.ui.w10 g3;
    public final f6 h3;
    public final f6 i3;
    public final RectF j3;
    public final Paint k3;
    public final f6 l3;
    public Drawable m3;
    public int n3;
    public final Paint o3;
    public final /* synthetic */ w31 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(w31 w31Var, Context context, int i10, i31 i31Var, d31 d31Var, d31 d31Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, i31Var, d31Var, d31Var2, g6Var);
        this.p3 = w31Var;
        this.g3 = new org.telegram.ui.w10();
        bs bsVar = bs.h;
        this.h3 = new f6(this, 320L, bsVar);
        this.i3 = new f6(this, 320L, bsVar);
        this.j3 = new RectF();
        this.k3 = new Paint(1);
        this.l3 = new f6(this, 420L, bsVar);
        this.o3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer X0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.j71, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z10;
        float e = this.h3.e(canScrollHorizontally(-1));
        float e7 = this.i3.e(canScrollHorizontally(1));
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
            if (childAt instanceof r31) {
                r31 r31Var = (r31) childAt;
                if (r31Var.s) {
                    if (width > r31Var.getX()) {
                        width = r31Var.getX();
                        RecyclerView.R(r31Var);
                    }
                    if (f12 < r31Var.getX() + r31Var.getWidth()) {
                        f12 = r31Var.getX() + r31Var.getWidth();
                        RecyclerView.R(r31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.n2;
        if (f12 > width) {
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            Paint paint = this.o3;
            paint.setColor(o12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.m3 == null) {
                this.m3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b9, g6Var);
            if (this.n3 != w02) {
                Drawable drawable = this.m3;
                this.n3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.m3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.m3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        w31 w31Var = this.p3;
        long j10 = w31Var.H;
        long j11 = w31Var.b0;
        f6 f6Var = this.l3;
        if (j10 != j11) {
            w31Var.I = j10;
            f6Var.d(0.0f, true);
        }
        w31Var.H = w31Var.b0;
        r31 r31Var2 = null;
        r31 r31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof r31) {
                r31 r31Var4 = (r31) childAt2;
                if (!r31Var4.x) {
                    i10 = i11;
                    if (r31Var4.getTopicId() == w31Var.b0) {
                        r31Var2 = r31Var4;
                    }
                    z10 = z11;
                    if (r31Var4.getTopicId() == w31Var.I) {
                        r31Var3 = r31Var4;
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
        if (r31Var2 != null) {
            float x10 = r31Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = r31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (r31Var2.getX() + r31Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (r31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.j3;
            rectF2.set(x10, y3, x11, y10);
            if (r31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(r31Var3.getX() + AndroidUtilities.dp(f7), r31Var3.getY() + AndroidUtilities.dp(4.0f), (r31Var3.getX() + r31Var3.getWidth()) - AndroidUtilities.dp(f7), (r31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, f6Var.d(f7, false), rectF2);
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var), 31);
            Paint paint2 = this.k3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.w10 w10Var = this.g3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                w10Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (e7 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                w10Var.b(canvas2, rectF5, 2, e7);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
