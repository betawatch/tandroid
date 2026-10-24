package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ a6(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = c2Var;
        this.c = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController.lambda$saveFile$48(this.c, this.b);
                break;
            case 1:
                MediaController.lambda$saveFile$52(this.b, this.c);
                break;
            case 2:
                MediaController.lambda$saveFile$57(this.b, this.c);
                break;
            default:
                MediaController.lambda$saveFile$55(this.c, this.b);
                break;
        }
    }

    public /* synthetic */ a6(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = c2Var;
    }
}
