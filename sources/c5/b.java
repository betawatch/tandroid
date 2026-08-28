package c5;

import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i9) {
        this.a = i9;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b = false;
                ((c) this.c).getClass();
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ((qn) this.c).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
        }
    }
}
