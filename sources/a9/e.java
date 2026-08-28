package a9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.v;
import d7.p;
import e9.o;
import e9.q;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.t3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public final q a;

    public e(q qVar) {
        this.a = qVar;
    }

    public final void a(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        o oVar = this.a.f;
        Thread currentThread = Thread.currentThread();
        oVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        t tVar = oVar.e;
        v vVar = new v(oVar, currentTimeMillis, th, currentThread);
        tVar.getClass();
        tVar.Q(new p(vVar, 1));
    }

    public final void b() {
        q qVar = this.a;
        Boolean bool = Boolean.TRUE;
        e9.t tVar = qVar.b;
        synchronized (tVar) {
            tVar.f = false;
            tVar.g = bool;
            SharedPreferences.Editor edit = tVar.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (tVar.c) {
                try {
                    if (tVar.a()) {
                        if (!tVar.e) {
                            tVar.d.trySetResult(null);
                            tVar.e = true;
                        }
                    } else if (tVar.e) {
                        tVar.d = new TaskCompletionSource();
                        tVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void c(String str, String str2) {
        o oVar = this.a.f;
        oVar.getClass();
        try {
            ((l) oVar.d.d).r(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = oVar.a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e10;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        t3 t3Var = this.a.f.d;
        t3Var.getClass();
        String b10 = f9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) t3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) t3Var.h).getReference();
                if (b10 == null ? str2 == null : b10.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) t3Var.h).set(b10, true);
                ((t) t3Var.b).Q(new f9.o(t3Var, 0));
            } finally {
            }
        }
    }
}
