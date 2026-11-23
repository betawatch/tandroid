package bi;

import android.view.View;
import android.widget.TextView;
import di.j9;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;

    public /* synthetic */ b5(f5 f5Var, int i7) {
        this.a = i7;
        this.b = f5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        f5 f5Var = this.b;
        switch (i7) {
            case 0:
                TextView textView = f5Var.v1;
                x60 G = x60.G(f5Var.c, f5Var.J0, textView);
                int[] iArr = f5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    G.i(new ai.u0(f5Var, i11, 4), gd.G(i11 / 3600, "GiftOfferHours", new Object[0]), i11 == f5Var.y1);
                }
                G.W(5);
                f5Var.I0(textView, G, true);
                break;
            case 1:
                f5 f5Var2 = this.b;
                hi.e eVar = f5Var2.w1;
                if (eVar.e0 && !eVar.R) {
                    if (mp.u1(f5Var2.a).A2()) {
                        org.telegram.ui.b.b(f5Var2.a);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(f5Var2.s1);
                        long j3 = f5Var2.x1;
                        int i12 = f5Var2.y1;
                        eVar.setLoading(true);
                        int i13 = f5Var2.a;
                        String str = f5Var2.m1.slug;
                        d5 d5Var = new d5(f5Var2, j3, i12, 0);
                        HashMap hashMap = l4.a;
                        zy.C(i13);
                        long E = zy.E();
                        tr a02 = tr.a0(i13);
                        a02.a.c(new j9(a02, E, str, j3, i12, d5Var));
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.o6.N0(f5Var.a, f5Var.getContext(), f5Var.J0);
                break;
        }
    }
}
