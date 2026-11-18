package fi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ u5(p6 p6Var, int i7) {
        this.a = i7;
        this.b = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p6 p6Var = this.b;
                p6Var.R = false;
                p6Var.S = null;
                break;
            case 1:
                p6 p6Var2 = this.b;
                p6Var2.s = true;
                p6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                p6 p6Var3 = this.b;
                p6Var3.R = false;
                p6Var3.S = null;
                break;
        }
    }
}
