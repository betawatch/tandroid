package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w01 implements org.telegram.messenger.a20, org.telegram.messenger.b20, te.b {
    public final /* synthetic */ n11 a;

    public /* synthetic */ w01(n11 n11Var) {
        this.a = n11Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        n11 n11Var = this.a;
        boolean z9 = false;
        if (!n11Var.J.j3 && !n11Var.y.j3) {
            Object obj = y31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z9 = n11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n11.a(this.a, (y31) obj);
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
