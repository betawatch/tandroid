package fg;

import android.view.View;
import android.widget.TextView;
import bi.za;
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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.iy;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements f0, ll0 {
    public final /* synthetic */ h0 a;

    public /* synthetic */ x(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // fg.f0
    public void a(a0.i iVar, ArrayList arrayList) {
        h0 h0Var = this.a;
        int i10 = h0Var.s0;
        h0Var.t0 = arrayList;
        h0Var.x0 = iVar;
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

    @Override // org.telegram.ui.Components.ll0
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
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new za(iyVar, longValue, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(wyVar.getThemedColor(j6.q7));
                }
            }
        }
        return true;
    }
}
