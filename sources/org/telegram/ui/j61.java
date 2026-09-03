package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dh.b b;

    public /* synthetic */ j61(dh.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((n51) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
