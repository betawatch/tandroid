package jg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.kw;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements f0, dj0 {
    public final /* synthetic */ h0 a;

    public /* synthetic */ t(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // jg.f0
    public void a(a0.h hVar, ArrayList arrayList) {
        h0 h0Var = this.a;
        int i7 = h0Var.s0;
        h0Var.t0 = arrayList;
        h0Var.x0 = hVar;
        for (int i10 = 0; i10 < h0Var.t0.size(); i10++) {
            g0 g0Var = (g0) h0Var.t0.get(i10);
            TLObject tLObject = g0Var.a;
            if (tLObject instanceof TLRPC.User) {
                qp.s1(i7).X3((TLRPC.User) g0Var.a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                qp.s1(i7).Q3((TLRPC.Chat) g0Var.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                qp.s1(i7).U3((TLRPC.EncryptedChat) g0Var.a, true);
            }
        }
        h0Var.G(null);
        h0Var.f();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        TLRPC.User a22;
        kw kwVar = this.a.U;
        if (kwVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            zw zwVar = kwVar.a;
            if (zwVar.getParentActivity() != null && (a22 = zwVar.getMessagesController().a2(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zwVar.getParentActivity());
                String M0 = id.M0(2131752234, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(id.a0("ChatHintsDeleteAlert", null, 2131752235, g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(id.M0(2131744855, null), new di.c1(kwVar, longValue, 8));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                zwVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    t6.U(textView, m6.q7, zwVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
