package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import androidx.lifecycle.v;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ h this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ androidx.lifecycle.o val$lifecycle;
    final /* synthetic */ l val$listener;

    public CarContext$1(h hVar, androidx.lifecycle.o oVar, Executor executor, l lVar) {
        this.val$lifecycle = oVar;
        this.val$executor = executor;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (((v) this.val$lifecycle).c.compareTo(androidx.lifecycle.n.c) >= 0) {
            final List asList = Arrays.asList(strArr);
            final List asList2 = Arrays.asList(strArr2);
            this.val$executor.execute(new Runnable() { // from class: androidx.car.app.g
                @Override // java.lang.Runnable
                public final void run() {
                    List list = asList;
                    List list2 = asList2;
                    ((l) null).a();
                }
            });
        }
    }
}
