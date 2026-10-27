package ig;

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
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.ey;
import org.telegram.ui.ox;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements g0, cm0 {
    public final /* synthetic */ i0 a;

    public /* synthetic */ w(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // ig.g0
    public void a(a0.h hVar, ArrayList arrayList) {
        i0 i0Var = this.a;
        int i10 = i0Var.s0;
        i0Var.t0 = arrayList;
        i0Var.x0 = hVar;
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

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        TLRPC.User user;
        ox oxVar = this.a.U;
        if (oxVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ey eyVar = oxVar.a;
            if (eyVar.getParentActivity() != null && (user = eyVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new di.d1(oxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                eyVar.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    f7.V(textView, y6.q7, eyVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
