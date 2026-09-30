package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ td(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.b);
                break;
            case 1:
                org.telegram.ui.Components.e5.t0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.e5.t0(8, this.b, null);
                break;
            default:
                TranslateController.lambda$pushToSummarize$18(this.b);
                break;
        }
    }
}
