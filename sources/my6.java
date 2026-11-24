// default package

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class my6 extends xy6 {
    public final /* synthetic */ byte E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my6(hu0 hu0Var, hu0 hu0Var2, FrameLayout frameLayout, long j) {
        super(hu0Var2, frameLayout, j, true);
        this.F = hu0Var;
    }

    @Override // xy6
    public final void f(String str, boolean z, boolean z2) {
        a aVar;
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                if (!z2) {
                    super.f(str, z, z2);
                    break;
                } else {
                    aVar = ((d) ((hu0) obj)).actionBar;
                    aVar.setSearchFieldText("");
                    break;
                }
            default:
                vy1 vy1Var = (vy1) obj;
                zya zyaVar = vy1Var.Q1;
                if (!this.e.isEmpty()) {
                    if (!z2) {
                        super.f(str, z, z2);
                        break;
                    } else {
                        vy1Var.v1.K.setText("");
                        break;
                    }
                } else if (zyaVar.getVisibility() != 4) {
                    zyaVar.setVisibility(4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my6(vy1 vy1Var, d dVar, ww0 ww0Var, long j) {
        super(dVar, ww0Var, j, false);
        this.F = vy1Var;
    }
}
