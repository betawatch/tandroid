package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ xd(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$checkSensitive$447(this.b);
                break;
            case 1:
                org.telegram.ui.Components.z4.t0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.z4.t0(8, this.b, null);
                break;
            default:
                TranslateController.lambda$pushToSummarize$18(this.b);
                break;
        }
    }
}
