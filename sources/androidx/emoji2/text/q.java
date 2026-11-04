package androidx.emoji2.text;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q {
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    public q(Bitmap bitmap) {
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
        arrayList2.add(s4.b.g);
        this.d = bitmap;
        arrayList.add(s4.e.d);
        arrayList.add(s4.e.e);
        arrayList.add(s4.e.f);
        arrayList.add(s4.e.g);
        arrayList.add(s4.e.h);
        arrayList.add(s4.e.i);
    }

    public int a(int i3) {
        SparseArray sparseArray = ((t) this.e).a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(i3);
        int i10 = 1;
        int i11 = 2;
        if (this.a == 2) {
            if (tVar != null) {
                this.e = tVar;
                this.c++;
            } else if (i3 == 65038) {
                d();
            } else if (i3 != 65039) {
                t tVar2 = (t) this.e;
                if (tVar2.b != null) {
                    i11 = 3;
                    if (this.c != 1) {
                        this.f = tVar2;
                        d();
                    } else if (e()) {
                        this.f = (t) this.e;
                        d();
                    } else {
                        d();
                    }
                } else {
                    d();
                }
            }
            i10 = i11;
        } else if (tVar == null) {
            d();
        } else {
            this.a = 2;
            this.e = tVar;
            this.c = 1;
            i10 = i11;
        }
        this.b = i3;
        return i10;
    }

    public s4.b b() {
        int max;
        s4.b bVar;
        ArrayList arrayList = (ArrayList) this.f;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i3 = this.c;
        int i10 = this.b;
        double d = -1.0d;
        if (i10 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i10) {
                d = Math.sqrt(i10 / height);
            }
        } else if (i3 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i3) {
            d = i3 / max;
        }
        int i11 = 0;
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        s4.b bVar2 = new s4.b(iArr, this.a, arrayList.isEmpty() ? null : (s4.c[]) arrayList.toArray(new s4.c[arrayList.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList2 = (ArrayList) bVar2.c;
        ArrayList arrayList3 = (ArrayList) this.e;
        s4.b bVar3 = new s4.b(arrayList3, arrayList2);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) bVar3.d;
        int size = arrayList3.size();
        int i12 = 0;
        while (i12 < size) {
            s4.e eVar = (s4.e) arrayList3.get(i12);
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
            s4.d dVar = null;
            while (i15 < size2) {
                s4.d dVar2 = (s4.d) list.get(i15);
                float[] b10 = dVar2.b();
                float f15 = b10[1];
                float f16 = f10;
                float[] fArr3 = eVar.b;
                if (f15 >= fArr2[i15] && f15 <= fArr2[2]) {
                    float f17 = b10[2];
                    if (f17 >= fArr3[i15] && f17 <= fArr3[2] && !sparseBooleanArray.get(dVar2.d)) {
                        float[] b11 = dVar2.b();
                        s4.d dVar3 = (s4.d) bVar3.e;
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
            s4.b bVar4 = bVar3;
            if (dVar != null) {
                sparseBooleanArray.append(dVar.d, true);
            }
            fVar.put(eVar, dVar);
            i12++;
            i11 = i15;
            bVar3 = bVar4;
        }
        s4.b bVar5 = bVar3;
        sparseBooleanArray.clear();
        return bVar5;
    }

    public VolumeProvider c() {
        q qVar;
        if (((VolumeProvider) this.e) != null) {
            qVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            qVar = this;
            qVar.e = new a2.e(qVar, this.a, this.b, this.c, (String) this.d);
        } else {
            qVar = this;
            qVar.e = new a2.f(this, qVar.a, qVar.b, qVar.c);
        }
        return (VolumeProvider) qVar.e;
    }

    public void d() {
        this.a = 1;
        this.e = (t) this.d;
        this.c = 0;
    }

    public boolean e() {
        r1.a b10 = ((t) this.e).b.b();
        int a10 = b10.a(6);
        return !(a10 == 0 || ((ByteBuffer) b10.d).get(a10 + b10.a) == 0) || this.b == 65039;
    }
}
