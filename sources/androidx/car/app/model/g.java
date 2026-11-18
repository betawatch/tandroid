package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnSelectedDelegateImpl;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Binder c;

    public /* synthetic */ g(Binder binder, int i7, int i10) {
        this.a = i10;
        this.c = binder;
        this.b = i7;
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
