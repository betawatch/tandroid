package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import b8.f1;
import ed.q;
import ed.s;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import k2.p1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import od.l;
import od.p;
import v0.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final a a = new a();
    public static final Set b;
    public static final int c;
    public static final /* synthetic */ int d = 0;

    static {
        Set set;
        Integer[] numArr = {7, 20};
        int length = numArr.length;
        if (length == 0) {
            set = q.a;
        } else if (length != 1) {
            set = new LinkedHashSet(s.b(numArr.length));
            for (Integer num : numArr) {
                set.add(num);
            }
        } else {
            set = Collections.singleton(numArr[0]);
            j.d(set, "singleton(...)");
        }
        b = set;
        c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        j.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c);
        Parcel obtain = Parcel.obtain();
        j.d(obtain, "obtain(...)");
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, p pVar, Executor executor, h callback, CancellationSignal cancellationSignal) {
        j.e(executor, "executor");
        j.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        f1.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i3, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i3 == -1) {
            return false;
        }
        r rVar = new r();
        rVar.a = new w0.c(2, p1.j(i3, "activity with result code: ", " indicating not RESULT_OK"));
        if (i3 == 0) {
            rVar.a = new w0.b("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new c(lVar, rVar, 0));
        return true;
    }
}
