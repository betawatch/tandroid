package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nl implements om {
    public final /* synthetic */ bo a;
    public final /* synthetic */ bo b;

    public nl(bo boVar, bo boVar2) {
        this.b = boVar;
        this.a = boVar2;
    }

    @Override // org.telegram.ui.om
    public final void S0(int i10) {
        this.b.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.om
    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.Components.lb lbVar;
        int i10;
        bo boVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) boVar.J4.get(Integer.valueOf(boVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) boVar.o6[0].get(boVar.L4);
            }
            boVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(boVar.H4);
        ArrayList arrayList2 = new ArrayList(boVar.J4.values());
        org.telegram.ui.Components.oc ocVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (boVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + boVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + boVar.T5, ((Integer) boVar.H4.get(0)).intValue()).commit();
            }
            boVar.yc(0, true);
        } else {
            boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(boVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.oc ocVar2 = boVar.A3;
        if (ocVar2 != null) {
            ocVar2.b();
        }
        boVar.B3 = true;
        int i11 = boVar.C3 + 1;
        boVar.C3 = i11;
        boolean z12 = boVar.h4;
        bo boVar2 = this.a;
        int G8 = z12 ? boVar2.G8() : boVar.G8();
        ArrayList arrayList3 = new ArrayList(boVar.h4 ? boVar2.H4 : boVar.H4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i11);
        zn znVar = boVar.ea;
        if (boVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(boVar.getParentActivity(), znVar);
                lcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                lcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                lcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                lbVar = lcVar;
            } else {
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(boVar.getParentActivity(), znVar);
                wbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                wbVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                lbVar = wbVar;
            }
            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(boVar.getParentActivity(), znVar, true);
            mcVar.a = y7Var;
            mcVar.b = l0Var;
            lbVar.setButton(mcVar);
            ocVar = org.telegram.ui.Components.oc.g(boVar, lbVar, 5000);
        }
        boVar.A3 = ocVar;
    }

    @Override // org.telegram.ui.om
    public final void s0(String str) {
        this.b.da(str, false);
    }
}
