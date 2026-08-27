package jh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ v5(s6 s6Var, int i10) {
        this.a = i10;
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
