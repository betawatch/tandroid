package bi;

import android.view.View;
import android.widget.TextView;
import di.i9;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ w4(a5 a5Var, int i7) {
        this.a = i7;
        this.b = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        a5 a5Var = this.b;
        switch (i7) {
            case 0:
                TextView textView = a5Var.v1;
                y60 G = y60.G(a5Var.c, a5Var.J0, textView);
                int[] iArr = a5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    G.i(new ai.w0(a5Var, i11, 3), gd.G(i11 / 3600, "GiftOfferHours", new Object[0]), i11 == a5Var.y1);
                }
                G.W(5);
                a5Var.I0(textView, G, true);
                break;
            case 1:
                a5 a5Var2 = this.b;
                hi.d dVar = a5Var2.w1;
                if (dVar.e0 && !dVar.R) {
                    if (mp.u1(a5Var2.a).A2()) {
                        org.telegram.ui.b.b(a5Var2.a);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(a5Var2.s1);
                        long j3 = a5Var2.x1;
                        int i12 = a5Var2.y1;
                        dVar.setLoading(true);
                        int i13 = a5Var2.a;
                        String str = a5Var2.m1.slug;
                        y4 y4Var = new y4(a5Var2, j3, i12, 0);
                        HashMap hashMap = f4.a;
                        zy.C(i13);
                        long E = zy.E();
                        tr a02 = tr.a0(i13);
                        a02.a.c(new i9(a02, E, str, j3, i12, y4Var));
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.n6.N0(a5Var.a, a5Var.getContext(), a5Var.J0);
                break;
        }
    }
}
