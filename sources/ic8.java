// default package

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ic8 {
    public static final hc q = new hc(2);
    public final Context a;
    public final gc8 b;
    public final SparseArray c;
    public final boolean d;
    public final xc3 e;
    public final adb f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final vac i;
    public iq j = new iq();
    public cdb k;
    public Pair l;
    public int m;
    public byte n;
    public long o;
    public int p;

    public ic8(zl3 zl3Var) {
        this.a = (Context) zl3Var.d;
        gc8 gc8Var = (gc8) zl3Var.f;
        gc8Var.getClass();
        this.b = gc8Var;
        this.c = new SparseArray();
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.d = zl3Var.a;
        adb adbVar = (adb) zl3Var.g;
        this.f = adbVar;
        long j = zl3Var.c;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        vac vacVar = (vac) zl3Var.h;
        this.i = vacVar;
        this.e = new xc3((uac) zl3Var.e, vacVar, adbVar);
        this.g = new CopyOnWriteArraySet();
        new fm4(new em4());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = (byte) 0;
    }
}
