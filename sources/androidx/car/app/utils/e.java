package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class e {
    public static IOnDoneCallback a() {
        final cp7 cp7Var = null;
        return new IOnDoneCallback.Stub(cp7Var) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ cp7 val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(y21 y21Var) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(y21 y21Var) {
                throw null;
            }
        };
    }

    public static void b(w06 w06Var, IOnDoneCallback iOnDoneCallback, String str, q69 q69Var) {
        hnb.a(new bm8((Object) w06Var, (Object) iOnDoneCallback, (Object) str, (Object) q69Var, (byte) 8));
    }

    public static void c(IOnDoneCallback iOnDoneCallback, String str, q69 q69Var) {
        hnb.a(new gm8(iOnDoneCallback, str, q69Var, (byte) 9));
    }

    public static void d(String str, r69 r69Var) {
        try {
            e(str, r69Var);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void e(String str, r69 r69Var) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            r69Var.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new gp2(tb4.y("Remote ", str, " call failed"), e2);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        d(str.concat(" onFailure"), new lt2((Object) iOnDoneCallback, (Object) exc, (Object) str, (byte) 26));
    }
}
