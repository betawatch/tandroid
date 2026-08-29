package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jp0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ dq0 d;

    public jp0(dq0 dq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = dq0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r3).getTopicsController().getTopics(-r11.id) == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        dq0 dq0Var = this.d;
        jl0 jl0Var = dq0Var.A;
        aq0 aq0Var = dq0Var.H;
        org.telegram.ui.ActionBar.l lVar = dq0Var.v0;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue != (-dialog.id)) {
            return;
        }
        ArrayList arrayList = aq0Var.f;
        AtomicReference atomicReference = this.b;
        if (arrayList == null) {
            i22 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        }
        if (atomicReference.get() != null) {
            z10 = false;
            i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            aq0Var.f = MessagesController.getInstance(i12).getTopicsController().getTopics(-dialog.id);
            i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            aq0Var.d = UserObject.isBotForum(i13, dialog.id);
            i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            aq0Var.e = UserObject.isBotForumWithEditableTopics(i14, dialog.id);
            if (z10) {
                aq0Var.l();
            }
            if (aq0Var.f != null) {
                i21 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                NotificationCenter.getInstance(i21).removeObserver(this, NotificationCenter.topicsDidLoaded);
            }
            if (z10) {
                return;
            }
            jl0Var.setVisibility(0);
            jl0Var.setAlpha(0.0f);
            lVar.setVisibility(0);
            lVar.setAlpha(0.0f);
            i15 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            if (UserObject.isBotForum(i15, dialog.id)) {
                i20 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                lVar.setTitle(DialogObject.getShortName(MessagesController.getInstance(i20).getUser(Long.valueOf(dialog.id))));
                lVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
            } else {
                i16 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                if (ChatObject.isMonoForum(i16, dialog.id)) {
                    i18 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                    i19 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                    lVar.setTitle(yf.d.i(MessagesController.getInstance(i19).getChat(Long.valueOf(-dialog.id)), i18, false));
                    lVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                } else {
                    i17 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                    lVar.setTitle(MessagesController.getInstance(i17).getChat(Long.valueOf(-dialog.id)).title);
                    lVar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                }
            }
            dq0Var.I0 = dq0Var.H0;
            o1.k kVar = dq0Var.x0;
            if (kVar != null) {
                kVar.c();
            }
            int[] iArr = new int[2];
            o1.k kVar2 = new o1.k(new ib.a(0.0f));
            o1.l lVar2 = new o1.l(1000.0f);
            org.telegram.ui.tn tnVar = dq0Var.b0;
            lVar2.b((tnVar == null || !tnVar.b) ? 800.0f : 10.0f);
            lVar2.a(1.0f);
            kVar2.u = lVar2;
            dq0Var.x0 = kVar2;
            kVar2.b(new to0(this, this.c, iArr, 1));
            dq0Var.x0.a(new db(this, 5));
            dq0Var.x0.f();
            if (atomicReference.get() != null) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) atomicReference.get());
                atomicReference.set(null);
                return;
            }
            return;
        }
        z10 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        aq0Var.f = MessagesController.getInstance(i12).getTopicsController().getTopics(-dialog.id);
        i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        aq0Var.d = UserObject.isBotForum(i13, dialog.id);
        i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        aq0Var.e = UserObject.isBotForumWithEditableTopics(i14, dialog.id);
        if (z10) {
        }
        if (aq0Var.f != null) {
        }
        if (z10) {
        }
    }
}
