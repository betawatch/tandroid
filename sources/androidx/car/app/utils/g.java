package androidx.car.app.utils;

import a3.l0;
import ai.t2;
import ai.y0;
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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        h.a(new l0(iOnDoneCallback, str, aVar, 17));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, a aVar) {
        h.a(new y0(oVar, iOnDoneCallback, str, aVar, 6));
    }

    public static void d(String str, b bVar) {
        try {
            e(str, bVar);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e);
        }
    }

    public static void e(String str, b bVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            bVar.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e7) {
            throw new j(a1.g.p("Remote ", str, " call failed"), e7);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new t2(iOnDoneCallback, exc, str, 2));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
