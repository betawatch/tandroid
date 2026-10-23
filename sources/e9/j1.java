package e9;

import java.util.Map;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
