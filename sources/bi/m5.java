package bi;

import org.telegram.messenger.q10;
import org.telegram.ui.Components.fq0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements te.b, q10 {
    public final /* synthetic */ fq0 a;

    public /* synthetic */ m5(fq0 fq0Var) {
        this.a = fq0Var;
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.q10
    public Object d(Number number, Object obj) {
        fq0 fq0Var = this.a;
        fq0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        fq0Var.h(null, new n5(fq0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void G(float f10, int i7) {
    }
}
