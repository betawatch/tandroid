package di;

import java.util.List;
import org.telegram.messenger.d20;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements d20 {
    public final /* synthetic */ q6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ p6(q6 q6Var, boolean z9, int i7, List list) {
        this.a = q6Var;
        this.b = z9;
        this.c = i7;
        this.d = list;
    }

    @Override // org.telegram.messenger.d20
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
