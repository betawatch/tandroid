package kh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s8 extends f2.d1 {
    public final /* synthetic */ u8 a;

    public s8(u8 u8Var) {
        this.a = u8Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }
}
