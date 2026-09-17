package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ e(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                f0.U(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                f0.T(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                f0 f0Var = this.b;
                if (z10) {
                    f0Var.u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                f0Var.s0();
                break;
            default:
                f0.S(this.b, ((Integer) obj).intValue());
                break;
        }
    }
}
