package com.google.android.gms.internal.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import c8.hc;
import j$.util.Objects;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class g3 {
    public final Context a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;
    public Object n;

    public g3(Context context, String str, String str2) {
        this.d = new Object();
        this.b = false;
        this.c = false;
        this.a = context;
        this.f = str;
        this.h = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.n = str2;
    }

    public s4.p c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract s4.q d(String str);

    public s4.q e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(s4.n nVar);

    public void g(ca.i iVar) {
        s4.x.b();
        if (((ca.i) this.n) != iVar) {
            this.n = iVar;
            if (this.c) {
                return;
            }
            this.c = true;
            ((android.support.v4.media.session.q) this.e).sendEmptyMessage(1);
        }
    }

    public void h(s4.n nVar) {
        s4.x.b();
        if (Objects.equals((s4.n) this.h, nVar)) {
            return;
        }
        this.h = nVar;
        if (this.b) {
            return;
        }
        this.b = true;
        ((android.support.v4.media.session.q) this.e).sendEmptyMessage(2);
    }

    public abstract Object i(b7.f fVar, Context context);

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
            } catch (RemoteException e10) {
                Log.e((String) this.f, "Could not finalize native handle", e10);
            }
        }
    }

    public Object m() {
        b7.f fVar;
        synchronized (this.d) {
            Object obj = this.e;
            if (obj != null) {
                return obj;
            }
            try {
                fVar = b7.f.c(this.a, b7.f.c, (String) this.h);
            } catch (b7.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.n);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    fVar = b7.f.c(this.a, b7.f.b, str);
                } catch (b7.b e10) {
                    hc.a(e10, "Error loading optional module %s", str);
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
                    fVar = null;
                }
            }
            if (fVar != null) {
                try {
                    this.e = i(fVar, this.a);
                } catch (RemoteException | b7.b e11) {
                    Log.e((String) this.f, "Error creating remote native handle", e11);
                }
            }
            boolean z9 = this.c;
            if (!z9 && this.e == null) {
                Log.w((String) this.f, "Native handle not yet available. Reverting to no-op handle.");
                this.c = true;
            } else if (z9 && this.e != null) {
                Log.w((String) this.f, "Native handle is now available.");
            }
            return this.e;
        }
    }

    public g3(Context context, uy uyVar) {
        this.e = new android.support.v4.media.session.q(this, 12);
        if (context != null) {
            this.a = context;
            if (uyVar == null) {
                this.d = new uy(new ComponentName(context, getClass()), 15);
                return;
            } else {
                this.d = uyVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
