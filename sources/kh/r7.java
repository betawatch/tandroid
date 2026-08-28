package kh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r7 extends f2.d1 {
    public final /* synthetic */ s7 a;

    public r7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0) {
            s7 s7Var = this.a;
            if (s7Var.e0) {
                s7Var.e0 = false;
            }
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        s7 s7Var = this.a;
        s7Var.c0();
        s7Var.W();
        if (!s7Var.d.G1 || s7Var.e0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) s7Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
