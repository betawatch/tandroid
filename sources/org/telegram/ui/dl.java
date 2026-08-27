package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dl implements em {
    public final /* synthetic */ rn a;
    public final /* synthetic */ rn b;

    public dl(rn rnVar, rn rnVar2) {
        this.b = rnVar;
        this.a = rnVar2;
    }

    @Override // org.telegram.ui.em
    public final void E(boolean z10, boolean z11) {
        org.telegram.ui.Components.cb cbVar;
        int i10;
        rn rnVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) rnVar.F4.get(Integer.valueOf(rnVar.H4));
            if (messageObject == null) {
                messageObject = (MessageObject) rnVar.k6[0].get(rnVar.H4);
            }
            rnVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(rnVar.D4);
        ArrayList arrayList2 = new ArrayList(rnVar.F4.values());
        org.telegram.ui.Components.ec ecVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (rnVar.D4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + rnVar.P5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + rnVar.P5, ((Integer) rnVar.D4.get(0)).intValue()).commit();
            }
            rnVar.yc(0, true);
        } else {
            rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(rnVar.P5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.ec ecVar2 = rnVar.w3;
        if (ecVar2 != null) {
            ecVar2.b();
        }
        rnVar.x3 = true;
        int i11 = rnVar.y3 + 1;
        rnVar.y3 = i11;
        boolean z12 = rnVar.d4;
        rn rnVar2 = this.a;
        int G8 = z12 ? rnVar2.G8() : rnVar.G8();
        ArrayList arrayList3 = new ArrayList(rnVar.d4 ? rnVar2.D4 : rnVar.D4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList3, i11);
        pn pnVar = rnVar.aa;
        if (rnVar.getParentActivity() == null) {
            j0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(rnVar.getParentActivity(), pnVar);
                bcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                bcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                bcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                cbVar = bcVar;
            } else {
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(rnVar.getParentActivity(), pnVar);
                mbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                mbVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                cbVar = mbVar;
            }
            org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(rnVar.getParentActivity(), pnVar, true);
            ccVar.a = y7Var;
            ccVar.b = j0Var;
            cbVar.setButton(ccVar);
            ecVar = org.telegram.ui.Components.ec.g(rnVar, cbVar, 5000);
        }
        rnVar.w3 = ecVar;
    }

    @Override // org.telegram.ui.em
    public final void P0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.em
    public final void g0(String str) {
        this.b.da(str, false);
    }
}
