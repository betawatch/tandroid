package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements a20, b20 {
    public final /* synthetic */ q1 a;

    @Override // org.telegram.messenger.b20
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        if (r31Var.a == 16) {
            Object obj = r31Var.G;
            if (!(obj instanceof s1) || !((s1) obj).g) {
                this.a.j0(r31Var, view);
                z9 = true;
                return Boolean.valueOf(z9);
            }
        }
        z9 = false;
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        q1.b0(this.a, (r31) obj, (View) obj2);
    }
}
