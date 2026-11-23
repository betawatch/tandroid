package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ f(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        m0 m0Var = this.b;
        switch (i7) {
            case 0:
                m0.g1(m0Var, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                m0Var.s2.b.add(0, aiComposeTone);
                m0Var.E1();
                new kc(m0Var.E2, m0Var.J0).p(aiComposeTone.emoji_id, org.telegram.messenger.gd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.gd.N0(2131754957, null)).j();
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = m0Var.s2;
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
                m0Var.E1();
                break;
            default:
                m0.f1(m0Var, ((Integer) obj).intValue());
                break;
        }
    }
}
