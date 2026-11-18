package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements org.telegram.messenger.v10, org.telegram.messenger.w10, te.b {
    public final /* synthetic */ z11 a;

    public /* synthetic */ i11(z11 z11Var) {
        this.a = z11Var;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        z11 z11Var = this.a;
        boolean z10 = false;
        if (!z11Var.K.k3 && !z11Var.y.k3) {
            Object obj = l41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = z11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        z11.a(this.a, (l41) obj);
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
