package ag;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements p20, q20 {
    public final /* synthetic */ z2 a;

    public /* synthetic */ n2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        if (b51Var.a == 16) {
            Object obj = b51Var.G;
            if (!(obj instanceof h3) || !((h3) obj).g) {
                this.a.j0(b51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        z2.b0(this.a, (b51) obj, (View) obj2);
    }
}
