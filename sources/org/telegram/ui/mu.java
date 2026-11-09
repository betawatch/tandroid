package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements org.telegram.ui.Components.cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ mu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                Object obj = ywVar.C0.x0.G(i7).G;
                if (!(obj instanceof org.telegram.messenger.ij)) {
                    if (obj instanceof di.l6) {
                        di.l6 l6Var = (di.l6) obj;
                        Bundle f10 = rf.b.f(3, TeXSymbolParser.TYPE_ATTR);
                        f10.putString("hashtag", l6Var.C);
                        f10.putInt("storiesCount", l6Var.J);
                        ywVar.presentFragment(new org.telegram.ui.Components.v80(f10, null));
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
                    yw.p4(cnVar, ijVar);
                    ywVar.presentFragment(cnVar);
                    break;
                }
                break;
            default:
                yw ywVar2 = this.b;
                ywVar2.b0.I0(true);
                ArrayList arrayList = ywVar2.b0.e3;
                ywVar2.t3(arrayList.isEmpty() ? jg.q0.j3[i7] : (jg.o0) arrayList.get(i7));
                break;
        }
    }
}
