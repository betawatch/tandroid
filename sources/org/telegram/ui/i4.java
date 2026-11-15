package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i4 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4(Object obj, int i7) {
        this.a = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b = false;
                ((j4) this.c).getClass();
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ((an) this.c).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
        }
    }
}
