package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import f7.f0;
import j3.r0;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import pc.r;
import zc.l;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d {
    public static final a a = new a();
    public static final LinkedHashSet b;
    public static final int c;
    public static final /* synthetic */ int d = 0;

    static {
        Integer[] numArr = {7, 20};
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(2));
        for (int i9 = 0; i9 < 2; i9++) {
            linkedHashSet.add(numArr[i9]);
        }
        b = linkedHashSet;
        c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        i.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c);
        Parcel obtain = Parcel.obtain();
        i.d(obtain, "obtain(...)");
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, p pVar, Executor executor, v0.i callback, CancellationSignal cancellationSignal) {
        i.e(executor, "executor");
        i.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        f0.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i9, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i9 == -1) {
            return false;
        }
        kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
        pVar2.a = new w0.c(r0.m(i9, "activity with result code: ", " indicating not RESULT_OK"), 2);
        if (i9 == 0) {
            pVar2.a = new w0.b("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new c(lVar, pVar2, 0));
        return true;
    }
}
