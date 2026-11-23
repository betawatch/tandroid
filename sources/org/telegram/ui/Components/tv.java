package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tv implements View.OnFocusChangeListener {
    public final /* synthetic */ qy a;

    public tv(qy qyVar) {
        this.a = qyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            qy qyVar = this.a;
            qyVar.X0 = G0;
            org.telegram.messenger.ri.d0(qyVar.d1).O(qyVar.X0, false);
        }
    }
}
