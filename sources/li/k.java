package li;

import android.content.Context;
import android.widget.TextView;
import di.x2;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.t4;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ is e;

    public /* synthetic */ k(is isVar, boolean z10, boolean z11, long j3, int i7) {
        this.a = i7;
        this.e = isVar;
        this.b = z10;
        this.c = z11;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2131751914;
        boolean z10 = this.c;
        boolean z11 = this.b;
        long j3 = this.d;
        is isVar = this.e;
        switch (i7) {
            case 0:
                n nVar = (n) isVar;
                String M0 = hd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                t4.s0(nVar, M0, hd.M0(i10, null), hd.M0(2131746321, null), true, new f(nVar, j3, 0));
                break;
            case 1:
                d0 d0Var = (d0) isVar;
                Context context = d0Var.getContext();
                e6 e6Var = d0Var.J0;
                String M02 = hd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                t1 M = t4.M(context, e6Var, M02, hd.M0(i10, null), hd.M0(2131746321, null), new x2(d0Var, j3, 11));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    q6.U(textView, j6.q7, null);
                    break;
                }
                break;
            case 2:
                np npVar = (np) isVar;
                ArrayList arrayList = z11 ? npVar.w0 : npVar.v0;
                if (!z10) {
                    arrayList.remove(Long.valueOf(j3));
                    break;
                } else if (!arrayList.contains(Long.valueOf(j3))) {
                    arrayList.add(Long.valueOf(j3));
                    break;
                }
                break;
            default:
                an.y1((an) isVar, j3, z11, z10);
                break;
        }
    }

    public /* synthetic */ k(an anVar, long j3, boolean z10, boolean z11) {
        this.a = 3;
        this.e = anVar;
        this.d = j3;
        this.b = z10;
        this.c = z11;
    }
}
