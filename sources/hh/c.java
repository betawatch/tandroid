package hh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c implements il0 {
    public final /* synthetic */ g6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f c;

    public c(Context context, f fVar, g6 g6Var) {
        this.c = fVar;
        this.a = g6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.c;
        h20 h20Var = fVar.e0;
        HashMap hashMap = fVar.g0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.a0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z4 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            h20Var.c((p30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.j0;
            if (size >= i11) {
                new qc(fVar.k0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            p30 p30Var = new p30(this.b, tL_help_country);
            p30Var.setOnClickListener(new a(fVar, 4));
            h20Var.a(p30Var);
            hashMap.put(tL_help_country.iso2, p30Var);
            z4 = true;
        }
        if (view instanceof lg.c) {
            ((lg.c) view).c(z4, true);
        }
        fVar.a0.N(true);
        fVar.b0.c(hashMap.size(), true);
    }
}
