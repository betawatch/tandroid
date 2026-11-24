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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ldd extends wv6 {
    public final /* synthetic */ byte r = 1;
    public final b4 s;

    public ldd(Context context, v0e v0eVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = v0eVar;
        m();
    }

    @Override // wv6
    public final Object i(nt3 nt3Var, Context context) {
        IInterface eueVar;
        l9f l9fVar;
        byte b = this.r;
        b4 b4Var = this.s;
        Object obj = null;
        switch (b) {
            case 0:
                if (nt3.a(context, "com.google.android.gms.vision.dynamite.face") > nt3.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b2 = nt3Var.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i = nye.a;
                    if (b2 != null) {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eueVar = queryLocalInterface instanceof tje ? (tje) queryLocalInterface : new eue(b2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                    }
                    eueVar = null;
                } else {
                    IBinder b3 = nt3Var.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i2 = nye.a;
                    if (b3 != null) {
                        IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        eueVar = queryLocalInterface2 instanceof tje ? (tje) queryLocalInterface2 : new eue(b3, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                    }
                    eueVar = null;
                }
                if (eueVar != null) {
                    eq7 eq7Var = new eq7(context);
                    v0e v0eVar = (v0e) b4Var;
                    ite.h(v0eVar);
                    eue eueVar2 = (eue) eueVar;
                    Parcel a = eueVar2.a();
                    int i3 = gpd.a;
                    a.writeStrongBinder(eq7Var);
                    gpd.a(a, v0eVar);
                    Parcel S = eueVar2.S(a, 1);
                    IBinder readStrongBinder = S.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface3 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                        obj = queryLocalInterface3 instanceof xoe ? (xoe) queryLocalInterface3 : new xoe(readStrongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", (byte) 11);
                    }
                    S.recycle();
                    break;
                }
                break;
            default:
                IBinder b4 = nt3Var.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b4 == null) {
                    l9fVar = null;
                } else {
                    IInterface queryLocalInterface4 = b4.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    l9fVar = queryLocalInterface4 instanceof l9f ? (l9f) queryLocalInterface4 : new l9f(b4, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", (byte) 11);
                }
                if (l9fVar != null) {
                    eq7 eq7Var2 = new eq7(context);
                    cue cueVar = (cue) b4Var;
                    ite.h(cueVar);
                    Parcel a2 = l9fVar.a();
                    int i4 = gpd.a;
                    a2.writeStrongBinder(eq7Var2);
                    gpd.a(a2, cueVar);
                    Parcel S2 = l9fVar.S(a2, 1);
                    IBinder readStrongBinder2 = S2.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        obj = queryLocalInterface5 instanceof b7f ? (b7f) queryLocalInterface5 : new b7f(readStrongBinder2, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", (byte) 11);
                    }
                    S2.recycle();
                    break;
                }
                break;
        }
        return obj;
    }

    @Override // wv6
    public final void j() {
        switch (this.r) {
            case 0:
                xoe xoeVar = (xoe) m();
                ite.h(xoeVar);
                xoeVar.U(xoeVar.a());
                break;
            default:
                if (k()) {
                    b7f b7fVar = (b7f) m();
                    ite.h(b7fVar);
                    b7fVar.U(b7fVar.a());
                    break;
                }
                break;
        }
    }

    public final w84[] n(ByteBuffer byteBuffer, wef wefVar) {
        wy5[] wy5VarArr;
        fgf[] fgfVarArr;
        if (!k()) {
            return new w84[0];
        }
        try {
            eq7 eq7Var = new eq7(byteBuffer);
            xoe xoeVar = (xoe) m();
            ite.h(xoeVar);
            Parcel a = xoeVar.a();
            int i = gpd.a;
            a.writeStrongBinder(eq7Var);
            gpd.a(a, wefVar);
            Parcel S = xoeVar.S(a, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) S.createTypedArray(FaceParcel.CREATOR);
            S.recycle();
            w84[] w84VarArr = new w84[faceParcelArr.length];
            for (int i2 = 0; i2 < faceParcelArr.length; i2++) {
                FaceParcel faceParcel = faceParcelArr[i2];
                int i3 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    wy5VarArr = new wy5[0];
                } else {
                    wy5[] wy5VarArr2 = new wy5[landmarkParcelArr.length];
                    for (int i4 = 0; i4 < landmarkParcelArr.length; i4++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i4];
                        wy5VarArr2[i4] = new wy5(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    wy5VarArr = wy5VarArr2;
                }
                w6d[] w6dVarArr = faceParcel.E;
                if (w6dVarArr == null) {
                    fgfVarArr = new fgf[0];
                } else {
                    fgf[] fgfVarArr2 = new fgf[w6dVarArr.length];
                    for (int i5 = 0; i5 < w6dVarArr.length; i5++) {
                        PointF[] pointFArr = w6dVarArr[i5].a;
                        fgfVarArr2[i5] = new fgf((byte) 15);
                    }
                    fgfVarArr = fgfVarArr2;
                }
                w84VarArr[i2] = new w84(i3, wy5VarArr, fgfVarArr);
            }
            return w84VarArr;
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new w84[0];
        }
    }

    public ldd(Context context, cue cueVar) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = cueVar;
        m();
    }
}
