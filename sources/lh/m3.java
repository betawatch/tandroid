package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m3 extends mh.g5 {
    public final /* synthetic */ int o1;
    public final /* synthetic */ Object p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(n3 n3Var, Context context, int i10, long j10, g6 g6Var, int i11) {
        super(context, i10, j10, g6Var, null);
        this.o1 = i11;
        this.p1 = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public int getBottomInset() {
        switch (this.o1) {
            case 3:
                return ((mh.g5) this.p1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // mh.g5, org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public qc getBulletinFactory() {
        switch (this.o1) {
            case 0:
                return qc.a0(((n3) this.p1).a.a);
            case 1:
                return qc.a0(((n3) this.p1).a.a);
            case 2:
                return qc.a0(((n3) this.p1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(mh.g5 g5Var, Context context, int i10, long j10, g6 g6Var, View view) {
        super(context, i10, j10, g6Var, view);
        this.o1 = 3;
        this.p1 = g5Var;
    }
}
