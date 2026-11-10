package di;

import java.util.List;
import org.telegram.messenger.d20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements d20 {
    public final /* synthetic */ r6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ q6(r6 r6Var, boolean z9, int i7, List list) {
        this.a = r6Var;
        this.b = z9;
        this.c = i7;
        this.d = list;
    }

    @Override // org.telegram.messenger.d20
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
