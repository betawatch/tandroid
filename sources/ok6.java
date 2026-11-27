// default package

import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ok6 extends n3 {
    public final /* synthetic */ Map.Entry b;
    public final /* synthetic */ rk6 c;

    public ok6(Map.Entry entry, rk6 rk6Var) {
        super((byte) 0, false);
        this.b = entry;
        this.c = rk6Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.b;
        return this.c.c(entry.getKey(), entry.getValue());
    }
}
