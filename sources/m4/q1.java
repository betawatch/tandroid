package m4;

import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class q1 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final o1 d;

    static {
        String str = e2.d0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public q1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static q1 a(Bundle bundle) {
        o1 o1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j3 = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(o1.d, MediaDataController.MAX_STYLE_RUNS_COUNT);
            String string = bundle3.getString(o1.e, "");
            Bundle bundle4 = bundle3.getBundle(o1.f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            o1Var = new o1(string, i11, bundle4);
        } else {
            o1Var = i10 != 0 ? new o1(i10) : null;
        }
        o1 o1Var2 = o1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new q1(i10, bundle2, j3, o1Var2);
    }

    public q1(int i10, Bundle bundle, long j3, o1 o1Var) {
        e2.d.b(o1Var == null || i10 < 0);
        this.a = i10;
        this.b = new Bundle(bundle);
        this.c = j3;
        if (o1Var == null && i10 < 0) {
            o1Var = new o1(i10);
        }
        this.d = o1Var;
    }
}
