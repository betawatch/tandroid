package e0;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class g0 {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public g0(String str, int i10, String str2, Notification notification) {
        this.a = str;
        this.b = i10;
        this.c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.a;
        int i10 = this.b;
        String str2 = this.c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(str2);
            Notification notification = this.d;
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
        sb2.append(this.b);
        sb2.append(", tag:");
        return a1.g.s(sb2, this.c, "]");
    }
}
