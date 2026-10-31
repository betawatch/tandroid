package ag;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.a51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements o20, p20 {
    public final /* synthetic */ z2 a;

    public /* synthetic */ n2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        if (a51Var.a == 16) {
            Object obj = a51Var.G;
            if (!(obj instanceof h3) || !((h3) obj).g) {
                this.a.i0(a51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        z2.a0(this.a, (a51) obj, (View) obj2);
    }
}
