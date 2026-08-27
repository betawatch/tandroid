package androidx.car.app.utils;

import a9.p;
import ag.l0;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class i {
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

    public static void b(IOnDoneCallback iOnDoneCallback, String str, c cVar) {
        j.a(new a(iOnDoneCallback, str, cVar));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, c cVar) {
        j.a(new b(oVar, iOnDoneCallback, str, cVar, 0));
    }

    public static void d(String str, d dVar) {
        try {
            e(str, dVar);
        } catch (RemoteException e9) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e9);
        }
    }

    public static void e(String str, d dVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            dVar.call();
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            throw new a7.c(p.m("Remote ", str, " call failed"), e10);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new l0(iOnDoneCallback, exc, str, 2));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
