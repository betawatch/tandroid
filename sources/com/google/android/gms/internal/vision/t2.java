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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t2 extends c2.t {
    public final /* synthetic */ int r = 0;
    public final a6.a s;

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
    public final Object i(k6.e eVar, Context context) {
        e3 e3Var;
        IInterface fVar;
        int i10 = this.r;
        a6.a aVar = this.s;
        Object obj = null;
        switch (i10) {
            case 0:
                IBinder b10 = eVar.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b10 == null) {
                    e3Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    e3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new e3(b10, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 2);
                }
                if (e3Var != null) {
                    j6.b bVar = new j6.b(context);
                    x1 x1Var = (x1) aVar;
                    z5.l.h(x1Var);
                    Parcel E0 = e3Var.E0();
                    int i11 = a.a;
                    E0.writeStrongBinder(bVar);
                    a.a(E0, x1Var);
                    Parcel N0 = e3Var.N0(E0, 1);
                    IBinder readStrongBinder = N0.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface2 instanceof d3 ? (d3) queryLocalInterface2 : new d3(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 2);
                    }
                    N0.recycle();
                    break;
                }
                break;
            default:
                if (k6.e.a(context, "com.google.android.gms.vision.dynamite.face") > k6.e.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b11 = eVar.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i12 = g8.g.a;
                    if (b11 != null) {
                        IInterface queryLocalInterface3 = b11.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        fVar = queryLocalInterface3 instanceof g8.d ? (g8.d) queryLocalInterface3 : new g8.f(b11, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 2);
                        if (fVar != null) {
                            j6.b bVar2 = new j6.b(context);
                            g8.c cVar = (g8.c) aVar;
                            z5.l.h(cVar);
                            g8.f fVar2 = (g8.f) fVar;
                            Parcel E02 = fVar2.E0();
                            int i13 = a.a;
                            E02.writeStrongBinder(bVar2);
                            a.a(E02, cVar);
                            Parcel N02 = fVar2.N0(E02, 1);
                            IBinder readStrongBinder2 = N02.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                                obj = queryLocalInterface4 instanceof g8.e ? (g8.e) queryLocalInterface4 : new g8.e(readStrongBinder2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 2);
                            }
                            N02.recycle();
                            break;
                        }
                    }
                    fVar = null;
                    if (fVar != null) {
                    }
                } else {
                    IBinder b12 = eVar.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i14 = g8.g.a;
                    if (b12 != null) {
                        IInterface queryLocalInterface5 = b12.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        fVar = queryLocalInterface5 instanceof g8.d ? (g8.d) queryLocalInterface5 : new g8.f(b12, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 2);
                        if (fVar != null) {
                        }
                    }
                    fVar = null;
                    if (fVar != null) {
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
                    z5.l.h(d3Var);
                    d3Var.P0(d3Var.E0());
                    break;
                }
                break;
            default:
                g8.e eVar = (g8.e) m();
                z5.l.h(eVar);
                eVar.P0(eVar.E0());
                break;
        }
    }

    public f8.a[] n(ByteBuffer byteBuffer, f3 f3Var) {
        f8.d[] dVarArr;
        ab.b[] bVarArr;
        if (!k()) {
            return new f8.a[0];
        }
        try {
            j6.b bVar = new j6.b(byteBuffer);
            g8.e eVar = (g8.e) m();
            z5.l.h(eVar);
            Parcel E0 = eVar.E0();
            int i10 = a.a;
            E0.writeStrongBinder(bVar);
            a.a(E0, f3Var);
            Parcel N0 = eVar.N0(E0, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) N0.createTypedArray(FaceParcel.CREATOR);
            N0.recycle();
            f8.a[] aVarArr = new f8.a[faceParcelArr.length];
            for (int i11 = 0; i11 < faceParcelArr.length; i11++) {
                FaceParcel faceParcel = faceParcelArr[i11];
                int i12 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    dVarArr = new f8.d[0];
                } else {
                    f8.d[] dVarArr2 = new f8.d[landmarkParcelArr.length];
                    for (int i13 = 0; i13 < landmarkParcelArr.length; i13++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i13];
                        dVarArr2[i13] = new f8.d(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    dVarArr = dVarArr2;
                }
                g8.a[] aVarArr2 = faceParcel.y;
                if (aVarArr2 == null) {
                    bVarArr = new ab.b[0];
                } else {
                    ab.b[] bVarArr2 = new ab.b[aVarArr2.length];
                    for (int i14 = 0; i14 < aVarArr2.length; i14++) {
                        PointF[] pointFArr = aVarArr2[i14].a;
                        bVarArr2[i14] = new ab.b(7);
                    }
                    bVarArr = bVarArr2;
                }
                aVarArr[i11] = new f8.a(i12, dVarArr, bVarArr);
            }
            return aVarArr;
        } catch (RemoteException e10) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e10);
            return new f8.a[0];
        }
    }

    public t2(Context context, g8.c cVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = cVar;
        m();
    }
}
