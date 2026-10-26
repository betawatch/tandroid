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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s31 extends r71 {
    public final org.telegram.ui.w10 n3;
    public final h6 o3;
    public final h6 p3;
    public final RectF q3;
    public final Paint r3;
    public final h6 s3;
    public Drawable t3;
    public int u3;
    public final Paint v3;
    public final /* synthetic */ e41 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(e41 e41Var, Context context, int i10, r31 r31Var, m31 m31Var, m31 m31Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, 0, false, r31Var, m31Var, m31Var2, u6Var);
        this.w3 = e41Var;
        this.n3 = new org.telegram.ui.w10();
        ds dsVar = ds.h;
        this.o3 = new h6(this, 320L, dsVar);
        this.p3 = new h6(this, 320L, dsVar);
        this.q3 = new RectF();
        this.r3 = new Paint(1);
        this.s3 = new h6(this, 420L, dsVar);
        this.v3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.r71, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z10;
        float e = this.o3.e(canScrollHorizontally(-1));
        float e10 = this.p3.e(canScrollHorizontally(1));
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        boolean z11 = i11 > 0 || e10 > 0.0f;
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
            if (childAt instanceof z31) {
                z31 z31Var = (z31) childAt;
                if (z31Var.s) {
                    if (width > z31Var.getX()) {
                        width = z31Var.getX();
                        RecyclerView.R(z31Var);
                    }
                    if (f12 < z31Var.getX() + z31Var.getWidth()) {
                        f12 = z31Var.getX() + z31Var.getWidth();
                        RecyclerView.R(z31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.n2;
        if (f12 > width) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
            Paint paint = this.v3;
            paint.setColor(o12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.t3 == null) {
                this.t3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.b9, u6Var);
            if (this.u3 != w02) {
                Drawable drawable = this.t3;
                this.u3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.t3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.t3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        e41 e41Var = this.w3;
        long j10 = e41Var.H;
        long j11 = e41Var.b0;
        h6 h6Var = this.s3;
        if (j10 != j11) {
            e41Var.I = j10;
            h6Var.d(0.0f, true);
        }
        e41Var.H = e41Var.b0;
        z31 z31Var2 = null;
        z31 z31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof z31) {
                z31 z31Var4 = (z31) childAt2;
                if (!z31Var4.x) {
                    i10 = i11;
                    if (z31Var4.getTopicId() == e41Var.b0) {
                        z31Var2 = z31Var4;
                    }
                    z10 = z11;
                    if (z31Var4.getTopicId() == e41Var.I) {
                        z31Var3 = z31Var4;
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
        if (z31Var2 != null) {
            float x9 = z31Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = z31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x10 = (z31Var2.getX() + z31Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (z31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.q3;
            rectF2.set(x9, y3, x10, y10);
            if (z31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(z31Var3.getX() + AndroidUtilities.dp(f7), z31Var3.getY() + AndroidUtilities.dp(4.0f), (z31Var3.getX() + z31Var3.getWidth()) - AndroidUtilities.dp(f7), (z31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, h6Var.d(f7, false), rectF2);
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var), 31);
            Paint paint2 = this.r3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.w10 w10Var = this.n3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                w10Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (e10 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                w10Var.b(canvas2, rectF5, 2, e10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
