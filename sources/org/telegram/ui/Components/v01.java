package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v01 implements org.telegram.messenger.a20, org.telegram.messenger.b20, te.b {
    public final /* synthetic */ m11 a;

    public /* synthetic */ v01(m11 m11Var) {
        this.a = m11Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        m11 m11Var = this.a;
        boolean z9 = false;
        if (!m11Var.J.j3 && !m11Var.y.j3) {
            Object obj = x31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z9 = m11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        m11.a(this.a, (x31) obj);
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
