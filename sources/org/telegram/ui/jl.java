package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jl implements im {
    public final /* synthetic */ wn a;
    public final /* synthetic */ wn b;

    public jl(wn wnVar, wn wnVar2) {
        this.b = wnVar;
        this.a = wnVar2;
    }

    @Override // org.telegram.ui.im
    public final void Q0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.im
    public final void T(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        wn wnVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) wnVar.V4.get(Integer.valueOf(wnVar.X4));
            if (messageObject == null) {
                messageObject = (MessageObject) wnVar.E6[0].get(wnVar.X4);
            }
            wnVar.tc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(wnVar.T4);
        ArrayList arrayList2 = new ArrayList(wnVar.V4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (wnVar.T4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + wnVar.j6).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + wnVar.j6, ((Integer) wnVar.T4.get(0)).intValue()).commit();
            }
            wnVar.Pc(0, true);
        } else {
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.j6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = wnVar.M3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        wnVar.N3 = true;
        int i11 = wnVar.O3 + 1;
        wnVar.O3 = i11;
        boolean z12 = wnVar.t4;
        wn wnVar2 = this.a;
        int T8 = z12 ? wnVar2.T8() : wnVar.T8();
        ArrayList arrayList3 = new ArrayList(wnVar.t4 ? wnVar2.T4 : wnVar.T4);
        org.telegram.messenger.d8 d8Var = new org.telegram.messenger.d8(this, z11, arrayList, arrayList2, T8, i11);
        org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList3, i11);
        un unVar = wnVar.ua;
        if (wnVar.getParentActivity() == null) {
            j0Var.run();
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
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", T8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(wnVar.getParentActivity(), unVar, true);
            ocVar.b = d8Var;
            ocVar.c = j0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(wnVar, nbVar, 5000);
        }
        wnVar.M3 = qcVar;
    }

    @Override // org.telegram.ui.im
    public final void p0(String str) {
        this.b.qa(str, false);
    }
}
