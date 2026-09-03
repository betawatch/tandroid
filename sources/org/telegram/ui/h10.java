package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h10 extends org.telegram.ui.Components.u00 {
    public final /* synthetic */ int R;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h10(Object obj, Context context, int i10) {
        super(context, null);
        this.R = i10;
        this.S = obj;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        switch (this.R) {
            case 0:
                return ((t10) this.S).s;
            default:
                return ((r10) this.S).d.s;
        }
    }
}
