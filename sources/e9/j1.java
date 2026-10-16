package e9;

import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        return this.b.k(entry.getKey(), entry.getValue());
    }
}
