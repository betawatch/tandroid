package ih;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m3 extends jh.h5 {
    public final /* synthetic */ int n1;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(n3 n3Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, j10, c6Var, null);
        this.n1 = i11;
        this.o1 = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public int getBottomInset() {
        switch (this.n1) {
            case 3:
                return ((jh.h5) this.o1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // jh.h5, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public tc getBulletinFactory() {
        switch (this.n1) {
            case 0:
                return tc.a0(((n3) this.o1).a.a);
            case 1:
                return tc.a0(((n3) this.o1).a.a);
            case 2:
                return tc.a0(((n3) this.o1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(jh.h5 h5Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, i10, j10, c6Var, view);
        this.n1 = 3;
        this.o1 = h5Var;
    }
}
