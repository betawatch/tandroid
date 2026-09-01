package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kl implements km {
    public final /* synthetic */ xn a;
    public final /* synthetic */ xn b;

    public kl(xn xnVar, xn xnVar2) {
        this.b = xnVar;
        this.a = xnVar2;
    }

    @Override // org.telegram.ui.km
    public final void O0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.km
    public final void W(boolean z4, boolean z10) {
        org.telegram.ui.Components.eb ebVar;
        int i10;
        xn xnVar = this.b;
        if (!z4) {
            MessageObject messageObject = (MessageObject) xnVar.G4.get(Integer.valueOf(xnVar.I4));
            if (messageObject == null) {
                messageObject = (MessageObject) xnVar.l6[0].get(xnVar.I4);
            }
            xnVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(xnVar.E4);
        ArrayList arrayList2 = new ArrayList(xnVar.G4.values());
        org.telegram.ui.Components.ic icVar = null;
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (xnVar.E4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + xnVar.Q5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + xnVar.Q5, ((Integer) xnVar.E4.get(0)).intValue()).commit();
            }
            xnVar.yc(0, true);
        } else {
            xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(xnVar.Q5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.ic icVar2 = xnVar.x3;
        if (icVar2 != null) {
            icVar2.b();
        }
        xnVar.y3 = true;
        int i11 = xnVar.z3 + 1;
        xnVar.z3 = i11;
        boolean z11 = xnVar.e4;
        xn xnVar2 = this.a;
        int G8 = z11 ? xnVar2.G8() : xnVar.G8();
        ArrayList arrayList3 = new ArrayList(xnVar.e4 ? xnVar2.E4 : xnVar.E4);
        org.telegram.messenger.b8 b8Var = new org.telegram.messenger.b8(this, z10, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z10, arrayList3, i11);
        vn vnVar = xnVar.ba;
        if (xnVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z10) {
                org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(xnVar.getParentActivity(), vnVar);
                fcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                fcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                fcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                ebVar = fcVar;
            } else {
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(xnVar.getParentActivity(), vnVar);
                qbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                qbVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                ebVar = qbVar;
            }
            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(xnVar.getParentActivity(), vnVar, true);
            gcVar.a = b8Var;
            gcVar.b = l0Var;
            ebVar.setButton(gcVar);
            icVar = org.telegram.ui.Components.ic.g(xnVar, ebVar, 5000);
        }
        xnVar.x3 = icVar;
    }

    @Override // org.telegram.ui.km
    public final void t0(String str) {
        this.b.da(str, false);
    }
}
