package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fl implements em {
    public final /* synthetic */ qn a;
    public final /* synthetic */ qn b;

    public fl(qn qnVar, qn qnVar2) {
        this.b = qnVar;
        this.a = qnVar2;
    }

    @Override // org.telegram.ui.em
    public final void D0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.em
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Components.nb nbVar;
        int i10;
        qn qnVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) qnVar.J4.get(Integer.valueOf(qnVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) qnVar.o6[0].get(qnVar.L4);
            }
            qnVar.hc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(qnVar.H4);
        ArrayList arrayList2 = new ArrayList(qnVar.J4.values());
        org.telegram.ui.Components.qc qcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (qnVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + qnVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + qnVar.T5, ((Integer) qnVar.H4.get(0)).intValue()).commit();
            }
            qnVar.Dc(0, true);
        } else {
            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.qc qcVar2 = qnVar.A3;
        if (qcVar2 != null) {
            qcVar2.b();
        }
        qnVar.B3 = true;
        int i11 = qnVar.C3 + 1;
        qnVar.C3 = i11;
        boolean z12 = qnVar.h4;
        qn qnVar2 = this.a;
        int L8 = z12 ? qnVar2.L8() : qnVar.L8();
        ArrayList arrayList3 = new ArrayList(qnVar.h4 ? qnVar2.H4 : qnVar.H4);
        org.telegram.messenger.a8 a8Var = new org.telegram.messenger.a8(this, z11, arrayList, arrayList2, L8, i11);
        org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList3, i11);
        on onVar = qnVar.ea;
        if (qnVar.getParentActivity() == null) {
            k0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(qnVar.getParentActivity(), onVar);
                ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ncVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                ncVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                nbVar = ncVar;
            } else {
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(qnVar.getParentActivity(), onVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", L8, new Object[0]));
                nbVar = ybVar;
            }
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(qnVar.getParentActivity(), onVar, true);
            ocVar.a = a8Var;
            ocVar.b = k0Var;
            nbVar.setButton(ocVar);
            qcVar = org.telegram.ui.Components.qc.g(qnVar, nbVar, 5000);
        }
        qnVar.A3 = qcVar;
    }

    @Override // org.telegram.ui.em
    public final void b0(String str) {
        this.b.ia(str, false);
    }
}
