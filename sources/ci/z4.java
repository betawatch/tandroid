package ci;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class z4 extends s4.r0 {
    public final /* synthetic */ t5 a;

    public z4(t5 t5Var) {
        this.a = t5Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        t5 t5Var = this.a;
        if (i10 == 0) {
            t5Var.V = true;
            t5Var.invalidate();
        }
        if (i10 == 1) {
            t5Var.V = false;
            a5.a aVar = t5Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            AndroidUtilities.hideKeyboard(t5Var);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t5 t5Var = this.a;
        t5Var.c();
        t5Var.invalidate();
    }
}
