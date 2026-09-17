package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = k80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.b, this.c, this.d, 1));
                break;
            default:
                k80 k80Var = this.b;
                k80Var.setJoinRequest(this.c);
                k80Var.setJoinToSend(this.d);
                break;
        }
    }
}
