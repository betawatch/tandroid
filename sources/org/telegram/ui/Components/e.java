package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ e(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                g0.U(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                g0.T(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                g0 g0Var = this.b;
                if (z10) {
                    g0Var.q0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                g0Var.s0();
                break;
            default:
                g0.S(this.b, ((Integer) obj).intValue());
                break;
        }
    }
}
