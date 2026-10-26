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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t2 extends g3 {
    public final /* synthetic */ int r = 0;
    public final p6.a s;

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
    public final Object i(z6.e eVar, Context context) {
        e3 e3Var;
        v8.c eVar2;
        int i10 = this.r;
        p6.a aVar = this.s;
        Object obj = null;
        switch (i10) {
            case 0:
                IBinder b10 = eVar.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b10 == null) {
                    e3Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    e3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new e3(b10, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 4);
                }
                if (e3Var != null) {
                    y6.b bVar = new y6.b(context);
                    x1 x1Var = (x1) aVar;
                    o6.l.h(x1Var);
                    Parcel F0 = e3Var.F0();
                    int i11 = a.a;
                    F0.writeStrongBinder(bVar);
                    a.a(F0, x1Var);
                    Parcel O0 = e3Var.O0(F0, 1);
                    IBinder readStrongBinder = O0.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface2 instanceof d3 ? (d3) queryLocalInterface2 : new d3(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 4);
                    }
                    O0.recycle();
                    break;
                }
                break;
            default:
                if (z6.e.a(context, "com.google.android.gms.vision.dynamite.face") > z6.e.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b11 = eVar.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i12 = v8.f.a;
                    if (b11 != null) {
                        IInterface queryLocalInterface3 = b11.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface3 instanceof v8.c ? (v8.c) queryLocalInterface3 : new v8.e(b11, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
                        if (eVar2 != null) {
                            y6.b bVar2 = new y6.b(context);
                            v8.b bVar3 = (v8.b) aVar;
                            o6.l.h(bVar3);
                            v8.e eVar3 = (v8.e) eVar2;
                            Parcel F02 = eVar3.F0();
                            int i13 = a.a;
                            F02.writeStrongBinder(bVar2);
                            a.a(F02, bVar3);
                            Parcel O02 = eVar3.O0(F02, 1);
                            IBinder readStrongBinder2 = O02.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                                obj = queryLocalInterface4 instanceof v8.d ? (v8.d) queryLocalInterface4 : new v8.d(readStrongBinder2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 4);
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
                    int i14 = v8.f.a;
                    if (b12 != null) {
                        IInterface queryLocalInterface5 = b12.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eVar2 = queryLocalInterface5 instanceof v8.c ? (v8.c) queryLocalInterface5 : new v8.e(b12, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 4);
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

    @Override // com.google.android.gms.internal.vision.g3
    public final void j() {
        switch (this.r) {
            case 0:
                if (k()) {
                    d3 d3Var = (d3) m();
                    o6.l.h(d3Var);
                    d3Var.Q0(d3Var.F0());
                    break;
                }
                break;
            default:
                v8.d dVar = (v8.d) m();
                o6.l.h(dVar);
                dVar.Q0(dVar.F0());
                break;
        }
    }

    public u8.a[] n(ByteBuffer byteBuffer, f3 f3Var) {
        u8.c[] cVarArr;
        sb.b[] bVarArr;
        if (!k()) {
            return new u8.a[0];
        }
        try {
            y6.b bVar = new y6.b(byteBuffer);
            v8.d dVar = (v8.d) m();
            o6.l.h(dVar);
            Parcel F0 = dVar.F0();
            int i10 = a.a;
            F0.writeStrongBinder(bVar);
            a.a(F0, f3Var);
            Parcel O0 = dVar.O0(F0, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) O0.createTypedArray(FaceParcel.CREATOR);
            O0.recycle();
            u8.a[] aVarArr = new u8.a[faceParcelArr.length];
            for (int i11 = 0; i11 < faceParcelArr.length; i11++) {
                FaceParcel faceParcel = faceParcelArr[i11];
                int i12 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    cVarArr = new u8.c[0];
                } else {
                    u8.c[] cVarArr2 = new u8.c[landmarkParcelArr.length];
                    for (int i13 = 0; i13 < landmarkParcelArr.length; i13++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i13];
                        cVarArr2[i13] = new u8.c(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    cVarArr = cVarArr2;
                }
                v8.a[] aVarArr2 = faceParcel.y;
                if (aVarArr2 == null) {
                    bVarArr = new sb.b[0];
                } else {
                    sb.b[] bVarArr2 = new sb.b[aVarArr2.length];
                    for (int i14 = 0; i14 < aVarArr2.length; i14++) {
                        PointF[] pointFArr = aVarArr2[i14].a;
                        bVarArr2[i14] = new sb.b(23);
                    }
                    bVarArr = bVarArr2;
                }
                aVarArr[i11] = new u8.a(i12, cVarArr, bVarArr);
            }
            return aVarArr;
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new u8.a[0];
        }
    }

    public t2(Context context, v8.b bVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = bVar;
        m();
    }
}
