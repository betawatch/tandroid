package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s3 extends hh.i5 {
    public final /* synthetic */ int n1;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(t3 t3Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, j10, c6Var, null);
        this.n1 = i11;
        this.o1 = t3Var;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public int getBottomInset() {
        switch (this.n1) {
            case 3:
                return ((hh.i5) this.o1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // hh.i5, org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.j2
    public mc getBulletinFactory() {
        switch (this.n1) {
            case 0:
                return mc.a0(((t3) this.o1).a.a);
            case 1:
                return mc.a0(((t3) this.o1).a.a);
            case 2:
                return mc.a0(((t3) this.o1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(hh.i5 i5Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, i10, j10, c6Var, view);
        this.n1 = 3;
        this.o1 = i5Var;
    }
}
