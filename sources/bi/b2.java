package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ja;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b2 extends di.c6 {
    public final /* synthetic */ int x3 = 0;
    public final /* synthetic */ ja y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(s2 s2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, j3, e6Var, null);
        this.y3 = s2Var;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public int R() {
        switch (this.x3) {
            case 1:
                return ((di.c6) this.y3).R();
            default:
                return super.R();
        }
    }

    @Override // di.c6, org.telegram.ui.ActionBar.u2, org.telegram.ui.ActionBar.a2
    public cc k() {
        switch (this.x3) {
            case 0:
                s2 s2Var = (s2) this.y3;
                return new cc(s2Var.c, s2Var.J0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(di.c6 c6Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, i7, j3, e6Var, view);
        this.y3 = c6Var;
    }
}
