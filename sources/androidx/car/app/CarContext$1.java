package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ g this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ w06 val$lifecycle;
    final /* synthetic */ gp7 val$listener;

    public CarContext$1(g gVar, w06 w06Var, Executor executor, gp7 gp7Var) {
        this.val$lifecycle = w06Var;
        this.val$executor = executor;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (((g16) this.val$lifecycle).b.compareTo(v06.c) >= 0) {
            final List asList = Arrays.asList(strArr);
            final List asList2 = Arrays.asList(strArr2);
            this.val$executor.execute(new Runnable() { // from class: androidx.car.app.f
                @Override // java.lang.Runnable
                public final void run() {
                    List list = asList;
                    List list2 = asList2;
                    ((gp7) null).a();
                }
            });
        }
    }
}
