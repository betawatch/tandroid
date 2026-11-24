// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        gba.o1 = i;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gba.o1).apply();
        pcbVar.invalidate();
        try {
            hn7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
