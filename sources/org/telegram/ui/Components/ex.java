package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ex(Object obj, float f10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gx gxVar = (gx) this.d;
                float f10 = this.b;
                int i10 = this.c;
                yy yyVar = gxVar.B;
                try {
                    sh.n nVar = new sh.n(yyVar.L.getContext(), 0, f10);
                    nVar.a = i10;
                    yyVar.M.w0(nVar);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            default:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) this.d;
                float f11 = this.b;
                int i11 = this.c;
                try {
                    sh.n nVar2 = new sh.n(a61Var.d0.getContext(), 0, f11);
                    nVar2.a = i11;
                    a61Var.n0.w0(nVar2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
