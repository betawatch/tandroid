package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements org.telegram.messenger.u10, org.telegram.messenger.v10, te.b {
    public final /* synthetic */ z11 a;

    public /* synthetic */ i11(z11 z11Var) {
        this.a = z11Var;
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.v10
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        z11 z11Var = this.a;
        boolean z10 = false;
        if (!z11Var.K.k3 && !z11Var.y.k3) {
            Object obj = n41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = z11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        z11.a(this.a, (n41) obj);
    }

    @Override // te.b
    public /* synthetic */ void G(float f10, int i7) {
    }
}
