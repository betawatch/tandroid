// default package

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class li6 implements aq4 {
    public final /* synthetic */ ni6 a;

    public li6(ni6 ni6Var) {
        this.a = ni6Var;
    }

    @Override // aq4
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        ni6 ni6Var = this.a;
        ni6Var.getClass();
        entry.getClass();
        return new ki6(entry, ni6Var);
    }
}
