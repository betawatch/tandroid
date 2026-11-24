package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.utils.e;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ b this$0;
    final /* synthetic */ w26 val$lifecycle;

    public NavigationManager$1(b bVar, w26 w26Var) {
        this.val$lifecycle = w26Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStopNavigation$0() {
        throw null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        e.b(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new s89() { // from class: androidx.car.app.navigation.a
            @Override // s89
            public final Object a() {
                Object lambda$onStopNavigation$0;
                lambda$onStopNavigation$0 = NavigationManager$1.this.lambda$onStopNavigation$0();
                return lambda$onStopNavigation$0;
            }
        });
    }
}
