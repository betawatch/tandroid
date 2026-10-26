package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa1 implements Runnable {
    public final /* synthetic */ yb1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ wa1(yb1 yb1Var, int i10, float f7, float f10) {
        this.a = yb1Var;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb1 yb1Var = this.a;
        int i10 = this.b;
        float f7 = this.c;
        float f10 = this.d;
        long j10 = yb1Var.r;
        if (yb1Var.s || j10 == 0) {
            return;
        }
        WidgetSandboxNative.touch(j10, i10, f7, f10, 0, true, false, 0, 0);
    }
}
