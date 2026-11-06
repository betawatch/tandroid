package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q01 implements org.telegram.messenger.a20, org.telegram.messenger.b20, te.b {
    public final /* synthetic */ g11 a;

    public /* synthetic */ q01(g11 g11Var) {
        this.a = g11Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        g11 g11Var = this.a;
        boolean z9 = false;
        if (!g11Var.J.j3 && !g11Var.y.j3) {
            Object obj = r31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z9 = g11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        g11.a(this.a, (r31) obj);
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
