package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class jl implements km {
    public final /* synthetic */ wn a;
    public final /* synthetic */ wn b;

    public jl(wn wnVar, wn wnVar2) {
        this.b = wnVar;
        this.a = wnVar2;
    }

    @Override // org.telegram.ui.km
    public final void S0(int i10) {
        this.b.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.km
    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        wn wnVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) wnVar.J4.get(Integer.valueOf(wnVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) wnVar.o6[0].get(wnVar.L4);
            }
            wnVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(wnVar.H4);
        ArrayList arrayList2 = new ArrayList(wnVar.J4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (wnVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + wnVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + wnVar.T5, ((Integer) wnVar.H4.get(0)).intValue()).commit();
            }
            wnVar.yc(0, true);
        } else {
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = wnVar.A3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        wnVar.B3 = true;
        int i11 = wnVar.C3 + 1;
        wnVar.C3 = i11;
        boolean z12 = wnVar.h4;
        wn wnVar2 = this.a;
        int G8 = z12 ? wnVar2.G8() : wnVar.G8();
        ArrayList arrayList3 = new ArrayList(wnVar.h4 ? wnVar2.H4 : wnVar.H4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i11);
        un unVar = wnVar.ea;
        if (wnVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(wnVar.getParentActivity(), unVar);
                ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ncVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ncVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                nbVar = ncVar;
            } else {
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wnVar.getParentActivity(), unVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(wnVar.getParentActivity(), unVar, true);
            ocVar.a = y7Var;
            ocVar.b = l0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(wnVar, nbVar, 5000);
        }
        wnVar.A3 = qcVar;
    }

    @Override // org.telegram.ui.km
    public final void s0(String str) {
        this.b.da(str, false);
    }
}
