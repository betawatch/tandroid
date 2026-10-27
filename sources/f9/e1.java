package f9;

import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e1 extends k {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ g1 b;

    public e1(Map.Entry entry, g1 g1Var) {
        this.a = entry;
        this.b = g1Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.l(entry.getKey(), entry.getValue());
    }
}
