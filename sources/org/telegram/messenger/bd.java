package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class bd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ bd(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$checkSensitive$453(this.b);
                break;
            case 1:
                org.telegram.ui.Components.g5.s0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.g5.s0(8, this.b, null);
                break;
            default:
                TranslateController.lambda$pushToSummarize$18(this.b);
                break;
        }
    }
}
