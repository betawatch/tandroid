package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh.b b;

    public /* synthetic */ j61(eh.b bVar, int i10) {
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
