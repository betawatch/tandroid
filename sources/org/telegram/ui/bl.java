package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bl implements cm {
    public final /* synthetic */ qn a;
    public final /* synthetic */ qn b;

    public bl(qn qnVar, qn qnVar2) {
        this.b = qnVar;
        this.a = qnVar2;
    }

    @Override // org.telegram.ui.cm
    public final void D(boolean z10, boolean z11) {
        org.telegram.ui.Components.eb ebVar;
        int i9;
        qn qnVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) qnVar.F4.get(Integer.valueOf(qnVar.H4));
            if (messageObject == null) {
                messageObject = (MessageObject) qnVar.k6[0].get(qnVar.H4);
            }
            qnVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(qnVar.D4);
        ArrayList arrayList2 = new ArrayList(qnVar.F4.values());
        org.telegram.ui.Components.gc gcVar = null;
        if (z11) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
            if (qnVar.D4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + qnVar.P5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + qnVar.P5, ((Integer) qnVar.D4.get(0)).intValue()).commit();
            }
            qnVar.yc(0, true);
        } else {
            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar.P5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.gc gcVar2 = qnVar.w3;
        if (gcVar2 != null) {
            gcVar2.b();
        }
        qnVar.x3 = true;
        int i10 = qnVar.y3 + 1;
        qnVar.y3 = i10;
        boolean z12 = qnVar.d4;
        qn qnVar2 = this.a;
        int G8 = z12 ? qnVar2.G8() : qnVar.G8();
        ArrayList arrayList3 = new ArrayList(qnVar.d4 ? qnVar2.D4 : qnVar.D4);
        org.telegram.messenger.v7 v7Var = new org.telegram.messenger.v7(this, z11, arrayList, arrayList2, G8, i10);
        org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList3, i10);
        on onVar = qnVar.aa;
        if (qnVar.getParentActivity() == null) {
            j0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(qnVar.getParentActivity(), onVar);
                dcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                dcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                dcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                ebVar = dcVar;
            } else {
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(qnVar.getParentActivity(), onVar);
                obVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                obVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                ebVar = obVar;
            }
            org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(qnVar.getParentActivity(), onVar, true);
            ecVar.a = v7Var;
            ecVar.b = j0Var;
            ebVar.setButton(ecVar);
            gcVar = org.telegram.ui.Components.gc.g(qnVar, ebVar, 5000);
        }
        qnVar.w3 = gcVar;
    }

    @Override // org.telegram.ui.cm
    public final void L(String str) {
        this.b.da(str, false);
    }

    @Override // org.telegram.ui.cm
    public final void P0(int i9) {
        this.b.j(i9, 0, true, 0, true, 0);
    }
}
