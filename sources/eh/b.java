package eh;

import android.view.View;
import android.view.WindowInsets;
import cg.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y10;
import r0.m1;
import r0.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements y10, o {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        f fVar = this.a;
        fVar.processLegacyContainerInsets(g10);
        fVar.U.a(m1Var.a.f(8).d > 0, true);
        return m1.b;
    }

    @Override // org.telegram.ui.Components.y10
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.a;
        if (fVar.h0 != min) {
            fVar.h0 = min;
            fVar.T.a(min);
            fVar.d0.postOnAnimation(new m2(fVar, 13));
        }
    }
}
