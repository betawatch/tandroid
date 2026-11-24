// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ap6 extends Binder implements dk5 {
    public static dk5 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof dk5)) {
            return (dk5) queryLocalInterface;
        }
        ck5 ck5Var = new ck5();
        ck5Var.a = iBinder;
        return ck5Var;
    }
}
