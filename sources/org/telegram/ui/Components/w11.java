package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w11 implements org.telegram.messenger.o20, org.telegram.messenger.p20, fe.e {
    public final /* synthetic */ o21 a;

    public /* synthetic */ w11(o21 o21Var) {
        this.a = o21Var;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        o21 o21Var = this.a;
        boolean z10 = false;
        if (!o21Var.M.j3 && !o21Var.F.j3) {
            Object obj = a51Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = o21Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o21.a(this.a, (a51) obj);
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.a.h();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
