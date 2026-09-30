package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
