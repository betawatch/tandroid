package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh0 b;

    public /* synthetic */ lh0(mh0 mh0Var, int i7) {
        this.a = i7;
        this.b = mh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mh0 mh0Var = this.b;
                mh0Var.getClass();
                try {
                    bg.i iVar = mh0Var.C0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.g3(mh0Var.A0);
                break;
            case 1:
                mh0 mh0Var2 = this.b;
                mh0Var2.Q = null;
                mh0Var2.p();
                break;
            case 2:
                mh0.h(this.b);
                break;
            case 3:
                mh0.e(this.b);
                break;
            case 4:
                mh0.d(this.b);
                break;
            case 5:
                mh0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
