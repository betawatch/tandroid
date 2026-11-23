package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ m0 c;

    public /* synthetic */ k(n0 n0Var, m0 m0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
        this.c = m0Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                if (n0Var.q2 != null) {
                    this.c.c(0, true);
                    n0Var.y1(null);
                    break;
                }
                break;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                n0 n0Var2 = this.b;
                if (n0Var2.q2 != aiComposeTone) {
                    this.c.d(aiComposeTone, true);
                    n0Var2.y1(aiComposeTone);
                    break;
                }
                break;
        }
    }
}
