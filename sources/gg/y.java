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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.dy;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        dy dyVar = this.a.U;
        if (dyVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ry ryVar = dyVar.a;
            if (ryVar.getParentActivity() != null && (user = ryVar.getMessagesController().getUser(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.z1(dyVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ryVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(ryVar.getThemedColor(h6.q7));
                }
            }
        }
        return true;
    }
}
