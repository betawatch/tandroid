package h9;

import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        return this.b.a(entry.getKey(), entry.getValue());
    }
}
