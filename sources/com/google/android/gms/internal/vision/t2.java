package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.PointF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t2 extends g3 {
    public final /* synthetic */ int r = 0;
    public final q6.a s;

    public t2(Context context, x1 x1Var) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = x1Var;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // com.google.android.gms.internal.vision.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(a7.f fVar, Context context) {
        e3 e3Var;
        w8.d fVar2;
        int i3 = this.r;
        q6.a aVar = this.s;
        Object obj = null;
        switch (i3) {
            case 0:
                IBinder b10 = fVar.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b10 == null) {
                    e3Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    e3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new e3(b10, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 4);
                }
                if (e3Var != null) {
                    z6.b bVar = new z6.b(context);
                    x1 x1Var = (x1) aVar;
                    p6.m.g(x1Var);
                    Parcel H0 = e3Var.H0();
                    int i10 = a.a;
                    H0.writeStrongBinder(bVar);
                    a.a(H0, x1Var);
                    Parcel Q0 = e3Var.Q0(H0, 1);
                    IBinder readStrongBinder = Q0.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface2 instanceof d3 ? (d3) queryLocalInterface2 : new d3(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 4);
                    }
                    Q0.recycle();
                    break;
                }
                break;
            default:
                if (a7.f.a(context, "com.google.android.gms.vision.dynamite.face") > a7.f.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b11 = fVar.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i11 = w8.g.a;
                    if (b11 != null) {
                        IInterface queryLocalInterface3 = b11.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        fVar2 = queryLocalInterface3 instanceof w8.d ? (w8.d) queryLocalInterface3 : new w8.f(b11, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
                        if (fVar2 != null) {
                            z6.b bVar2 = new z6.b(context);
                            w8.c cVar = (w8.c) aVar;
                            p6.m.g(cVar);
                            w8.f fVar3 = (w8.f) fVar2;
                            Parcel H02 = fVar3.H0();
                            int i12 = a.a;
                            H02.writeStrongBinder(bVar2);
                            a.a(H02, cVar);
                            Parcel Q02 = fVar3.Q0(H02, 1);
                            IBinder readStrongBinder2 = Q02.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                                obj = queryLocalInterface4 instanceof w8.e ? (w8.e) queryLocalInterface4 : new w8.e(readStrongBinder2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 4);
                            }
                            Q02.recycle();
                            break;
                        }
                    }
                    fVar2 = null;
                    if (fVar2 != null) {
                    }
                } else {
                    IBinder b12 = fVar.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i13 = w8.g.a;
                    if (b12 != null) {
                        IInterface queryLocalInterface5 = b12.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        fVar2 = queryLocalInterface5 instanceof w8.d ? (w8.d) queryLocalInterface5 : new w8.f(b12, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
                        if (fVar2 != null) {
                        }
                    }
                    fVar2 = null;
                    if (fVar2 != null) {
                    }
                }
                break;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final void j() {
        switch (this.r) {
            case 0:
                if (k()) {
                    d3 d3Var = (d3) m();
                    p6.m.g(d3Var);
                    d3Var.S0(d3Var.H0());
                    break;
                }
                break;
            default:
                w8.e eVar = (w8.e) m();
                p6.m.g(eVar);
                eVar.S0(eVar.H0());
                break;
        }
    }

    public v8.a[] n(ByteBuffer byteBuffer, f3 f3Var) {
        v8.c[] cVarArr;
        v7.s[] sVarArr;
        if (!k()) {
            return new v8.a[0];
        }
        try {
            z6.b bVar = new z6.b(byteBuffer);
            w8.e eVar = (w8.e) m();
            p6.m.g(eVar);
            Parcel H0 = eVar.H0();
            int i3 = a.a;
            H0.writeStrongBinder(bVar);
            a.a(H0, f3Var);
            Parcel Q0 = eVar.Q0(H0, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) Q0.createTypedArray(FaceParcel.CREATOR);
            Q0.recycle();
            v8.a[] aVarArr = new v8.a[faceParcelArr.length];
            for (int i10 = 0; i10 < faceParcelArr.length; i10++) {
                FaceParcel faceParcel = faceParcelArr[i10];
                int i11 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    cVarArr = new v8.c[0];
                } else {
                    v8.c[] cVarArr2 = new v8.c[landmarkParcelArr.length];
                    for (int i12 = 0; i12 < landmarkParcelArr.length; i12++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i12];
                        cVarArr2[i12] = new v8.c(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    cVarArr = cVarArr2;
                }
                w8.a[] aVarArr2 = faceParcel.E;
                if (aVarArr2 == null) {
                    sVarArr = new v7.s[0];
                } else {
                    v7.s[] sVarArr2 = new v7.s[aVarArr2.length];
                    for (int i13 = 0; i13 < aVarArr2.length; i13++) {
                        PointF[] pointFArr = aVarArr2[i13].a;
                        sVarArr2[i13] = new v7.s(25);
                    }
                    sVarArr = sVarArr2;
                }
                aVarArr[i10] = new v8.a(i11, cVarArr, sVarArr);
            }
            return aVarArr;
        } catch (RemoteException e10) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e10);
            return new v8.a[0];
        }
    }

    public t2(Context context, w8.c cVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = cVar;
        m();
    }
}
