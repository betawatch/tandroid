package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                org.telegram.ui.c61 c61Var = (org.telegram.ui.c61) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    mi.n nVar2 = new mi.n(c61Var.h0.getContext(), 0, f10);
                    nVar2.a = i11;
                    c61Var.r0.w0(nVar2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
