package hh;

import android.view.View;
import android.view.WindowInsets;
import eh.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e20;
import r0.m1;
import r0.o;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements e20, o {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // r0.o
    public m1 M0(View view, m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        f fVar = this.a;
        fVar.processLegacyContainerInsets(g10);
        fVar.V.a(m1Var.a.f(8).d > 0, true);
        return m1.b;
    }

    @Override // org.telegram.ui.Components.e20
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.a;
        if (fVar.i0 != min) {
            fVar.i0 = min;
            fVar.U.a(min);
            fVar.e0.postOnAnimation(new m(fVar, 17));
        }
    }
}
