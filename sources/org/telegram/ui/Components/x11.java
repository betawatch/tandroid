package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x11 implements org.telegram.messenger.p20, org.telegram.messenger.q20, fe.e {
    public final /* synthetic */ p21 a;

    public /* synthetic */ x11(p21 p21Var) {
        this.a = p21Var;
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        p21 p21Var = this.a;
        boolean z10 = false;
        if (!p21Var.J.j3 && !p21Var.y.j3) {
            Object obj = b51Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = p21Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        p21.a(this.a, (b51) obj);
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.a.h();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
