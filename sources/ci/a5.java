package ci;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class a5 extends s4.r0 {
    public final /* synthetic */ u5 a;

    public a5(u5 u5Var) {
        this.a = u5Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        u5 u5Var = this.a;
        if (i10 == 0) {
            u5Var.V = true;
            u5Var.invalidate();
        }
        if (i10 == 1) {
            u5Var.V = false;
            a5.a aVar = u5Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            AndroidUtilities.hideKeyboard(u5Var);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u5 u5Var = this.a;
        u5Var.c();
        u5Var.invalidate();
    }
}
