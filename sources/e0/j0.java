package e0;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j0 {
    public final String a;
    public final int b;
    public final Notification c;

    public j0(String str, int i9, Notification notification) {
        this.a = str;
        this.b = i9;
        this.c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.a;
        int i9 = this.b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.g);
            obtain.writeString(str);
            obtain.writeInt(i9);
            obtain.writeString(null);
            Notification notification = this.c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.a);
        sb2.append(", id:");
        return aa.d.l(this.b, ", tag:null]", sb2);
    }
}
