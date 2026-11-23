package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements org.telegram.messenger.w10, org.telegram.messenger.x10, te.b {
    public final /* synthetic */ a21 a;

    public /* synthetic */ j11(a21 a21Var) {
        this.a = a21Var;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.x10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        a21 a21Var = this.a;
        boolean z10 = false;
        if (!a21Var.K.k3 && !a21Var.y.k3) {
            Object obj = o41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = a21Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a21.a(this.a, (o41) obj);
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
