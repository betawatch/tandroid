package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n4 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b = false;
                ((o4) this.c).getClass();
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ((xn) this.c).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
        }
    }
}
