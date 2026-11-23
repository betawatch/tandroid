package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements u10, v10 {
    public final /* synthetic */ t1 a;

    public /* synthetic */ k1(t1 t1Var) {
        this.a = t1Var;
    }

    @Override // org.telegram.messenger.v10
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (n41Var.a == 16) {
            Object obj = n41Var.H;
            if (!(obj instanceof v1) || !((v1) obj).g) {
                this.a.j0(n41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t1.b0(this.a, (n41) obj, (View) obj2);
    }
}
