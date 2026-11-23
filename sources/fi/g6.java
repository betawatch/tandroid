package fi;

import java.util.List;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements z10 {
    public final /* synthetic */ h6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ g6(h6 h6Var, boolean z10, int i7, List list) {
        this.a = h6Var;
        this.b = z10;
        this.c = i7;
        this.d = list;
    }

    @Override // org.telegram.messenger.z10
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
