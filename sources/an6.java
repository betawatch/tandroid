// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class an6 extends Binder implements ei5 {
    public static ei5 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof ei5)) {
            return (ei5) queryLocalInterface;
        }
        di5 di5Var = new di5();
        di5Var.a = iBinder;
        return di5Var;
    }
}
