package h9;

import java.util.Map;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        return this.b.m(entry.getKey(), entry.getValue());
    }
}
