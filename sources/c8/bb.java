package c8;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class bb {
    public static void a(p4.l lVar) {
        if (lVar != null) {
            try {
                p4.k kVar = (p4.k) lVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(0);
                    kVar.a.transact(3006, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            } catch (RemoteException unused) {
            }
        }
    }
}
