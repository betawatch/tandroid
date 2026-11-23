package li;

import android.content.Context;
import android.widget.TextView;
import bi.e4;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ fs e;

    public /* synthetic */ l(fs fsVar, boolean z10, boolean z11, long j3, int i7) {
        this.a = i7;
        this.e = fsVar;
        this.b = z10;
        this.c = z11;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2131751902;
        boolean z10 = this.c;
        boolean z11 = this.b;
        long j3 = this.d;
        fs fsVar = this.e;
        switch (i7) {
            case 0:
                o oVar = (o) fsVar;
                String N0 = gd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                b5.s0(oVar, N0, gd.N0(i10, null), gd.N0(2131746125, null), true, new g(oVar, j3, 0));
                break;
            case 1:
                c0 c0Var = (c0) fsVar;
                Context context = c0Var.getContext();
                i6 i6Var = c0Var.J0;
                String N02 = gd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                t1 M = b5.M(context, i6Var, N02, gd.N0(i10, null), gd.N0(2131746125, null), new e4(c0Var, j3, 12));
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

    public /* synthetic */ l(bn bnVar, long j3, boolean z10, boolean z11) {
        this.a = 3;
        this.e = bnVar;
        this.d = j3;
        this.b = z10;
        this.c = z11;
    }
}
