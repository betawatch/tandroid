package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.aj;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w5 extends Drawable {
    public final /* synthetic */ int a;
    public final Paint b;
    public final RectF c;
    public final /* synthetic */ int d;
    public final Object e;
    public final /* synthetic */ View f;

    public w5(View view, View view2, int i7, Paint paint) {
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
                k6.t((View) this.e, this.f, null);
                float f14 = this.d;
                Paint paint = this.b;
                if (paint == null) {
                    paint = k6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, f14, f14, paint);
                if (k6.d1()) {
                    canvas.drawRoundRect(rectF, f14, f14, k6.V0("paintChatActionBackgroundDarken"));
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
        aj ajVar;
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
        int[] iArr = q1Var.K2;
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
        ij ijVar = q1Var.P5;
        boolean z9 = ijVar != null && ijVar.Q3();
        for (int i11 = 0; i11 < 4; i11++) {
            if (!q1Var.D2) {
                if (i11 == (z9 ? 3 : 2)) {
                    float[] fArr = org.telegram.ui.Cells.q1.hd;
                    int i12 = i11 * 2;
                    float L2 = org.telegram.messenger.g0.L(iz.Y0);
                    fArr[i12 + 1] = L2;
                    fArr[i12] = L2;
                } else if (((q1Var.B6 && q1Var.L == null) || q1Var.F) && (i11 == 2 || i11 == 3)) {
                    float[] fArr2 = org.telegram.ui.Cells.q1.hd;
                    int i13 = i11 * 2;
                    int i14 = i13 + 1;
                    float L3 = org.telegram.messenger.g0.L(q1Var.F ? Math.min(5, iz.Y0) : iz.Y0);
                    fArr2[i14] = L3;
                    fArr2[i13] = L3;
                }
            }
            float[] fArr3 = org.telegram.ui.Cells.q1.hd;
            int i15 = i11 * 2;
            fArr3[i15 + 1] = 0.0f;
            fArr3[i15] = 0.0f;
        }
        if (z9 || q1Var.J || (ajVar = q1Var.L) != null || (ajVar != null && ((w1Var = q1Var.w2) == null || !w1Var.b))) {
            path.addRoundRect(rectF, org.telegram.ui.Cells.q1.hd, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.top);
            path.lineTo(rectF.left + org.telegram.messenger.g0.L(6.0f), (rectF.bottom - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.L(5.0f));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF.left + org.telegram.messenger.g0.L(-7.0f), rectF.bottom - org.telegram.messenger.g0.L(23.0f), rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f14 = rectF.right;
            float[] fArr4 = org.telegram.ui.Cells.q1.hd;
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

    public w5(org.telegram.ui.Cells.q1 q1Var, int i7) {
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
