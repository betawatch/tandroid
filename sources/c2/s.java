package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s {
    public final Context a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object h;
    public Object n;

    public s(Context context, String str, String str2) {
        this.d = new Object();
        this.b = false;
        this.c = false;
        this.a = context;
        this.e = str;
        this.f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.h = str2;
    }

    public q c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract r d(String str);

    public r e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(o oVar);

    public void g(t tVar) {
        c0.b();
        if (((t) this.n) != tVar) {
            this.n = tVar;
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

    public abstract Object i(i6.e eVar, Context context);

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
            } catch (RemoteException e10) {
                Log.e((String) this.e, "Could not finalize native handle", e10);
            }
        }
    }

    public Object m() {
        i6.e eVar;
        synchronized (this.d) {
            Object obj = this.n;
            if (obj != null) {
                return obj;
            }
            try {
                eVar = i6.e.c(this.a, i6.e.c, (String) this.f);
            } catch (i6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVar = i6.e.c(this.a, i6.e.b, str);
                } catch (i6.b e10) {
                    com.google.android.gms.internal.cast.o.a(e10, "Error loading optional module %s", str);
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
                } catch (RemoteException | i6.b e11) {
                    Log.e((String) this.e, "Error creating remote native handle", e11);
                }
            }
            boolean z10 = this.c;
            if (!z10 && this.n == null) {
                Log.w((String) this.e, "Native handle not yet available. Reverting to no-op handle.");
                this.c = true;
            } else if (z10 && this.n != null) {
                Log.w((String) this.e, "Native handle is now available.");
            }
            return this.n;
        }
    }

    public s(Context context, android.support.v4.media.c cVar) {
        this.e = new androidx.mediarouter.app.d(this, 4);
        if (context != null) {
            this.a = context;
            if (cVar == null) {
                this.d = new android.support.v4.media.c(new ComponentName(context, getClass()), 5);
                return;
            } else {
                this.d = cVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
