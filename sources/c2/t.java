package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import j7.e7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class t {
    public final Context a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object h;
    public Object n;

    public t(Context context, String str, String str2) {
        this.d = new Object();
        this.b = false;
        this.c = false;
        this.a = context;
        this.e = str;
        this.f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.h = str2;
    }

    public r c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract s d(String str);

    public s e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(o oVar);

    public void g(u uVar) {
        c0.b();
        if (((u) this.n) != uVar) {
            this.n = uVar;
            if (this.c) {
                return;
            }
            this.c = true;
            ((androidx.mediarouter.app.d) this.e).sendEmptyMessage(1);
        }
    }

    public void h(o oVar) {
        c0.b();
        if (Objects.equals((o) this.h, oVar)) {
            return;
        }
        this.h = oVar;
        if (this.b) {
            return;
        }
        this.b = true;
        ((androidx.mediarouter.app.d) this.e).sendEmptyMessage(2);
    }

    public abstract Object i(m6.e eVar, Context context);

    public abstract void j();

    public boolean k() {
        return m() != null;
    }

    public void l() {
        synchronized (this.d) {
            if (this.n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e6) {
                Log.e((String) this.e, "Could not finalize native handle", e6);
            }
        }
    }

    public Object m() {
        m6.e eVar;
        synchronized (this.d) {
            Object obj = this.n;
            if (obj != null) {
                return obj;
            }
            try {
                eVar = m6.e.c(this.a, m6.e.c, (String) this.f);
            } catch (m6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVar = m6.e.c(this.a, m6.e.b, str);
                } catch (m6.b e6) {
                    e7.a(e6, "Error loading optional module %s", str);
                    if (!this.b) {
                        String str2 = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        String str3 = (String) this.h;
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
                    this.n = i(eVar, this.a);
                } catch (RemoteException | m6.b e10) {
                    Log.e((String) this.e, "Error creating remote native handle", e10);
                }
            }
            boolean z4 = this.c;
            if (!z4 && this.n == null) {
                Log.w((String) this.e, "Native handle not yet available. Reverting to no-op handle.");
                this.c = true;
            } else if (z4 && this.n != null) {
                Log.w((String) this.e, "Native handle is now available.");
            }
            return this.n;
        }
    }

    public t(Context context, y5.h hVar) {
        this.e = new androidx.mediarouter.app.d(this, 4);
        if (context != null) {
            this.a = context;
            if (hVar == null) {
                this.d = new y5.h(new ComponentName(context, getClass()), 7);
                return;
            } else {
                this.d = hVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
