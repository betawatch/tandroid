package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z2 extends di.f6 {
    public final /* synthetic */ int A3 = 0;
    public final /* synthetic */ sa B3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(n3 n3Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, j3, h6Var, null);
        this.B3 = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public int R() {
        switch (this.A3) {
            case 1:
                return ((di.f6) this.B3).R();
            default:
                return super.R();
        }
    }

    @Override // di.f6, org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public lc k() {
        switch (this.A3) {
            case 0:
                n3 n3Var = (n3) this.B3;
                return new lc(n3Var.c, n3Var.J0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(di.f6 f6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        super(context, i7, j3, h6Var, view);
        this.B3 = f6Var;
    }
}
