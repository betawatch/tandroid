package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ f(f0 f0Var, int i7) {
        this.a = i7;
        this.b = f0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        f0 f0Var = this.b;
        switch (i7) {
            case 0:
                f0.f1(f0Var, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                f0Var.p2.b.add(0, aiComposeTone);
                f0Var.x1();
                new gc(f0Var.B2, f0Var.I0).p(aiComposeTone.emoji_id, org.telegram.messenger.id.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.id.M0(2131754957, null)).j();
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = f0Var.p2;
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
                f0Var.x1();
                break;
            default:
                f0.e1(f0Var, ((Integer) obj).intValue());
                break;
        }
    }
}
