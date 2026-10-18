package org.telegram.messenger;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class mb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ mb(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.b);
                break;
            case 1:
                org.telegram.ui.Components.f5.s0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.f5.s0(8, this.b, null);
                break;
            default:
                TranslateController.lambda$pushToSummarize$18(this.b);
                break;
        }
    }
}
