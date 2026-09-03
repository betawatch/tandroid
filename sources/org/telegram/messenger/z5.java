package org.telegram.messenger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ z5(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = d2Var;
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

    public /* synthetic */ z5(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = d2Var;
    }
}
