package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lx extends f2.w {
    public final /* synthetic */ mz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(mz mzVar) {
        super(8);
        this.Q = mzVar;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        try {
            fx fxVar = new fx(this, recyclerView.getContext(), 1);
            fxVar.a = i10;
            w0(fxVar);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
