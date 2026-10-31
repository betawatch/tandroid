package gg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.d00;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends Drawable {
    public static c00 j;
    public static final int[] k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray l;
    public final c00 a;
    public LinearGradient b;
    public int e;
    public final Paint f;
    public final Paint g;
    public int[] h;
    public final Matrix c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i10) {
        if (j == null) {
            j = d00.h(R.raw.topic_bubble, -1);
        }
        c00 clone = j.clone();
        SparseArray sparseArray = clone.r;
        this.a = clone;
        ArrayList arrayList = clone.a;
        arrayList.add(arrayList.get(0));
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStrokeWidth(i0.L(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        sparseArray.put(1, paint);
        sparseArray.put(2, paint2);
        b(i10);
    }

    public static int a(int i10, int i11) {
        return Math.abs(Color.blue(i10) - Color.blue(i11)) + Math.abs(Color.green(i10) - Color.green(i11)) + Math.abs(Color.red(i10) - Color.red(i11));
    }

    public final void b(int i10) {
        int i11 = this.i;
        if (i11 == i10 && i11 == -1) {
            return;
        }
        this.i = i10;
        int[] iArr = k;
        int a2 = a(iArr[0], i10);
        this.e = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            int a10 = a(iArr[i12], i10);
            if (a10 < a2) {
                this.e = i12;
                a2 = a10;
            }
        }
        int[] iArr2 = (int[]) l.get(iArr[this.e]);
        int[] iArr3 = t6.I.q() ? new int[]{i0.b.f(0.2f, iArr2[0], -1), i0.b.f(0.2f, iArr2[1], -1)} : iArr2;
        this.h = iArr3;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr3, (float[]) null, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        linearGradient.setLocalMatrix(this.c);
        paint.setShader(this.b);
        this.a.r.put(0, paint);
        this.g.setColor(i0.b.f(0.1f, iArr3[1], -1));
        this.f.setColor(i0.b.f(0.1f, iArr3[0], -16777216));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        c00 c00Var = this.a;
        c00Var.setBounds(bounds);
        c00Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
