package fi;

import java.util.List;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements z10 {
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

    @Override // org.telegram.messenger.z10
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
