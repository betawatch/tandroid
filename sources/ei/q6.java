package ei;

import java.util.List;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements v10 {
    public final /* synthetic */ r6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ q6(r6 r6Var, boolean z10, int i3, List list) {
        this.a = r6Var;
        this.b = z10;
        this.c = i3;
        this.d = list;
    }

    @Override // org.telegram.messenger.v10
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
