package di;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d61;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class p4 extends d61 {
    public final /* synthetic */ fb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(fb fbVar, Context context, int i10, n4 n4Var, a1.c cVar, bi.b bVar) {
        super(context, i10, 0, false, n4Var, cVar, null, bVar, -1, 0);
        this.f3 = fbVar;
    }

    @Override // org.telegram.ui.Components.d61
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (e2.h) new ah.m(this, 5));
    }

    @Override // org.telegram.ui.Components.ll0
    public final Integer V0(int i10) {
        return 0;
    }
}
