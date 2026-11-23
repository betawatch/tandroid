package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ f(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        n0 n0Var = this.b;
        switch (i7) {
            case 0:
                n0.g1(n0Var, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                n0Var.s2.b.add(0, aiComposeTone);
                n0Var.E1();
                new lc(n0Var.E2, n0Var.J0).p(aiComposeTone.emoji_id, org.telegram.messenger.hd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.hd.N0(2131754957, null)).j();
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = n0Var.s2;
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
                n0Var.E1();
                break;
            default:
                n0.f1(n0Var, ((Integer) obj).intValue());
                break;
        }
    }
}
