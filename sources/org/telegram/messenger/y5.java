package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ y5(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = c2Var;
        this.c = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController.lambda$saveFile$45(this.c, this.b);
                break;
            case 1:
                MediaController.lambda$saveFile$49(this.b, this.c);
                break;
            case 2:
                MediaController.lambda$saveFile$52(this.c, this.b);
                break;
            default:
                MediaController.lambda$saveFile$54(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ y5(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = c2Var;
    }
}
