package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class qb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ qb(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$checkSensitive$450(this.b);
                break;
            case 1:
                org.telegram.ui.Components.f5.t0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.f5.t0(8, this.b, null);
                break;
            default:
                TranslateController.lambda$pushToSummarize$18(this.b);
                break;
        }
    }
}
