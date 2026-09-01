package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class j {
    public static IOnDoneCallback a() {
        final androidx.car.app.j jVar = null;
        return new IOnDoneCallback.Stub(jVar) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ androidx.car.app.j val$callback;

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
        } catch (RemoteException e6) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e6);
        }
    }

    public static void e(String str, e eVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            eVar.call();
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e10) {
            throw new a7.b(android.support.v4.media.a.o("Remote ", str, " call failed"), e10);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new a(iOnDoneCallback, exc, str, 1));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
