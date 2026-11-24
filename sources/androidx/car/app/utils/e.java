package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class e {
    public static IOnDoneCallback a() {
        final fr7 fr7Var = null;
        return new IOnDoneCallback.Stub(fr7Var) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ fr7 val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(g41 g41Var) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(g41 g41Var) {
                throw null;
            }
        };
    }

    public static void b(w26 w26Var, IOnDoneCallback iOnDoneCallback, String str, s89 s89Var) {
        ipb.a(new no8((Object) w26Var, (Object) iOnDoneCallback, (Object) str, (Object) s89Var, (byte) 8));
    }

    public static void c(IOnDoneCallback iOnDoneCallback, String str, s89 s89Var) {
        ipb.a(new ak8((Object) iOnDoneCallback, (Object) str, (Object) s89Var, (byte) 12));
    }

    public static void d(String str, t89 t89Var) {
        try {
            e(str, t89Var);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void e(String str, t89 t89Var) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            t89Var.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new rq2(kt6.o("Remote ", str, " call failed"), e2);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new wu2((Object) iOnDoneCallback, (Object) exc, (Object) str, (byte) 26));
    }
}
