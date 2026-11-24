// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
