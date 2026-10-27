package di;

import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements Utilities.CallbackReturn {
    public final /* synthetic */ z6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ y6(z6 z6Var, boolean z10, int i10, List list) {
        this.a = z6Var;
        this.b = z10;
        this.c = i10;
        this.d = list;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
