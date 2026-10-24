package e9;

import java.util.Map;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        return this.b.q(entry.getKey(), entry.getValue());
    }
}
