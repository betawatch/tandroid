package ai;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ k8(m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m9 m9Var = this.b;
                m9Var.R = false;
                m9Var.S = null;
                break;
            case 1:
                m9 m9Var2 = this.b;
                m9Var2.s = true;
                m9Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                m9 m9Var3 = this.b;
                m9Var3.R = false;
                m9Var3.S = null;
                break;
        }
    }
}
