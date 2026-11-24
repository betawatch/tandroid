// default package

import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
