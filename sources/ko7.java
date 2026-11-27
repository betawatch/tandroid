// default package

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ko7 {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public ko7(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(zk5 zk5Var) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        xk5 xk5Var = (xk5) zk5Var;
        xk5Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(zk5.g);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            xk5Var.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return c00.k(sb, this.c, "]");
    }
}
