package androidx.emoji2.text;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o {
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    public o(Bitmap bitmap) {
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
        arrayList2.add(d2.c.g);
        this.d = bitmap;
        arrayList.add(d2.f.d);
        arrayList.add(d2.f.e);
        arrayList.add(d2.f.f);
        arrayList.add(d2.f.g);
        arrayList.add(d2.f.h);
        arrayList.add(d2.f.i);
    }

    public int a(int i10) {
        SparseArray sparseArray = ((r) this.e).a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(i10);
        int i11 = 1;
        if (this.a == 2) {
            if (rVar != null) {
                this.e = rVar;
                this.c++;
            } else if (i10 == 65038) {
                d();
            } else if (i10 != 65039) {
                r rVar2 = (r) this.e;
                if (rVar2.b != null) {
                    if (this.c != 1) {
                        this.f = rVar2;
                        d();
                    } else if (e()) {
                        this.f = (r) this.e;
                        d();
                    } else {
                        d();
                    }
                    i11 = 3;
                } else {
                    d();
                }
            }
            i11 = 2;
        } else if (rVar == null) {
            d();
        } else {
            this.a = 2;
            this.e = rVar;
            this.c = 1;
            i11 = 2;
        }
        this.b = i10;
        return i11;
    }

    public d2.c b() {
        int max;
        d2.c cVar;
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
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        d2.c cVar2 = new d2.c(iArr, this.a, arrayList.isEmpty() ? null : (d2.d[]) arrayList.toArray(new d2.d[arrayList.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList2 = (ArrayList) cVar2.c;
        ArrayList arrayList3 = (ArrayList) this.e;
        d2.c cVar3 = new d2.c(arrayList3, arrayList2);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) cVar3.d;
        int size = arrayList3.size();
        int i12 = 0;
        while (i12 < size) {
            d2.f fVar = (d2.f) arrayList3.get(i12);
            float[] fArr = fVar.c;
            float[] fArr2 = fVar.a;
            float f9 = 0.0f;
            for (float f10 : fArr) {
                if (f10 > 0.0f) {
                    f9 += f10;
                }
            }
            if (f9 != 0.0f) {
                int length = fArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    float f11 = fArr[i13];
                    if (f11 > 0.0f) {
                        fArr[i13] = f11 / f9;
                    }
                }
            }
            a0.f fVar2 = (a0.f) cVar3.c;
            List list = (List) cVar3.a;
            int size2 = list.size();
            int i14 = 0;
            d2.e eVar = null;
            float f12 = 0.0f;
            while (i14 < size2) {
                d2.e eVar2 = (d2.e) list.get(i14);
                float[] b10 = eVar2.b();
                float f13 = b10[1];
                float[] fArr3 = fVar.b;
                if (f13 >= fArr2[0] && f13 <= fArr2[2]) {
                    float f14 = b10[2];
                    if (f14 >= fArr3[0] && f14 <= fArr3[2] && !sparseBooleanArray.get(eVar2.d)) {
                        float[] b11 = eVar2.b();
                        d2.e eVar3 = (d2.e) cVar3.e;
                        int i15 = eVar3 != null ? eVar3.e : 1;
                        cVar = cVar3;
                        float[] fArr4 = fVar.c;
                        float f15 = fArr4[0];
                        float abs = f15 > 0.0f ? (1.0f - Math.abs(b11[1] - fArr2[1])) * f15 : 0.0f;
                        float f16 = fArr4[1];
                        float abs2 = f16 > 0.0f ? (1.0f - Math.abs(b11[2] - fArr3[1])) * f16 : 0.0f;
                        float f17 = fArr4[2];
                        float f18 = abs + abs2 + (f17 > 0.0f ? (eVar2.e / i15) * f17 : 0.0f);
                        if (eVar == null || f18 > f12) {
                            eVar = eVar2;
                            f12 = f18;
                        }
                        i14++;
                        cVar3 = cVar;
                    }
                }
                cVar = cVar3;
                i14++;
                cVar3 = cVar;
            }
            d2.c cVar4 = cVar3;
            if (eVar != null) {
                sparseBooleanArray.append(eVar.d, true);
            }
            fVar2.put(fVar, eVar);
            i12++;
            cVar3 = cVar4;
        }
        d2.c cVar5 = cVar3;
        sparseBooleanArray.clear();
        return cVar5;
    }

    public VolumeProvider c() {
        o oVar;
        if (((VolumeProvider) this.e) != null) {
            oVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            oVar = this;
            oVar.e = new y1.e(oVar, this.a, this.b, this.c, (String) this.d);
        } else {
            oVar = this;
            oVar.e = new y1.f(this, oVar.a, oVar.b, oVar.c);
        }
        return (VolumeProvider) oVar.e;
    }

    public void d() {
        this.a = 1;
        this.e = (r) this.d;
        this.c = 0;
    }

    public boolean e() {
        p1.a b10 = ((r) this.e).b.b();
        int a2 = b10.a(6);
        return !(a2 == 0 || ((ByteBuffer) b10.d).get(a2 + b10.a) == 0) || this.b == 65039;
    }
}
