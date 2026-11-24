// default package

import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ki6 extends m3 {
    public final /* synthetic */ Map.Entry b;
    public final /* synthetic */ ni6 c;

    public ki6(Map.Entry entry, ni6 ni6Var) {
        super((byte) 0, false);
        this.b = entry;
        this.c = ni6Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.b;
        return this.c.e(entry.getKey(), entry.getValue());
    }
}
