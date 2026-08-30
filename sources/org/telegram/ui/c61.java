package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dh.b b;

    public /* synthetic */ c61(dh.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((g51) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
