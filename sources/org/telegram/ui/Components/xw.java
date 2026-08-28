package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xw extends f2.y {
    public final /* synthetic */ wy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(wy wyVar) {
        super(8);
        this.Q = wyVar;
    }

    @Override // f2.m0, f2.z0
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        try {
            kh.n1 n1Var2 = new kh.n1(this, recyclerView.getContext(), 2);
            n1Var2.a = i9;
            w0(n1Var2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
