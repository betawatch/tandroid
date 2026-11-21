package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.Cells.u2 {
    public final /* synthetic */ us0 b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(us0 us0Var, Context context) {
        super(context, true);
        this.b5 = us0Var;
    }

    @Override // org.telegram.ui.Cells.u2
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.u2
    public final boolean getIsPinned() {
        us0 us0Var = this.b5;
        ArrayList arrayList = us0Var.f;
        cs0 cs0Var = us0Var.s;
        if (cs0Var == null || cs0Var.getAdapter() != us0Var) {
            return false;
        }
        us0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.ov) arrayList.get(R)).b;
    }
}
