package b1;

import a8.d7;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import hd.p;
import hd.r;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import rd.l;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
            set = p.a;
        } else if (length != 1) {
            set = new LinkedHashSet(r.b(numArr.length));
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
        intent.putExtra("RESULT_RECEIVER", d(resultReceiver));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, rd.p pVar, Executor executor, v0.g callback, CancellationSignal cancellationSignal) {
        j.e(executor, "executor");
        j.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        d7.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i7, rd.p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i7 == -1) {
            return false;
        }
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r();
        rVar.a = new w0.c(2, jg.g.k(i7, "activity with result code: ", " indicating not RESULT_OK"));
        if (i7 == 0) {
            rVar.a = new w0.b("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new c(lVar, rVar, 0));
        return true;
    }

    public static ResultReceiver d(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        j.d(obtain, "obtain(...)");
        j.b(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
