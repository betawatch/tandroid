package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import androidx.lifecycle.v;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
