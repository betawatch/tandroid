package lh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class q8 extends f2.b1 {
    public final /* synthetic */ s8 a;

    public q8(s8 s8Var) {
        this.a = s8Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        viewGroup.invalidate();
    }
}
