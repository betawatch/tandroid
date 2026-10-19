package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ py0 a;

    public /* synthetic */ zx0(py0 py0Var) {
        this.a = py0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
        py0.D(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new g50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
