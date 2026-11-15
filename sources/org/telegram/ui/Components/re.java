package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class re implements r1.d {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ jt0 c;

    public re(float f10, jt0 jt0Var) {
        this.b = f10;
        this.c = jt0Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        if (this.a || f10 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
