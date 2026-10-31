package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j4 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j4(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b = false;
                ((k4) this.c).getClass();
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ((un) this.c).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
        }
    }
}
