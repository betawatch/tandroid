package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qx(Object obj, float f10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rx rxVar = (rx) this.d;
                float f10 = this.b;
                int i10 = this.c;
                kz kzVar = rxVar.C;
                try {
                    wh.o oVar = new wh.o(kzVar.M.getContext(), 0, f10);
                    oVar.a = i10;
                    kzVar.N.w0(oVar);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.x61 x61Var = (org.telegram.ui.x61) this.d;
                float f11 = this.b;
                int i11 = this.c;
                try {
                    wh.o oVar2 = new wh.o(x61Var.e0.getContext(), 0, f11);
                    oVar2.a = i11;
                    x61Var.o0.w0(oVar2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
        }
    }
}
