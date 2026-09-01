package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr0 b;

    public /* synthetic */ pr0(yr0 yr0Var, int i10) {
        this.a = i10;
        this.b = yr0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.qc(this.b.b.b0, null).m(org.telegram.ui.Components.pc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.qc(this.b.b.b0, null).m(org.telegram.ui.Components.pc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
