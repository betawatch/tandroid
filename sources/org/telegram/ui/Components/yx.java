package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yx(Object obj, float f7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zx zxVar = (zx) this.d;
                float f7 = this.b;
                int i10 = this.c;
                sz szVar = zxVar.F;
                try {
                    mi.n nVar = new mi.n(szVar.P.getContext(), 0, f7);
                    nVar.a = i10;
                    szVar.Q.w0(nVar);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.f61 f61Var = (org.telegram.ui.f61) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    mi.n nVar2 = new mi.n(f61Var.h0.getContext(), 0, f10);
                    nVar2.a = i11;
                    f61Var.r0.w0(nVar2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
