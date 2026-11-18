package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v2 extends di.f6 {
    public final /* synthetic */ int A3 = 0;
    public final /* synthetic */ sa B3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(j3 j3Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, j3, i6Var, null);
        this.B3 = j3Var;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public int R() {
        switch (this.A3) {
            case 1:
                return ((di.f6) this.B3).R();
            default:
                return super.R();
        }
    }

    @Override // di.f6, org.telegram.ui.ActionBar.x2, org.telegram.ui.ActionBar.d2
    public lc k() {
        switch (this.A3) {
            case 0:
                j3 j3Var = (j3) this.B3;
                return new lc(j3Var.c, j3Var.J0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(di.f6 f6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, View view) {
        super(context, i7, j3, i6Var, view);
        this.B3 = f6Var;
    }
}
