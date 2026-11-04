package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ iu(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        switch (this.a) {
            case 0:
                uw uwVar = this.b;
                Object obj = uwVar.D0.y0.G(i3).G;
                if (!(obj instanceof org.telegram.messenger.zi)) {
                    if (obj instanceof ei.l6) {
                        ei.l6 l6Var = (ei.l6) obj;
                        Bundle k10 = org.telegram.ui.Cells.f1.k(3, TeXSymbolParser.TYPE_ATTR);
                        k10.putString("hashtag", l6Var.C);
                        k10.putInt("storiesCount", l6Var.J);
                        uwVar.presentFragment(new org.telegram.ui.Components.r80(k10, null));
                        break;
                    }
                } else {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.zi.B0(ziVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.zi.B0(ziVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.zi.B0(ziVar.k));
                    }
                    bundle.putInt("message_id", ziVar.f1());
                    wm wmVar = new wm(bundle);
                    uw.p4(wmVar, ziVar);
                    uwVar.presentFragment(wmVar);
                    break;
                }
                break;
            default:
                uw uwVar2 = this.b;
                uwVar2.c0.I0(true);
                ArrayList arrayList = uwVar2.c0.f3;
                uwVar2.t3(arrayList.isEmpty() ? kg.n0.k3[i3] : (kg.l0) arrayList.get(i3));
                break;
        }
    }
}
