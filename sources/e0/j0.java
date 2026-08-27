package e0;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j0 {
    public final String a;
    public final int b;
    public final Notification c;

    public j0(String str, int i10, Notification notification) {
        this.a = str;
        this.b = i10;
        this.c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.a;
        int i10 = this.b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.g);
            obtain.writeString(str);
            obtain.writeInt(i10);
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
        return a9.p.k(this.b, ", tag:null]", sb2);
    }
}
