package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.utils.c;
import androidx.car.app.utils.i;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ b this$0;
    final /* synthetic */ o val$lifecycle;

    public NavigationManager$1(b bVar, o oVar) {
        this.val$lifecycle = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStopNavigation$0() {
        throw null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        i.c(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new c() { // from class: androidx.car.app.navigation.a
            @Override // androidx.car.app.utils.c
            public final Object a() {
                Object lambda$onStopNavigation$0;
                lambda$onStopNavigation$0 = NavigationManager$1.this.lambda$onStopNavigation$0();
                return lambda$onStopNavigation$0;
            }
        });
    }
}
