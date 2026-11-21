package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
            org.telegram.messenger.ri.d0(tyVar.d1).O(tyVar.X0, false);
        }
    }
}
