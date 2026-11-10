package bi;

import android.content.Context;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o0 extends m41 {
    public final /* synthetic */ int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(pj0 pj0Var, Context context, int i7, int i10, boolean z9, v10 v10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11) {
        super(pj0Var, context, i7, i10, z9, v10Var, h6Var);
        this.P = i11;
    }

    @Override // org.telegram.ui.Components.m41, org.telegram.ui.Components.oj0
    public boolean D(v4.d1 d1Var) {
        switch (this.P) {
            case 0:
                return false;
            default:
                return super.D(d1Var);
        }
    }

    @Override // org.telegram.ui.Components.m41
    public int I(int i7) {
        switch (this.P) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.m6.i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.m6.w0(i7, this.x);
            default:
                return super.I(i7);
        }
    }
}
