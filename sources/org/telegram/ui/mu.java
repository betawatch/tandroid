package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ mu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                cx cxVar = this.b;
                Object obj = cxVar.D0.y0.G(i7).H;
                if (!(obj instanceof org.telegram.messenger.gj)) {
                    if (obj instanceof fi.b6) {
                        fi.b6 b6Var = (fi.b6) obj;
                        Bundle f10 = p5.c.f(3, TeXSymbolParser.TYPE_ATTR);
                        f10.putString("hashtag", b6Var.C);
                        f10.putInt("storiesCount", b6Var.J);
                        cxVar.presentFragment(new org.telegram.ui.Components.k90(f10, null));
                        break;
                    }
                } else {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.gj.B0(gjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.gj.B0(gjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(gjVar.k));
                    }
                    bundle.putInt("message_id", gjVar.e1());
                    bn bnVar = new bn(bundle);
                    cx.r4(bnVar, gjVar);
                    cxVar.presentFragment(bnVar);
                    break;
                }
                break;
            default:
                cx cxVar2 = this.b;
                cxVar2.c0.I0(true);
                ArrayList arrayList = cxVar2.c0.f3;
                cxVar2.t3(arrayList.isEmpty() ? jg.q0.k3[i7] : (jg.o0) arrayList.get(i7));
                break;
        }
    }
}
