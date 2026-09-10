package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pl implements qm {
    public final /* synthetic */ eo a;
    public final /* synthetic */ eo b;

    public pl(eo eoVar, eo eoVar2) {
        this.b = eoVar;
        this.a = eoVar2;
    }

    @Override // org.telegram.ui.qm
    public final void S0(int i10) {
        this.b.E(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.qm
    public final void V(boolean z10, boolean z11) {
        org.telegram.ui.Components.mb mbVar;
        int i10;
        eo eoVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) eoVar.o6[0].get(eoVar.L4);
            }
            eoVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(eoVar.H4);
        ArrayList arrayList2 = new ArrayList(eoVar.J4.values());
        org.telegram.ui.Components.pc pcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (eoVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + eoVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + eoVar.T5, ((Integer) eoVar.H4.get(0)).intValue()).commit();
            }
            eoVar.yc(0, true);
        } else {
            eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(eoVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.pc pcVar2 = eoVar.A3;
        if (pcVar2 != null) {
            pcVar2.b();
        }
        eoVar.B3 = true;
        int i11 = eoVar.C3 + 1;
        eoVar.C3 = i11;
        boolean z12 = eoVar.h4;
        eo eoVar2 = this.a;
        int G8 = z12 ? eoVar2.G8() : eoVar.G8();
        ArrayList arrayList3 = new ArrayList(eoVar.h4 ? eoVar2.H4 : eoVar.H4);
        org.telegram.messenger.e8 e8Var = new org.telegram.messenger.e8(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.o0 o0Var = new org.telegram.messenger.voip.o0(this, z11, arrayList3, i11);
        bo boVar = eoVar.ea;
        if (eoVar.getParentActivity() == null) {
            o0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(eoVar.getParentActivity(), boVar);
                mcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                mcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                mcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                mbVar = mcVar;
            } else {
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(eoVar.getParentActivity(), boVar);
                xbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                xbVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                mbVar = xbVar;
            }
            org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(eoVar.getParentActivity(), boVar, true);
            ncVar.a = e8Var;
            ncVar.b = o0Var;
            mbVar.setButton(ncVar);
            pcVar = org.telegram.ui.Components.pc.g(eoVar, mbVar, 5000);
        }
        eoVar.A3 = pcVar;
    }

    @Override // org.telegram.ui.qm
    public final void r0(String str) {
        this.b.da(str, false);
    }
}
