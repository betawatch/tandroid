// default package

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m07 extends x07 {
    public final /* synthetic */ byte E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m07(qv0 qv0Var, qv0 qv0Var2, FrameLayout frameLayout, long j) {
        super(qv0Var2, frameLayout, j, true);
        this.F = qv0Var;
    }

    @Override // x07
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
                    aVar = ((d) ((qv0) obj)).actionBar;
                    aVar.setSearchFieldText("");
                    break;
                }
            default:
                i02 i02Var = (i02) obj;
                a1b a1bVar = i02Var.Q1;
                if (!this.e.isEmpty()) {
                    if (!z2) {
                        super.f(str, z, z2);
                        break;
                    } else {
                        i02Var.v1.K.setText("");
                        break;
                    }
                } else if (a1bVar.getVisibility() != 4) {
                    a1bVar.setVisibility(4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m07(i02 i02Var, d dVar, dy0 dy0Var, long j) {
        super(dVar, dy0Var, j, false);
        this.F = i02Var;
    }
}
