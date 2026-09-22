package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ll implements mm {
    public final /* synthetic */ zn a;
    public final /* synthetic */ zn b;

    public ll(zn znVar, zn znVar2) {
        this.b = znVar;
        this.a = znVar2;
    }

    @Override // org.telegram.ui.mm
    public final void R0(int i10) {
        this.b.E(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.mm
    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.Components.mb mbVar;
        int i10;
        zn znVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) znVar.o6[0].get(znVar.L4);
            }
            znVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(znVar.H4);
        ArrayList arrayList2 = new ArrayList(znVar.J4.values());
        org.telegram.ui.Components.pc pcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (znVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + znVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + znVar.T5, ((Integer) znVar.H4.get(0)).intValue()).commit();
            }
            znVar.yc(0, true);
        } else {
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.pc pcVar2 = znVar.A3;
        if (pcVar2 != null) {
            pcVar2.b();
        }
        znVar.B3 = true;
        int i11 = znVar.C3 + 1;
        znVar.C3 = i11;
        boolean z12 = znVar.h4;
        zn znVar2 = this.a;
        int G8 = z12 ? znVar2.G8() : znVar.G8();
        ArrayList arrayList3 = new ArrayList(znVar.h4 ? znVar2.H4 : znVar.H4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i11);
        xn xnVar = znVar.ea;
        if (znVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(znVar.getParentActivity(), xnVar);
                mcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                mcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                mcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                mbVar = mcVar;
            } else {
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(znVar.getParentActivity(), xnVar);
                xbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                xbVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                mbVar = xbVar;
            }
            org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(znVar.getParentActivity(), xnVar, true);
            ncVar.a = y7Var;
            ncVar.b = l0Var;
            mbVar.setButton(ncVar);
            pcVar = org.telegram.ui.Components.pc.g(znVar, mbVar, 5000);
        }
        znVar.A3 = pcVar;
    }

    @Override // org.telegram.ui.mm
    public final void s0(String str) {
        this.b.da(str, false);
    }
}
