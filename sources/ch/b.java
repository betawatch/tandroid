package ch;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q10;
import r0.m1;
import r0.o;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements q10, o {
    public final /* synthetic */ h a;

    public /* synthetic */ b(h hVar) {
        this.a = hVar;
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        h hVar = this.a;
        hVar.processLegacyContainerInsets(g10);
        hVar.U.a(m1Var.a.f(8).d > 0, true);
        return m1.b;
    }

    @Override // org.telegram.ui.Components.q10
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        h hVar = this.a;
        if (hVar.h0 != min) {
            hVar.h0 = min;
            hVar.T.a(min);
            hVar.d0.postOnAnimation(new af.e(hVar, 26));
        }
    }
}
