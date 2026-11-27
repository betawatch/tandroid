// default package

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class igd extends b99 {
    public final /* synthetic */ hg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igd(hg0 hg0Var, Looper looper) {
        super(looper, (byte) 4);
        this.a = hg0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        e9d e9dVar;
        hg0 hg0Var = this.a;
        int i = hg0Var.C.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (e9dVar = (e9d) message.obj) != null) {
                e9dVar.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !hg0Var.r()) {
            e9d e9dVar2 = (e9d) message.obj;
            if (e9dVar2 != null) {
                e9dVar2.c();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            hg0Var.z = new ws2(message.arg2, null, null);
            if (!hg0Var.A) {
                TextUtils.isEmpty(hg0Var.l());
            }
            ws2 ws2Var = hg0Var.z;
            if (ws2Var == null) {
                ws2Var = new ws2(8, null, null);
            }
            hg0Var.o.a(ws2Var);
            hg0Var.s(ws2Var);
            return;
        }
        if (i4 == 5) {
            ws2 ws2Var2 = hg0Var.z;
            if (ws2Var2 == null) {
                ws2Var2 = new ws2(8, null, null);
            }
            hg0Var.o.a(ws2Var2);
            hg0Var.s(ws2Var2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            ws2 ws2Var3 = new ws2(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            hg0Var.o.a(ws2Var3);
            hg0Var.s(ws2Var3);
            return;
        }
        if (i4 == 6) {
            hg0Var.A(5, null);
            j09 j09Var = hg0Var.t;
            if (j09Var != null) {
                ((k05) j09Var.b).onConnectionSuspended(message.arg2);
            }
            hg0Var.t(message.arg2);
            hg0Var.y(5, 1, null);
            return;
        }
        if (i4 == 2 && !hg0Var.q()) {
            e9d e9dVar3 = (e9d) message.obj;
            if (e9dVar3 != null) {
                e9dVar3.c();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        e9d e9dVar4 = (e9d) message.obj;
        synchronized (e9dVar4) {
            bool = e9dVar4.a;
            if (e9dVar4.b) {
                String obj2 = e9dVar4.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj2);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (bool != null) {
            hg0 hg0Var2 = e9dVar4.f;
            int i6 = e9dVar4.d;
            if (i6 != 0) {
                hg0Var2.A(1, null);
                Bundle bundle = e9dVar4.e;
                e9dVar4.b(new ws2(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!e9dVar4.a()) {
                hg0Var2.A(1, null);
                e9dVar4.b(new ws2(8, null, null));
            }
        }
        synchronized (e9dVar4) {
            e9dVar4.b = true;
        }
        e9dVar4.c();
    }
}
