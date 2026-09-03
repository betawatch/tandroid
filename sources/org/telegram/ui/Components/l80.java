package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ l80(m80 m80Var, boolean z4, boolean z10, int i10) {
        this.a = i10;
        this.b = m80Var;
        this.c = z4;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l80(this.b, this.c, this.d, 1));
                break;
            default:
                m80 m80Var = this.b;
                m80Var.setJoinRequest(this.c);
                m80Var.setJoinToSend(this.d);
                break;
        }
    }
}
