package bh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.w20;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d implements mk0 {
    public final /* synthetic */ b6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ j c;

    public d(Context context, j jVar, b6 b6Var) {
        this.c = jVar;
        this.a = b6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        TLRPC.TL_help_country tL_help_country;
        j jVar = this.c;
        q10 q10Var = jVar.d0;
        HashMap hashMap = jVar.f0;
        if (i9 == 0 || (tL_help_country = (TLRPC.TL_help_country) jVar.Z.G(i9 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            q10Var.c((w20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = jVar.i0;
            if (size >= i10) {
                new oc(jVar.j0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i10)))).j();
                return;
            }
            w20 w20Var = new w20(this.b, tL_help_country);
            w20Var.setOnClickListener(new a(jVar, 4));
            q10Var.a(w20Var);
            hashMap.put(tL_help_country.iso2, w20Var);
            z10 = true;
        }
        if (view instanceof fg.c) {
            ((fg.c) view).c(z10, true);
        }
        jVar.Z.N(true);
        jVar.a0.c(hashMap.size(), true);
    }
}
