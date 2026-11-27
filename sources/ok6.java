// default package

import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
