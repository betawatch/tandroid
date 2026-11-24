// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mk6 extends m3 {
    public final /* synthetic */ Map.Entry b;
    public final /* synthetic */ pk6 c;

    public mk6(Map.Entry entry, pk6 pk6Var) {
        super((byte) 0, false);
        this.b = entry;
        this.c = pk6Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.b;
        return this.c.f(entry.getKey(), entry.getValue());
    }
}
