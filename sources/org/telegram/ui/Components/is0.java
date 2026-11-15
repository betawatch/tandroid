package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.Cells.t2 {
    public final /* synthetic */ js0 b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(js0 js0Var, Context context) {
        super(context, true);
        this.b5 = js0Var;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean Z() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean getIsPinned() {
        js0 js0Var = this.b5;
        ArrayList arrayList = js0Var.f;
        sr0 sr0Var = js0Var.s;
        if (sr0Var == null || sr0Var.getAdapter() != js0Var) {
            return false;
        }
        js0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.sv) arrayList.get(R)).b;
    }
}
