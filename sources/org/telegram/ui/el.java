package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class el implements fm {
    public final /* synthetic */ tn a;
    public final /* synthetic */ tn b;

    public el(tn tnVar, tn tnVar2) {
        this.b = tnVar;
        this.a = tnVar2;
    }

    @Override // org.telegram.ui.fm
    public final void Q0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.fm
    public final void U(boolean z10, boolean z11) {
        org.telegram.ui.Components.jb jbVar;
        int i10;
        tn tnVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) tnVar.F4.get(Integer.valueOf(tnVar.H4));
            if (messageObject == null) {
                messageObject = (MessageObject) tnVar.k6[0].get(tnVar.H4);
            }
            tnVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(tnVar.D4);
        ArrayList arrayList2 = new ArrayList(tnVar.F4.values());
        org.telegram.ui.Components.mc mcVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (tnVar.D4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + tnVar.P5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + tnVar.P5, ((Integer) tnVar.D4.get(0)).intValue()).commit();
            }
            tnVar.yc(0, true);
        } else {
            tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(tnVar.P5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.mc mcVar2 = tnVar.w3;
        if (mcVar2 != null) {
            mcVar2.b();
        }
        tnVar.x3 = true;
        int i11 = tnVar.y3 + 1;
        tnVar.y3 = i11;
        boolean z12 = tnVar.d4;
        tn tnVar2 = this.a;
        int G8 = z12 ? tnVar2.G8() : tnVar.G8();
        ArrayList arrayList3 = new ArrayList(tnVar.d4 ? tnVar2.D4 : tnVar.D4);
        org.telegram.messenger.a8 a8Var = new org.telegram.messenger.a8(this, z11, arrayList, arrayList2, G8, i11);
        org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList3, i11);
        rn rnVar = tnVar.aa;
        if (tnVar.getParentActivity() == null) {
            k0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(tnVar.getParentActivity(), rnVar);
                jcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                jcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                jcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                jbVar = jcVar;
            } else {
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(tnVar.getParentActivity(), rnVar);
                ubVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ubVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", G8, new Object[0]));
                jbVar = ubVar;
            }
            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(tnVar.getParentActivity(), rnVar, true);
            kcVar.a = a8Var;
            kcVar.b = k0Var;
            jbVar.setButton(kcVar);
            mcVar = org.telegram.ui.Components.mc.g(tnVar, jbVar, 5000);
        }
        tnVar.w3 = mcVar;
    }

    @Override // org.telegram.ui.fm
    public final void q0(String str) {
        this.b.da(str, false);
    }
}
