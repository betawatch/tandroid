// default package

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class em8 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ em8(PrivacySettingsActivity privacySettingsActivity, byte b) {
        this.a = b;
        this.b = privacySettingsActivity;
    }

    public final void a() {
        int i;
        byte b = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (b) {
            case 2:
                gm8 gm8Var = privacySettingsActivity.a;
                if (gm8Var != null && (i = privacySettingsActivity.s) >= 0) {
                    gm8Var.g(i);
                    break;
                }
                break;
            default:
                privacySettingsActivity.D0();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee
    public final void r(he heVar, int i) {
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
                    fc4.g(e, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M02 = jb6.M0(2131746529, "PrivacyPaymentsClearAlertTitle");
                he heVar2 = alertDialog$Builder.a;
                heVar2.S = M02;
                heVar2.U = jb6.M0(2131746531, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.j(jb6.M0(2131752036, "ClearButton"), new em8(privacySettingsActivity, b2));
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                privacySettingsActivity.showDialog(heVar2);
                privacySettingsActivity.showDialog(heVar2);
                TextView textView = (TextView) heVar2.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
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
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new nf2(objArr == true ? 1 : 0));
                if (zArr[0]) {
                    M0 = zArr[1] ? jb6.M0(2131746527, "PrivacyPaymentsPaymentShippingCleared") : jb6.M0(2131746526, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = jb6.M0(2131746528, "PrivacyPaymentsPaymentInfoCleared");
                }
                c41.b0(privacySettingsActivity).Q(R.raw.chats_infotip, 36, M0).j();
                break;
            case 2:
            case 3:
            default:
                he o = new AlertDialog$Builder(3, null, privacySettingsActivity.getParentActivity()).o();
                privacySettingsActivity.c = o;
                o.j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    z8c userConfig = privacySettingsActivity.getUserConfig();
                    boolean z = privacySettingsActivity.U;
                    userConfig.V = z;
                    privacySettingsActivity.T = z;
                    privacySettingsActivity.getUserConfig().u(false);
                }
                bw2 contactsController = privacySettingsActivity.getContactsController();
                dm8 dm8Var = new dm8(privacySettingsActivity, b2);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tL_contacts_deleteContacts.id.add(contactsController.getMessagesController().n1(((TLRPC.TL_contact) contactsController.f0.get(i2)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new pm(contactsController, dm8Var, (byte) 26));
                break;
            case 4:
                privacySettingsActivity.getClass();
                mh6 mh6Var = new mh6();
                dm8 dm8Var2 = new dm8(privacySettingsActivity, (byte) 2);
                mh6Var.G = (byte) 3;
                mh6Var.a = 12;
                mh6Var.e0 = dm8Var2;
                privacySettingsActivity.presentFragment(mh6Var);
                break;
        }
    }
}
