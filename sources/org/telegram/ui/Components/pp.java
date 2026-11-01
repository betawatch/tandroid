package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pp extends LinearLayout {
    public final /* synthetic */ sp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(sp spVar, Context context) {
        super(context);
        this.a = spVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        sp.I0(this.a);
    }
}
