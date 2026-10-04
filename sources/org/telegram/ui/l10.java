package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class l10 extends org.telegram.ui.Components.w00 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.w00
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((x10) this.V).s;
            default:
                return ((v10) this.V).d.s;
        }
    }
}
