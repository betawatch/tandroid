package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sx(Object obj, float f7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tx txVar = (tx) this.d;
                float f7 = this.b;
                int i10 = this.c;
                kz kzVar = txVar.F;
                try {
                    ki.p pVar = new ki.p(kzVar.P.getContext(), 0, f7);
                    pVar.a = i10;
                    kzVar.Q.w0(pVar);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    ki.p pVar2 = new ki.p(j71Var.h0.getContext(), 0, f10);
                    pVar2.a = i11;
                    j71Var.r0.w0(pVar2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
