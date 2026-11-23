package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zk b;

    public /* synthetic */ tk(zk zkVar, int i7) {
        this.a = i7;
        this.b = zkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0();
                break;
            case 1:
                zk zkVar = this.b;
                EditTextBoldCursor editTextBoldCursor = zkVar.T;
                if (!zkVar.L && !zkVar.O0 && !zkVar.b.J && zkVar.M0 && zkVar.U0 == null && editTextBoldCursor.hasFocus() && zkVar.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                zk zkVar2 = this.b;
                if (!zkVar2.L && zkVar2.M0 && zkVar2.isShown()) {
                    zkVar2.e0();
                    break;
                }
                break;
            case 3:
                zk zkVar3 = this.b;
                if (!zkVar3.L) {
                    float f10 = zkVar3.n0;
                    if (f10 < 1.0f && zkVar3.m0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        zkVar3.m0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.m = hVar;
                        zkVar3.m0.f(0.001f);
                        zkVar3.m0.b(new j7(zkVar3, 4));
                        zkVar3.m0.a(new ya(zkVar3, 2));
                        zkVar3.m0.h();
                        break;
                    }
                }
                break;
            case 4:
                zk zkVar4 = this.b;
                if (zkVar4.M0 && !zkVar4.L) {
                    zkVar4.d0();
                    if (zkVar4.N0) {
                        zkVar4.e0();
                        break;
                    }
                }
                break;
            default:
                zk zkVar5 = this.b;
                if (!zkVar5.q0) {
                    zkVar5.p0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
