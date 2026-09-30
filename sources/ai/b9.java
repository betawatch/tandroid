package ai;

import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements Utilities.CallbackReturn {
    public final /* synthetic */ d9 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ b9(d9 d9Var, boolean z10, int i10, List list) {
        this.a = d9Var;
        this.b = z10;
        this.c = i10;
        this.d = list;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
