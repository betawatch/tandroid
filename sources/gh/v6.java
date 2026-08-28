package gh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ Utilities.Callback f;

    public /* synthetic */ v6(v7 v7Var, int i9, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.b = v7Var;
        this.d = i9;
        this.e = callback;
        this.c = zArr;
        this.f = callback2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                if (this.d > 0) {
                    this.b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.c[0] = true;
                Utilities.Callback callback2 = this.f;
                if (callback2 != null) {
                    callback2.run(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
            default:
                this.c[0] = true;
                if (this.d > 0) {
                    this.b.S();
                }
                Utilities.Callback callback3 = this.e;
                if (callback3 != null) {
                    callback3.run(bool.booleanValue() ? "paid" : "failed");
                }
                Utilities.Callback callback4 = this.f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v6(v7 v7Var, boolean[] zArr, int i9, Utilities.Callback callback, Utilities.Callback callback2) {
        this.b = v7Var;
        this.c = zArr;
        this.d = i9;
        this.e = callback;
        this.f = callback2;
    }
}
