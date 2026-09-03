package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i10 extends org.telegram.ui.Components.u00 {
    public final /* synthetic */ int R;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i10(Object obj, Context context, int i10) {
        super(context, null);
        this.R = i10;
        this.S = obj;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        switch (this.R) {
            case 0:
                return ((u10) this.S).s;
            default:
                return ((s10) this.S).d.s;
        }
    }
}
