package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d51 extends ImageReceiver {
    public final /* synthetic */ e51 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d51(e51 e51Var) {
        super(null);
        this.J1 = e51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.o5
    public final void invalidate() {
        this.J1.invalidate();
    }
}
