package ch;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.t10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d implements pk0 {
    public final /* synthetic */ c6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h c;

    public d(Context context, h hVar, c6 c6Var) {
        this.c = hVar;
        this.a = c6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        h hVar = this.c;
        t10 t10Var = hVar.d0;
        HashMap hashMap = hVar.f0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) hVar.Z.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            t10Var.c((a30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = hVar.i0;
            if (size >= i11) {
                new mc(hVar.j0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            a30 a30Var = new a30(this.b, tL_help_country);
            a30Var.setOnClickListener(new a(hVar, 4));
            t10Var.a(a30Var);
            hashMap.put(tL_help_country.iso2, a30Var);
            z10 = true;
        }
        if (view instanceof gg.c) {
            ((gg.c) view).c(z10, true);
        }
        hVar.Z.N(true);
        hVar.a0.c(hashMap.size(), true);
    }
}
