package androidx.car.app.utils;

import a3.j0;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.k;
import androidx.lifecycle.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class i {
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

    public static void b(IOnDoneCallback iOnDoneCallback, String str, c cVar) {
        j.a(new j0(iOnDoneCallback, str, cVar, 2));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, c cVar) {
        j.a(new b(oVar, iOnDoneCallback, str, cVar, 0));
    }

    public static void d(String str, d dVar) {
        try {
            e(str, dVar);
        } catch (RemoteException e7) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e7);
        }
    }

    public static void e(String str, d dVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            dVar.call();
        } catch (SecurityException e7) {
            throw e7;
        } catch (RuntimeException e10) {
            throw new androidx.car.app.j(a4.a.p("Remote ", str, " call failed"), e10);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new a(iOnDoneCallback, exc, str, 1));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
