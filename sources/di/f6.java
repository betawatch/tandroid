package di;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ f6(z6 z6Var, int i7) {
        this.a = i7;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z6 z6Var = this.b;
                z6Var.R = false;
                z6Var.S = null;
                break;
            case 1:
                z6 z6Var2 = this.b;
                z6Var2.s = true;
                z6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                z6 z6Var3 = this.b;
                z6Var3.R = false;
                z6Var3.S = null;
                break;
        }
    }
}
