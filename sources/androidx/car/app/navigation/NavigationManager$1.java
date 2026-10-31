package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.utils.h;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        h.c(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new androidx.car.app.utils.b() { // from class: androidx.car.app.navigation.a
            @Override // androidx.car.app.utils.b
            public final Object a() {
                Object lambda$onStopNavigation$0;
                lambda$onStopNavigation$0 = NavigationManager$1.this.lambda$onStopNavigation$0();
                return lambda$onStopNavigation$0;
            }
        });
    }
}
