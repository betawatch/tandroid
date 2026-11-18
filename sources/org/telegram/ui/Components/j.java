package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ l0 c;

    public /* synthetic */ j(m0 m0Var, l0 l0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
        this.c = l0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                if (m0Var.q2 != null) {
                    this.c.c(0, true);
                    m0Var.y1(null);
                    break;
                }
                break;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                m0 m0Var2 = this.b;
                if (m0Var2.q2 != aiComposeTone) {
                    this.c.d(aiComposeTone, true);
                    m0Var2.y1(aiComposeTone);
                    break;
                }
                break;
        }
    }
}
