package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.b41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements x10, y10 {
    public final /* synthetic */ r1 a;

    @Override // org.telegram.messenger.y10
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (b41Var.a == 16) {
            Object obj = b41Var.G;
            if (!(obj instanceof u1) || !((u1) obj).g) {
                this.a.j0(b41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r1.b0(this.a, (b41) obj, (View) obj2);
    }
}
