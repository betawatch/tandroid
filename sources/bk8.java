// default package

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bk8 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ bk8(PrivacySettingsActivity privacySettingsActivity, byte b) {
        this.a = b;
        this.b = privacySettingsActivity;
    }

    public final void a() {
        int i;
        byte b = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (b) {
            case 2:
                dk8 dk8Var = privacySettingsActivity.a;
                if (dk8Var != null && (i = privacySettingsActivity.s) >= 0) {
                    dk8Var.g(i);
                    break;
                }
                break;
            default:
                privacySettingsActivity.C0();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ed
    public final void u(hd hdVar, int i) {
        String M0;
        byte b = this.a;
        Object[] objArr = 0;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                privacySettingsActivity.getClass();
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M02 = k96.M0(2131746603, "PrivacyPaymentsClearAlertTitle");
                hd hdVar2 = alertDialog$Builder.a;
                hdVar2.S = M02;
                hdVar2.U = k96.M0(2131746605, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.j(k96.M0(2131752087, "ClearButton"), new bk8(privacySettingsActivity, b2));
                alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                privacySettingsActivity.showDialog(hdVar2);
                privacySettingsActivity.showDialog(hdVar2);
                TextView textView = (TextView) hdVar2.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                    break;
                }
                break;
            case 1:
                privacySettingsActivity.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().u(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ce2(objArr == true ? 1 : 0));
                if (zArr[0]) {
                    M0 = zArr[1] ? k96.M0(2131746601, "PrivacyPaymentsPaymentShippingCleared") : k96.M0(2131746600, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = k96.M0(2131746602, "PrivacyPaymentsPaymentInfoCleared");
                }
                u21.b0(privacySettingsActivity).Q(R.raw.chats_infotip, 36, M0).j();
                break;
            case 2:
            case 3:
            default:
                hd o = new AlertDialog$Builder(3, null, privacySettingsActivity.getParentActivity()).o();
                privacySettingsActivity.c = o;
                o.j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    y6c userConfig = privacySettingsActivity.getUserConfig();
                    boolean z = privacySettingsActivity.U;
                    userConfig.V = z;
                    privacySettingsActivity.T = z;
                    privacySettingsActivity.getUserConfig().u(false);
                }
                qu2 contactsController = privacySettingsActivity.getContactsController();
                ak8 ak8Var = new ak8(privacySettingsActivity, b2);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tL_contacts_deleteContacts.id.add(contactsController.getMessagesController().m1(((TLRPC.TL_contact) contactsController.f0.get(i2)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new pl(contactsController, ak8Var, (byte) 26));
                break;
            case 4:
                privacySettingsActivity.getClass();
                mf6 mf6Var = new mf6();
                ak8 ak8Var2 = new ak8(privacySettingsActivity, (byte) 2);
                mf6Var.G = (byte) 3;
                mf6Var.a = 12;
                mf6Var.e0 = ak8Var2;
                privacySettingsActivity.presentFragment(mf6Var);
                break;
        }
    }
}
