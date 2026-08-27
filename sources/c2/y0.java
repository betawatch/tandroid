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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y0 extends s implements ServiceConnection {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public a1.c B;
    public final ComponentName r;
    public final t0 s;
    public final ArrayList v;
    public boolean w;
    public boolean x;
    public r0 y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public y0(Context context, ComponentName componentName) {
        super(context, new k5.i(componentName, 5));
        this.v = new ArrayList();
        this.r = componentName;
        this.s = new t0();
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
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) list.get(i10)).d().equals(str)) {
                w0 w0Var = new w0(this, str);
                this.v.add(w0Var);
                if (this.A) {
                    w0Var.a(this.y);
                }
                r();
                return w0Var;
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
            r0 r0Var = this.y;
            int i10 = r0Var.d;
            r0Var.d = i10 + 1;
            r0Var.b(10, i10, 0, oVar != null ? oVar.a : null, null);
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
        t tVar = (t) this.n;
        if (tVar == null) {
            return null;
        }
        List list = (List) tVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) list.get(i10)).d().equals(str)) {
                x0 x0Var = new x0(this, str, str2);
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

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.x) {
            p();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        r0 r0Var = new r0(this, messenger);
                        int i10 = r0Var.d;
                        r0Var.d = i10 + 1;
                        r0Var.g = i10;
                        if (r0Var.b(1, i10, 4, null, null)) {
                            try {
                                r0Var.a.getBinder().linkToDeath(r0Var, 0);
                                this.y = r0Var;
                                return;
                            } catch (RemoteException unused) {
                                r0Var.binderDied();
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
                ((s0) arrayList.get(i10)).c();
            }
            r0 r0Var = this.y;
            r0Var.b(2, 0, 0, null, null);
            r0Var.b.b.clear();
            r0Var.a.getBinder().unlinkToDeath(r0Var, 0);
            r0Var.i.s.post(new q0(r0Var, 0));
            this.y = null;
        }
    }

    public final void q() {
        if (this.x) {
            this.x = false;
            p();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e9) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e9);
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
