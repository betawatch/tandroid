package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lx(Object obj, float f9, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f9;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nx nxVar = (nx) this.d;
                float f9 = this.b;
                int i10 = this.c;
                fz fzVar = nxVar.B;
                try {
                    uh.n nVar = new uh.n(fzVar.L.getContext(), 0, f9);
                    nVar.a = i10;
                    fzVar.M.w0(nVar);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                org.telegram.ui.d61 d61Var = (org.telegram.ui.d61) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    uh.n nVar2 = new uh.n(d61Var.d0.getContext(), 0, f10);
                    nVar2.a = i11;
                    d61Var.n0.w0(nVar2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
