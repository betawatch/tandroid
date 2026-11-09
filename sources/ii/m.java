package ii;

import android.content.Context;
import android.widget.TextView;
import bi.r3;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.v4;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ls e;

    public /* synthetic */ m(ls lsVar, boolean z9, boolean z10, long j3, int i7) {
        this.a = i7;
        this.e = lsVar;
        this.b = z9;
        this.c = z10;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2131751914;
        boolean z9 = this.c;
        boolean z10 = this.b;
        long j3 = this.d;
        ls lsVar = this.e;
        switch (i7) {
            case 0:
                p pVar = (p) lsVar;
                String M0 = id.M0(2131751915, null);
                if (z10) {
                    i10 = 2131751917;
                } else if (z9) {
                    i10 = 2131751916;
                }
                v4.s0(pVar, M0, id.M0(i10, null), id.M0(2131746321, null), true, new h(pVar, j3, 0));
                break;
            case 1:
                d0 d0Var = (d0) lsVar;
                Context context = d0Var.getContext();
                g6 g6Var = d0Var.I0;
                String M02 = id.M0(2131751915, null);
                if (z10) {
                    i10 = 2131751917;
                } else if (z9) {
                    i10 = 2131751916;
                }
                u1 M = v4.M(context, g6Var, M02, id.M0(i10, null), id.M0(2131746321, null), new r3(d0Var, j3, 10));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    s6.U(textView, l6.q7, null);
                    break;
                }
                break;
            case 2:
                qp qpVar = (qp) lsVar;
                ArrayList arrayList = z10 ? qpVar.v0 : qpVar.u0;
                if (!z9) {
                    arrayList.remove(Long.valueOf(j3));
                    break;
                } else if (!arrayList.contains(Long.valueOf(j3))) {
                    arrayList.add(Long.valueOf(j3));
                    break;
                }
                break;
            default:
                cn.y1((cn) lsVar, j3, z10, z9);
                break;
        }
    }

    public /* synthetic */ m(cn cnVar, long j3, boolean z9, boolean z10) {
        this.a = 3;
        this.e = cnVar;
        this.d = j3;
        this.b = z9;
        this.c = z10;
    }
}
