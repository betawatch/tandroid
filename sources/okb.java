// default package

import android.content.Context;
import java.util.HashSet;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class okb extends uy0 implements tjb {
    public int e;
    public final /* synthetic */ d0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okb(d0 d0Var, Context context) {
        super(context);
        this.f = d0Var;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Lj));
    }

    @Override // tjb
    public final void updateColors() {
        ty0 ty0Var = this.d;
        if (ty0Var != null) {
            try {
                int w0 = bkb.w0(null, bkb.Lj, false);
                if (w0 != this.e) {
                    this.e = w0;
                    ty0Var.setOuterColor(w0);
                    ty0Var.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
