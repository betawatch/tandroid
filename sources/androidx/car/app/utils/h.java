package androidx.car.app.utils;

import a3.l0;
import ag.q0;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.j;
import androidx.lifecycle.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h {
    public static IOnDoneCallback a() {
        final j jVar = null;
        return new IOnDoneCallback.Stub(jVar) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ j val$callback;

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

    public static void b(IOnDoneCallback iOnDoneCallback, String str, b bVar) {
        i.a(new l0(iOnDoneCallback, str, bVar, 10));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, b bVar) {
        i.a(new q0(oVar, iOnDoneCallback, str, bVar, 3));
    }

    public static void d(String str, c cVar) {
        try {
            e(str, cVar);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e);
        }
    }

    public static void e(String str, c cVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            cVar.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e7) {
            throw new ad.d(a1.g.n("Remote ", str, " call failed"), e7);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new a(iOnDoneCallback, exc, str, 1));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
