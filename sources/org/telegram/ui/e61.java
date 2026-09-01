package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh.b b;

    public /* synthetic */ e61(eh.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((i51) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
