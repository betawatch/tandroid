package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ g(e0 e0Var, int i3) {
        this.a = i3;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        int i10 = 0;
        e0 e0Var = this.b;
        switch (i3) {
            case 0:
                e0.f1(e0Var, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                e0Var.n2.b.add(0, aiComposeTone);
                e0Var.x1();
                new fc(e0Var.z2, e0Var.J0).p(aiComposeTone.emoji_id, org.telegram.messenger.bd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.bd.M0(2131754957, null)).j();
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = e0Var.n2;
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
                e0Var.x1();
                break;
            default:
                e0.e1(e0Var, ((Integer) obj).intValue());
                break;
        }
    }
}
