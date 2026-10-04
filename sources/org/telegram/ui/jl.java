package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jl implements km {
    public final /* synthetic */ yn a;
    public final /* synthetic */ yn b;

    public jl(yn ynVar, yn ynVar2) {
        this.b = ynVar;
        this.a = ynVar2;
    }

    @Override // org.telegram.ui.km
    public final void S0(int i10) {
        this.b.D(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.km
    public final void X(boolean z10, boolean z11) {
        org.telegram.ui.Components.ob obVar;
        int i10;
        yn ynVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) ynVar.H4.get(Integer.valueOf(ynVar.J4));
            if (messageObject == null) {
                messageObject = (MessageObject) ynVar.m6[0].get(ynVar.J4);
            }
            ynVar.bc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(ynVar.F4);
        ArrayList arrayList2 = new ArrayList(ynVar.H4.values());
        org.telegram.ui.Components.rc rcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (ynVar.F4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + ynVar.R5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + ynVar.R5, ((Integer) ynVar.F4.get(0)).intValue()).commit();
            }
            ynVar.xc(0, true);
        } else {
            ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(ynVar.R5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.rc rcVar2 = ynVar.y3;
        if (rcVar2 != null) {
            rcVar2.b();
        }
        ynVar.z3 = true;
        int i11 = ynVar.A3 + 1;
        ynVar.A3 = i11;
        boolean z12 = ynVar.f4;
        yn ynVar2 = this.a;
        int H8 = z12 ? ynVar2.H8() : ynVar.H8();
        ArrayList arrayList3 = new ArrayList(ynVar.f4 ? ynVar2.F4 : ynVar.F4);
        org.telegram.messenger.v7 v7Var = new org.telegram.messenger.v7(this, z11, arrayList, arrayList2, H8, i11);
        org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(this, z11, arrayList3, i11);
        wn wnVar = ynVar.ca;
        if (ynVar.getParentActivity() == null) {
            m0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(ynVar.getParentActivity(), wnVar);
                ocVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ocVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ocVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                obVar = ocVar;
            } else {
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(ynVar.getParentActivity(), wnVar);
                zbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                zbVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", H8, new Object[0]));
                obVar = zbVar;
            }
            org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(ynVar.getParentActivity(), wnVar, true);
            pcVar.a = v7Var;
            pcVar.b = m0Var;
            obVar.setButton(pcVar);
            rcVar = org.telegram.ui.Components.rc.g(ynVar, obVar, 5000);
        }
        ynVar.y3 = rcVar;
    }

    @Override // org.telegram.ui.km
    public final void u0(String str) {
        this.b.ca(str, false);
    }
}
