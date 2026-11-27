package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class e {
    public static IOnDoneCallback a() {
        final cs7 cs7Var = null;
        return new IOnDoneCallback.Stub(cs7Var) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ cs7 val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(h31 h31Var) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(h31 h31Var) {
                throw null;
            }
        };
    }

    public static void b(a36 a36Var, IOnDoneCallback iOnDoneCallback, String str, da9 da9Var) {
        hrb.a(new vp8((Object) a36Var, (Object) iOnDoneCallback, (Object) str, (Object) da9Var, (byte) 9));
    }

    public static void c(IOnDoneCallback iOnDoneCallback, String str, da9 da9Var) {
        hrb.a(new sa8(iOnDoneCallback, str, da9Var, (byte) 17));
    }

    public static void d(String str, ea9 ea9Var) {
        try {
            e(str, ea9Var);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void e(String str, ea9 ea9Var) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            ea9Var.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new zp2(qd4.y("Remote ", str, " call failed"), e2);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new o48(iOnDoneCallback, (Object) exc, str, (byte) 5));
    }
}
