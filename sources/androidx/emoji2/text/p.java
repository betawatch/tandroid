package androidx.emoji2.text;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        arrayList2.add(q4.b.g);
        this.d = bitmap;
        arrayList.add(q4.e.d);
        arrayList.add(q4.e.e);
        arrayList.add(q4.e.f);
        arrayList.add(q4.e.g);
        arrayList.add(q4.e.h);
        arrayList.add(q4.e.i);
    }

    public int a(int i10) {
        SparseArray sparseArray = ((s) this.e).a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(i10);
        int i11 = 1;
        int i12 = 2;
        if (this.a == 2) {
            if (sVar != null) {
                this.e = sVar;
                this.c++;
            } else if (i10 == 65038) {
                d();
            } else if (i10 != 65039) {
                s sVar2 = (s) this.e;
                if (sVar2.b != null) {
                    i12 = 3;
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
            i11 = i12;
        } else if (sVar == null) {
            d();
        } else {
            this.a = 2;
            this.e = sVar;
            this.c = 1;
            i11 = i12;
        }
        this.b = i10;
        return i11;
    }

    public q4.b b() {
        int max;
        q4.b bVar;
        ArrayList arrayList = (ArrayList) this.f;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i10 = this.c;
        int i11 = this.b;
        double d = -1.0d;
        if (i11 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i11) {
                d = Math.sqrt(i11 / height);
            }
        } else if (i10 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i10) {
            d = i10 / max;
        }
        int i12 = 0;
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        q4.b bVar2 = new q4.b(iArr, this.a, arrayList.isEmpty() ? null : (q4.c[]) arrayList.toArray(new q4.c[arrayList.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList2 = (ArrayList) bVar2.c;
        ArrayList arrayList3 = (ArrayList) this.e;
        q4.b bVar3 = new q4.b(arrayList3, arrayList2);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) bVar3.d;
        int size = arrayList3.size();
        int i13 = 0;
        while (i13 < size) {
            q4.e eVar = (q4.e) arrayList3.get(i13);
            float[] fArr = eVar.c;
            float[] fArr2 = eVar.a;
            int length = fArr.length;
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i14 = i12; i14 < length; i14++) {
                float f11 = fArr[i14];
                if (f11 > 0.0f) {
                    f10 += f11;
                }
            }
            if (f10 != 0.0f) {
                int length2 = fArr.length;
                for (int i15 = i12; i15 < length2; i15++) {
                    float f12 = fArr[i15];
                    if (f12 > 0.0f) {
                        fArr[i15] = f12 / f10;
                    }
                }
            }
            a0.f fVar = (a0.f) bVar3.c;
            List list = (List) bVar3.a;
            int size2 = list.size();
            int i16 = i12;
            float f13 = 0.0f;
            q4.d dVar = null;
            while (i16 < size2) {
                q4.d dVar2 = (q4.d) list.get(i16);
                float[] b10 = dVar2.b();
                float f14 = b10[1];
                float f15 = f7;
                float[] fArr3 = eVar.b;
                if (f14 >= fArr2[i16] && f14 <= fArr2[2]) {
                    float f16 = b10[2];
                    if (f16 >= fArr3[i16] && f16 <= fArr3[2] && !sparseBooleanArray.get(dVar2.d)) {
                        float[] b11 = dVar2.b();
                        q4.d dVar3 = (q4.d) bVar3.e;
                        int i17 = dVar3 != null ? dVar3.e : 1;
                        bVar = bVar3;
                        float[] fArr4 = eVar.c;
                        float f17 = fArr4[i16];
                        float abs = f17 > f15 ? (1.0f - Math.abs(b11[1] - fArr2[1])) * f17 : f15;
                        float f18 = fArr4[1];
                        float abs2 = f18 > f15 ? (1.0f - Math.abs(b11[2] - fArr3[1])) * f18 : f15;
                        float f19 = fArr4[2];
                        float f20 = abs + abs2 + (f19 > f15 ? (dVar2.e / i17) * f19 : f15);
                        if (dVar == null || f20 > f13) {
                            dVar = dVar2;
                            f13 = f20;
                        }
                        i16++;
                        bVar3 = bVar;
                        f7 = f15;
                    }
                }
                bVar = bVar3;
                i16++;
                bVar3 = bVar;
                f7 = f15;
            }
            q4.b bVar4 = bVar3;
            if (dVar != null) {
                sparseBooleanArray.append(dVar.d, true);
            }
            fVar.put(eVar, dVar);
            i13++;
            i12 = i16;
            bVar3 = bVar4;
        }
        q4.b bVar5 = bVar3;
        sparseBooleanArray.clear();
        return bVar5;
    }

    public VolumeProvider c() {
        p pVar;
        if (((VolumeProvider) this.e) != null) {
            pVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            pVar = this;
            pVar.e = new y1.e(pVar, this.a, this.b, this.c, (String) this.d);
        } else {
            pVar = this;
            pVar.e = new y1.f(this, pVar.a, pVar.b, pVar.c);
        }
        return (VolumeProvider) pVar.e;
    }

    public void d() {
        this.a = 1;
        this.e = (s) this.d;
        this.c = 0;
    }

    public boolean e() {
        p1.a b10 = ((s) this.e).b.b();
        int a2 = b10.a(6);
        return !(a2 == 0 || ((ByteBuffer) b10.d).get(a2 + b10.a) == 0) || this.b == 65039;
    }
}
