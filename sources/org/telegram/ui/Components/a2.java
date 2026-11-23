package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.mr b;

    public /* synthetic */ a2(org.telegram.messenger.mr mrVar, int i7) {
        this.a = i7;
        this.b = mrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.mr mrVar = this.b;
                if (mrVar != null) {
                    mrVar.d(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.mr mrVar2 = this.b;
                if (mrVar2 != null) {
                    mrVar2.d(false);
                    break;
                }
                break;
        }
    }
}
