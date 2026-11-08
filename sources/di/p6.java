package di;

import java.util.List;
import org.telegram.messenger.d20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
