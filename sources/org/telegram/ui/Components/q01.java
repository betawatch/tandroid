package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q01 implements org.telegram.messenger.s10, org.telegram.messenger.t10, qe.b {
    public final /* synthetic */ g11 a;

    public /* synthetic */ q01(g11 g11Var) {
        this.a = g11Var;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        g11 g11Var = this.a;
        boolean z10 = false;
        if (!g11Var.K.k3 && !g11Var.y.k3) {
            Object obj = r31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = g11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        g11.a(this.a, (r31) obj);
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }
}
