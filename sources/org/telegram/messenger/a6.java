package org.telegram.messenger;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ a6(org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = a2Var;
        this.c = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController.lambda$saveFile$46(this.c, this.b);
                break;
            case 1:
                MediaController.lambda$saveFile$50(this.b, this.c);
                break;
            case 2:
                MediaController.lambda$saveFile$53(this.c, this.b);
                break;
            default:
                MediaController.lambda$saveFile$55(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ a6(boolean[] zArr, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = a2Var;
    }
}
