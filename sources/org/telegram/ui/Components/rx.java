package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                org.telegram.ui.i71 i71Var = (org.telegram.ui.i71) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    ji.o oVar2 = new ji.o(i71Var.h0.getContext(), 0, f10);
                    oVar2.a = i11;
                    i71Var.r0.w0(oVar2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
