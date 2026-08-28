package gh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback2 c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ t5(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.d = callback;
        this.b = zArr;
        this.c = callback2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                Utilities.Callback callback = this.d;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.b[0] = true;
                Utilities.Callback2 callback2 = this.c;
                if (callback2 != null) {
                    callback2.run(bool.booleanValue() ? "paid" : "failed", l10);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                Utilities.Callback2 callback22 = this.c;
                if (callback22 != null) {
                    callback22.run(bool.booleanValue() ? "paid" : "failed", l10);
                }
                Utilities.Callback callback3 = this.d;
                if (callback3 != null) {
                    callback3.run(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t5(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.b = zArr;
        this.c = callback2;
        this.d = callback;
    }
}
