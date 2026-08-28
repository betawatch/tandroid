package dh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import n2.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o {
    public static o q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final DispatchQueue a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final w[] b = new w[l.C.length];
    public final we.b[] c = new we.b[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final m n = new m(this, 0);
    public final Rect o = new Rect();

    public o() {
        int dp = AndroidUtilities.dp(SharedConfig.getDevicePerformanceClass() == 2 ? 150.0f : 100.0f);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i9 = 0;
        while (true) {
            w[] wVarArr = this.b;
            if (i9 >= wVarArr.length) {
                return;
            }
            w wVar = new w((char) 0, 4);
            wVar.c = new float[Math.max(64, 2)];
            wVar.b = 0;
            wVarArr[i9] = wVar;
            i9++;
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i9;
        int[] iArr;
        int i10;
        int[] iArr2;
        float f10;
        int i11;
        int i12;
        float f11;
        Rect rect2 = rect;
        w[] wVarArr = this.b;
        for (w wVar : wVarArr) {
            wVar.b = 0;
        }
        int i13 = 0;
        while (i13 < 100) {
            l lVar = (l) this.i.get(i13);
            if (Rect.intersects(lVar.getBounds(), rect2)) {
                float[][] fArr = l.D;
                int[] iArr3 = lVar.f;
                float[] fArr2 = lVar.e;
                if (wVarArr != null) {
                    int length = wVarArr.length;
                    float[] fArr3 = l.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int min = (int) Math.min(currentTimeMillis - lVar.j, 34L);
                        lVar.j = currentTimeMillis;
                        ArrayList arrayList = lVar.h;
                        Stack stack = lVar.c;
                        int i14 = lVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = lVar.getBounds();
                        float f12 = bounds.left;
                        float f13 = bounds.top;
                        i9 = i13;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = lVar.z;
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        float f16 = rectF.right;
                        float f17 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f18 = rect2.left - dpf2;
                        float f19 = rect2.top - dpf2;
                        float f20 = rect2.right + dpf2;
                        float f21 = rect2.bottom + dpf2;
                        float f22 = min;
                        float f23 = f22 / 500.0f;
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            e eVar = (e) arrayList.get(i15);
                            float f24 = f22;
                            float f25 = f16;
                            float min2 = Math.min(eVar.g + f24, eVar.f);
                            eVar.g = min2;
                            float f26 = eVar.a;
                            float f27 = eVar.b;
                            boolean z10 = f26 < f14 || f26 > f25 || f27 < f15 || f27 > f17;
                            if (min2 >= eVar.f || z10) {
                                if (stack.size() < i14) {
                                    stack.push(eVar);
                                }
                                int i17 = i16 - 1;
                                if (i15 != i17) {
                                    arrayList.set(i15, (e) arrayList.get(i17));
                                }
                                arrayList.remove(i17);
                                size = i16 - 1;
                                i15--;
                            } else {
                                float f28 = eVar.e * f23;
                                eVar.a = (eVar.c * f28) + f26;
                                eVar.b = (eVar.d * f28) + f27;
                                size = i16;
                            }
                            i15++;
                            f22 = f24;
                            f16 = f25;
                        }
                        float f29 = f16;
                        int size2 = arrayList.size();
                        if (size2 < i14) {
                            int i18 = i14 - size2;
                            int i19 = 14;
                            float f30 = -1.0f;
                            Arrays.fill(fArr2, 0, Math.min(i18, 14), -1.0f);
                            float f31 = f13;
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < i18) {
                                float f32 = fArr2[i21];
                                if (f32 == f30) {
                                    f32 = Utilities.fastRandom.nextFloat();
                                    fArr2[i21] = f32;
                                }
                                float f33 = f32;
                                int i22 = i21 + 1;
                                i21 = i22 == i19 ? 0 : i22;
                                e eVar2 = !stack.isEmpty() ? (e) stack.pop() : new e();
                                int i23 = 0;
                                while (true) {
                                    eVar2.a = (Utilities.fastRandom.nextFloat() * width) + f12;
                                    float nextFloat = (Utilities.fastRandom.nextFloat() * height) + f31;
                                    eVar2.b = nextFloat;
                                    int i24 = i23 + 1;
                                    f11 = f31;
                                    float f34 = eVar2.a;
                                    if ((f34 < f14 || f34 > f29 || nextFloat < f15 || nextFloat > f17) && i24 < 4) {
                                        f31 = f11;
                                        i23 = i24;
                                    }
                                }
                                int i25 = i20;
                                int[] iArr4 = iArr3;
                                double d = ((f33 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                eVar2.c = (float) Math.cos(d);
                                eVar2.d = (float) Math.sin(d);
                                eVar2.g = 0.0f;
                                eVar2.f = Utilities.fastRandom.nextInt(2000) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                                eVar2.e = (f33 * 6.0f) + 4.0f;
                                eVar2.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(eVar2);
                                i20 = i25 + 1;
                                iArr3 = iArr4;
                                f31 = f11;
                                i19 = 14;
                                f30 = -1.0f;
                            }
                            iArr = iArr3;
                            size2 = arrayList.size();
                        } else {
                            iArr = iArr3;
                        }
                        for (int i26 = 0; i26 < length2; i26++) {
                            iArr[i26] = 0;
                        }
                        int i27 = lVar.x;
                        int i28 = 0;
                        while (i28 < size2) {
                            e eVar3 = (e) arrayList.get(i28);
                            float f35 = eVar3.a;
                            float f36 = eVar3.b;
                            if (f35 >= f18 && f35 <= f20 && f36 >= f19 && f36 <= f21) {
                                int i29 = eVar3.h;
                                float[] fArr4 = fArr[i29];
                                int i30 = iArr[i29];
                                int i31 = i30 + 1;
                                if (i31 < fArr4.length) {
                                    fArr4[i30] = f35;
                                    fArr4[i31] = f36;
                                    int i32 = i30 + 2;
                                    float f37 = lVar.b[i29];
                                    if (f35 < f37) {
                                        i10 = size2;
                                        int i33 = i30 + 3;
                                        iArr2 = iArr;
                                        if (i33 < fArr4.length) {
                                            fArr4[i32] = i27 + f35;
                                            fArr4[i33] = f36;
                                            i32 = i30 + 4;
                                        }
                                    } else {
                                        i10 = size2;
                                        iArr2 = iArr;
                                    }
                                    float f38 = i27;
                                    float f39 = f38 - f37;
                                    if (f35 > f39) {
                                        int i34 = i32 + 1;
                                        f10 = f38;
                                        if (i34 < fArr4.length) {
                                            fArr4[i32] = f35 - f10;
                                            fArr4[i34] = f36;
                                            i32 += 2;
                                        }
                                    } else {
                                        f10 = f38;
                                    }
                                    if (f36 < f37 && (i12 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f35;
                                        fArr4[i12] = f36 + f10;
                                        i32 += 2;
                                    }
                                    if (f36 > f39 && (i11 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f35;
                                        fArr4[i11] = f36 - f10;
                                        i32 += 2;
                                    }
                                    iArr2[i29] = i32;
                                    i28++;
                                    size2 = i10;
                                    iArr = iArr2;
                                }
                            }
                            i10 = size2;
                            iArr2 = iArr;
                            i28++;
                            size2 = i10;
                            iArr = iArr2;
                        }
                        int[] iArr5 = iArr;
                        for (int i35 = 0; i35 < length2; i35++) {
                            w wVar2 = wVarArr[i35];
                            float[] fArr5 = fArr[i35];
                            int i36 = iArr5[i35];
                            int i37 = wVar2.b + i36;
                            float[] fArr6 = (float[]) wVar2.c;
                            if (i37 > fArr6.length) {
                                wVar2.c = Arrays.copyOf((float[]) wVar2.c, Math.max(i37, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) wVar2.c, wVar2.b, i36);
                            wVar2.b += i36;
                        }
                        i13 = i9 + 1;
                        rect2 = rect;
                    }
                }
            }
            i9 = i13;
            i13 = i9 + 1;
            rect2 = rect;
        }
        l lVar2 = (l) this.i.get(0);
        lVar2.getClass();
        float[] fArr7 = l.C;
        if (wVarArr == null || wVarArr.length != fArr7.length) {
            return;
        }
        for (int i38 = 0; i38 < fArr7.length; i38++) {
            w wVar3 = wVarArr[i38];
            Paint paint = lVar2.a[i38];
            int i39 = wVar3.b;
            if (i39 > 0) {
                canvas.drawPoints((float[]) wVar3.c, 0, i39, paint);
            }
        }
    }
}
