package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class nz extends org.telegram.ui.Components.pz {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.pz
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((zz) this.W).s;
            default:
                return ((xz) this.W).d.s;
        }
    }
}
