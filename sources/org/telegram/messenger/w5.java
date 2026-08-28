package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ w5(org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, int i9) {
        this.a = i9;
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

    public /* synthetic */ w5(boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.a = i9;
        this.c = zArr;
        this.b = c2Var;
    }
}
