package h9;

import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e1 extends k {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ h1 b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.a = entry;
        this.b = h1Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.j(entry.getKey(), entry.getValue());
    }
}
