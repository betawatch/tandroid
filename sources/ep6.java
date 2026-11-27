// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ep6 extends Binder implements gk5 {
    public static gk5 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof gk5)) {
            return (gk5) queryLocalInterface;
        }
        fk5 fk5Var = new fk5();
        fk5Var.a = iBinder;
        return fk5Var;
    }
}
