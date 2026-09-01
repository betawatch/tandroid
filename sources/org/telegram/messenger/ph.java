package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ph(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.a = i10;
        this.b = callback2;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$3(this.b, this.c);
                break;
            default:
                PasskeysController.lambda$create$8(this.b, this.c);
                break;
        }
    }
}
