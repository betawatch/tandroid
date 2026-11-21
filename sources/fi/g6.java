package fi;

import java.util.List;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements y10 {
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

    @Override // org.telegram.messenger.y10
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
