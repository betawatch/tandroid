package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ c6(org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = e2Var;
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

    public /* synthetic */ c6(boolean[] zArr, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = e2Var;
    }
}
