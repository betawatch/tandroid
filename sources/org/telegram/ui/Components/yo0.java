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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yo0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ rp0 d;

    public yo0(rp0 rp0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = rp0Var;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean z10;
        int i11;
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
        rp0 rp0Var = this.d;
        wk0 wk0Var = rp0Var.A;
        op0 op0Var = rp0Var.H;
        org.telegram.ui.ActionBar.k kVar = rp0Var.v0;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue != (-dialog.id)) {
            return;
        }
        ArrayList arrayList = op0Var.f;
        AtomicReference atomicReference = this.b;
        if (arrayList == null) {
            i21 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        }
        if (atomicReference.get() != null) {
            z10 = false;
            i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            op0Var.f = MessagesController.getInstance(i11).getTopicsController().getTopics(-dialog.id);
            i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            op0Var.d = UserObject.isBotForum(i12, dialog.id);
            i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            op0Var.e = UserObject.isBotForumWithEditableTopics(i13, dialog.id);
            if (z10) {
                op0Var.l();
            }
            if (op0Var.f != null) {
                i20 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                NotificationCenter.getInstance(i20).removeObserver(this, NotificationCenter.topicsDidLoaded);
            }
            if (z10) {
                return;
            }
            wk0Var.setVisibility(0);
            wk0Var.setAlpha(0.0f);
            kVar.setVisibility(0);
            kVar.setAlpha(0.0f);
            i14 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            if (UserObject.isBotForum(i14, dialog.id)) {
                i19 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                kVar.setTitle(DialogObject.getShortName(MessagesController.getInstance(i19).getUser(Long.valueOf(dialog.id))));
                kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
            } else {
                i15 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                if (ChatObject.isMonoForum(i15, dialog.id)) {
                    i17 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                    i18 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                    kVar.setTitle(vf.c.i(MessagesController.getInstance(i18).getChat(Long.valueOf(-dialog.id)), i17, false));
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                } else {
                    i16 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                    kVar.setTitle(MessagesController.getInstance(i16).getChat(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                }
            }
            rp0Var.I0 = rp0Var.H0;
            o1.j jVar = rp0Var.x0;
            if (jVar != null) {
                jVar.c();
            }
            int[] iArr = new int[2];
            o1.j jVar2 = new o1.j(new gb.a(0.0f));
            o1.k kVar2 = new o1.k(1000.0f);
            org.telegram.ui.qn qnVar = rp0Var.b0;
            kVar2.b((qnVar == null || !qnVar.b) ? 800.0f : 10.0f);
            kVar2.a(1.0f);
            jVar2.u = kVar2;
            rp0Var.x0 = jVar2;
            jVar2.b(new io0(this, this.c, iArr, 1));
            rp0Var.x0.a(new ya(this, 5));
            rp0Var.x0.f();
            if (atomicReference.get() != null) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) atomicReference.get());
                atomicReference.set(null);
                return;
            }
            return;
        }
        z10 = true;
        i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        op0Var.f = MessagesController.getInstance(i11).getTopicsController().getTopics(-dialog.id);
        i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        op0Var.d = UserObject.isBotForum(i12, dialog.id);
        i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        op0Var.e = UserObject.isBotForumWithEditableTopics(i13, dialog.id);
        if (z10) {
        }
        if (op0Var.f != null) {
        }
        if (z10) {
        }
    }
}
