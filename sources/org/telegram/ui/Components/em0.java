package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class em0 extends kv0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ org.telegram.ui.kw M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em0(org.telegram.ui.kw kwVar, Context context, wz wzVar, int i7) {
        super(context, wzVar, 1, null);
        this.L = i7;
        this.M = kwVar;
    }

    @Override // org.telegram.ui.Components.kv0, android.view.View
    public final void setVisibility(int i7) {
        switch (this.L) {
            case 0:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
