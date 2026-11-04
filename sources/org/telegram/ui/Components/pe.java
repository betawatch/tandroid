package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pe implements q1.d {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ ht0 c;

    public pe(float f10, ht0 ht0Var) {
        this.b = f10;
        this.c = ht0Var;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        if (this.a || f10 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
