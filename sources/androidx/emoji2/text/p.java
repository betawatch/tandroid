package androidx.emoji2.text;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class p {
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    public p(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = 16;
        this.b = 12544;
        this.c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(t4.b.g);
        this.d = bitmap;
        arrayList.add(t4.e.d);
        arrayList.add(t4.e.e);
        arrayList.add(t4.e.f);
        arrayList.add(t4.e.g);
        arrayList.add(t4.e.h);
        arrayList.add(t4.e.i);
    }

    public int a(int i7) {
        SparseArray sparseArray = ((s) this.e).a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(i7);
        int i10 = 1;
        int i11 = 2;
        if (this.a == 2) {
            if (sVar != null) {
                this.e = sVar;
                this.c++;
            } else if (i7 == 65038) {
                d();
            } else if (i7 != 65039) {
                s sVar2 = (s) this.e;
                if (sVar2.b != null) {
                    i11 = 3;
                    if (this.c != 1) {
                        this.f = sVar2;
                        d();
                    } else if (e()) {
                        this.f = (s) this.e;
                        d();
                    } else {
                        d();
                    }
                } else {
                    d();
                }
            }
            i10 = i11;
        } else if (sVar == null) {
            d();
        } else {
            this.a = 2;
            this.e = sVar;
            this.c = 1;
            i10 = i11;
        }
        this.b = i7;
        return i10;
    }

    public t4.b b() {
        int max;
        t4.b bVar;
        ArrayList arrayList = (ArrayList) this.f;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i7 = this.c;
        int i10 = this.b;
        double d = -1.0d;
        if (i10 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i10) {
                d = Math.sqrt(i10 / height);
            }
        } else if (i7 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i7) {
            d = i7 / max;
        }
        int i11 = 0;
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        t4.b bVar2 = new t4.b(iArr, this.a, arrayList.isEmpty() ? null : (t4.c[]) arrayList.toArray(new t4.c[arrayList.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList2 = (ArrayList) bVar2.c;
        ArrayList arrayList3 = (ArrayList) this.e;
        t4.b bVar3 = new t4.b(arrayList3, arrayList2);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) bVar3.d;
        int size = arrayList3.size();
        int i12 = 0;
        while (i12 < size) {
            t4.e eVar = (t4.e) arrayList3.get(i12);
            float[] fArr = eVar.c;
            float[] fArr2 = eVar.a;
            int length = fArr.length;
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i13 = i11; i13 < length; i13++) {
                float f12 = fArr[i13];
                if (f12 > 0.0f) {
                    f11 += f12;
                }
            }
            if (f11 != 0.0f) {
                int length2 = fArr.length;
                for (int i14 = i11; i14 < length2; i14++) {
                    float f13 = fArr[i14];
                    if (f13 > 0.0f) {
                        fArr[i14] = f13 / f11;
                    }
                }
            }
            a0.f fVar = (a0.f) bVar3.c;
            List list = (List) bVar3.a;
            int size2 = list.size();
            int i15 = i11;
            float f14 = 0.0f;
            t4.d dVar = null;
            while (i15 < size2) {
                t4.d dVar2 = (t4.d) list.get(i15);
                float[] b10 = dVar2.b();
                float f15 = b10[1];
                float f16 = f10;
                float[] fArr3 = eVar.b;
                if (f15 >= fArr2[i15] && f15 <= fArr2[2]) {
                    float f17 = b10[2];
                    if (f17 >= fArr3[i15] && f17 <= fArr3[2] && !sparseBooleanArray.get(dVar2.d)) {
                        float[] b11 = dVar2.b();
                        t4.d dVar3 = (t4.d) bVar3.e;
                        int i16 = dVar3 != null ? dVar3.e : 1;
                        bVar = bVar3;
                        float[] fArr4 = eVar.c;
                        float f18 = fArr4[i15];
                        float abs = f18 > f16 ? (1.0f - Math.abs(b11[1] - fArr2[1])) * f18 : f16;
                        float f19 = fArr4[1];
                        float abs2 = f19 > f16 ? (1.0f - Math.abs(b11[2] - fArr3[1])) * f19 : f16;
                        float f20 = fArr4[2];
                        float f21 = abs + abs2 + (f20 > f16 ? (dVar2.e / i16) * f20 : f16);
                        if (dVar == null || f21 > f14) {
                            dVar = dVar2;
                            f14 = f21;
                        }
                        i15++;
                        bVar3 = bVar;
                        f10 = f16;
                    }
                }
                bVar = bVar3;
                i15++;
                bVar3 = bVar;
                f10 = f16;
            }
            t4.b bVar4 = bVar3;
            if (dVar != null) {
                sparseBooleanArray.append(dVar.d, true);
            }
            fVar.put(eVar, dVar);
            i12++;
            i11 = i15;
            bVar3 = bVar4;
        }
        t4.b bVar5 = bVar3;
        sparseBooleanArray.clear();
        return bVar5;
    }

    public VolumeProvider c() {
        p pVar;
        if (((VolumeProvider) this.e) != null) {
            pVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            pVar = this;
            pVar.e = new b2.e(pVar, this.a, this.b, this.c, (String) this.d);
        } else {
            pVar = this;
            pVar.e = new b2.f(this, pVar.a, pVar.b, pVar.c);
        }
        return (VolumeProvider) pVar.e;
    }

    public void d() {
        this.a = 1;
        this.e = (s) this.d;
        this.c = 0;
    }

    public boolean e() {
        s1.a b10 = ((s) this.e).b.b();
        int a10 = b10.a(6);
        return !(a10 == 0 || ((ByteBuffer) b10.d).get(a10 + b10.a) == 0) || this.b == 65039;
    }
}
