package org.telegram.messenger;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ w5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = b2Var;
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

    public /* synthetic */ w5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = b2Var;
    }
}
