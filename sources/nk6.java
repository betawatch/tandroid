// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nk6 implements bs4 {
    public final /* synthetic */ pk6 a;

    public nk6(pk6 pk6Var) {
        this.a = pk6Var;
    }

    @Override // bs4
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        pk6 pk6Var = this.a;
        pk6Var.getClass();
        entry.getClass();
        return new mk6(entry, pk6Var);
    }
}
