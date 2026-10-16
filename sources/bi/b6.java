package bi;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b6 extends s4.r0 {
    public final /* synthetic */ w6 a;

    public b6(w6 w6Var) {
        this.a = w6Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        w6 w6Var = this.a;
        if (i10 == 0) {
            w6Var.V = true;
            w6Var.invalidate();
        }
        if (i10 == 1) {
            w6Var.V = false;
            a5.a aVar = w6Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            AndroidUtilities.hideKeyboard(w6Var);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        w6 w6Var = this.a;
        w6Var.c();
        w6Var.invalidate();
    }
}
