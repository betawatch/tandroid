// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class mbd {
    public static final he6 a = new he6("CastDynamiteModule", null);

    public static fcd a(Context context, ld1 ld1Var, hhd hhdVar, HashMap hashMap) {
        fcd vbdVar;
        hcd b = b(context);
        br7 br7Var = new br7(context.getApplicationContext());
        Parcel R = b.R();
        ald.d(R, br7Var);
        ald.c(R, ld1Var);
        ald.d(R, hhdVar);
        R.writeMap(hashMap);
        Parcel T = b.T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = bcd.b;
        if (readStrongBinder == null) {
            vbdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            vbdVar = queryLocalInterface instanceof fcd ? (fcd) queryLocalInterface : new vbd(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", (byte) 3);
        }
        T.recycle();
        return vbdVar;
    }

    public static hcd b(Context context) {
        try {
            IBinder b = vs3.c(context, vs3.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof hcd ? (hcd) queryLocalInterface : new hcd(b, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", (byte) 3);
        } catch (ss3 e) {
            throw new ah7(e);
        }
    }
}
