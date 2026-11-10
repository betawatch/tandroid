package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements a20, b20 {
    public final /* synthetic */ q1 a;

    @Override // org.telegram.messenger.b20
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        if (x31Var.a == 16) {
            Object obj = x31Var.G;
            if (!(obj instanceof s1) || !((s1) obj).g) {
                this.a.j0(x31Var, view);
                z9 = true;
                return Boolean.valueOf(z9);
            }
        }
        z9 = false;
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        q1.b0(this.a, (x31) obj, (View) obj2);
    }
}
