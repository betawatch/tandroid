package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.d3;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends b8.a {
    public final t2 b;

    public n(t2 t2Var) {
        super(0);
        this.b = t2Var;
    }

    @Override // b8.a
    public final void N() {
        super.N();
        this.b.l();
    }

    public final SparseArray Q(a5.n nVar) {
        m[] mVarArr;
        if (nVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        f3 b10 = f3.b(nVar);
        Bitmap bitmap = (Bitmap) nVar.d;
        t2 t2Var = this.b;
        if (bitmap != null) {
            if (t2Var.k()) {
                try {
                    i6.b bVar = new i6.b(bitmap);
                    d3 d3Var = (d3) t2Var.m();
                    y5.l.h(d3Var);
                    Parcel E0 = d3Var.E0();
                    int i10 = com.google.android.gms.internal.vision.a.a;
                    E0.writeStrongBinder(bVar);
                    com.google.android.gms.internal.vision.a.a(E0, b10);
                    Parcel N0 = d3Var.N0(E0, 2);
                    m[] mVarArr2 = (m[]) N0.createTypedArray(m.CREATOR);
                    N0.recycle();
                    mVarArr = mVarArr2;
                } catch (RemoteException e9) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e9);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
            if (mVarArr == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer q6 = nVar.q();
            y5.l.h(q6);
            if (t2Var.k()) {
                try {
                    i6.b bVar2 = new i6.b(q6);
                    d3 d3Var2 = (d3) t2Var.m();
                    y5.l.h(d3Var2);
                    Parcel E02 = d3Var2.E0();
                    int i11 = com.google.android.gms.internal.vision.a.a;
                    E02.writeStrongBinder(bVar2);
                    com.google.android.gms.internal.vision.a.a(E02, b10);
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
