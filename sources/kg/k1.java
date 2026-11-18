package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements v10, w10 {
    public final /* synthetic */ t1 a;

    @Override // org.telegram.messenger.w10
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (l41Var.a == 16) {
            Object obj = l41Var.H;
            if (!(obj instanceof v1) || !((v1) obj).g) {
                this.a.j0(l41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t1.b0(this.a, (l41) obj, (View) obj2);
    }
}
