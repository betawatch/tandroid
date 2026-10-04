package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
