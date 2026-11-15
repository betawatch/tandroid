package androidx.car.app.utils;

import a8.p0;
import aa.r;
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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class h {
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

    public static void b(IOnDoneCallback iOnDoneCallback, String str, b bVar) {
        i.a(new r(iOnDoneCallback, str, bVar, 4));
    }

    public static void c(o oVar, IOnDoneCallback iOnDoneCallback, String str, b bVar) {
        i.a(new a(oVar, iOnDoneCallback, str, bVar, 0));
    }

    public static void d(String str, c cVar) {
        try {
            e(str, cVar);
        } catch (RemoteException e10) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call " + str, e10);
        }
    }

    public static void e(String str, c cVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            cVar.call();
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw new j(p0.p("Remote ", str, " call failed"), e11);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new a3.h((Object) iOnDoneCallback, (Object) exc, str, 4));
    }

    public static List g(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
