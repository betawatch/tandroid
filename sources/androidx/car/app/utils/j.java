package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j {
    public static IOnDoneCallback a() {
        final androidx.car.app.k kVar = null;
        return new IOnDoneCallback.Stub(kVar) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ androidx.car.app.k val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(w.b bVar) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(w.b bVar) {
                throw null;
            }
        };
    }

    public static void b(IOnDoneCallback iOnDoneCallback, String str, d dVar) {
        k.a(new b(iOnDoneCallback, str, dVar));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, d dVar) {
        k.a(new c(oVar, iOnDoneCallback, str, dVar, 0));
    }

    public static void d(String str, e eVar) {
        try {
            e(str, eVar);
        } catch (RemoteException e10) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e10);
        }
    }

    public static void e(String str, e eVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            eVar.call();
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw new androidx.car.app.j(aa.d.o("Remote ", str, " call failed"), e11);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new a(iOnDoneCallback, exc, str, 1));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
