package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y01 implements org.telegram.messenger.x10, org.telegram.messenger.y10, te.b {
    public final /* synthetic */ p11 a;

    public /* synthetic */ y01(p11 p11Var) {
        this.a = p11Var;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        p11 p11Var = this.a;
        boolean z10 = false;
        if (!p11Var.K.k3 && !p11Var.y.k3) {
            Object obj = b41Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = p11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        p11.a(this.a, (b41) obj);
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
