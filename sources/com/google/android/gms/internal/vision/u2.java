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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u2 extends h3 {
    public final /* synthetic */ int r = 0;
    public final o6.a s;

    public u2(Context context, x1 x1Var) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = x1Var;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // com.google.android.gms.internal.vision.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(y6.e eVar, Context context) {
        f3 f3Var;
        IInterface eVar2;
        int i10 = this.r;
        o6.a aVar = this.s;
        Object obj = null;
        switch (i10) {
            case 0:
                IBinder b10 = eVar.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b10 == null) {
                    f3Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    f3Var = queryLocalInterface instanceof f3 ? (f3) queryLocalInterface : new f3(b10, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 3);
                }
                if (f3Var != null) {
                    x6.b bVar = new x6.b(context);
                    x1 x1Var = (x1) aVar;
                    n6.l.h(x1Var);
                    Parcel F0 = f3Var.F0();
                    int i11 = a.a;
                    F0.writeStrongBinder(bVar);
                    a.a(F0, x1Var);
                    Parcel O0 = f3Var.O0(F0, 1);
                    IBinder readStrongBinder = O0.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface2 instanceof e3 ? (e3) queryLocalInterface2 : new e3(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 3);
                    }
                    O0.recycle();
                    break;
                }
                break;
            default:
                if (y6.e.a(context, "com.google.android.gms.vision.dynamite.face") > y6.e.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b11 = eVar.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i12 = u8.f.a;
                    if (b11 != null) {
                        IInterface queryLocalInterface3 = b11.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface3 instanceof u8.c ? (u8.c) queryLocalInterface3 : new u8.e(b11, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 3);
                        if (eVar2 != null) {
                            x6.b bVar2 = new x6.b(context);
                            u8.b bVar3 = (u8.b) aVar;
                            n6.l.h(bVar3);
                            u8.e eVar3 = (u8.e) eVar2;
                            Parcel F02 = eVar3.F0();
                            int i13 = a.a;
                            F02.writeStrongBinder(bVar2);
                            a.a(F02, bVar3);
                            Parcel O02 = eVar3.O0(F02, 1);
                            IBinder readStrongBinder2 = O02.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                                obj = queryLocalInterface4 instanceof u8.d ? (u8.d) queryLocalInterface4 : new u8.d(readStrongBinder2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 3);
                            }
                            O02.recycle();
                            break;
                        }
                    }
                    eVar2 = null;
                    if (eVar2 != null) {
                    }
                } else {
                    IBinder b12 = eVar.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i14 = u8.f.a;
                    if (b12 != null) {
                        IInterface queryLocalInterface5 = b12.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface5 instanceof u8.c ? (u8.c) queryLocalInterface5 : new u8.e(b12, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 3);
                        if (eVar2 != null) {
                        }
                    }
                    eVar2 = null;
                    if (eVar2 != null) {
                    }
                }
                break;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.h3
    public final void j() {
        switch (this.r) {
            case 0:
                if (k()) {
                    e3 e3Var = (e3) m();
                    n6.l.h(e3Var);
                    e3Var.Q0(e3Var.F0());
                    break;
                }
                break;
            default:
                u8.d dVar = (u8.d) m();
                n6.l.h(dVar);
                dVar.Q0(dVar.F0());
                break;
        }
    }

    public t8.a[] n(ByteBuffer byteBuffer, g3 g3Var) {
        t8.d[] dVarArr;
        na.d[] dVarArr2;
        if (!k()) {
            return new t8.a[0];
        }
        try {
            x6.b bVar = new x6.b(byteBuffer);
            u8.d dVar = (u8.d) m();
            n6.l.h(dVar);
            Parcel F0 = dVar.F0();
            int i10 = a.a;
            F0.writeStrongBinder(bVar);
            a.a(F0, g3Var);
            Parcel O0 = dVar.O0(F0, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) O0.createTypedArray(FaceParcel.CREATOR);
            O0.recycle();
            t8.a[] aVarArr = new t8.a[faceParcelArr.length];
            for (int i11 = 0; i11 < faceParcelArr.length; i11++) {
                FaceParcel faceParcel = faceParcelArr[i11];
                int i12 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    dVarArr = new t8.d[0];
                } else {
                    t8.d[] dVarArr3 = new t8.d[landmarkParcelArr.length];
                    for (int i13 = 0; i13 < landmarkParcelArr.length; i13++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i13];
                        dVarArr3[i13] = new t8.d(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    dVarArr = dVarArr3;
                }
                u8.a[] aVarArr2 = faceParcel.y;
                if (aVarArr2 == null) {
                    dVarArr2 = new na.d[0];
                } else {
                    na.d[] dVarArr4 = new na.d[aVarArr2.length];
                    for (int i14 = 0; i14 < aVarArr2.length; i14++) {
                        PointF[] pointFArr = aVarArr2[i14].a;
                        dVarArr4[i14] = new na.d(23);
                    }
                    dVarArr2 = dVarArr4;
                }
                aVarArr[i11] = new t8.a(i12, dVarArr, dVarArr2);
            }
            return aVarArr;
        } catch (RemoteException e7) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e7);
            return new t8.a[0];
        }
    }

    public u2(Context context, u8.b bVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = bVar;
        m();
    }
}
