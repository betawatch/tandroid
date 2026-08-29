package c9;

import ab.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;
import g9.p;
import g9.r;
import g9.u;
import h9.o;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public final r a;

    public c(r rVar) {
        this.a = rVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        p pVar = this.a.f;
        Thread currentThread = Thread.currentThread();
        pVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = pVar.e;
        v vVar = new v(pVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.Q(new f7.p(vVar, 1));
    }

    public final void b() {
        r rVar = this.a;
        Boolean bool = Boolean.TRUE;
        u uVar = rVar.b;
        synchronized (uVar) {
            uVar.f = false;
            uVar.g = bool;
            SharedPreferences.Editor edit = uVar.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (uVar.c) {
                try {
                    if (uVar.a()) {
                        if (!uVar.e) {
                            uVar.d.trySetResult(null);
                            uVar.e = true;
                        }
                    } else if (uVar.e) {
                        uVar.d = new TaskCompletionSource();
                        uVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void c(String str, String str2) {
        p pVar = this.a.f;
        pVar.getClass();
        try {
            ((m) pVar.d.d).r(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = pVar.a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e10;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        s3 s3Var = this.a.f.d;
        s3Var.getClass();
        String b10 = h9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) s3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) s3Var.h).getReference();
                if (b10 == null ? str2 == null : b10.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) s3Var.h).set(b10, true);
                ((s) s3Var.b).Q(new o(s3Var, 0));
            } finally {
            }
        }
    }
}
