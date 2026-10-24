package m4;

import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.MediaDataController;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class s1 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final q1 d;

    static {
        String str = e2.m0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public s1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static s1 a(Bundle bundle) {
        q1 q1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle o10 = e2.m0.o(bundle.getBundle(f));
        long j10 = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i11 = bundle2.getInt(q1.d, MediaDataController.MAX_STYLE_RUNS_COUNT);
            String string = bundle2.getString(q1.e, "");
            Bundle o11 = e2.m0.o(bundle2.getBundle(q1.f));
            if (o11 == null) {
                o11 = Bundle.EMPTY;
            }
            q1Var = new q1(string, i11, o11);
        } else {
            q1Var = i10 != 0 ? new q1(i10) : null;
        }
        q1 q1Var2 = q1Var;
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        return new s1(i10, o10, j10, q1Var2);
    }

    public s1(int i10, Bundle bundle, long j10, q1 q1Var) {
        u6.g(q1Var == null || i10 < 0);
        this.a = i10;
        this.b = new Bundle(bundle);
        this.c = j10;
        if (q1Var == null && i10 < 0) {
            q1Var = new q1(i10);
        }
        this.d = q1Var;
    }
}
