package ai;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class q6 extends s4.t0 {
    public final /* synthetic */ l7 a;

    public q6(l7 l7Var) {
        this.a = l7Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        l7 l7Var = this.a;
        if (i10 == 0) {
            l7Var.V = true;
            l7Var.invalidate();
        }
        if (i10 == 1) {
            l7Var.V = false;
            a5.a aVar = l7Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            AndroidUtilities.hideKeyboard(l7Var);
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l7 l7Var = this.a;
        l7Var.c();
        l7Var.invalidate();
    }
}
