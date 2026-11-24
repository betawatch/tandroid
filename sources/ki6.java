// default package

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
