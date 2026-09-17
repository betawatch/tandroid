package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class f40 extends View {
    public final /* synthetic */ j60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = j60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
