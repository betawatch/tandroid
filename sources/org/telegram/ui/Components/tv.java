package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
