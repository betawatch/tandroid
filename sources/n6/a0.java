package n6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a0 extends com.google.android.gms.internal.cast.c0 {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g gVar, Looper looper) {
        super(looper, 4);
        this.a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.a.R.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                w wVar = (w) message.obj;
                wVar.getClass();
                wVar.d();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !this.a.f()) {
            w wVar2 = (w) message.obj;
            wVar2.getClass();
            wVar2.d();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            g gVar = this.a;
            gVar.O = new k6.a(message.arg2);
            if (!gVar.P && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(gVar.v());
                    g gVar2 = this.a;
                    if (!gVar2.P) {
                        gVar2.F(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            g gVar3 = this.a;
            k6.a aVar = gVar3.O;
            if (aVar == null) {
                aVar = new k6.a(8);
            }
            gVar3.E.a(aVar);
            this.a.z(aVar);
            return;
        }
        if (i12 == 5) {
            g gVar4 = this.a;
            k6.a aVar2 = gVar4.O;
            if (aVar2 == null) {
                aVar2 = new k6.a(8);
            }
            gVar4.E.a(aVar2);
            this.a.z(aVar2);
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            k6.a aVar3 = new k6.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.E.a(aVar3);
            this.a.z(aVar3);
            return;
        }
        if (i12 == 6) {
            this.a.F(5, null);
            m mVar = this.a.J;
            if (mVar != null) {
                ((com.google.android.gms.common.api.k) mVar.a).onConnectionSuspended(message.arg2);
            }
            this.a.A(message.arg2);
            g.E(this.a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.a.j()) {
            w wVar3 = (w) message.obj;
            wVar3.getClass();
            wVar3.d();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", i2.g.i(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        w wVar4 = (w) message.obj;
        synchronized (wVar4) {
            try {
                bool = wVar4.a;
                if (wVar4.b) {
                    Log.w("GmsClient", "Callback proxy " + wVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            g gVar5 = wVar4.f;
            int i14 = wVar4.d;
            if (i14 != 0) {
                gVar5.F(1, null);
                Bundle bundle = wVar4.e;
                wVar4.a(new k6.a(i14, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!wVar4.b()) {
                gVar5.F(1, null);
                wVar4.a(new k6.a(8, null));
            }
        }
        synchronized (wVar4) {
            wVar4.b = true;
        }
        wVar4.d();
    }
}
