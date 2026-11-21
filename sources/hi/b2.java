package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.k01;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class b2 extends fq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.fq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, (org.telegram.ui.ActionBar.h6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.i).c.b.s0;
            case 2:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, ((gy) this.i).H.a2);
            case 3:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Q5, ((tl0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, ((k01) this.i).G.a1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(gy gyVar) {
        super(1.25f);
        this.h = 2;
        this.i = gyVar;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(org.telegram.ui.ActionBar.h6 h6Var) {
        super(1.25f);
        this.h = 0;
        this.i = h6Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(k01 k01Var) {
        super(1.25f);
        this.h = 4;
        this.i = k01Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }
}
