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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t2 extends c2.s {
    public final /* synthetic */ int r = 0;
    public final y5.a s;

    public t2(Context context, x1 x1Var) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = x1Var;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // c2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(i6.e eVar, Context context) {
        e3 e3Var;
        e8.c eVar2;
        int i9 = this.r;
        y5.a aVar = this.s;
        Object obj = null;
        switch (i9) {
            case 0:
                IBinder b10 = eVar.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b10 == null) {
                    e3Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    e3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new e3(b10, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 4);
                }
                if (e3Var != null) {
                    h6.b bVar = new h6.b(context);
                    x1 x1Var = (x1) aVar;
                    x5.l.h(x1Var);
                    Parcel E0 = e3Var.E0();
                    int i10 = a.a;
                    E0.writeStrongBinder(bVar);
                    a.a(E0, x1Var);
                    Parcel N0 = e3Var.N0(E0, 1);
                    IBinder readStrongBinder = N0.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface2 instanceof d3 ? (d3) queryLocalInterface2 : new d3(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 4);
                    }
                    N0.recycle();
                    break;
                }
                break;
            default:
                if (i6.e.a(context, "com.google.android.gms.vision.dynamite.face") > i6.e.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b11 = eVar.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i11 = e8.f.a;
                    if (b11 != null) {
                        IInterface queryLocalInterface3 = b11.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface3 instanceof e8.c ? (e8.c) queryLocalInterface3 : new e8.e(b11, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
                        if (eVar2 != null) {
                            h6.b bVar2 = new h6.b(context);
                            e8.b bVar3 = (e8.b) aVar;
                            x5.l.h(bVar3);
                            e8.e eVar3 = (e8.e) eVar2;
                            Parcel E02 = eVar3.E0();
                            int i12 = a.a;
                            E02.writeStrongBinder(bVar2);
                            a.a(E02, bVar3);
                            Parcel N02 = eVar3.N0(E02, 1);
                            IBinder readStrongBinder2 = N02.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                                obj = queryLocalInterface4 instanceof e8.d ? (e8.d) queryLocalInterface4 : new e8.d(readStrongBinder2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 4);
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
                    int i13 = e8.f.a;
                    if (b12 != null) {
                        IInterface queryLocalInterface5 = b12.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface5 instanceof e8.c ? (e8.c) queryLocalInterface5 : new e8.e(b12, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
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

    @Override // c2.s
    public final void j() {
        switch (this.r) {
            case 0:
                if (k()) {
                    d3 d3Var = (d3) m();
                    x5.l.h(d3Var);
                    d3Var.P0(d3Var.E0());
                    break;
                }
                break;
            default:
                e8.d dVar = (e8.d) m();
                x5.l.h(dVar);
                dVar.P0(dVar.E0());
                break;
        }
    }

    public d8.a[] n(ByteBuffer byteBuffer, f3 f3Var) {
        d8.d[] dVarArr;
        d7.u[] uVarArr;
        if (!k()) {
            return new d8.a[0];
        }
        try {
            h6.b bVar = new h6.b(byteBuffer);
            e8.d dVar = (e8.d) m();
            x5.l.h(dVar);
            Parcel E0 = dVar.E0();
            int i9 = a.a;
            E0.writeStrongBinder(bVar);
            a.a(E0, f3Var);
            Parcel N0 = dVar.N0(E0, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) N0.createTypedArray(FaceParcel.CREATOR);
            N0.recycle();
            d8.a[] aVarArr = new d8.a[faceParcelArr.length];
            for (int i10 = 0; i10 < faceParcelArr.length; i10++) {
                FaceParcel faceParcel = faceParcelArr[i10];
                int i11 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    dVarArr = new d8.d[0];
                } else {
                    d8.d[] dVarArr2 = new d8.d[landmarkParcelArr.length];
                    for (int i12 = 0; i12 < landmarkParcelArr.length; i12++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i12];
                        dVarArr2[i12] = new d8.d(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    dVarArr = dVarArr2;
                }
                e8.a[] aVarArr2 = faceParcel.y;
                if (aVarArr2 == null) {
                    uVarArr = new d7.u[0];
                } else {
                    d7.u[] uVarArr2 = new d7.u[aVarArr2.length];
                    for (int i13 = 0; i13 < aVarArr2.length; i13++) {
                        PointF[] pointFArr = aVarArr2[i13].a;
                        uVarArr2[i13] = new d7.u(5);
                    }
                    uVarArr = uVarArr2;
                }
                aVarArr[i10] = new d8.a(i11, dVarArr, uVarArr);
            }
            return aVarArr;
        } catch (RemoteException e10) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e10);
            return new d8.a[0];
        }
    }

    public t2(Context context, e8.b bVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = bVar;
        m();
    }
}
