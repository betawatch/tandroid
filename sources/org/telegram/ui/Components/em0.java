package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
