package b6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b0 extends a7.e {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g gVar, Looper looper) {
        super(looper, 0);
        this.a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.a.O.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                x xVar = (x) message.obj;
                xVar.getClass();
                xVar.d();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !this.a.e()) {
            x xVar2 = (x) message.obj;
            xVar2.getClass();
            xVar2.d();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            g gVar = this.a;
            gVar.L = new y5.a(message.arg2);
            if (!gVar.M && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(gVar.v());
                    g gVar2 = this.a;
                    if (!gVar2.M) {
                        gVar2.F(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            g gVar3 = this.a;
            y5.a aVar = gVar3.L;
            if (aVar == null) {
                aVar = new y5.a(8);
            }
            gVar3.B.a(aVar);
            this.a.z(aVar);
            return;
        }
        if (i12 == 5) {
            g gVar4 = this.a;
            y5.a aVar2 = gVar4.L;
            if (aVar2 == null) {
                aVar2 = new y5.a(8);
            }
            gVar4.B.a(aVar2);
            this.a.z(aVar2);
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            y5.a aVar3 = new y5.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.B.a(aVar3);
            this.a.z(aVar3);
            return;
        }
        if (i12 == 6) {
            this.a.F(5, null);
            n nVar = this.a.G;
            if (nVar != null) {
                ((com.google.android.gms.common.api.k) nVar.a).onConnectionSuspended(message.arg2);
            }
            this.a.A(message.arg2);
            g.E(this.a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.a.h()) {
            x xVar3 = (x) message.obj;
            xVar3.getClass();
            xVar3.d();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", l.d.j(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        x xVar4 = (x) message.obj;
        synchronized (xVar4) {
            try {
                bool = xVar4.a;
                if (xVar4.b) {
                    Log.w("GmsClient", "Callback proxy " + xVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            g gVar5 = xVar4.f;
            int i14 = xVar4.d;
            if (i14 != 0) {
                gVar5.F(1, null);
                Bundle bundle = xVar4.e;
                xVar4.a(new y5.a(i14, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!xVar4.b()) {
                gVar5.F(1, null);
                xVar4.a(new y5.a(8, null));
            }
        }
        synchronized (xVar4) {
            xVar4.b = true;
        }
        xVar4.d();
    }
}
