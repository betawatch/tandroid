package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kl implements lm {
    public final /* synthetic */ xn a;
    public final /* synthetic */ xn b;

    public kl(xn xnVar, xn xnVar2) {
        this.b = xnVar;
        this.a = xnVar2;
    }

    @Override // org.telegram.ui.lm
    public final void S0(int i10) {
        this.b.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.lm
    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        xn xnVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) xnVar.J4.get(Integer.valueOf(xnVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) xnVar.o6[0].get(xnVar.L4);
            }
            xnVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(xnVar.H4);
        ArrayList arrayList2 = new ArrayList(xnVar.J4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (xnVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + xnVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + xnVar.T5, ((Integer) xnVar.H4.get(0)).intValue()).commit();
            }
            xnVar.yc(0, true);
        } else {
            xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(xnVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = xnVar.A3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        xnVar.B3 = true;
        int i11 = xnVar.C3 + 1;
        xnVar.C3 = i11;
        boolean z12 = xnVar.h4;
        xn xnVar2 = this.a;
        int G8 = z12 ? xnVar2.G8() : xnVar.G8();
        ArrayList arrayList3 = new ArrayList(xnVar.h4 ? xnVar2.H4 : xnVar.H4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i11);
        vn vnVar = xnVar.ea;
        if (xnVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(xnVar.getParentActivity(), vnVar);
                ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ncVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ncVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                nbVar = ncVar;
            } else {
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(xnVar.getParentActivity(), vnVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(xnVar.getParentActivity(), vnVar, true);
            ocVar.a = y7Var;
            ocVar.b = l0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(xnVar, nbVar, 5000);
        }
        xnVar.A3 = qcVar;
    }

    @Override // org.telegram.ui.lm
    public final void s0(String str) {
        this.b.da(str, false);
    }
}
