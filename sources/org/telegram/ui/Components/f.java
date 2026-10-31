package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ f(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        int i11 = 0;
        g0 g0Var = this.b;
        switch (i10) {
            case 0:
                g0.f1(g0Var, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                g0Var.m2.b.add(0, aiComposeTone);
                g0Var.x1();
                new cc(g0Var.y2, g0Var.I0).p(aiComposeTone.emoji_id, org.telegram.messenger.cd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.cd.L0(2131754957, null)).j();
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = g0Var.m2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.b;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if ((arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i11)).id == tL_aiComposeTone.id) {
                                arrayList.set(i11, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i11++;
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
