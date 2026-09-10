package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xx(Object obj, float f7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yx yxVar = (yx) this.d;
                float f7 = this.b;
                int i10 = this.c;
                rz rzVar = yxVar.F;
                try {
                    ii.o oVar = new ii.o(rzVar.P.getContext(), 0, f7);
                    oVar.a = i10;
                    rzVar.Q.w0(oVar);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.l71 l71Var = (org.telegram.ui.l71) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    ii.o oVar2 = new ii.o(l71Var.h0.getContext(), 0, f10);
                    oVar2.a = i11;
                    l71Var.r0.w0(oVar2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
