package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ra;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b3 extends di.f6 {
    public final /* synthetic */ int A3 = 0;
    public final /* synthetic */ ra B3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(p3 p3Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, j3, i6Var, null);
        this.B3 = p3Var;
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
    public kc k() {
        switch (this.A3) {
            case 0:
                p3 p3Var = (p3) this.B3;
                return new kc(p3Var.c, p3Var.J0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(di.f6 f6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, View view) {
        super(context, i7, j3, i6Var, view);
        this.B3 = f6Var;
    }
}
