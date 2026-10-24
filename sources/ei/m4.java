package ei;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ rg.d2 c;

    public /* synthetic */ m4(f6 f6Var, rg.d2 d2Var, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0(this.c, true);
                break;
            default:
                this.b.A0(this.c);
                break;
        }
    }
}
