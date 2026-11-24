// default package

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nu7 {
    public byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nu7(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = (byte) 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (bitmap.isRecycled()) {
            w26.j("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(wtc.f);
        this.b = bitmap;
        arrayList.add(yfb.d);
        arrayList.add(yfb.e);
        arrayList.add(yfb.f);
        arrayList.add(yfb.g);
        arrayList.add(yfb.h);
        arrayList.add(yfb.i);
    }

    public final wtc a() {
        ArrayList arrayList;
        wtc wtcVar;
        ArrayList arrayList2 = (ArrayList) this.d;
        Bitmap bitmap = (Bitmap) this.b;
        int height = bitmap.getHeight() * bitmap.getWidth();
        double sqrt = height > 12544 ? Math.sqrt(12544.0d / height) : -1.0d;
        int i = 0;
        Bitmap createScaledBitmap = sqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * sqrt), (int) Math.ceil(bitmap.getHeight() * sqrt), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        gl2 gl2Var = new gl2(iArr, this.a, arrayList2.isEmpty() ? null : (mu7[]) arrayList2.toArray(new mu7[arrayList2.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) gl2Var.d;
        ArrayList arrayList4 = (ArrayList) this.c;
        wtc wtcVar2 = new wtc();
        wtcVar2.a = arrayList3;
        wtcVar2.c = new SparseBooleanArray();
        wtcVar2.b = new ps(0);
        int size = arrayList3.size();
        int i2 = TLObject.FLAG_31;
        ou7 ou7Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            ou7 ou7Var2 = (ou7) arrayList3.get(i3);
            int i4 = ou7Var2.e;
            if (i4 > i2) {
                ou7Var = ou7Var2;
                i2 = i4;
            }
        }
        wtcVar2.d = ou7Var;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) wtcVar2.c;
        int size2 = arrayList4.size();
        int i5 = 0;
        while (i5 < size2) {
            yfb yfbVar = (yfb) arrayList4.get(i5);
            float[] fArr = yfbVar.c;
            float[] fArr2 = yfbVar.a;
            int length = fArr.length;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i6 = i; i6 < length; i6++) {
                float f3 = fArr[i6];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                int length2 = fArr.length;
                for (int i7 = i; i7 < length2; i7++) {
                    float f4 = fArr[i7];
                    if (f4 > 0.0f) {
                        fArr[i7] = f4 / f2;
                    }
                }
            }
            ps psVar = (ps) wtcVar2.b;
            ArrayList arrayList5 = (ArrayList) wtcVar2.a;
            int size3 = arrayList5.size();
            int i8 = i;
            float f5 = 0.0f;
            ou7 ou7Var3 = null;
            while (i8 < size3) {
                ou7 ou7Var4 = (ou7) arrayList5.get(i8);
                float[] b = ou7Var4.b();
                float f6 = b[1];
                float f7 = f;
                float[] fArr3 = yfbVar.b;
                if (f6 >= fArr2[i8] && f6 <= fArr2[2]) {
                    float f8 = b[2];
                    if (f8 >= fArr3[i8] && f8 <= fArr3[2] && !sparseBooleanArray.get(ou7Var4.d)) {
                        float[] b2 = ou7Var4.b();
                        arrayList = arrayList4;
                        ou7 ou7Var5 = (ou7) wtcVar2.d;
                        int i9 = ou7Var5 != null ? ou7Var5.e : 1;
                        wtcVar = wtcVar2;
                        float[] fArr4 = yfbVar.c;
                        float f9 = fArr4[i8];
                        float abs = f9 > f7 ? (1.0f - Math.abs(b2[1] - fArr2[1])) * f9 : f7;
                        float f10 = fArr4[1];
                        float abs2 = f10 > f7 ? (1.0f - Math.abs(b2[2] - fArr3[1])) * f10 : f7;
                        float f11 = fArr4[2];
                        float f12 = abs + abs2 + (f11 > f7 ? (ou7Var4.e / i9) * f11 : f7);
                        if (ou7Var3 == null || f12 > f5) {
                            ou7Var3 = ou7Var4;
                            f5 = f12;
                        }
                        i8++;
                        f = f7;
                        arrayList4 = arrayList;
                        wtcVar2 = wtcVar;
                    }
                }
                arrayList = arrayList4;
                wtcVar = wtcVar2;
                i8++;
                f = f7;
                arrayList4 = arrayList;
                wtcVar2 = wtcVar;
            }
            ArrayList arrayList6 = arrayList4;
            wtc wtcVar3 = wtcVar2;
            if (ou7Var3 != null) {
                sparseBooleanArray.append(ou7Var3.d, true);
            }
            psVar.put(yfbVar, ou7Var3);
            i5++;
            i = i8;
            arrayList4 = arrayList6;
            wtcVar2 = wtcVar3;
        }
        wtc wtcVar4 = wtcVar2;
        sparseBooleanArray.clear();
        return wtcVar4;
    }

    public final void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        lid lidVar = (lid) this.d;
        if (z) {
            lidVar.E(kk7.m1, 28, qjd.p);
            xgd.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            lidVar.E(95, 28, qjd.p);
            xgd.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nu7(lid lidVar, int i, vs2 vs2Var, Runnable runnable) {
        this.a = i;
        this.b = vs2Var;
        this.c = runnable;
        this.d = lidVar;
    }
}
