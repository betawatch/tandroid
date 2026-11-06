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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class t2 extends g3 {
    public final /* synthetic */ int r = 0;
    public final r6.a s;

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
    public final Object i(b7.f fVar, Context context) {
        e3 e3Var;
        x8.c eVar;
        int i7 = this.r;
        r6.a aVar = this.s;
        Object obj = null;
        switch (i7) {
            case 0:
                IBinder b10 = fVar.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b10 == null) {
                    e3Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    e3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new e3(b10, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 4);
                }
                if (e3Var != null) {
                    a7.b bVar = new a7.b(context);
                    x1 x1Var = (x1) aVar;
                    q6.m.g(x1Var);
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
                if (b7.f.a(context, "com.google.android.gms.vision.dynamite.face") > b7.f.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b11 = fVar.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i11 = x8.f.a;
                    if (b11 != null) {
                        IInterface queryLocalInterface3 = b11.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar = queryLocalInterface3 instanceof x8.c ? (x8.c) queryLocalInterface3 : new x8.e(b11, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
                        if (eVar != null) {
                            a7.b bVar2 = new a7.b(context);
                            x8.b bVar3 = (x8.b) aVar;
                            q6.m.g(bVar3);
                            x8.e eVar2 = (x8.e) eVar;
                            Parcel H02 = eVar2.H0();
                            int i12 = a.a;
                            H02.writeStrongBinder(bVar2);
                            a.a(H02, bVar3);
                            Parcel Q02 = eVar2.Q0(H02, 1);
                            IBinder readStrongBinder2 = Q02.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                                obj = queryLocalInterface4 instanceof x8.d ? (x8.d) queryLocalInterface4 : new x8.d(readStrongBinder2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 4);
                            }
                            Q02.recycle();
                            break;
                        }
                    }
                    eVar = null;
                    if (eVar != null) {
                    }
                } else {
                    IBinder b12 = fVar.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i13 = x8.f.a;
                    if (b12 != null) {
                        IInterface queryLocalInterface5 = b12.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar = queryLocalInterface5 instanceof x8.c ? (x8.c) queryLocalInterface5 : new x8.e(b12, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
                        if (eVar != null) {
                        }
                    }
                    eVar = null;
                    if (eVar != null) {
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
                    q6.m.g(d3Var);
                    d3Var.S0(d3Var.H0());
                    break;
                }
                break;
            default:
                x8.d dVar = (x8.d) m();
                q6.m.g(dVar);
                dVar.S0(dVar.H0());
                break;
        }
    }

    public w8.a[] n(ByteBuffer byteBuffer, f3 f3Var) {
        w8.c[] cVarArr;
        pb.b[] bVarArr;
        if (!k()) {
            return new w8.a[0];
        }
        try {
            a7.b bVar = new a7.b(byteBuffer);
            x8.d dVar = (x8.d) m();
            q6.m.g(dVar);
            Parcel H0 = dVar.H0();
            int i7 = a.a;
            H0.writeStrongBinder(bVar);
            a.a(H0, f3Var);
            Parcel Q0 = dVar.Q0(H0, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) Q0.createTypedArray(FaceParcel.CREATOR);
            Q0.recycle();
            w8.a[] aVarArr = new w8.a[faceParcelArr.length];
            for (int i10 = 0; i10 < faceParcelArr.length; i10++) {
                FaceParcel faceParcel = faceParcelArr[i10];
                int i11 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    cVarArr = new w8.c[0];
                } else {
                    w8.c[] cVarArr2 = new w8.c[landmarkParcelArr.length];
                    for (int i12 = 0; i12 < landmarkParcelArr.length; i12++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i12];
                        cVarArr2[i12] = new w8.c(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    cVarArr = cVarArr2;
                }
                x8.a[] aVarArr2 = faceParcel.D;
                if (aVarArr2 == null) {
                    bVarArr = new pb.b[0];
                } else {
                    pb.b[] bVarArr2 = new pb.b[aVarArr2.length];
                    for (int i13 = 0; i13 < aVarArr2.length; i13++) {
                        PointF[] pointFArr = aVarArr2[i13].a;
                        bVarArr2[i13] = new pb.b(27);
                    }
                    bVarArr = bVarArr2;
                }
                aVarArr[i10] = new w8.a(i11, cVarArr, bVarArr);
            }
            return aVarArr;
        } catch (RemoteException e10) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e10);
            return new w8.a[0];
        }
    }

    public t2(Context context, x8.b bVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = bVar;
        m();
    }
}
