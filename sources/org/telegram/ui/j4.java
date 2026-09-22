package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    ((bo) this.c).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
        }
    }
}
