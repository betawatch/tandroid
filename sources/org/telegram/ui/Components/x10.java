package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class x10 extends m40 {
    public final /* synthetic */ FragmentContextView I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(FragmentContextView fragmentContextView, Context context) {
        super(6, context, null, true);
        this.I = fragmentContextView;
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            try {
                this.I.B0.removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
