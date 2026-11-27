// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
