package m4;

import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class l1 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final j1 d;

    static {
        String str = e2.d0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public l1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static l1 a(Bundle bundle) {
        j1 j1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j3 = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(j1.d, MediaDataController.MAX_STYLE_RUNS_COUNT);
            String string = bundle3.getString(j1.e, "");
            Bundle bundle4 = bundle3.getBundle(j1.f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            j1Var = new j1(string, i11, bundle4);
        } else {
            j1Var = i10 != 0 ? new j1(i10) : null;
        }
        j1 j1Var2 = j1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new l1(i10, bundle2, j3, j1Var2);
    }

    public l1(int i10, Bundle bundle, long j3, j1 j1Var) {
        e2.d.b(j1Var == null || i10 < 0);
        this.a = i10;
        this.b = new Bundle(bundle);
        this.c = j3;
        if (j1Var == null && i10 < 0) {
            j1Var = new j1(i10);
        }
        this.d = j1Var;
    }
}
