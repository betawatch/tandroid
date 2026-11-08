package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ g(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        g0 g0Var = this.b;
        switch (i7) {
            case 0:
                g0.f1(g0Var, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                g0Var.m2.b.add(0, aiComposeTone);
                g0Var.x1();
                new hc(g0Var.y2, g0Var.I0).p(aiComposeTone.emoji_id, org.telegram.messenger.id.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.id.M0(2131754957, null)).j();
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = g0Var.m2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.b;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if ((arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i10)).id == tL_aiComposeTone.id) {
                                arrayList.set(i10, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                g0Var.x1();
                break;
            default:
                g0.e1(g0Var, ((Integer) obj).intValue());
                break;
        }
    }
}
