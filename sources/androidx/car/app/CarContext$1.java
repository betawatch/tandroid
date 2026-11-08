package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import androidx.lifecycle.v;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
