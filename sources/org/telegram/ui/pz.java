package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pz extends org.telegram.ui.Components.lz {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz(int i7, Context context, Object obj) {
        super(context, null);
        this.U = i7;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.lz
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((b00) this.V).s;
            default:
                return ((zz) this.V).d.s;
        }
    }
}
