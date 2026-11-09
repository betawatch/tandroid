package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ jh0(sh0 sh0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = sh0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sh0 sh0Var = this.b;
                org.telegram.messenger.qs.f(sh0Var.b).d(new jh0(sh0Var, this.c, 1));
                break;
            default:
                sh0.a(this.b, this.c);
                break;
        }
    }
}
