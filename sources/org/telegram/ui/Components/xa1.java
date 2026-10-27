package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa1 implements Runnable {
    public final /* synthetic */ dc1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ xa1(dc1 dc1Var, int i10, float f7, float f10) {
        this.a = dc1Var;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dc1 dc1Var = this.a;
        int i10 = this.b;
        float f7 = this.c;
        float f10 = this.d;
        long j10 = dc1Var.s;
        if (dc1Var.t || j10 == 0) {
            return;
        }
        WidgetSandboxNative.touch(j10, i10, f7, f10, 0, true, false, 0, 0);
    }
}
