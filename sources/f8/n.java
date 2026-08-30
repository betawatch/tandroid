package f8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.d3;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n extends cb.e {
    public final t2 b;

    public n(t2 t2Var) {
        super(2);
        this.b = t2Var;
    }

    @Override // cb.e
    public final void J() {
        super.J();
        this.b.l();
    }

    public final SparseArray L(androidx.biometric.e eVar) {
        m[] mVarArr;
        if (eVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        f3 e = f3.e(eVar);
        Bitmap bitmap = (Bitmap) eVar.d;
        t2 t2Var = this.b;
        if (bitmap != null) {
            if (t2Var.k()) {
                try {
                    l6.b bVar = new l6.b(bitmap);
                    d3 d3Var = (d3) t2Var.m();
                    b6.m.h(d3Var);
                    Parcel E0 = d3Var.E0();
                    int i10 = com.google.android.gms.internal.vision.a.a;
                    E0.writeStrongBinder(bVar);
                    com.google.android.gms.internal.vision.a.a(E0, e);
                    Parcel N0 = d3Var.N0(E0, 2);
                    m[] mVarArr2 = (m[]) N0.createTypedArray(m.CREATOR);
                    N0.recycle();
                    mVarArr = mVarArr2;
                } catch (RemoteException e6) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e6);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
            if (mVarArr == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer s6 = eVar.s();
            b6.m.h(s6);
            if (t2Var.k()) {
                try {
                    l6.b bVar2 = new l6.b(s6);
                    d3 d3Var2 = (d3) t2Var.m();
                    b6.m.h(d3Var2);
                    Parcel E02 = d3Var2.E0();
                    int i11 = com.google.android.gms.internal.vision.a.a;
                    E02.writeStrongBinder(bVar2);
                    com.google.android.gms.internal.vision.a.a(E02, e);
                    Parcel N02 = d3Var2.N0(E02, 1);
                    m[] mVarArr3 = (m[]) N02.createTypedArray(m.CREATOR);
                    N02.recycle();
                    mVarArr = mVarArr3;
                } catch (RemoteException e10) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
        }
        SparseArray sparseArray = new SparseArray(mVarArr.length);
        for (m mVar : mVarArr) {
            sparseArray.append(mVar.b.hashCode(), mVar);
        }
        return sparseArray;
    }
}
