package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mc;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k0 extends mc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(r1 r1Var, r1 r1Var2, int i7) {
        super(r1Var);
        this.k = i7;
        this.l = r1Var2;
    }

    @Override // org.telegram.ui.Components.mc
    public final void b() {
        switch (this.k) {
            case 0:
                ((r1) this.l).q2();
                break;
            case 1:
                ((r1) this.l).q2();
                break;
            default:
                ((xw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(xw0 xw0Var) {
        super((View) null);
        this.k = 2;
        this.l = xw0Var;
    }
}
