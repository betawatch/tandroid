// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class bw6 {
    public final Context a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object h;
    public Object n;

    public bw6(Context context, xh4 xh4Var) {
        this.e = new d1(this, (byte) 10);
        if (context == null) {
            lq5.j("context must not be null");
            throw null;
        }
        this.a = context;
        if (xh4Var == null) {
            this.d = new xh4((Object) new ComponentName(context, getClass()), (byte) 15);
        } else {
            this.d = xh4Var;
        }
    }

    public zv6 c(String str) {
        if (str != null) {
            return null;
        }
        lq5.j("initialMemberRouteId cannot be null.");
        return null;
    }

    public abstract aw6 d(String str);

    public aw6 e(String str, String str2) {
        if (str == null) {
            lq5.j("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return d(str);
        }
        lq5.j("routeGroupId cannot be null");
        return null;
    }

    public abstract void f(gv6 gv6Var);

    public final void g(fo4 fo4Var) {
        lw6.b();
        if (((fo4) this.n) != fo4Var) {
            this.n = fo4Var;
            if (this.c) {
                return;
            }
            this.c = true;
            ((d1) this.e).sendEmptyMessage(1);
        }
    }

    public final void h(gv6 gv6Var) {
        lw6.b();
        if (Objects.equals((gv6) this.h, gv6Var)) {
            return;
        }
        this.h = gv6Var;
        if (this.b) {
            return;
        }
        this.b = true;
        ((d1) this.e).sendEmptyMessage(2);
    }

    public abstract Object i(vs3 vs3Var, Context context);

    public abstract void j();

    public final boolean k() {
        return m() != null;
    }

    public final void l() {
        synchronized (this.d) {
            if (this.n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e) {
                Log.e((String) this.e, "Could not finalize native handle", e);
            }
        }
    }

    public final Object m() {
        vs3 vs3Var;
        synchronized (this.d) {
            Object obj = this.n;
            if (obj != null) {
                return obj;
            }
            try {
                vs3Var = vs3.c(this.a, vs3.c, (String) this.f);
            } catch (ss3 unused) {
                String concat = "com.google.android.gms.vision.".concat((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module ".concat(concat));
                }
                try {
                    vs3Var = vs3.c(this.a, vs3.b, concat);
                } catch (ss3 e) {
                    tqe.a(e, "Error loading optional module %s", concat);
                    if (!this.b) {
                        String str = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency ".concat(str));
                        }
                        String str2 = (String) this.h;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str2);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.a.sendBroadcast(intent);
                        this.b = true;
                    }
                    vs3Var = null;
                }
            }
            if (vs3Var != null) {
                try {
                    this.n = i(vs3Var, this.a);
                } catch (RemoteException | ss3 e2) {
                    Log.e((String) this.e, "Error creating remote native handle", e2);
                }
            }
            boolean z = this.c;
            Object obj2 = this.n;
            if (z) {
                if (obj2 != null) {
                    Log.w((String) this.e, "Native handle is now available.");
                }
            } else if (obj2 == null) {
                Log.w((String) this.e, "Native handle not yet available. Reverting to no-op handle.");
                this.c = true;
            }
            return this.n;
        }
    }

    public bw6(Context context, String str, String str2) {
        this.d = new Object();
        this.b = false;
        this.c = false;
        this.a = context;
        this.e = str;
        this.f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.h = str2;
    }
}
