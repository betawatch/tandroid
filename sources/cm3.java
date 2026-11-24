// default package

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cm3 implements km3, h59 {
    public final /* synthetic */ mm3 a;

    public /* synthetic */ cm3(mm3 mm3Var) {
        this.a = mm3Var;
    }

    @Override // km3
    public final void a(vh6 vh6Var, ArrayList arrayList) {
        mm3 mm3Var = this.a;
        int i = mm3Var.t0;
        mm3Var.u0 = arrayList;
        mm3Var.y0 = vh6Var;
        for (int i2 = 0; i2 < mm3Var.u0.size(); i2++) {
            lm3 lm3Var = (lm3) mm3Var.u0.get(i2);
            TLObject tLObject = lm3Var.a;
            if (tLObject instanceof TLRPC.User) {
                oc7.r1(i).c4((TLRPC.User) lm3Var.a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                oc7.r1(i).V3((TLRPC.Chat) lm3Var.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                oc7.r1(i).Z3((TLRPC.EncryptedChat) lm3Var.a, true);
            }
        }
        mm3Var.G(null);
        mm3Var.f();
    }

    @Override // h59
    public final boolean g(int i, View view) {
        TLRPC.User W1;
        uj3 uj3Var = this.a.V;
        if (uj3Var != null) {
            Long l = (Long) view.getTag();
            long longValue = l.longValue();
            nk3 nk3Var = uj3Var.a;
            if (nk3Var.getParentActivity() != null && (W1 = nk3Var.getMessagesController().W1(l)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk3Var.getParentActivity());
                String M0 = jb6.M0(2131752171, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = gm.S2(jb6.a0("ChatHintsDeleteAlert", null, 2131752172, bw2.m(0, W1.first_name, W1.last_name)));
                alertDialog$Builder.j(jb6.M0(2131744544, null), new d12((Object) uj3Var, longValue, (byte) 2));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                nk3Var.showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, nk3Var.getResourceProvider());
                }
            }
        }
        return true;
    }
}
