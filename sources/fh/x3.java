package fh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x3 extends gh.k5 {
    public final /* synthetic */ int n1;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(y3 y3Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, i9, j10, b6Var, null);
        this.n1 = i10;
        this.o1 = y3Var;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public int getBottomInset() {
        switch (this.n1) {
            case 3:
                return ((gh.k5) this.o1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // gh.k5, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public oc getBulletinFactory() {
        switch (this.n1) {
            case 0:
                return oc.a0(((y3) this.o1).a.a);
            case 1:
                return oc.a0(((y3) this.o1).a.a);
            case 2:
                return oc.a0(((y3) this.o1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(gh.k5 k5Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, View view) {
        super(context, i9, j10, b6Var, view);
        this.n1 = 3;
        this.o1 = k5Var;
    }
}
