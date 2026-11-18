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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ v4(z4 z4Var, int i7) {
        this.a = i7;
        this.b = z4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        z4 z4Var = this.b;
        switch (i7) {
            case 0:
                TextView textView = z4Var.v1;
                y60 G = y60.G(z4Var.c, z4Var.J0, textView);
                int[] iArr = z4.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    G.i(new ai.w0(z4Var, i11, 3), gd.G(i11 / 3600, "GiftOfferHours", new Object[0]), i11 == z4Var.y1);
                }
                G.W(5);
                z4Var.I0(textView, G, true);
                break;
            case 1:
                z4 z4Var2 = this.b;
                hi.d dVar = z4Var2.w1;
                if (dVar.e0 && !dVar.R) {
                    if (mp.u1(z4Var2.a).A2()) {
                        org.telegram.ui.b.b(z4Var2.a);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(z4Var2.s1);
                        long j3 = z4Var2.x1;
                        int i12 = z4Var2.y1;
                        dVar.setLoading(true);
                        int i13 = z4Var2.a;
                        String str = z4Var2.m1.slug;
                        x4 x4Var = new x4(z4Var2, j3, i12, 0);
                        HashMap hashMap = e4.a;
                        zy.C(i13);
                        long E = zy.E();
                        tr a02 = tr.a0(i13);
                        a02.a.c(new i9(a02, E, str, j3, i12, x4Var));
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.n6.N0(z4Var.a, z4Var.getContext(), z4Var.J0);
                break;
        }
    }
}
