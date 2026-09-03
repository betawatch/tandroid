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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t2 extends c2.t {
    public final /* synthetic */ int r = 0;
    public final c6.a s;

    public t2(Context context, x1 x1Var) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = x1Var;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // c2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(m6.e eVar, Context context) {
        e3 e3Var;
        i8.c eVar2;
        int i10 = this.r;
        c6.a aVar = this.s;
        Object obj = null;
        switch (i10) {
            case 0:
                IBinder b10 = eVar.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b10 == null) {
                    e3Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    e3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new e3(b10, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 3);
                }
                if (e3Var != null) {
                    l6.b bVar = new l6.b(context);
                    x1 x1Var = (x1) aVar;
                    b6.m.h(x1Var);
                    Parcel E0 = e3Var.E0();
                    int i11 = a.a;
                    E0.writeStrongBinder(bVar);
                    a.a(E0, x1Var);
                    Parcel N0 = e3Var.N0(E0, 1);
                    IBinder readStrongBinder = N0.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface2 instanceof d3 ? (d3) queryLocalInterface2 : new d3(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 3);
                    }
                    N0.recycle();
                    break;
                }
                break;
            default:
                if (m6.e.a(context, "com.google.android.gms.vision.dynamite.face") > m6.e.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b11 = eVar.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i12 = i8.f.a;
                    if (b11 != null) {
                        IInterface queryLocalInterface3 = b11.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface3 instanceof i8.c ? (i8.c) queryLocalInterface3 : new i8.e(b11, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 3);
                        if (eVar2 != null) {
                            l6.b bVar2 = new l6.b(context);
                            i8.b bVar3 = (i8.b) aVar;
                            b6.m.h(bVar3);
                            i8.e eVar3 = (i8.e) eVar2;
                            Parcel E02 = eVar3.E0();
                            int i13 = a.a;
                            E02.writeStrongBinder(bVar2);
                            a.a(E02, bVar3);
                            Parcel N02 = eVar3.N0(E02, 1);
                            IBinder readStrongBinder2 = N02.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                                obj = queryLocalInterface4 instanceof i8.d ? (i8.d) queryLocalInterface4 : new i8.d(readStrongBinder2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 3);
                            }
                            N02.recycle();
                            break;
                        }
                    }
                    eVar2 = null;
                    if (eVar2 != null) {
                    }
                } else {
                    IBinder b12 = eVar.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i14 = i8.f.a;
                    if (b12 != null) {
                        IInterface queryLocalInterface5 = b12.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface5 instanceof i8.c ? (i8.c) queryLocalInterface5 : new i8.e(b12, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 3);
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

    @Override // c2.t
    public final void j() {
        switch (this.r) {
            case 0:
                if (k()) {
                    d3 d3Var = (d3) m();
                    b6.m.h(d3Var);
                    d3Var.P0(d3Var.E0());
                    break;
                }
                break;
            default:
                i8.d dVar = (i8.d) m();
                b6.m.h(dVar);
                dVar.P0(dVar.E0());
                break;
        }
    }

    public h8.a[] n(ByteBuffer byteBuffer, f3 f3Var) {
        h8.d[] dVarArr;
        cb.b[] bVarArr;
        if (!k()) {
            return new h8.a[0];
        }
        try {
            l6.b bVar = new l6.b(byteBuffer);
            i8.d dVar = (i8.d) m();
            b6.m.h(dVar);
            Parcel E0 = dVar.E0();
            int i10 = a.a;
            E0.writeStrongBinder(bVar);
            a.a(E0, f3Var);
            Parcel N0 = dVar.N0(E0, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) N0.createTypedArray(FaceParcel.CREATOR);
            N0.recycle();
            h8.a[] aVarArr = new h8.a[faceParcelArr.length];
            for (int i11 = 0; i11 < faceParcelArr.length; i11++) {
                FaceParcel faceParcel = faceParcelArr[i11];
                int i12 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    dVarArr = new h8.d[0];
                } else {
                    h8.d[] dVarArr2 = new h8.d[landmarkParcelArr.length];
                    for (int i13 = 0; i13 < landmarkParcelArr.length; i13++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i13];
                        dVarArr2[i13] = new h8.d(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    dVarArr = dVarArr2;
                }
                i8.a[] aVarArr2 = faceParcel.y;
                if (aVarArr2 == null) {
                    bVarArr = new cb.b[0];
                } else {
                    cb.b[] bVarArr2 = new cb.b[aVarArr2.length];
                    for (int i14 = 0; i14 < aVarArr2.length; i14++) {
                        PointF[] pointFArr = aVarArr2[i14].a;
                        bVarArr2[i14] = new cb.b(8);
                    }
                    bVarArr = bVarArr2;
                }
                aVarArr[i11] = new h8.a(i12, dVarArr, bVarArr);
            }
            return aVarArr;
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new h8.a[0];
        }
    }

    public t2(Context context, i8.b bVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = bVar;
        m();
    }
}
