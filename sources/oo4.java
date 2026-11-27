// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oo4 extends Drawable {
    public static ggb j;
    public static final int[] k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray l;
    public final ggb a;
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

    public oo4(int i) {
        ggb ggbVar = j;
        if (ggbVar == null) {
            ggbVar = hgb.g(R.raw.topic_bubble, -1);
            j = ggbVar;
        }
        ggb clone = ggbVar.clone();
        SparseArray sparseArray = clone.r;
        this.a = clone;
        ArrayList arrayList = clone.a;
        arrayList.add(arrayList.get(0));
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStrokeWidth(hl.L(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        sparseArray.put(1, paint);
        sparseArray.put(2, paint2);
        b(i);
    }

    public static int a(int i, int i2) {
        return Math.abs(Color.blue(i) - Color.blue(i2)) + Math.abs(Color.green(i) - Color.green(i2)) + Math.abs(Color.red(i) - Color.red(i2));
    }

    public final void b(int i) {
        int i2 = this.i;
        if (i2 == i && i2 == -1) {
            return;
        }
        this.i = i;
        int[] iArr = k;
        int a = a(iArr[0], i);
        this.e = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            int a2 = a(iArr[i3], i);
            if (a2 < a) {
                this.e = i3;
                a = a2;
            }
        }
        int[] iArr2 = (int[]) l.get(iArr[this.e]);
        int[] iArr3 = aob.I.o() ? new int[]{vm2.f(0.2f, iArr2[0], -1), vm2.f(0.2f, iArr2[1], -1)} : iArr2;
        this.h = iArr3;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr3, (float[]) null, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        linearGradient.setLocalMatrix(this.c);
        paint.setShader(this.b);
        this.a.r.put(0, paint);
        this.g.setColor(vm2.f(0.1f, iArr3[1], -1));
        this.f.setColor(vm2.f(0.1f, iArr3[0], -16777216));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        ggb ggbVar = this.a;
        ggbVar.setBounds(bounds);
        ggbVar.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i)).invalidate();
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
