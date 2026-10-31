package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import c5.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
import org.telegram.messenger.s5;
import org.telegram.messenger.tz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k {
    public static k q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final s5 a = new s5("SpoilerEffectBitmapFactory", 3);
    public final x[] b = new x[i.C.length];
    public final m4.c[] c = new m4.c[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final jf.b n = new jf.b(this, 1);
    public final Rect o = new Rect();

    public k() {
        int L = i0.L(tz.o() == 2 ? 150.0f : 100.0f);
        Point point = i0.q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.k = min < i0.L(80.0f) ? i0.L(80.0f) : min;
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.b;
            if (i10 >= xVarArr.length) {
                return;
            }
            boolean z10 = false;
            x xVar = new x(11, z10, z10);
            xVar.c = new float[Math.max(64, 2)];
            xVar.b = 0;
            xVarArr[i10] = xVar;
            i10++;
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i10;
        int[] iArr;
        int i11;
        float f7;
        int i12;
        int i13;
        d5.a aVar;
        float f10;
        int i14;
        Rect rect2 = rect;
        x[] xVarArr = this.b;
        for (x xVar : xVarArr) {
            xVar.b = 0;
        }
        int i15 = 0;
        while (i15 < 100) {
            i iVar = (i) this.i.get(i15);
            if (Rect.intersects(iVar.getBounds(), rect2)) {
                float[][] fArr = i.D;
                int[] iArr2 = iVar.f;
                float[] fArr2 = iVar.e;
                int length = xVarArr.length;
                float[] fArr3 = i.C;
                if (length == fArr3.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int min = (int) Math.min(currentTimeMillis - iVar.j, 34L);
                    iVar.j = currentTimeMillis;
                    ArrayList arrayList = iVar.h;
                    Stack stack = iVar.c;
                    int i16 = iVar.d;
                    int length2 = fArr3.length;
                    Rect bounds = iVar.getBounds();
                    float f11 = bounds.left;
                    float f12 = bounds.top;
                    i10 = i15;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = iVar.z;
                    float f13 = rectF.left;
                    float f14 = rectF.top;
                    float f15 = rectF.right;
                    float f16 = rectF.bottom;
                    float N = i0.N(1.0f);
                    float f17 = rect2.left - N;
                    float f18 = rect2.top - N;
                    float f19 = rect2.right + N;
                    float f20 = rect2.bottom + N;
                    float f21 = min;
                    float f22 = f21 / 500.0f;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        int i18 = size;
                        d dVar = (d) arrayList.get(i17);
                        float f23 = f21;
                        float f24 = f15;
                        float min2 = Math.min(dVar.g + f23, dVar.f);
                        dVar.g = min2;
                        float f25 = dVar.a;
                        float f26 = dVar.b;
                        boolean z10 = f25 < f13 || f25 > f24 || f26 < f14 || f26 > f16;
                        if (min2 >= dVar.f || z10) {
                            if (stack.size() < i16) {
                                stack.push(dVar);
                            }
                            int i19 = i18 - 1;
                            if (i17 != i19) {
                                arrayList.set(i17, (d) arrayList.get(i19));
                            }
                            arrayList.remove(i19);
                            size = i18 - 1;
                            i17--;
                        } else {
                            float f27 = dVar.e * f22;
                            dVar.a = (dVar.c * f27) + f25;
                            dVar.b = (dVar.d * f27) + f26;
                            size = i18;
                        }
                        i17++;
                        f21 = f23;
                        f15 = f24;
                    }
                    float f28 = f15;
                    int size2 = arrayList.size();
                    if (size2 < i16) {
                        int i20 = i16 - size2;
                        int i21 = 14;
                        float f29 = -1.0f;
                        Arrays.fill(fArr2, 0, Math.min(i20, 14), -1.0f);
                        float f30 = f12;
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < i20) {
                            float f31 = fArr2[i23];
                            if (f31 == f29) {
                                f31 = Utilities.c.nextFloat();
                                fArr2[i23] = f31;
                            }
                            float f32 = f31;
                            int i24 = i23 + 1;
                            i23 = i24 == i21 ? 0 : i24;
                            d dVar2 = !stack.isEmpty() ? (d) stack.pop() : new d();
                            int i25 = 0;
                            while (true) {
                                aVar = Utilities.c;
                                f10 = f30;
                                dVar2.a = (aVar.nextFloat() * width) + f11;
                                float nextFloat = (aVar.nextFloat() * height) + f10;
                                dVar2.b = nextFloat;
                                int i26 = i25 + 1;
                                i14 = i22;
                                float f33 = dVar2.a;
                                if ((f33 < f13 || f33 > f28 || nextFloat < f14 || nextFloat > f16) && i26 < 4) {
                                    i22 = i14;
                                    i25 = i26;
                                    f30 = f10;
                                }
                            }
                            int[] iArr3 = iArr2;
                            double d = ((f32 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            dVar2.c = (float) Math.cos(d);
                            dVar2.d = (float) Math.sin(d);
                            dVar2.g = 0.0f;
                            dVar2.f = aVar.nextInt(2000) + 1000;
                            dVar2.e = (f32 * 6.0f) + 4.0f;
                            dVar2.h = aVar.nextInt(length2);
                            arrayList.add(dVar2);
                            i22 = i14 + 1;
                            iArr2 = iArr3;
                            f30 = f10;
                            i21 = 14;
                            f29 = -1.0f;
                        }
                        iArr = iArr2;
                        size2 = arrayList.size();
                    } else {
                        iArr = iArr2;
                    }
                    for (int i27 = 0; i27 < length2; i27++) {
                        iArr[i27] = 0;
                    }
                    int i28 = iVar.x;
                    int i29 = 0;
                    while (i29 < size2) {
                        d dVar3 = (d) arrayList.get(i29);
                        float f34 = dVar3.a;
                        float f35 = dVar3.b;
                        if (f34 >= f17 && f34 <= f19 && f35 >= f18 && f35 <= f20) {
                            int i30 = dVar3.h;
                            float[] fArr4 = fArr[i30];
                            int i31 = iArr[i30];
                            int i32 = i31 + 1;
                            if (i32 < fArr4.length) {
                                fArr4[i31] = f34;
                                fArr4[i32] = f35;
                                int i33 = i31 + 2;
                                float f36 = iVar.b[i30];
                                if (f34 < f36) {
                                    int i34 = i31 + 3;
                                    i11 = size2;
                                    if (i34 < fArr4.length) {
                                        fArr4[i33] = i28 + f34;
                                        fArr4[i34] = f35;
                                        i33 = i31 + 4;
                                    }
                                } else {
                                    i11 = size2;
                                }
                                float f37 = i28;
                                float f38 = f37 - f36;
                                if (f34 > f38) {
                                    int i35 = i33 + 1;
                                    f7 = f37;
                                    if (i35 < fArr4.length) {
                                        fArr4[i33] = f34 - f7;
                                        fArr4[i35] = f35;
                                        i33 += 2;
                                    }
                                } else {
                                    f7 = f37;
                                }
                                if (f35 < f36 && (i13 = i33 + 1) < fArr4.length) {
                                    fArr4[i33] = f34;
                                    fArr4[i13] = f35 + f7;
                                    i33 += 2;
                                }
                                if (f35 > f38 && (i12 = i33 + 1) < fArr4.length) {
                                    fArr4[i33] = f34;
                                    fArr4[i12] = f35 - f7;
                                    i33 += 2;
                                }
                                iArr[i30] = i33;
                                i29++;
                                size2 = i11;
                            }
                        }
                        i11 = size2;
                        i29++;
                        size2 = i11;
                    }
                    for (int i36 = 0; i36 < length2; i36++) {
                        x xVar2 = xVarArr[i36];
                        float[] fArr5 = fArr[i36];
                        int i37 = iArr[i36];
                        int i38 = xVar2.b + i37;
                        float[] fArr6 = (float[]) xVar2.c;
                        if (i38 > fArr6.length) {
                            xVar2.c = Arrays.copyOf((float[]) xVar2.c, Math.max(i38, fArr6.length * 2));
                        }
                        System.arraycopy(fArr5, 0, (float[]) xVar2.c, xVar2.b, i37);
                        xVar2.b += i37;
                    }
                    i15 = i10 + 1;
                    rect2 = rect;
                }
            }
            i10 = i15;
            i15 = i10 + 1;
            rect2 = rect;
        }
        i iVar2 = (i) this.i.get(0);
        iVar2.getClass();
        float[] fArr7 = i.C;
        if (xVarArr.length != fArr7.length) {
            return;
        }
        for (int i39 = 0; i39 < fArr7.length; i39++) {
            x xVar3 = xVarArr[i39];
            Paint paint = iVar2.a[i39];
            int i40 = xVar3.b;
            if (i40 > 0) {
                canvas.drawPoints((float[]) xVar3.c, 0, i40, paint);
            }
        }
    }
}
