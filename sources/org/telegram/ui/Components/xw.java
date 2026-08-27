package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xw extends f2.x {
    public final /* synthetic */ yy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(yy yyVar) {
        super(8);
        this.Q = yyVar;
    }

    @Override // f2.k0, f2.x0
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        try {
            lh.l1 l1Var2 = new lh.l1(this, recyclerView.getContext(), 2);
            l1Var2.a = i10;
            w0(l1Var2);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
