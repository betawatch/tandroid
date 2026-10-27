package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ o7(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8.s(this.b);
                break;
            default:
                m8.u(this.b);
                break;
        }
    }
}
