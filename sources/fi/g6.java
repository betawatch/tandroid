package fi;

import java.util.List;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
