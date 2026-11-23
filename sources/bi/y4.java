package bi;

import android.view.View;
import android.widget.TextView;
import di.j9;
import java.util.HashMap;
import org.telegram.messenger.az;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ y4(c5 c5Var, int i7) {
        this.a = i7;
        this.b = c5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        c5 c5Var = this.b;
        switch (i7) {
            case 0:
                TextView textView = c5Var.v1;
                a70 G = a70.G(c5Var.c, c5Var.J0, textView);
                int[] iArr = c5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    G.i(new ai.c1(c5Var, i11, 3), hd.G(i11 / 3600, "GiftOfferHours", new Object[0]), i11 == c5Var.y1);
                }
                G.W(5);
                c5Var.I0(textView, G, true);
                break;
            case 1:
                c5 c5Var2 = this.b;
                hi.e eVar = c5Var2.w1;
                if (eVar.e0 && !eVar.R) {
                    if (np.u1(c5Var2.a).A2()) {
                        org.telegram.ui.b.b(c5Var2.a);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(c5Var2.s1);
                        long j3 = c5Var2.x1;
                        int i12 = c5Var2.y1;
                        eVar.setLoading(true);
                        int i13 = c5Var2.a;
                        String str = c5Var2.m1.slug;
                        a5 a5Var = new a5(c5Var2, j3, i12, 0);
                        HashMap hashMap = i4.a;
                        az.C(i13);
                        long E = az.E();
                        ur a02 = ur.a0(i13);
                        a02.a.c(new j9(a02, E, str, j3, i12, a5Var));
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.n6.N0(c5Var.a, c5Var.getContext(), c5Var.J0);
                break;
        }
    }
}
