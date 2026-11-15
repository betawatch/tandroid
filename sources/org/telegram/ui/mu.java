package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ mu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                Object obj = ywVar.D0.y0.G(i7).G;
                if (!(obj instanceof org.telegram.messenger.gj)) {
                    if (obj instanceof fi.d6) {
                        fi.d6 d6Var = (fi.d6) obj;
                        Bundle f10 = r.b.f(3, TeXSymbolParser.TYPE_ATTR);
                        f10.putString("hashtag", d6Var.C);
                        f10.putInt("storiesCount", d6Var.J);
                        ywVar.presentFragment(new org.telegram.ui.Components.y80(f10, null));
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
                    an anVar = new an(bundle);
                    yw.p4(anVar, gjVar);
                    ywVar.presentFragment(anVar);
                    break;
                }
                break;
            default:
                yw ywVar2 = this.b;
                ywVar2.c0.I0(true);
                ArrayList arrayList = ywVar2.c0.f3;
                ywVar2.t3(arrayList.isEmpty() ? jg.q0.k3[i7] : (jg.o0) arrayList.get(i7));
                break;
        }
    }
}
