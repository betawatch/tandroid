package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class hm0 extends nv0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ org.telegram.ui.kw M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm0(org.telegram.ui.kw kwVar, Context context, yz yzVar, int i7) {
        super(context, yzVar, 1, null);
        this.L = i7;
        this.M = kwVar;
    }

    @Override // org.telegram.ui.Components.nv0, android.view.View
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
