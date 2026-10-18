package ei;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class r7 extends s4.r0 {
    public final /* synthetic */ s7 a;

    public r7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            s7 s7Var = this.a;
            if (s7Var.i0) {
                s7Var.i0 = false;
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        s7 s7Var = this.a;
        s7Var.e0();
        s7Var.Y();
        if (!s7Var.d.I1 || s7Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) s7Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
