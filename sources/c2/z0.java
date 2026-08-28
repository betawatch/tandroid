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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z0 extends s implements ServiceConnection {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public a1.c B;
    public final ComponentName r;
    public final u0 s;
    public final ArrayList v;
    public boolean w;
    public boolean x;
    public s0 y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public z0(Context context, ComponentName componentName) {
        super(context, new android.support.v4.media.c(componentName, 5));
        this.v = new ArrayList();
        this.r = componentName;
        this.s = new u0();
    }

    @Override // c2.s
    public final q c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        t tVar = (t) this.n;
        if (tVar == null) {
            return null;
        }
        List list = (List) tVar.c;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((n) list.get(i9)).d().equals(str)) {
                x0 x0Var = new x0(this, str);
                this.v.add(x0Var);
                if (this.A) {
                    x0Var.a(this.y);
                }
                r();
                return x0Var;
            }
        }
        return null;
    }

    @Override // c2.s
    public final r d(String str) {
        if (str != null) {
            return o(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // c2.s
    public final r e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return o(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // c2.s
    public final void f(o oVar) {
        if (this.A) {
            s0 s0Var = this.y;
            int i9 = s0Var.d;
            s0Var.d = i9 + 1;
            s0Var.b(10, i9, 0, oVar != null ? oVar.a : null, null);
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

    public final y0 o(String str, String str2) {
        t tVar = (t) this.n;
        if (tVar == null) {
            return null;
        }
        List list = (List) tVar.c;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((n) list.get(i9)).d().equals(str)) {
                y0 y0Var = new y0(this, str, str2);
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

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.x) {
            p();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        s0 s0Var = new s0(this, messenger);
                        int i9 = s0Var.d;
                        s0Var.d = i9 + 1;
                        s0Var.g = i9;
                        if (s0Var.b(1, i9, 4, null, null)) {
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
            this.A = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((t0) arrayList.get(i9)).c();
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
