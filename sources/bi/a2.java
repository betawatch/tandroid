package bi;

import android.content.Context;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a2 extends u6 {
    public final /* synthetic */ s2 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(s2 s2Var, Context context, int i7, ug.j jVar, long j3, k1 k1Var) {
        super(context, i7, null, jVar, j3, k1Var, false, false);
        this.v2 = s2Var;
    }

    @Override // bi.u6
    public final cc e1() {
        s2 s2Var = this.v2;
        return new cc(s2Var.c, s2Var.J0);
    }
}
