package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class hl implements gm {
    public final /* synthetic */ sn a;
    public final /* synthetic */ sn b;

    public hl(sn snVar, sn snVar2) {
        this.b = snVar;
        this.a = snVar2;
    }

    @Override // org.telegram.ui.gm
    public final void D0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.gm
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        sn snVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) snVar.J4.get(Integer.valueOf(snVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) snVar.o6[0].get(snVar.L4);
            }
            snVar.gc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(snVar.H4);
        ArrayList arrayList2 = new ArrayList(snVar.J4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (snVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + snVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + snVar.T5, ((Integer) snVar.H4.get(0)).intValue()).commit();
            }
            snVar.Cc(0, true);
        } else {
            snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(snVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = snVar.A3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        snVar.B3 = true;
        int i11 = snVar.C3 + 1;
        snVar.C3 = i11;
        boolean z12 = snVar.h4;
        sn snVar2 = this.a;
        int L8 = z12 ? snVar2.L8() : snVar.L8();
        ArrayList arrayList3 = new ArrayList(snVar.h4 ? snVar2.H4 : snVar.H4);
        org.telegram.messenger.w7 w7Var = new org.telegram.messenger.w7(this, z11, arrayList, arrayList2, L8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i11);
        qn qnVar = snVar.ea;
        if (snVar.getParentActivity() == null) {
            l0Var.run();
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
            ocVar.a = w7Var;
            ocVar.b = l0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(snVar, nbVar, 5000);
        }
        snVar.A3 = qcVar;
    }

    @Override // org.telegram.ui.gm
    public final void b0(String str) {
        this.b.ia(str, false);
    }
}
