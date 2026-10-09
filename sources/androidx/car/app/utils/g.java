package androidx.car.app.utils;

import a3.k0;
import ae.x;
import ai.i5;
import ai.r5;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.j;
import androidx.lifecycle.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class g {
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

    public static void b(IOnDoneCallback iOnDoneCallback, String str, a aVar) {
        h.a(new k0(iOnDoneCallback, str, aVar, 10));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, a aVar) {
        h.a(new i5(oVar, iOnDoneCallback, str, aVar, 4));
    }

    public static void d(String str, b bVar) {
        try {
            e(str, bVar);
        } catch (RemoteException e7) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e7);
        }
    }

    public static void e(String str, b bVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            bVar.call();
        } catch (SecurityException e7) {
            throw e7;
        } catch (RuntimeException e10) {
            throw new x(a1.g.q("Remote ", str, " call failed"), e10);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new r5(iOnDoneCallback, exc, str, 3));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
