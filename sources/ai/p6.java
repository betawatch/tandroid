package ai;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class p6 extends s4.s0 {
    public final /* synthetic */ k7 a;

    public p6(k7 k7Var) {
        this.a = k7Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        k7 k7Var = this.a;
        if (i10 == 0) {
            k7Var.V = true;
            k7Var.invalidate();
        }
        if (i10 == 1) {
            k7Var.V = false;
            a5.a aVar = k7Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            AndroidUtilities.hideKeyboard(k7Var);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k7 k7Var = this.a;
        k7Var.c();
        k7Var.invalidate();
    }
}
