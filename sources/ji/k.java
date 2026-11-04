package ji;

import android.content.Context;
import android.widget.TextView;
import ci.e3;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.t4;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ cs e;

    public /* synthetic */ k(cs csVar, boolean z10, boolean z11, long j10, int i3) {
        this.a = i3;
        this.e = csVar;
        this.b = z10;
        this.c = z11;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 2131751914;
        boolean z10 = this.c;
        boolean z11 = this.b;
        long j10 = this.d;
        cs csVar = this.e;
        switch (i3) {
            case 0:
                n nVar = (n) csVar;
                String M0 = bd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                t4.u0(nVar, M0, bd.M0(i10, null), bd.M0(2131746329, null), true, new f(nVar, j10, 0));
                break;
            case 1:
                b0 b0Var = (b0) csVar;
                Context context = b0Var.getContext();
                e6 e6Var = b0Var.J0;
                String M02 = bd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                s1 O = t4.O(context, e6Var, M02, bd.M0(i10, null), bd.M0(2131746329, null), new e3(b0Var, j10, 10));
                O.show();
                TextView textView = (TextView) O.d(-1);
                if (textView != null) {
                    r6.V(textView, k6.q7, null);
                    break;
                }
                break;
            case 2:
                hp hpVar = (hp) csVar;
                ArrayList arrayList = z11 ? hpVar.w0 : hpVar.v0;
                if (!z10) {
                    arrayList.remove(Long.valueOf(j10));
                    break;
                } else if (!arrayList.contains(Long.valueOf(j10))) {
                    arrayList.add(Long.valueOf(j10));
                    break;
                }
                break;
            default:
                wm.u1((wm) csVar, j10, z11, z10);
                break;
        }
    }

    public /* synthetic */ k(wm wmVar, long j10, boolean z10, boolean z11) {
        this.a = 3;
        this.e = wmVar;
        this.d = j10;
        this.b = z10;
        this.c = z11;
    }
}
