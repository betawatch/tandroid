package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt b;

    public /* synthetic */ pt(rt rtVar, int i7) {
        this.a = i7;
        this.b = rtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rt rtVar = this.b;
                rtVar.post(new pt(rtVar, 1));
                break;
            default:
                rt rtVar2 = this.b;
                rtVar2.h();
                rtVar2.d();
                break;
        }
    }
}
