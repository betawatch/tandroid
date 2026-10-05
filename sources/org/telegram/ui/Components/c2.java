package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 b;

    public /* synthetic */ c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a = i10;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.dismiss();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.b.dismiss();
                break;
        }
    }
}
