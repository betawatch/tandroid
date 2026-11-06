package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ ku(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                ww wwVar = this.b;
                Object obj = wwVar.C0.x0.G(i7).G;
                if (!(obj instanceof org.telegram.messenger.ij)) {
                    if (obj instanceof di.k6) {
                        di.k6 k6Var = (di.k6) obj;
                        Bundle f10 = rf.b.f(3, TeXSymbolParser.TYPE_ATTR);
                        f10.putString("hashtag", k6Var.C);
                        f10.putInt("storiesCount", k6Var.J);
                        wwVar.presentFragment(new org.telegram.ui.Components.u80(f10, null));
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
                    bundle.putInt("message_id", ijVar.f1());
                    an anVar = new an(bundle);
                    ww.p4(anVar, ijVar);
                    wwVar.presentFragment(anVar);
                    break;
                }
                break;
            default:
                ww wwVar2 = this.b;
                wwVar2.b0.I0(true);
                ArrayList arrayList = wwVar2.b0.e3;
                wwVar2.t3(arrayList.isEmpty() ? jg.q0.j3[i7] : (jg.o0) arrayList.get(i7));
                break;
        }
    }
}
