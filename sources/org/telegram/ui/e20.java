package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e20 extends View {
    public final /* synthetic */ c40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = c40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.U0();
        }
    }
}
