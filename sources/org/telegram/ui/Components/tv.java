package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tv implements View.OnFocusChangeListener {
    public final /* synthetic */ ry a;

    public tv(ry ryVar) {
        this.a = ryVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ry ryVar = this.a;
            ryVar.X0 = G0;
            org.telegram.messenger.ri.d0(ryVar.d1).O(ryVar.X0, false);
        }
    }
}
