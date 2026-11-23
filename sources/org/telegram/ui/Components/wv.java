package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wv implements View.OnFocusChangeListener {
    public final /* synthetic */ ty a;

    public wv(ty tyVar) {
        this.a = tyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ty tyVar = this.a;
            tyVar.X0 = G0;
            org.telegram.messenger.si.d0(tyVar.d1).O(tyVar.X0, false);
        }
    }
}
