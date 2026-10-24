package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gl implements fm {
    public final /* synthetic */ sn a;
    public final /* synthetic */ sn b;

    public gl(sn snVar, sn snVar2) {
        this.b = snVar;
        this.a = snVar2;
    }

    @Override // org.telegram.ui.fm
    public final void D0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.fm
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        sn snVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) snVar.V4.get(Integer.valueOf(snVar.X4));
            if (messageObject == null) {
                messageObject = (MessageObject) snVar.A6[0].get(snVar.X4);
            }
            snVar.jc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(snVar.T4);
        ArrayList arrayList2 = new ArrayList(snVar.V4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (snVar.T4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + snVar.f6).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + snVar.f6, ((Integer) snVar.T4.get(0)).intValue()).commit();
            }
            snVar.Fc(0, true);
        } else {
            snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(snVar.f6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = snVar.M3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        snVar.N3 = true;
        int i11 = snVar.O3 + 1;
        snVar.O3 = i11;
        boolean z12 = snVar.t4;
        sn snVar2 = this.a;
        int L8 = z12 ? snVar2.L8() : snVar.L8();
        ArrayList arrayList3 = new ArrayList(snVar.t4 ? snVar2.T4 : snVar.T4);
        org.telegram.messenger.a8 a8Var = new org.telegram.messenger.a8(this, z11, arrayList, arrayList2, L8, i11);
        org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList3, i11);
        qn qnVar = snVar.qa;
        if (snVar.getParentActivity() == null) {
            k0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(snVar.getParentActivity(), qnVar);
                ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ncVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ncVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                nbVar = ncVar;
            } else {
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(snVar.getParentActivity(), qnVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", L8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(snVar.getParentActivity(), qnVar, true);
            ocVar.b = a8Var;
            ocVar.c = k0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(snVar, nbVar, 5000);
        }
        snVar.M3 = qcVar;
    }

    @Override // org.telegram.ui.fm
    public final void b0(String str) {
        this.b.ia(str, false);
    }
}
