package mh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t7 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ Utilities.Callback f;

    public /* synthetic */ t6(t7 t7Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.b = t7Var;
        this.d = i10;
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

    public /* synthetic */ t6(t7 t7Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.b = t7Var;
        this.c = zArr;
        this.d = i10;
        this.e = callback;
        this.f = callback2;
    }
}
