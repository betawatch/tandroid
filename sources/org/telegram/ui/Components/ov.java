package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ov implements View.OnFocusChangeListener {
    public final /* synthetic */ ly a;

    public ov(ly lyVar) {
        this.a = lyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ly lyVar = this.a;
            lyVar.X0 = G0;
            org.telegram.messenger.si.b0(lyVar.d1).M(lyVar.X0, false);
        }
    }
}
