package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ol implements nm {
    public final /* synthetic */ zn a;
    public final /* synthetic */ zn b;

    public ol(zn znVar, zn znVar2) {
        this.b = znVar;
        this.a = znVar2;
    }

    @Override // org.telegram.ui.nm
    public final void O0(int i10) {
        this.b.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.nm
    public final void V(boolean z10, boolean z11) {
        org.telegram.ui.Components.qb qbVar;
        int i10;
        zn znVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) znVar.o6[0].get(znVar.L4);
            }
            znVar.gc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(znVar.H4);
        ArrayList arrayList2 = new ArrayList(znVar.J4.values());
        org.telegram.ui.Components.tc tcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (znVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + znVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + znVar.T5, ((Integer) znVar.H4.get(0)).intValue()).commit();
            }
            znVar.Cc(0, true);
        } else {
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.tc tcVar2 = znVar.A3;
        if (tcVar2 != null) {
            tcVar2.b();
        }
        znVar.B3 = true;
        int i11 = znVar.C3 + 1;
        znVar.C3 = i11;
        boolean z12 = znVar.h4;
        zn znVar2 = this.a;
        int L8 = z12 ? znVar2.L8() : znVar.L8();
        ArrayList arrayList3 = new ArrayList(znVar.h4 ? znVar2.H4 : znVar.H4);
        org.telegram.messenger.v7 v7Var = new org.telegram.messenger.v7(this, z11, arrayList, arrayList2, L8, i11);
        org.telegram.messenger.voip.n0 n0Var = new org.telegram.messenger.voip.n0(this, z11, arrayList3, i11);
        xn xnVar = znVar.ea;
        if (znVar.getParentActivity() == null) {
            n0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(znVar.getParentActivity(), xnVar);
                qcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                qcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                qcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                qbVar = qcVar;
            } else {
                org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(znVar.getParentActivity(), xnVar);
                bcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                bcVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", L8, new Object[0]));
                qbVar = bcVar;
            }
            org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(znVar.getParentActivity(), xnVar, true);
            rcVar.a = v7Var;
            rcVar.b = n0Var;
            qbVar.setButton(rcVar);
            tcVar = org.telegram.ui.Components.tc.g(znVar, qbVar, 5000);
        }
        znVar.A3 = tcVar;
    }

    @Override // org.telegram.ui.nm
    public final void o0(String str) {
        this.b.ia(str, false);
    }
}
