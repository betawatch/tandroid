package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class it0 extends org.telegram.ui.Cells.v2 {
    public final /* synthetic */ jt0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it0(jt0 jt0Var, Context context) {
        super(context, true);
        this.a5 = jt0Var;
    }

    @Override // org.telegram.ui.Cells.v2
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.v2
    public final boolean getIsPinned() {
        jt0 jt0Var = this.a5;
        ArrayList arrayList = jt0Var.f;
        ss0 ss0Var = jt0Var.s;
        if (ss0Var == null || ss0Var.getAdapter() != jt0Var) {
            return false;
        }
        jt0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.gw) arrayList.get(R)).b;
    }
}
