package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ml implements mm {
    public final /* synthetic */ zn a;
    public final /* synthetic */ zn b;

    public ml(zn znVar, zn znVar2) {
        this.b = znVar;
        this.a = znVar2;
    }

    @Override // org.telegram.ui.mm
    public final void O0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.mm
    public final void X(boolean z4, boolean z10) {
        org.telegram.ui.Components.eb ebVar;
        int i10;
        zn znVar = this.b;
        if (!z4) {
            MessageObject messageObject = (MessageObject) znVar.G4.get(Integer.valueOf(znVar.I4));
            if (messageObject == null) {
                messageObject = (MessageObject) znVar.l6[0].get(znVar.I4);
            }
            znVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(znVar.E4);
        ArrayList arrayList2 = new ArrayList(znVar.G4.values());
        org.telegram.ui.Components.ic icVar = null;
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (znVar.E4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + znVar.Q5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + znVar.Q5, ((Integer) znVar.E4.get(0)).intValue()).commit();
            }
            znVar.yc(0, true);
        } else {
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.Q5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.ic icVar2 = znVar.x3;
        if (icVar2 != null) {
            icVar2.b();
        }
        znVar.y3 = true;
        int i11 = znVar.z3 + 1;
        znVar.z3 = i11;
        boolean z11 = znVar.e4;
        zn znVar2 = this.a;
        int G8 = z11 ? znVar2.G8() : znVar.G8();
        ArrayList arrayList3 = new ArrayList(znVar.e4 ? znVar2.E4 : znVar.E4);
        org.telegram.messenger.b8 b8Var = new org.telegram.messenger.b8(this, z10, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z10, arrayList3, i11);
        xn xnVar = znVar.ba;
        if (znVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z10) {
                org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(znVar.getParentActivity(), xnVar);
                fcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                fcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                fcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                ebVar = fcVar;
            } else {
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(znVar.getParentActivity(), xnVar);
                qbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                qbVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                ebVar = qbVar;
            }
            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(znVar.getParentActivity(), xnVar, true);
            gcVar.a = b8Var;
            gcVar.b = l0Var;
            ebVar.setButton(gcVar);
            icVar = org.telegram.ui.Components.ic.g(znVar, ebVar, 5000);
        }
        znVar.x3 = icVar;
    }

    @Override // org.telegram.ui.mm
    public final void o0(String str) {
        this.b.da(str, false);
    }
}
