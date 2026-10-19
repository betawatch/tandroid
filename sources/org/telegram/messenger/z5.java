package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ z5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = b2Var;
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

    public /* synthetic */ z5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a = i10;
        this.c = zArr;
        this.b = b2Var;
    }
}
