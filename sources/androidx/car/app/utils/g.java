package androidx.car.app.utils;

import a8.p0;
import aa.s;
import ai.d0;
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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        h.a(new s(iOnDoneCallback, str, aVar, 5));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, a aVar) {
        h.a(new d0(oVar, iOnDoneCallback, str, aVar, 2));
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
            throw new j(p0.p("Remote ", str, " call failed"), e11);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new a3.h((Object) iOnDoneCallback, (Object) exc, str, 3));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
