package org.telegram.messenger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ x5(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = a2Var;
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

    public /* synthetic */ x5(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = a2Var;
    }
}
