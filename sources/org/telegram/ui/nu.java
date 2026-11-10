package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ nu(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                zw zwVar = this.b;
                Object obj = zwVar.C0.x0.G(i7).G;
                if (!(obj instanceof org.telegram.messenger.ij)) {
                    if (obj instanceof di.l6) {
                        di.l6 l6Var = (di.l6) obj;
                        Bundle f10 = rf.b.f(3, TeXSymbolParser.TYPE_ATTR);
                        f10.putString("hashtag", l6Var.C);
                        f10.putInt("storiesCount", l6Var.J);
                        zwVar.presentFragment(new org.telegram.ui.Components.v80(f10, null));
                        break;
                    }
                } else {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.ij.B0(ijVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.ij.B0(ijVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(ijVar.k));
                    }
                    bundle.putInt("message_id", ijVar.e1());
                    cn cnVar = new cn(bundle);
                    zw.p4(cnVar, ijVar);
                    zwVar.presentFragment(cnVar);
                    break;
                }
                break;
            default:
                zw zwVar2 = this.b;
                zwVar2.b0.I0(true);
                ArrayList arrayList = zwVar2.b0.e3;
                zwVar2.t3(arrayList.isEmpty() ? jg.q0.j3[i7] : (jg.o0) arrayList.get(i7));
                break;
        }
    }
}
