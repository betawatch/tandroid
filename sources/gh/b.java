package gh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
import r0.m1;
import r0.o;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements d20, o {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // r0.o
    public m1 N0(View view, m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        f fVar = this.a;
        fVar.processLegacyContainerInsets(g10);
        fVar.V.a(m1Var.a.f(8).d > 0, true);
        return m1.b;
    }

    @Override // org.telegram.ui.Components.d20
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.a;
        if (fVar.i0 != min) {
            fVar.i0 = min;
            fVar.U.a(min);
            fVar.e0.postOnAnimation(new ef.e(fVar, 15));
        }
    }
}
