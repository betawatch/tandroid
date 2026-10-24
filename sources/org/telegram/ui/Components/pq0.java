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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pq0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ir0 d;

    public pq0(ir0 ir0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = ir0Var;
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
        ir0 ir0Var = this.d;
        mm0 mm0Var = ir0Var.F;
        fr0 fr0Var = ir0Var.M;
        org.telegram.ui.ActionBar.k kVar = ir0Var.A0;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue != (-dialog.id)) {
            return;
        }
        ArrayList arrayList = fr0Var.f;
        AtomicReference atomicReference = this.b;
        if (arrayList == null) {
            i22 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        }
        if (atomicReference.get() != null) {
            z10 = false;
            i12 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            fr0Var.f = MessagesController.getInstance(i12).getTopicsController().getTopics(-dialog.id);
            i13 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            fr0Var.d = UserObject.isBotForum(i13, dialog.id);
            i14 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            fr0Var.e = UserObject.isBotForumWithEditableTopics(i14, dialog.id);
            if (z10) {
                fr0Var.l();
            }
            if (fr0Var.f != null) {
                i21 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                NotificationCenter.getInstance(i21).removeObserver(this, NotificationCenter.topicsDidLoaded);
            }
            if (z10) {
                return;
            }
            mm0Var.setVisibility(0);
            mm0Var.setAlpha(0.0f);
            kVar.setVisibility(0);
            kVar.setAlpha(0.0f);
            i15 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            if (UserObject.isBotForum(i15, dialog.id)) {
                i20 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                kVar.setTitle(DialogObject.getShortName(MessagesController.getInstance(i20).getUser(Long.valueOf(dialog.id))));
                kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
            } else {
                i16 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                if (ChatObject.isMonoForum(i16, dialog.id)) {
                    i18 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                    i19 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                    kVar.setTitle(og.d.i(MessagesController.getInstance(i19).getChat(Long.valueOf(-dialog.id)), i18, false));
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                } else {
                    i17 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                    kVar.setTitle(MessagesController.getInstance(i17).getChat(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                }
            }
            ir0Var.N0 = ir0Var.M0;
            o1.k kVar2 = ir0Var.C0;
            if (kVar2 != null) {
                kVar2.c();
            }
            int[] iArr = new int[2];
            o1.k kVar3 = new o1.k(new o1.j(0.0f));
            o1.l lVar = new o1.l(1000.0f);
            org.telegram.ui.sn snVar = ir0Var.g0;
            lVar.b((snVar == null || !snVar.b) ? 800.0f : 10.0f);
            lVar.a(1.0f);
            kVar3.u = lVar;
            ir0Var.C0 = kVar3;
            kVar3.b(new aq0(this, this.c, iArr, 1));
            ir0Var.C0.a(new hb(this, 6));
            ir0Var.C0.h();
            if (atomicReference.get() != null) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) atomicReference.get());
                atomicReference.set(null);
                return;
            }
            return;
        }
        z10 = true;
        i12 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        fr0Var.f = MessagesController.getInstance(i12).getTopicsController().getTopics(-dialog.id);
        i13 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        fr0Var.d = UserObject.isBotForum(i13, dialog.id);
        i14 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        fr0Var.e = UserObject.isBotForumWithEditableTopics(i14, dialog.id);
        if (z10) {
        }
        if (fr0Var.f != null) {
        }
        if (z10) {
        }
    }
}
