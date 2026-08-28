package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ex(Object obj, float f10, int i9, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fx fxVar = (fx) this.d;
                float f10 = this.b;
                int i9 = this.c;
                wy wyVar = fxVar.B;
                try {
                    rh.n nVar = new rh.n(wyVar.L.getContext(), 0, f10);
                    nVar.a = i9;
                    wyVar.M.w0(nVar);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) this.d;
                float f11 = this.b;
                int i10 = this.c;
                try {
                    rh.n nVar2 = new rh.n(b61Var.d0.getContext(), 0, f11);
                    nVar2.a = i10;
                    b61Var.n0.w0(nVar2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
