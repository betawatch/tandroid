package bh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n10;
import r0.m1;
import r0.o;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements n10, o {
    public final /* synthetic */ j a;

    public /* synthetic */ b(j jVar) {
        this.a = jVar;
    }

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        j jVar = this.a;
        jVar.processLegacyContainerInsets(g10);
        jVar.U.a(m1Var.a.f(8).d > 0, true);
        return m1.b;
    }

    @Override // org.telegram.ui.Components.n10
    public void a(int i9) {
        int min = Math.min(i9, AndroidUtilities.dp(144.0f));
        if (i9 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        j jVar = this.a;
        if (jVar.h0 != min) {
            jVar.h0 = min;
            jVar.T.a(min);
            jVar.d0.postOnAnimation(new af.e(jVar, 14));
        }
    }
}
