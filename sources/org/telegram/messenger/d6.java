package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ d6(org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, int i10) {
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

    public /* synthetic */ d6(boolean[] zArr, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = e2Var;
    }
}
