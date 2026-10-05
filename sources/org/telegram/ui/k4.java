package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k4 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k4(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b = false;
                ((l4) this.c).getClass();
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ((yn) this.c).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
        }
    }
}
