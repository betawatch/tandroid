package li;

import android.content.Context;
import android.widget.TextView;
import bi.y3;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ fs e;

    public /* synthetic */ m(fs fsVar, boolean z10, boolean z11, long j3, int i7) {
        this.a = i7;
        this.e = fsVar;
        this.b = z10;
        this.c = z11;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2131751903;
        boolean z10 = this.c;
        boolean z11 = this.b;
        long j3 = this.d;
        fs fsVar = this.e;
        switch (i7) {
            case 0:
                p pVar = (p) fsVar;
                String M0 = gd.M0(2131751904, null);
                if (z11) {
                    i10 = 2131751906;
                } else if (z10) {
                    i10 = 2131751905;
                }
                b5.s0(pVar, M0, gd.M0(i10, null), gd.M0(2131746126, null), true, new h(pVar, j3, 0));
                break;
            case 1:
                d0 d0Var = (d0) fsVar;
                Context context = d0Var.getContext();
                i6 i6Var = d0Var.J0;
                String M02 = gd.M0(2131751904, null);
                if (z11) {
                    i10 = 2131751906;
                } else if (z10) {
                    i10 = 2131751905;
                }
                u1 M = b5.M(context, i6Var, M02, gd.M0(i10, null), gd.M0(2131746126, null), new y3(d0Var, j3, 12));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    u6.U(textView, n6.q7, null);
                    break;
                }
                break;
            case 2:
                mp mpVar = (mp) fsVar;
                ArrayList arrayList = z11 ? mpVar.w0 : mpVar.v0;
                if (!z10) {
                    arrayList.remove(Long.valueOf(j3));
                    break;
                } else if (!arrayList.contains(Long.valueOf(j3))) {
                    arrayList.add(Long.valueOf(j3));
                    break;
                }
                break;
            default:
                bn.y1((bn) fsVar, j3, z11, z10);
                break;
        }
    }

    public /* synthetic */ m(bn bnVar, long j3, boolean z10, boolean z11) {
        this.a = 3;
        this.e = bnVar;
        this.d = j3;
        this.b = z10;
        this.c = z11;
    }
}
