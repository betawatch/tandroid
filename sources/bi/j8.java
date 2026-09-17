package bi;

import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
