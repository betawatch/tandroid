package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh.b b;

    public /* synthetic */ q51(bh.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((u41) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
