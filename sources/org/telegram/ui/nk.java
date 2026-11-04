package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nk implements gl {
    public final /* synthetic */ wm a;
    public final /* synthetic */ wm b;

    public nk(wm wmVar, wm wmVar2) {
        this.b = wmVar;
        this.a = wmVar2;
    }

    @Override // org.telegram.ui.gl
    public final void T0(int i3) {
        this.b.l(i3, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.gl
    public final void Y(boolean z10, boolean z11) {
        org.telegram.ui.Components.ya yaVar;
        int i3;
        wm wmVar = this.b;
        if (!z10) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wmVar.W4.get(Integer.valueOf(wmVar.Y4));
            if (ziVar == null) {
                ziVar = (org.telegram.messenger.zi) wmVar.F6[0].get(wmVar.Y4);
            }
            wmVar.Gc(ziVar);
            return;
        }
        ArrayList arrayList = new ArrayList(wmVar.U4);
        ArrayList arrayList2 = new ArrayList(wmVar.W4.values());
        org.telegram.ui.Components.ac acVar = null;
        if (z11) {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).d7;
            if (wmVar.U4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + wmVar.k6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + wmVar.k6, ((Integer) wmVar.U4.get(0)).intValue()).commit();
            }
            wmVar.cd(0, true);
        } else {
            wmVar.getNotificationCenter().k(org.telegram.messenger.hs.t0, Long.valueOf(wmVar.k6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.ac acVar2 = wmVar.P3;
        if (acVar2 != null) {
            acVar2.b();
        }
        wmVar.Q3 = true;
        int i10 = wmVar.R3 + 1;
        wmVar.R3 = i10;
        boolean z12 = wmVar.w4;
        wm wmVar2 = this.a;
        int a92 = z12 ? wmVar2.a9() : wmVar.a9();
        ArrayList arrayList3 = new ArrayList(wmVar.w4 ? wmVar2.U4 : wmVar.U4);
        mk mkVar = new mk(this, z11, arrayList, arrayList2, a92, i10);
        org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList3, i10);
        um umVar = wmVar.ya;
        if (wmVar.getParentActivity() == null) {
            j0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(wmVar.getParentActivity(), umVar);
                xbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                xbVar.b.setText(org.telegram.messenger.bd.M0(2131747232, null));
                xbVar.c.setText(org.telegram.messenger.bd.M0(2131747231, null));
                yaVar = xbVar;
            } else {
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(wmVar.getParentActivity(), umVar);
                ibVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ibVar.b.setText(org.telegram.messenger.bd.G(a92, "MessagesUnpinned", new Object[0]));
                yaVar = ibVar;
            }
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wmVar.getParentActivity(), umVar, true);
            ybVar.b = mkVar;
            ybVar.c = j0Var;
            yaVar.setButton(ybVar);
            acVar = org.telegram.ui.Components.ac.g(wmVar, yaVar, 5000);
        }
        wmVar.P3 = acVar;
    }

    @Override // org.telegram.ui.gl
    public final void w0(String str) {
        this.b.Da(str, false);
    }
}
