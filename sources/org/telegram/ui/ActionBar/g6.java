package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.bj;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g6 extends Drawable {
    public final /* synthetic */ int a;
    public final Paint b;
    public final RectF c;
    public final /* synthetic */ int d;
    public final Object e;
    public final /* synthetic */ View f;

    public g6(View view, View view2, int i10, Paint paint) {
        this.a = 0;
        this.e = view;
        this.f = view2;
        this.d = i10;
        this.b = paint;
        this.c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                float f7 = bounds.left;
                float f10 = bounds.top;
                float f11 = bounds.right;
                float f12 = bounds.bottom;
                RectF rectF = this.c;
                rectF.set(f7, f10, f11, f12);
                t6.t((View) this.e, this.f, null);
                float f13 = this.d;
                Paint paint = this.b;
                if (paint == null) {
                    paint = t6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, f13, f13, paint);
                if (t6.d1()) {
                    canvas.drawRoundRect(rectF, f13, f13, t6.V0("paintChatActionBackgroundDarken"));
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
        bj bjVar;
        org.telegram.ui.Cells.w1 w1Var;
        Rect bounds = getBounds();
        float f7 = bounds.left;
        float f10 = bounds.top;
        float f11 = bounds.right;
        float f12 = bounds.bottom;
        RectF rectF = this.c;
        rectF.set(f7, f10, f11, f12);
        Path path = (Path) this.e;
        path.rewind();
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
        int[] iArr = q1Var.J2;
        int i10 = this.d;
        int i11 = iArr[i10];
        if (i11 == 3 || i11 == 4) {
            path.addCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.i0.L(iArr[i10] == 3 ? 16.0f : 20.0f), Path.Direction.CW);
            return;
        }
        if (i11 != 2) {
            float L = i11 == 0 ? org.telegram.messenger.i0.L(6.0f) : 0.0f;
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        jj jjVar = q1Var.O5;
        boolean z10 = jjVar != null && jjVar.P3();
        for (int i12 = 0; i12 < 4; i12++) {
            if (!q1Var.C2) {
                if (i12 == (z10 ? 3 : 2)) {
                    float[] fArr = org.telegram.ui.Cells.q1.ed;
                    int i13 = i12 * 2;
                    float L2 = org.telegram.messenger.i0.L(tz.Y0);
                    fArr[i13 + 1] = L2;
                    fArr[i13] = L2;
                } else if (((q1Var.A6 && q1Var.L == null) || q1Var.F) && (i12 == 2 || i12 == 3)) {
                    float[] fArr2 = org.telegram.ui.Cells.q1.ed;
                    int i14 = i12 * 2;
                    int i15 = i14 + 1;
                    float L3 = org.telegram.messenger.i0.L(q1Var.F ? Math.min(5, tz.Y0) : tz.Y0);
                    fArr2[i15] = L3;
                    fArr2[i14] = L3;
                }
            }
            float[] fArr3 = org.telegram.ui.Cells.q1.ed;
            int i16 = i12 * 2;
            fArr3[i16 + 1] = 0.0f;
            fArr3[i16] = 0.0f;
        }
        if (z10 || q1Var.J || (bjVar = q1Var.L) != null || (bjVar != null && ((w1Var = q1Var.v2) == null || !w1Var.b))) {
            path.addRoundRect(rectF, org.telegram.ui.Cells.q1.ed, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + org.telegram.messenger.i0.L(6.0f), rectF.top);
            path.lineTo(rectF.left + org.telegram.messenger.i0.L(6.0f), (rectF.bottom - org.telegram.messenger.i0.L(6.0f)) - org.telegram.messenger.i0.L(5.0f));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(rectF.left + org.telegram.messenger.i0.L(-7.0f), rectF.bottom - org.telegram.messenger.i0.L(23.0f), rectF.left + org.telegram.messenger.i0.L(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f13 = rectF.right;
            float[] fArr4 = org.telegram.ui.Cells.q1.ed;
            float f14 = f13 - (fArr4[4] * 2.0f);
            float f15 = rectF.bottom;
            rectF2.set(f14, f15 - (fArr4[5] * 2.0f), f13, f15);
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
    public final void setAlpha(int i10) {
        int i11 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.a;
    }

    public g6(org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.a = 1;
        this.f = q1Var;
        this.d = i10;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        this.c = new RectF();
        this.e = new Path();
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
