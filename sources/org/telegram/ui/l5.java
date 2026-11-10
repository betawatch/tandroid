package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ l5(t5 t5Var, int i7) {
        this.a = i7;
        this.b = t5Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.U = (org.telegram.messenger.e3) obj;
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(11, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
