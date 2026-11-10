package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g31 {
    public final /* synthetic */ p31 a;
    public final /* synthetic */ t31 b;

    public g31(t31 t31Var, p31 p31Var) {
        this.b = t31Var;
        this.a = p31Var;
    }

    public final int a() {
        return this.b.s.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z9) {
        t31 t31Var = this.b;
        i31 i31Var = t31Var.n;
        if (z9) {
            v4.g0 adapter = i31Var.getAdapter();
            jg.d2 d2Var = t31Var.w;
            if (adapter != d2Var) {
                i31Var.setAdapter(d2Var);
                if (i31Var.getAdapter().b() <= 0) {
                    t31Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-i31Var.getPaddingTop()) + t31Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z9) {
            return;
        }
        v4.g0 adapter2 = i31Var.getAdapter();
        s31 s31Var = t31Var.s;
        if (adapter2 == s31Var) {
            return;
        }
        i31Var.setAdapter(s31Var);
        if (i31Var.getAdapter().b() <= 0) {
        }
    }
}
