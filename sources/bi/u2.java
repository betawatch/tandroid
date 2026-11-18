package bi;

import android.content.Context;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u2 extends a9 {
    public final /* synthetic */ j3 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(j3 j3Var, Context context, int i7, ug.j jVar, long j3, d2 d2Var) {
        super(context, i7, null, jVar, j3, d2Var, false, false);
        this.v2 = j3Var;
    }

    @Override // bi.a9
    public final lc f1() {
        j3 j3Var = this.v2;
        return new lc(j3Var.c, j3Var.J0);
    }
}
