package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tx(Object obj, float f7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ux uxVar = (ux) this.d;
                float f7 = this.b;
                int i10 = this.c;
                lz lzVar = uxVar.F;
                try {
                    ji.o oVar = new ji.o(lzVar.P.getContext(), 0, f7);
                    oVar.a = i10;
                    lzVar.Q.w0(oVar);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    ji.o oVar2 = new ji.o(a71Var.h0.getContext(), 0, f10);
                    oVar2.a = i11;
                    a71Var.r0.w0(oVar2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
