package m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
