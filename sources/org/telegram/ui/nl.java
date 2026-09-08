package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nl implements pm {
    public final /* synthetic */ co a;
    public final /* synthetic */ co b;

    public nl(co coVar, co coVar2) {
        this.b = coVar;
        this.a = coVar2;
    }

    @Override // org.telegram.ui.pm
    public final void V0(int i10) {
        this.b.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.pm
    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        co coVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) coVar.J4.get(Integer.valueOf(coVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) coVar.o6[0].get(coVar.L4);
            }
            coVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(coVar.H4);
        ArrayList arrayList2 = new ArrayList(coVar.J4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (coVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + coVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + coVar.T5, ((Integer) coVar.H4.get(0)).intValue()).commit();
            }
            coVar.yc(0, true);
        } else {
            coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(coVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = coVar.A3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        coVar.B3 = true;
        int i11 = coVar.C3 + 1;
        coVar.C3 = i11;
        boolean z12 = coVar.h4;
        co coVar2 = this.a;
        int G8 = z12 ? coVar2.G8() : coVar.G8();
        ArrayList arrayList3 = new ArrayList(coVar.h4 ? coVar2.H4 : coVar.H4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i11);
        ao aoVar = coVar.ea;
        if (coVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(coVar.getParentActivity(), aoVar);
                ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ncVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ncVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                nbVar = ncVar;
            } else {
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(coVar.getParentActivity(), aoVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(coVar.getParentActivity(), aoVar, true);
            ocVar.a = y7Var;
            ocVar.b = l0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(coVar, nbVar, 5000);
        }
        coVar.A3 = qcVar;
    }

    @Override // org.telegram.ui.pm
    public final void r0(String str) {
        this.b.da(str, false);
    }
}
