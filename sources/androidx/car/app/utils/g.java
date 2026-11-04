package androidx.car.app.utils;

import ai.k3;
import ai.z3;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.j;
import androidx.car.app.k;
import androidx.lifecycle.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class g {
    public static IOnDoneCallback a() {
        final k kVar = null;
        return new IOnDoneCallback.Stub(kVar) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ k val$callback;

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
        h.a(new k3(iOnDoneCallback, str, aVar, 5));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, a aVar) {
        h.a(new z3(oVar, iOnDoneCallback, str, aVar, 1));
    }

    public static void d(String str, b bVar) {
        try {
            e(str, bVar);
        } catch (RemoteException e10) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e10);
        }
    }

    public static void e(String str, b bVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            bVar.call();
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw new j(a1.g.q("Remote ", str, " call failed"), e11);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new aa.a(iOnDoneCallback, exc, str, 2));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
