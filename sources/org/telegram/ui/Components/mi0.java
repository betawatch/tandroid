package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ mi0(vi0 vi0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = vi0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vi0 vi0Var = this.b;
                org.telegram.messenger.zs.f(vi0Var.b).d(new mi0(vi0Var, this.c, 1));
                break;
            default:
                vi0.a(this.b, this.c);
                break;
        }
    }
}
