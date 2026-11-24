// default package

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h89 extends i89 {
    public final az8 f;
    public final u39 h;

    public h89(fm4 fm4Var, mm5 mm5Var, sv9 sv9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(fm4Var, mm5Var, sv9Var, arrayList, arrayList2, arrayList3);
        Uri.parse(((wg0) mm5Var.get(0)).a);
        long j = sv9Var.e;
        az8 az8Var = j <= 0 ? null : new az8(sv9Var.d, null, j);
        this.f = az8Var;
        this.h = az8Var == null ? new u39(new az8(0L, null, -1L), (byte) 13) : null;
    }

    @Override // i89
    public final String a() {
        return null;
    }

    @Override // i89
    public final r53 b() {
        return this.h;
    }

    @Override // i89
    public final az8 c() {
        return this.f;
    }
}
