package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ pt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.a = i7;
        this.b = privacySettingsActivity;
    }

    public void a() {
        int i7;
        switch (this.a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                rt0 rt0Var = privacySettingsActivity.a;
                if (rt0Var != null && (i7 = privacySettingsActivity.s) >= 0) {
                    rt0Var.g(i7);
                    break;
                }
                break;
            default:
                PrivacySettingsActivity.Z(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
                String M02 = org.telegram.messenger.id.M0(2131746794, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.R = M02;
                u1Var2.T = org.telegram.messenger.id.M0(2131746796, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, "ClearButton"), new pt0(privacySettingsActivity, i12));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(u1Var2);
                privacySettingsActivity.showDialog(u1Var2);
                TextView textView = (TextView) u1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new di.v5(9));
                boolean z9 = zArr[0];
                if (z9 && zArr[1]) {
                    M0 = org.telegram.messenger.id.M0(2131746792, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z9) {
                    M0 = org.telegram.messenger.id.M0(2131746791, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = org.telegram.messenger.id.M0(2131746793, "PrivacyPaymentsPaymentInfoCleared");
                }
                org.telegram.ui.Components.gc.a0(privacySettingsActivity).Q(R.raw.chats_infotip, 36, M0).j();
                break;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.u1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.c = p10;
                p10.i0 = false;
                if (privacySettingsActivity.S != privacySettingsActivity.T) {
                    org.telegram.messenger.p10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z10 = privacySettingsActivity.T;
                    userConfig.U = z10;
                    privacySettingsActivity.S = z10;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.g5 contactsController = privacySettingsActivity.getContactsController();
                ot0 ot0Var = new ot0(privacySettingsActivity, i12);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.e0.size();
                for (int i13 = 0; i13 < size; i13++) {
                    tL_contacts_deleteContacts.id.add(contactsController.getMessagesController().o1(((TLRPC.TL_contact) contactsController.e0.get(i13)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.r4(i11, contactsController, ot0Var));
                break;
            case 4:
                fe0 fe0Var = new fe0();
                ot0 ot0Var2 = new ot0(privacySettingsActivity, 2);
                fe0Var.F = 3;
                fe0Var.a = 12;
                fe0Var.d0 = ot0Var2;
                privacySettingsActivity.presentFragment(fe0Var);
                break;
        }
    }
}
