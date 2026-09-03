package e0;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i0 {
    public final String a;
    public final int b;
    public final Notification c;

    public i0(String str, int i10, Notification notification) {
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
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return android.support.v4.media.a.m(this.b, ", tag:null]", sb);
    }
}
