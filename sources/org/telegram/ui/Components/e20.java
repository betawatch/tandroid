package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e20 extends t40 {
    public final /* synthetic */ FragmentContextView I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(FragmentContextView fragmentContextView, Context context) {
        super(6, context, null, true);
        this.I = fragmentContextView;
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            try {
                this.I.C0.removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
