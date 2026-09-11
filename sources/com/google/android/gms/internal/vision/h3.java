package com.google.android.gms.internal.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import ji.u4;
import w7.m6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class h3 {
    public final Context a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;
    public Object n;

    public h3(Context context, String str, String str2) {
        this.d = new Object();
        this.b = false;
        this.c = false;
        this.a = context;
        this.f = str;
        this.h = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.n = str2;
    }

    public p4.p c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract p4.q d(String str);

    public p4.q e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(p4.n nVar);

    public void g(b2.p pVar) {
        p4.x.b();
        if (((b2.p) this.n) != pVar) {
            this.n = pVar;
            if (this.c) {
                return;
            }
            this.c = true;
            ((androidx.mediarouter.app.c) this.e).sendEmptyMessage(1);
        }
    }

    public void h(p4.n nVar) {
        p4.x.b();
        if (Objects.equals((p4.n) this.h, nVar)) {
            return;
        }
        this.h = nVar;
        if (this.b) {
            return;
        }
        this.b = true;
        ((androidx.mediarouter.app.c) this.e).sendEmptyMessage(2);
    }

    public abstract Object i(y6.e eVar, Context context);

    public abstract void j();

    public boolean k() {
        return m() != null;
    }

    public void l() {
        synchronized (this.d) {
            if (this.e == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e7) {
                Log.e((String) this.f, "Could not finalize native handle", e7);
            }
        }
    }

    public Object m() {
        y6.e eVar;
        synchronized (this.d) {
            Object obj = this.e;
            if (obj != null) {
                return obj;
            }
            try {
                eVar = y6.e.c(this.a, y6.e.c, (String) this.h);
            } catch (y6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.n);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVar = y6.e.c(this.a, y6.e.b, str);
                } catch (y6.b e7) {
                    m6.a(e7, "Error loading optional module %s", str);
                    if (!this.b) {
                        String str2 = (String) this.n;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        String str3 = (String) this.n;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str3);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.a.sendBroadcast(intent);
                        this.b = true;
                    }
                    eVar = null;
                }
            }
            if (eVar != null) {
                try {
                    this.e = i(eVar, this.a);
                } catch (RemoteException | y6.b e10) {
                    Log.e((String) this.f, "Error creating remote native handle", e10);
                }
            }
            boolean z10 = this.c;
            if (!z10 && this.e == null) {
                Log.w((String) this.f, "Native handle not yet available. Reverting to no-op handle.");
                this.c = true;
            } else if (z10 && this.e != null) {
                Log.w((String) this.f, "Native handle is now available.");
            }
            return this.e;
        }
    }

    public h3(Context context, u4 u4Var) {
        this.e = new androidx.mediarouter.app.c(this, 10);
        if (context != null) {
            this.a = context;
            if (u4Var == null) {
                this.d = new u4(new ComponentName(context, getClass()), 16);
                return;
            } else {
                this.d = u4Var;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
