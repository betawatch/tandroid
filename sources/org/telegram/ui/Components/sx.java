package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sx(Object obj, float f10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tx txVar = (tx) this.d;
                float f10 = this.b;
                int i10 = this.c;
                mz mzVar = txVar.C;
                try {
                    xh.o oVar = new xh.o(mzVar.M.getContext(), 0, f10);
                    oVar.a = i10;
                    mzVar.N.w0(oVar);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                org.telegram.ui.w61 w61Var = (org.telegram.ui.w61) this.d;
                float f11 = this.b;
                int i11 = this.c;
                try {
                    xh.o oVar2 = new xh.o(w61Var.e0.getContext(), 0, f11);
                    oVar2.a = i11;
                    w61Var.o0.w0(oVar2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
