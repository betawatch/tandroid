package di;

import a8.ng;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z4 extends s4.u0 {
    public final /* synthetic */ t5 a;

    public z4(t5 t5Var) {
        this.a = t5Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        t5 t5Var = this.a;
        if (i10 == 0) {
            t5Var.V = true;
            t5Var.invalidate();
        }
        if (i10 == 1) {
            t5Var.V = false;
            ng ngVar = t5Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) ngVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) ngVar.c).cancel();
                ngVar.c = null;
            }
            AndroidUtilities.hideKeyboard(t5Var);
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t5 t5Var = this.a;
        t5Var.c();
        t5Var.invalidate();
    }
}
