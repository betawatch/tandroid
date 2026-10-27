package di;

import a8.ng;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
