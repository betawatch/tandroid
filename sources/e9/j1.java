package e9;

import java.util.Map;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
