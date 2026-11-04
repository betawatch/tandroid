package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ dt0(PrivacySettingsActivity privacySettingsActivity, int i3) {
        this.a = i3;
        this.b = privacySettingsActivity;
    }

    public void a() {
        int i3;
        switch (this.a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                et0 et0Var = privacySettingsActivity.a;
                if (et0Var != null && (i3 = privacySettingsActivity.s) >= 0) {
                    et0Var.g(i3);
                    break;
                }
                break;
            default:
                PrivacySettingsActivity.Z(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String M0;
        int i10 = this.a;
        int i11 = 0;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        int i12 = 1;
        switch (i10) {
            case 0:
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M02 = org.telegram.messenger.bd.M0(2131746802, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                s1Var2.S = M02;
                s1Var2.U = org.telegram.messenger.bd.M0(2131746804, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, "ClearButton"), new dt0(privacySettingsActivity, i12));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(s1Var2);
                privacySettingsActivity.showDialog(s1Var2);
                TextView textView = (TextView) s1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ei.u5(9));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    M0 = org.telegram.messenger.bd.M0(2131746800, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z10) {
                    M0 = org.telegram.messenger.bd.M0(2131746799, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = org.telegram.messenger.bd.M0(2131746801, "PrivacyPaymentsPaymentInfoCleared");
                }
                org.telegram.ui.Components.fc.a0(privacySettingsActivity).Q(R.raw.chats_infotip, 36, M0).j();
                break;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.s1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.c = p10;
                p10.j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    org.telegram.messenger.h10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z11 = privacySettingsActivity.U;
                    userConfig.V = z11;
                    privacySettingsActivity.T = z11;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.g5 contactsController = privacySettingsActivity.getContactsController();
                ct0 ct0Var = new ct0(privacySettingsActivity, i12);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f0.size();
                for (int i13 = 0; i13 < size; i13++) {
                    tL_contacts_deleteContacts.id.add(contactsController.getMessagesController().o1(((TLRPC.TL_contact) contactsController.f0.get(i13)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.s4(i11, contactsController, ct0Var));
                break;
            case 4:
                xd0 xd0Var = new xd0();
                ct0 ct0Var2 = new ct0(privacySettingsActivity, 2);
                xd0Var.G = 3;
                xd0Var.a = 12;
                xd0Var.e0 = ct0Var2;
                privacySettingsActivity.presentFragment(xd0Var);
                break;
        }
    }
}
