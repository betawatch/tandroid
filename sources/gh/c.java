package gh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c implements il0 {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f c;

    public c(Context context, f fVar, f6 f6Var) {
        this.c = fVar;
        this.a = f6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.c;
        g20 g20Var = fVar.e0;
        HashMap hashMap = fVar.g0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.a0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z4 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            g20Var.c((n30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.j0;
            if (size >= i11) {
                new qc(fVar.k0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            n30 n30Var = new n30(this.b, tL_help_country);
            n30Var.setOnClickListener(new a(fVar, 4));
            g20Var.a(n30Var);
            hashMap.put(tL_help_country.iso2, n30Var);
            z4 = true;
        }
        if (view instanceof kg.c) {
            ((kg.c) view).c(z4, true);
        }
        fVar.a0.N(true);
        fVar.b0.c(hashMap.size(), true);
    }
}
