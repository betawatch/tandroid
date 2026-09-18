package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class kl implements mm {
    public final /* synthetic */ zn a;
    public final /* synthetic */ zn b;

    public kl(zn znVar, zn znVar2) {
        this.b = znVar;
        this.a = znVar2;
    }

    @Override // org.telegram.ui.mm
    public final void S0(int i10) {
        this.b.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.mm
    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
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
        org.telegram.ui.Components.qc qcVar = null;
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
        org.telegram.ui.Components.qc qcVar2 = znVar.A3;
        if (qcVar2 != null) {
            qcVar2.b();
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
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(znVar.getParentActivity(), xnVar);
                ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ncVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ncVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                nbVar = ncVar;
            } else {
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(znVar.getParentActivity(), xnVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(znVar.getParentActivity(), xnVar, true);
            ocVar.a = y7Var;
            ocVar.b = l0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(znVar, nbVar, 5000);
        }
        znVar.A3 = qcVar;
    }

    @Override // org.telegram.ui.mm
    public final void s0(String str) {
        this.b.da(str, false);
    }
}
