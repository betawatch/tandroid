package ih;

import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Utilities.CallbackReturn {
    public final /* synthetic */ n6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ m6(n6 n6Var, boolean z10, int i9, List list) {
        this.a = n6Var;
        this.b = z10;
        this.c = i9;
        this.d = list;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
