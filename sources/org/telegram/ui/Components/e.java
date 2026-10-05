package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ e(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                e0.S(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                e0.R(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.b;
                if (z10) {
                    e0Var.u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.s0();
                break;
            default:
                e0.Q(this.b, ((Integer) obj).intValue());
                break;
        }
    }
}
