package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
