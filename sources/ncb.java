// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ncb implements dn7, fn7 {
    public final /* synthetic */ pcb a;

    @Override // dn7
    public final String c(int i) {
        return this.a.n[i];
    }

    @Override // fn7
    public final void i(hn7 hn7Var, int i) {
        pcb pcbVar = this.a;
        pcbVar.b();
        gba.n1 = i;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gba.n1).apply();
        pcbVar.invalidate();
        try {
            hn7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
