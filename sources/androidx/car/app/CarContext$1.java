package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ g this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ w26 val$lifecycle;
    final /* synthetic */ jr7 val$listener;

    public CarContext$1(g gVar, w26 w26Var, Executor executor, jr7 jr7Var) {
        this.val$lifecycle = w26Var;
        this.val$executor = executor;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (((g36) this.val$lifecycle).b.compareTo(v26.c) >= 0) {
            final List asList = Arrays.asList(strArr);
            final List asList2 = Arrays.asList(strArr2);
            this.val$executor.execute(new Runnable() { // from class: androidx.car.app.f
                @Override // java.lang.Runnable
                public final void run() {
                    List list = asList;
                    List list2 = asList2;
                    ((jr7) null).a();
                }
            });
        }
    }
}
