package m4;

import a8.yb;
import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t1 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final r1 d;

    static {
        String str = e2.n0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public t1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static t1 a(Bundle bundle) {
        r1 r1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle o10 = e2.n0.o(bundle.getBundle(f));
        long j10 = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i11 = bundle2.getInt(r1.d, MediaDataController.MAX_STYLE_RUNS_COUNT);
            String string = bundle2.getString(r1.e, "");
            Bundle o11 = e2.n0.o(bundle2.getBundle(r1.f));
            if (o11 == null) {
                o11 = Bundle.EMPTY;
            }
            r1Var = new r1(string, i11, o11);
        } else {
            r1Var = i10 != 0 ? new r1(i10) : null;
        }
        r1 r1Var2 = r1Var;
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        return new t1(i10, o10, j10, r1Var2);
    }

    public t1(int i10, Bundle bundle, long j10, r1 r1Var) {
        yb.g(r1Var == null || i10 < 0);
        this.a = i10;
        this.b = new Bundle(bundle);
        this.c = j10;
        if (r1Var == null && i10 < 0) {
            r1Var = new r1(i10);
        }
        this.d = r1Var;
    }
}
