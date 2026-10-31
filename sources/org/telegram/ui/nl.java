package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nl implements gm {
    public final /* synthetic */ un a;
    public final /* synthetic */ un b;

    public nl(un unVar, un unVar2) {
        this.b = unVar;
        this.a = unVar2;
    }

    @Override // org.telegram.ui.gm
    public final void T0(int i10) {
        this.b.k(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.gm
    public final void X(boolean z10, boolean z11) {
        org.telegram.ui.Components.ta taVar;
        int i10;
        un unVar = this.b;
        if (!z10) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) unVar.V4.get(Integer.valueOf(unVar.X4));
            if (jjVar == null) {
                jjVar = (org.telegram.messenger.jj) unVar.E6[0].get(unVar.X4);
            }
            unVar.wc(jjVar);
            return;
        }
        ArrayList arrayList = new ArrayList(unVar.T4);
        ArrayList arrayList2 = new ArrayList(unVar.V4.values());
        org.telegram.ui.Components.wb wbVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
            if (unVar.T4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + unVar.j6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + unVar.j6, ((Integer) unVar.T4.get(0)).intValue()).commit();
            }
            unVar.Sc(0, true);
        } else {
            unVar.getNotificationCenter().k(org.telegram.messenger.zs.t0, Long.valueOf(unVar.j6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.wb wbVar2 = unVar.O3;
        if (wbVar2 != null) {
            wbVar2.b();
        }
        unVar.P3 = true;
        int i11 = unVar.Q3 + 1;
        unVar.Q3 = i11;
        boolean z12 = unVar.v4;
        un unVar2 = this.a;
        int T8 = z12 ? unVar2.T8() : unVar.T8();
        ArrayList arrayList3 = new ArrayList(unVar.v4 ? unVar2.T4 : unVar.T4);
        ml mlVar = new ml(this, z11, arrayList, arrayList2, T8, i11);
        org.telegram.messenger.voip.p0 p0Var = new org.telegram.messenger.voip.p0(this, z11, arrayList3, i11);
        sn snVar = unVar.xa;
        if (unVar.getParentActivity() == null) {
            p0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(unVar.getParentActivity(), snVar);
                tbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                tbVar.b.setText(org.telegram.messenger.cd.L0(2131747240, null));
                tbVar.c.setText(org.telegram.messenger.cd.L0(2131747239, null));
                taVar = tbVar;
            } else {
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(unVar.getParentActivity(), snVar);
                ebVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ebVar.b.setText(org.telegram.messenger.cd.G(T8, "MessagesUnpinned", new Object[0]));
                taVar = ebVar;
            }
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(unVar.getParentActivity(), snVar, true);
            ubVar.b = mlVar;
            ubVar.c = p0Var;
            taVar.setButton(ubVar);
            wbVar = org.telegram.ui.Components.wb.g(unVar, taVar, 5000);
        }
        unVar.O3 = wbVar;
    }

    @Override // org.telegram.ui.gm
    public final void v0(String str) {
        this.b.ta(str, false);
    }
}
