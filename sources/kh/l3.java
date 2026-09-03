package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l3 extends lh.g5 {
    public final /* synthetic */ int o1;
    public final /* synthetic */ Object p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(m3 m3Var, Context context, int i10, long j10, f6 f6Var, int i11) {
        super(context, i10, j10, f6Var, null);
        this.o1 = i11;
        this.p1 = m3Var;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public int getBottomInset() {
        switch (this.o1) {
            case 3:
                return ((lh.g5) this.p1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // lh.g5, org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.l2
    public qc getBulletinFactory() {
        switch (this.o1) {
            case 0:
                return qc.a0(((m3) this.p1).a.a);
            case 1:
                return qc.a0(((m3) this.p1).a.a);
            case 2:
                return qc.a0(((m3) this.p1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(lh.g5 g5Var, Context context, int i10, long j10, f6 f6Var, View view) {
        super(context, i10, j10, f6Var, view);
        this.o1 = 3;
        this.p1 = g5Var;
    }
}
