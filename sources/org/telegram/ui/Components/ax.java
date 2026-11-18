package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ax(Object obj, float f10, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bx bxVar = (bx) this.d;
                float f10 = this.b;
                int i7 = this.c;
                ry ryVar = bxVar.G;
                try {
                    pi.l lVar = new pi.l(ryVar.Q.getContext(), 0, f10);
                    lVar.a = i7;
                    ryVar.R.w0(lVar);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.d;
                float f11 = this.b;
                int i10 = this.c;
                try {
                    pi.l lVar2 = new pi.l(r11Var.i0.getContext(), 0, f11);
                    lVar2.a = i10;
                    r11Var.s0.w0(lVar2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }
}
