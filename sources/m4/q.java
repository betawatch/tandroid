package m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class q extends Binder implements m {
    public static m H0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof m)) {
            return (m) queryLocalInterface;
        }
        l lVar = new l();
        lVar.a = iBinder;
        return lVar;
    }
}
