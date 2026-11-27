// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class cgd extends bw6 {
    public final /* synthetic */ byte r = 0;
    public final c4 s;

    public cgd(Context context, i3e i3eVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = i3eVar;
        m();
    }

    @Override // bw6
    public final Object i(vs3 vs3Var, Context context) {
        jme sweVar;
        acf acfVar;
        byte b = this.r;
        c4 c4Var = this.s;
        Object obj = null;
        switch (b) {
            case 0:
                if (vs3.a(context, "com.google.android.gms.vision.dynamite.face") > vs3.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b2 = vs3Var.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i = c1f.a;
                    if (b2 != null) {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        sweVar = queryLocalInterface instanceof jme ? (jme) queryLocalInterface : new swe(b2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                    }
                    sweVar = null;
                } else {
                    IBinder b3 = vs3Var.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i2 = c1f.a;
                    if (b3 != null) {
                        IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        sweVar = queryLocalInterface2 instanceof jme ? (jme) queryLocalInterface2 : new swe(b3, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                    }
                    sweVar = null;
                }
                if (sweVar != null) {
                    br7 br7Var = new br7(context);
                    i3e i3eVar = (i3e) c4Var;
                    xve.h(i3eVar);
                    swe sweVar2 = (swe) sweVar;
                    Parcel a = sweVar2.a();
                    int i3 = urd.a;
                    a.writeStrongBinder(br7Var);
                    urd.a(a, i3eVar);
                    Parcel S = sweVar2.S(a, 1);
                    IBinder readStrongBinder = S.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface3 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                        obj = queryLocalInterface3 instanceof lre ? (lre) queryLocalInterface3 : new lre(readStrongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", (byte) 11);
                    }
                    S.recycle();
                    break;
                }
                break;
            default:
                IBinder b4 = vs3Var.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b4 == null) {
                    acfVar = null;
                } else {
                    IInterface queryLocalInterface4 = b4.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    acfVar = queryLocalInterface4 instanceof acf ? (acf) queryLocalInterface4 : new acf(b4, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", (byte) 11);
                }
                if (acfVar != null) {
                    br7 br7Var2 = new br7(context);
                    qwe qweVar = (qwe) c4Var;
                    xve.h(qweVar);
                    Parcel a2 = acfVar.a();
                    int i4 = urd.a;
                    a2.writeStrongBinder(br7Var2);
                    urd.a(a2, qweVar);
                    Parcel S2 = acfVar.S(a2, 1);
                    IBinder readStrongBinder2 = S2.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface5 instanceof q9f ? (q9f) queryLocalInterface5 : new q9f(readStrongBinder2, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", (byte) 11);
                    }
                    S2.recycle();
                    break;
                }
                break;
        }
        return obj;
    }

    @Override // bw6
    public final void j() {
        switch (this.r) {
            case 0:
                lre lreVar = (lre) m();
                xve.h(lreVar);
                lreVar.U(lreVar.a());
                break;
            default:
                if (k()) {
                    q9f q9fVar = (q9f) m();
                    xve.h(q9fVar);
                    q9fVar.U(q9fVar.a());
                    break;
                }
                break;
        }
    }

    public final i84[] n(ByteBuffer byteBuffer, lhf lhfVar) {
        bz5[] bz5VarArr;
        uif[] uifVarArr;
        if (!k()) {
            return new i84[0];
        }
        try {
            br7 br7Var = new br7(byteBuffer);
            lre lreVar = (lre) m();
            xve.h(lreVar);
            Parcel a = lreVar.a();
            int i = urd.a;
            a.writeStrongBinder(br7Var);
            urd.a(a, lhfVar);
            Parcel S = lreVar.S(a, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) S.createTypedArray(FaceParcel.CREATOR);
            S.recycle();
            i84[] i84VarArr = new i84[faceParcelArr.length];
            for (int i2 = 0; i2 < faceParcelArr.length; i2++) {
                FaceParcel faceParcel = faceParcelArr[i2];
                int i3 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    bz5VarArr = new bz5[0];
                } else {
                    bz5[] bz5VarArr2 = new bz5[landmarkParcelArr.length];
                    for (int i4 = 0; i4 < landmarkParcelArr.length; i4++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i4];
                        bz5VarArr2[i4] = new bz5(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    bz5VarArr = bz5VarArr2;
                }
                n9d[] n9dVarArr = faceParcel.E;
                if (n9dVarArr == null) {
                    uifVarArr = new uif[0];
                } else {
                    uif[] uifVarArr2 = new uif[n9dVarArr.length];
                    for (int i5 = 0; i5 < n9dVarArr.length; i5++) {
                        PointF[] pointFArr = n9dVarArr[i5].a;
                        uifVarArr2[i5] = new uif((byte) 15);
                    }
                    uifVarArr = uifVarArr2;
                }
                i84VarArr[i2] = new i84(i3, bz5VarArr, uifVarArr);
            }
            return i84VarArr;
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new i84[0];
        }
    }

    public cgd(Context context, qwe qweVar) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = qweVar;
        m();
    }
}
