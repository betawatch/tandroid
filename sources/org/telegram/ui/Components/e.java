package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ e(e0 e0Var, int i9) {
        this.a = i9;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                e0.T(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                e0.S(this.b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.b;
                if (z10) {
                    e0Var.q0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.r0();
                break;
            default:
                e0.R(this.b, ((Integer) obj).intValue());
                break;
        }
    }
}
