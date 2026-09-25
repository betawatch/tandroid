package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnSelectedDelegateImpl;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Binder c;

    public /* synthetic */ g(Binder binder, int i10, int i11) {
        this.a = i11;
        this.c = binder;
        this.b = i10;
    }

    @Override // androidx.car.app.utils.a
    public final Object a() {
        Object lambda$onAlertCancelled$0;
        Object lambda$onSelected$0;
        switch (this.a) {
            case 0:
                lambda$onAlertCancelled$0 = ((AlertCallbackDelegateImpl.AlertCallbackStub) this.c).lambda$onAlertCancelled$0(this.b);
                return lambda$onAlertCancelled$0;
            default:
                lambda$onSelected$0 = ((OnSelectedDelegateImpl.OnSelectedListenerStub) this.c).lambda$onSelected$0(this.b);
                return lambda$onSelected$0;
        }
    }
}
