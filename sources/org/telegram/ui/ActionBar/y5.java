package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.xi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y5 extends Drawable {
    public final /* synthetic */ int a;
    public final Paint b;
    public final RectF c;
    public final /* synthetic */ int d;
    public final Object e;
    public final /* synthetic */ View f;

    public y5(View view, View view2, int i7, Paint paint) {
        this.a = 0;
        this.e = view;
        this.f = view2;
        this.d = i7;
        this.b = paint;
        this.c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                float f10 = bounds.left;
                float f11 = bounds.top;
                float f12 = bounds.right;
                float f13 = bounds.bottom;
                RectF rectF = this.c;
                rectF.set(f10, f11, f12, f13);
                n6.t((View) this.e, this.f, null);
                float f14 = this.d;
                Paint paint = this.b;
                if (paint == null) {
                    paint = n6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, f14, f14, paint);
                if (n6.d1()) {
                    canvas.drawRoundRect(rectF, f14, f14, n6.V0("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                e();
                canvas.drawPath((Path) this.e, this.b);
                break;
        }
    }

    public void e() {
        xi xiVar;
        org.telegram.ui.Cells.w1 w1Var;
        Rect bounds = getBounds();
        float f10 = bounds.left;
        float f11 = bounds.top;
        float f12 = bounds.right;
        float f13 = bounds.bottom;
        RectF rectF = this.c;
        rectF.set(f10, f11, f12, f13);
        Path path = (Path) this.e;
        path.rewind();
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
        int[] iArr = q1Var.L2;
        int i7 = this.d;
        int i10 = iArr[i7];
        if (i10 == 3 || i10 == 4) {
            path.addCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.g0.L(iArr[i7] == 3 ? 16.0f : 20.0f), Path.Direction.CW);
            return;
        }
        if (i10 != 2) {
            float L = i10 == 0 ? org.telegram.messenger.g0.L(6.0f) : 0.0f;
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        fj fjVar = q1Var.Q5;
        boolean z10 = fjVar != null && fjVar.P3();
        for (int i11 = 0; i11 < 4; i11++) {
            if (!q1Var.E2) {
                if (i11 == (z10 ? 3 : 2)) {
                    float[] fArr = org.telegram.ui.Cells.q1.wd;
                    int i12 = i11 * 2;
                    float L2 = org.telegram.messenger.g0.L(bz.Y0);
                    fArr[i12 + 1] = L2;
                    fArr[i12] = L2;
                } else if (((q1Var.C6 && q1Var.M == null) || q1Var.G) && (i11 == 2 || i11 == 3)) {
                    float[] fArr2 = org.telegram.ui.Cells.q1.wd;
                    int i13 = i11 * 2;
                    int i14 = i13 + 1;
                    float L3 = org.telegram.messenger.g0.L(q1Var.G ? Math.min(5, bz.Y0) : bz.Y0);
                    fArr2[i14] = L3;
                    fArr2[i13] = L3;
                }
            }
            float[] fArr3 = org.telegram.ui.Cells.q1.wd;
            int i15 = i11 * 2;
            fArr3[i15 + 1] = 0.0f;
            fArr3[i15] = 0.0f;
        }
        if (z10 || q1Var.K || (xiVar = q1Var.M) != null || (xiVar != null && ((w1Var = q1Var.x2) == null || !w1Var.b))) {
            path.addRoundRect(rectF, org.telegram.ui.Cells.q1.wd, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.top);
            path.lineTo(rectF.left + org.telegram.messenger.g0.L(6.0f), (rectF.bottom - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.L(5.0f));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(-7.0f), rectF.bottom - org.telegram.messenger.g0.L(23.0f), rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f14 = rectF.right;
            float[] fArr4 = org.telegram.ui.Cells.q1.wd;
            float f15 = f14 - (fArr4[4] * 2.0f);
            float f16 = rectF.bottom;
            rectF2.set(f15, f16 - (fArr4[5] * 2.0f), f14, f16);
            path.arcTo(rectF2, 90.0f, -90.0f, false);
            path.lineTo(rectF.right, rectF.top);
            path.close();
        }
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        int i10 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.a;
    }

    public y5(org.telegram.ui.Cells.q1 q1Var, int i7) {
        this.a = 1;
        this.f = q1Var;
        this.d = i7;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        this.c = new RectF();
        this.e = new Path();
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
