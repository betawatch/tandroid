package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ lu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        switch (this.a) {
            case 0:
                bx bxVar = this.b;
                Object obj = bxVar.D0.y0.G(i7).H;
                if (!(obj instanceof org.telegram.messenger.fj)) {
                    if (obj instanceof fi.b6) {
                        fi.b6 b6Var = (fi.b6) obj;
                        Bundle f10 = p5.c.f(3, TeXSymbolParser.TYPE_ATTR);
                        f10.putString("hashtag", b6Var.C);
                        f10.putInt("storiesCount", b6Var.J);
                        bxVar.presentFragment(new org.telegram.ui.Components.h90(f10, null));
                        break;
                    }
                } else {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.fj.B0(fjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.fj.B0(fjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(fjVar.k));
                    }
                    bundle.putInt("message_id", fjVar.e1());
                    bn bnVar = new bn(bundle);
                    bx.r4(bnVar, fjVar);
                    bxVar.presentFragment(bnVar);
                    break;
                }
                break;
            default:
                bx bxVar2 = this.b;
                bxVar2.c0.I0(true);
                ArrayList arrayList = bxVar2.c0.f3;
                bxVar2.t3(arrayList.isEmpty() ? jg.q0.k3[i7] : (jg.o0) arrayList.get(i7));
                break;
        }
    }
}
