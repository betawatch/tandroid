package bi;

import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements Utilities.CallbackReturn {
    public final /* synthetic */ l8 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ j8(l8 l8Var, boolean z10, int i10, List list) {
        this.a = l8Var;
        this.b = z10;
        this.c = i10;
        this.d = list;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
