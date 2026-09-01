package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t61 extends ImageReceiver {
    public final /* synthetic */ u61 a;

    public t61(u61 u61Var) {
        this.a = u61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.r5
    public final void invalidate() {
        this.a.invalidate();
    }
}
