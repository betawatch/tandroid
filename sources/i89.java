// default package

import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class i89 {
    public final fm4 a;
    public final mm5 b;
    public final long c;
    public final List d;
    public final az8 e;

    public i89(fm4 fm4Var, mm5 mm5Var, tv9 tv9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        gre.f(!mm5Var.isEmpty());
        this.a = fm4Var;
        this.b = mm5.q(mm5Var);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = tv9Var.b(this);
        long j = tv9Var.c;
        long j2 = tv9Var.b;
        String str = g8c.a;
        this.c = g8c.b0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public String a() {
        return null;
    }

    public abstract r53 b();

    public az8 c() {
        return null;
    }
}
