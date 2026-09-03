package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.utils.d;
import androidx.car.app.utils.j;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        j.c(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new d() { // from class: androidx.car.app.navigation.a
            @Override // androidx.car.app.utils.d
            public final Object a() {
                Object lambda$onStopNavigation$0;
                lambda$onStopNavigation$0 = NavigationManager$1.this.lambda$onStopNavigation$0();
                return lambda$onStopNavigation$0;
            }
        });
    }
}
