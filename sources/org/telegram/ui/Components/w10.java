package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class w10 extends l40 {
    public final /* synthetic */ FragmentContextView I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(FragmentContextView fragmentContextView, Context context) {
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
