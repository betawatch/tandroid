package bi;

import android.view.View;
import android.widget.TextView;
import di.j9;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ z4(d5 d5Var, int i7) {
        this.a = i7;
        this.b = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        d5 d5Var = this.b;
        switch (i7) {
            case 0:
                TextView textView = d5Var.v1;
                a70 G = a70.G(d5Var.c, d5Var.J0, textView);
                int[] iArr = d5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    G.i(new ai.y0(d5Var, i11, 3), gd.G(i11 / 3600, "GiftOfferHours", new Object[0]), i11 == d5Var.y1);
                }
                G.W(5);
                d5Var.I0(textView, G, true);
                break;
            case 1:
                d5 d5Var2 = this.b;
                hi.e eVar = d5Var2.w1;
                if (eVar.e0 && !eVar.R) {
                    if (mp.u1(d5Var2.a).A2()) {
                        org.telegram.ui.b.b(d5Var2.a);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(d5Var2.s1);
                        long j3 = d5Var2.x1;
                        int i12 = d5Var2.y1;
                        eVar.setLoading(true);
                        int i13 = d5Var2.a;
                        String str = d5Var2.m1.slug;
                        b5 b5Var = new b5(d5Var2, j3, i12, 0);
                        HashMap hashMap = i4.a;
                        zy.C(i13);
                        long E = zy.E();
                        tr a02 = tr.a0(i13);
                        a02.a.c(new j9(a02, E, str, j3, i12, b5Var));
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.n6.N0(d5Var.a, d5Var.getContext(), d5Var.J0);
                break;
        }
    }
}
