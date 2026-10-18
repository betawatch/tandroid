package hg;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ey;
import org.telegram.ui.px;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements f0, yl0 {
    public final /* synthetic */ h0 a;

    public /* synthetic */ w(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        TLRPC.User user;
        px pxVar = this.a.U;
        if (pxVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ey eyVar = pxVar.a;
            if (eyVar.getParentActivity() != null && (user = eyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ci.d1(pxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                eyVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(eyVar.getThemedColor(h6.q7));
                }
            }
        }
        return true;
    }

    @Override // hg.f0
    public void b(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.a;
        int i10 = h0Var.s0;
        h0Var.t0 = arrayList;
        h0Var.x0 = hVar;
        for (int i11 = 0; i11 < h0Var.t0.size(); i11++) {
            g0 g0Var = (g0) h0Var.t0.get(i11);
            TLObject tLObject = g0Var.a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) g0Var.a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) g0Var.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.a, true);
            }
        }
        h0Var.G(null);
        h0Var.l();
    }
}
