package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback2 c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ x7(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.d = callback;
        this.b = zArr;
        this.c = callback2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Long l4 = (Long) obj;
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
                    callback2.run(bool.booleanValue() ? "paid" : "failed", l4);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                Utilities.Callback2 callback22 = this.c;
                if (callback22 != null) {
                    callback22.run(bool.booleanValue() ? "paid" : "failed", l4);
                }
                Utilities.Callback callback3 = this.d;
                if (callback3 != null) {
                    callback3.run(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x7(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.b = zArr;
        this.c = callback2;
        this.d = callback;
    }
}
