package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements org.telegram.ui.Components.hj0, r0.m, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ or(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = I0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.l0 = i3;
        pi.a.e(contactsActivity.d, I0.b, i3, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.i0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        ContactsActivity contactsActivity = this.a;
        u4.h0 adapter = contactsActivity.d.getAdapter();
        qr qrVar = contactsActivity.b;
        if (adapter == qrVar) {
            int S = qrVar.S(i3);
            int Q = contactsActivity.b.Q(i3);
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
            if (acVar != null) {
                acVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.J;
        if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            return true;
        }
        if (z10 || contactsActivity.K || !(view instanceof org.telegram.ui.Cells.f6)) {
            return false;
        }
        org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
        if (f6Var.getUser() != null && f6Var.getUser().contact) {
            contactsActivity.p0(f6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ContactsActivity contactsActivity = this.a;
        a0.h hVar = contactsActivity.a0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        org.telegram.messenger.g5 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i11);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.g0.get(Long.valueOf(user.id));
                user.contact = false;
                contactsController.f0.remove(tL_contact);
                contactsController.g0.remove(Long.valueOf(user.id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.hs notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.hp.C8;
            notificationCenter.k(org.telegram.messenger.hs.r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.hs.O, new Object[0]);
            org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(parentActivity, contactsActivity.getResourceProvider());
            sbVar.setTimer();
            sbVar.b.setText(org.telegram.messenger.bd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(parentActivity, contactsActivity.getResourceProvider(), true, true);
            ybVar.b = new org.telegram.messenger.b4(27, contactsController, hashMap);
            ybVar.c = new org.telegram.messenger.w4(contactsController, arrayList, 1);
            sbVar.setButton(ybVar);
            org.telegram.ui.Components.ac.g(contactsActivity, sbVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
