package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class y0 extends t implements ServiceConnection {
    public static final /* synthetic */ int D = 0;
    public boolean B;
    public a1.c C;
    public final ComponentName r;
    public final a7.e s;
    public final ArrayList v;
    public boolean w;
    public boolean x;
    public s0 y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public y0(Context context, ComponentName componentName) {
        super(context, new y5.h(componentName, 7));
        this.v = new ArrayList();
        this.r = componentName;
        this.s = new a7.e();
    }

    @Override // c2.t
    public final r c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        u uVar = (u) this.n;
        if (uVar == null) {
            return null;
        }
        List list = (List) uVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) list.get(i10)).d().equals(str)) {
                w0 w0Var = new w0(this, str);
                this.v.add(w0Var);
                if (this.B) {
                    w0Var.a(this.y);
                }
                r();
                return w0Var;
            }
        }
        return null;
    }

    @Override // c2.t
    public final s d(String str) {
        if (str != null) {
            return o(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // c2.t
    public final s e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return o(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // c2.t
    public final void f(o oVar) {
        if (this.B) {
            s0 s0Var = this.y;
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(10, i10, 0, oVar != null ? oVar.a : null, null);
        }
        r();
    }

    public final void n() {
        if (this.x) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.r);
        try {
            this.x = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final x0 o(String str, String str2) {
        u uVar = (u) this.n;
        if (uVar == null) {
            return null;
        }
        List list = (List) uVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) list.get(i10)).d().equals(str)) {
                x0 x0Var = new x0(this, str, str2);
                this.v.add(x0Var);
                if (this.B) {
                    x0Var.a(this.y);
                }
                r();
                return x0Var;
            }
        }
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.x) {
            p();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        s0 s0Var = new s0(this, messenger);
                        int i10 = s0Var.d;
                        s0Var.d = i10 + 1;
                        s0Var.g = i10;
                        if (s0Var.b(1, i10, 4, null, null)) {
                            try {
                                s0Var.a.getBinder().linkToDeath(s0Var, 0);
                                this.y = s0Var;
                                return;
                            } catch (RemoteException unused) {
                                s0Var.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        p();
    }

    public final void p() {
        if (this.y != null) {
            g(null);
            this.B = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t0) arrayList.get(i10)).c();
            }
            s0 s0Var = this.y;
            s0Var.b(2, 0, 0, null, null);
            s0Var.b.b.clear();
            s0Var.a.getBinder().unlinkToDeath(s0Var, 0);
            s0Var.i.s.post(new r0(s0Var, 0));
            this.y = null;
        }
    }

    public final void q() {
        if (this.x) {
            this.x = false;
            p();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e6) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e6);
            }
        }
    }

    public final void r() {
        if (!this.w || (((o) this.h) == null && this.v.isEmpty())) {
            q();
        } else {
            n();
        }
    }

    public final String toString() {
        return "Service connection " + this.r.flattenToShortString();
    }
}
