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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a1 extends t implements ServiceConnection {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public a1.c B;
    public final ComponentName r;
    public final v0 s;
    public final ArrayList v;
    public boolean w;
    public boolean x;
    public t0 y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public a1(Context context, ComponentName componentName) {
        super(context, new m5.i(componentName, 7));
        this.v = new ArrayList();
        this.r = componentName;
        this.s = new v0();
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
                y0 y0Var = new y0(this, str);
                this.v.add(y0Var);
                if (this.A) {
                    y0Var.a(this.y);
                }
                r();
                return y0Var;
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
        if (this.A) {
            t0 t0Var = this.y;
            int i10 = t0Var.d;
            t0Var.d = i10 + 1;
            t0Var.b(10, i10, 0, oVar != null ? oVar.a : null, null);
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

    public final z0 o(String str, String str2) {
        u uVar = (u) this.n;
        if (uVar == null) {
            return null;
        }
        List list = (List) uVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) list.get(i10)).d().equals(str)) {
                z0 z0Var = new z0(this, str, str2);
                this.v.add(z0Var);
                if (this.A) {
                    z0Var.a(this.y);
                }
                r();
                return z0Var;
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
                        t0 t0Var = new t0(this, messenger);
                        int i10 = t0Var.d;
                        t0Var.d = i10 + 1;
                        t0Var.g = i10;
                        if (t0Var.b(1, i10, 4, null, null)) {
                            try {
                                t0Var.a.getBinder().linkToDeath(t0Var, 0);
                                this.y = t0Var;
                                return;
                            } catch (RemoteException unused) {
                                t0Var.binderDied();
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
            this.A = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((u0) arrayList.get(i10)).c();
            }
            t0 t0Var = this.y;
            t0Var.b(2, 0, 0, null, null);
            t0Var.b.b.clear();
            t0Var.a.getBinder().unlinkToDeath(t0Var, 0);
            t0Var.i.s.post(new s0(t0Var, 0));
            this.y = null;
        }
    }

    public final void q() {
        if (this.x) {
            this.x = false;
            p();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
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
