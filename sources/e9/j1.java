package e9;

import java.util.Map;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class j1 extends n {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ l1 b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.a = entry;
        this.b = l1Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.p(entry.getKey(), entry.getValue());
    }
}
