package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;

    public /* synthetic */ fd(od odVar, int i10) {
        this.a = i10;
        this.b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                od odVar = this.b;
                odVar.j0 = true;
                odVar.h0();
                break;
            case 1:
                od odVar2 = this.b;
                odVar2.x = null;
                odVar2.y = null;
                odVar2.l0 = null;
                odVar2.m0 = null;
                odVar2.o0 = null;
                odVar2.n0 = null;
                odVar2.p0 = 0.0d;
                odVar2.e0(false, true);
                odVar2.e.h(null, null, odVar2.s, null);
                odVar2.h.setAnimation(odVar2.J);
                odVar2.J.M(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                od odVar3 = this.b;
                odVar3.j0 = true;
                if (odVar3.w.length() > 0) {
                    odVar3.d0(odVar3.w.getText().toString());
                }
                odVar3.h0();
                break;
        }
    }
}
