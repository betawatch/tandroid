package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ f(g0 g0Var, int i10) {
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
                    g0Var.u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                g0Var.s0();
                break;
            default:
                g0.S(this.b, ((Integer) obj).intValue());
                break;
        }
    }
}
