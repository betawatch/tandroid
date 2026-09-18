package gg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.iy;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements g0, cl0 {
    public final /* synthetic */ i0 a;

    public /* synthetic */ y(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // gg.g0
    public void a(a0.i iVar, ArrayList arrayList) {
        i0 i0Var = this.a;
        int i10 = i0Var.s0;
        i0Var.t0 = arrayList;
        i0Var.x0 = iVar;
        for (int i11 = 0; i11 < i0Var.t0.size(); i11++) {
            h0 h0Var = (h0) i0Var.t0.get(i11);
            TLObject tLObject = h0Var.a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) h0Var.a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) h0Var.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.a, true);
            }
        }
        i0Var.G(null);
        i0Var.l();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        iy iyVar = this.a.U;
        if (iyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            wy wyVar = iyVar.a;
            if (wyVar.getParentActivity() != null && (user = wyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(iyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wyVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(wyVar.getThemedColor(j6.q7));
                }
            }
        }
        return true;
    }
}
