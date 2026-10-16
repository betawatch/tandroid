package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ey(Object obj, float f7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fy fyVar = (fy) this.d;
                float f7 = this.b;
                int i10 = this.c;
                wz wzVar = fyVar.F;
                try {
                    ki.o oVar = new ki.o(wzVar.P.getContext(), 0, f7);
                    oVar.a = i10;
                    wzVar.Q.w0(oVar);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.r71 r71Var = (org.telegram.ui.r71) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    ki.o oVar2 = new ki.o(r71Var.h0.getContext(), 0, f10);
                    oVar2.a = i11;
                    r71Var.r0.w0(oVar2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
