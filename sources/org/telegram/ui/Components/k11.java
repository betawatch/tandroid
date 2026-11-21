package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements org.telegram.messenger.v10, org.telegram.messenger.w10, te.b {
    public final /* synthetic */ b21 a;

    public /* synthetic */ k11(b21 b21Var) {
        this.a = b21Var;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        b21 b21Var = this.a;
        boolean z10 = false;
        if (!b21Var.K.k3 && !b21Var.y.k3) {
            Object obj = o41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = b21Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b21.a(this.a, (o41) obj);
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
