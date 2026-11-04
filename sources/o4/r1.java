package o4;

import android.os.Bundle;
import android.os.SystemClock;
import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r1 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final p1 d;

    static {
        String str = g2.n0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public r1(int i3) {
        this(i3, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static r1 a(Bundle bundle) {
        p1 p1Var;
        int i3 = bundle.getInt(e, -1);
        Bundle o10 = g2.n0.o(bundle.getBundle(f));
        long j10 = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(p1.d, 1000);
            String string = bundle2.getString(p1.e, "");
            Bundle o11 = g2.n0.o(bundle2.getBundle(p1.f));
            if (o11 == null) {
                o11 = Bundle.EMPTY;
            }
            p1Var = new p1(string, i10, o11);
        } else {
            p1Var = i3 != 0 ? new p1(i3) : null;
        }
        p1 p1Var2 = p1Var;
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        return new r1(i3, o10, j10, p1Var2);
    }

    public r1(int i3, Bundle bundle, long j10, p1 p1Var) {
        zb.f(p1Var == null || i3 < 0);
        this.a = i3;
        this.b = new Bundle(bundle);
        this.c = j10;
        if (p1Var == null && i3 < 0) {
            p1Var = new p1(i3);
        }
        this.d = p1Var;
    }
}
