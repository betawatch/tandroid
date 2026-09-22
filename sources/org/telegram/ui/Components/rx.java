package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rx(Object obj, float f7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sx sxVar = (sx) this.d;
                float f7 = this.b;
                int i10 = this.c;
                kz kzVar = sxVar.F;
                try {
                    ji.o oVar = new ji.o(kzVar.P.getContext(), 0, f7);
                    oVar.a = i10;
                    kzVar.Q.w0(oVar);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.h71 h71Var = (org.telegram.ui.h71) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    ji.o oVar2 = new ji.o(h71Var.h0.getContext(), 0, f10);
                    oVar2.a = i11;
                    h71Var.r0.w0(oVar2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
