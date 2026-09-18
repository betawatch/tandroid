package m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class m extends Binder implements i {
    public static i G0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof i)) {
            return (i) queryLocalInterface;
        }
        h hVar = new h();
        hVar.a = iBinder;
        return hVar;
    }
}
