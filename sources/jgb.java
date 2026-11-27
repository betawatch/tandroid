// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jgb implements dq7, fq7 {
    public final /* synthetic */ lgb a;

    @Override // dq7
    public final String c(int i) {
        return this.a.n[i];
    }

    @Override // fq7
    public final void i(hq7 hq7Var, int i) {
        lgb lgbVar = this.a;
        lgbVar.b();
        xea.n1 = i;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", xea.n1).apply();
        lgbVar.invalidate();
        try {
            hq7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
