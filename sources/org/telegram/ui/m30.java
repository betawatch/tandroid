package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class m30 extends View {
    public final /* synthetic */ q50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = q50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.T0();
        }
    }
}
