package lh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.s20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d implements gk0 {
    public final /* synthetic */ p6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g c;

    public d(Context context, g gVar, p6 p6Var) {
        this.c = gVar;
        this.a = p6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.c;
        l10 l10Var = gVar.Z1;
        HashMap hashMap = gVar.b2;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.V1.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            l10Var.c((s20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = gVar.e2;
            if (size >= i11) {
                z20.s(cd.a0(null, null, 2131747127, Integer.valueOf(i11)), new cc(gVar.f2, this.a), R.raw.info, 36);
                return;
            }
            s20 s20Var = new s20(this.b, tL_help_country);
            s20Var.setOnClickListener(new a(gVar, 4));
            l10Var.a(s20Var);
            hashMap.put(tL_help_country.iso2, s20Var);
            z10 = true;
        }
        if (view instanceof qg.b) {
            ((qg.b) view).c(z10, true);
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }
}
