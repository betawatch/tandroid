package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hl implements gm {
    public final /* synthetic */ un a;
    public final /* synthetic */ un b;

    public hl(un unVar, un unVar2) {
        this.b = unVar;
        this.a = unVar2;
    }

    @Override // org.telegram.ui.gm
    public final void Q0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.gm
    public final void T(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        un unVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) unVar.V4.get(Integer.valueOf(unVar.X4));
            if (messageObject == null) {
                messageObject = (MessageObject) unVar.A6[0].get(unVar.X4);
            }
            unVar.pc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(unVar.T4);
        ArrayList arrayList2 = new ArrayList(unVar.V4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (unVar.T4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + unVar.f6).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + unVar.f6, ((Integer) unVar.T4.get(0)).intValue()).commit();
            }
            unVar.Lc(0, true);
        } else {
            unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(unVar.f6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = unVar.M3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        unVar.N3 = true;
        int i11 = unVar.O3 + 1;
        unVar.O3 = i11;
        boolean z12 = unVar.t4;
        un unVar2 = this.a;
        int Q8 = z12 ? unVar2.Q8() : unVar.Q8();
        ArrayList arrayList3 = new ArrayList(unVar.t4 ? unVar2.T4 : unVar.T4);
        org.telegram.messenger.c8 c8Var = new org.telegram.messenger.c8(this, z11, arrayList, arrayList2, Q8, i11);
        org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList3, i11);
        sn snVar = unVar.qa;
        if (unVar.getParentActivity() == null) {
            j0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(unVar.getParentActivity(), snVar);
                ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ncVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ncVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                nbVar = ncVar;
            } else {
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(unVar.getParentActivity(), snVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", Q8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(unVar.getParentActivity(), snVar, true);
            ocVar.b = c8Var;
            ocVar.c = j0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(unVar, nbVar, 5000);
        }
        unVar.M3 = qcVar;
    }

    @Override // org.telegram.ui.gm
    public final void p0(String str) {
        this.b.na(str, false);
    }
}
