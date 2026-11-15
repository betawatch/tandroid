package fi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ x5(s6 s6Var, int i7) {
        this.a = i7;
        this.b = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s6 s6Var = this.b;
                s6Var.R = false;
                s6Var.S = null;
                break;
            case 1:
                s6 s6Var2 = this.b;
                s6Var2.s = true;
                s6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                s6 s6Var3 = this.b;
                s6Var3.R = false;
                s6Var3.S = null;
                break;
        }
    }
}
