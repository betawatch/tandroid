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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tp0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ mq0 d;

    public tp0(mq0 mq0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = mq0Var;
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
        boolean z4;
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
        mq0 mq0Var = this.d;
        tl0 tl0Var = mq0Var.B;
        jq0 jq0Var = mq0Var.I;
        org.telegram.ui.ActionBar.k kVar = mq0Var.w0;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue != (-dialog.id)) {
            return;
        }
        ArrayList arrayList = jq0Var.f;
        AtomicReference atomicReference = this.b;
        if (arrayList == null) {
            i22 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
        }
        if (atomicReference.get() != null) {
            z4 = false;
            i12 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
            jq0Var.f = MessagesController.getInstance(i12).getTopicsController().getTopics(-dialog.id);
            i13 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
            jq0Var.d = UserObject.isBotForum(i13, dialog.id);
            i14 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
            jq0Var.e = UserObject.isBotForumWithEditableTopics(i14, dialog.id);
            if (z4) {
                jq0Var.l();
            }
            if (jq0Var.f != null) {
                i21 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                NotificationCenter.getInstance(i21).removeObserver(this, NotificationCenter.topicsDidLoaded);
            }
            if (z4) {
                return;
            }
            tl0Var.setVisibility(0);
            tl0Var.setAlpha(0.0f);
            kVar.setVisibility(0);
            kVar.setAlpha(0.0f);
            i15 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
            if (UserObject.isBotForum(i15, dialog.id)) {
                i20 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                kVar.setTitle(DialogObject.getShortName(MessagesController.getInstance(i20).getUser(Long.valueOf(dialog.id))));
                kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
            } else {
                i16 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                if (ChatObject.isMonoForum(i16, dialog.id)) {
                    i18 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                    i19 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                    kVar.setTitle(bg.e.i(MessagesController.getInstance(i19).getChat(Long.valueOf(-dialog.id)), i18, false));
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                } else {
                    i17 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                    kVar.setTitle(MessagesController.getInstance(i17).getChat(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                }
            }
            mq0Var.J0 = mq0Var.I0;
            o1.j jVar = mq0Var.y0;
            if (jVar != null) {
                jVar.c();
            }
            int[] iArr = new int[2];
            o1.j jVar2 = new o1.j(new kb.a(0.0f));
            o1.k kVar2 = new o1.k(1000.0f);
            org.telegram.ui.xn xnVar = mq0Var.c0;
            kVar2.b((xnVar == null || !xnVar.b) ? 800.0f : 10.0f);
            kVar2.a(1.0f);
            jVar2.u = kVar2;
            mq0Var.y0 = jVar2;
            jVar2.b(new ep0(this, this.c, iArr, 1));
            mq0Var.y0.a(new ya(this, 5));
            mq0Var.y0.f();
            if (atomicReference.get() != null) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) atomicReference.get());
                atomicReference.set(null);
                return;
            }
            return;
        }
        z4 = true;
        i12 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
        jq0Var.f = MessagesController.getInstance(i12).getTopicsController().getTopics(-dialog.id);
        i13 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
        jq0Var.d = UserObject.isBotForum(i13, dialog.id);
        i14 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
        jq0Var.e = UserObject.isBotForumWithEditableTopics(i14, dialog.id);
        if (z4) {
        }
        if (jq0Var.f != null) {
        }
        if (z4) {
        }
    }
}
