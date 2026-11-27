package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.utils.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ b this$0;
    final /* synthetic */ a36 val$lifecycle;

    public NavigationManager$1(b bVar, a36 a36Var) {
        this.val$lifecycle = a36Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStopNavigation$0() {
        throw null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        e.b(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new da9() { // from class: androidx.car.app.navigation.a
            @Override // da9
            public final Object a() {
                Object lambda$onStopNavigation$0;
                lambda$onStopNavigation$0 = NavigationManager$1.this.lambda$onStopNavigation$0();
                return lambda$onStopNavigation$0;
            }
        });
    }
}
