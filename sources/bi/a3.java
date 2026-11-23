package bi;

import android.content.Context;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a3 extends f9 {
    public final /* synthetic */ p3 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(p3 p3Var, Context context, int i7, ug.j jVar, long j3, j2 j2Var) {
        super(context, i7, null, jVar, j3, j2Var, false, false);
        this.v2 = p3Var;
    }

    @Override // bi.f9
    public final kc f1() {
        p3 p3Var = this.v2;
        return new kc(p3Var.c, p3Var.J0);
    }
}
