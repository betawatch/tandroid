package androidx.car.app;

import androidx.car.app.IAppManager;

/* loaded from: classes.dex */
public abstract class AppManager {

    class 1 extends IAppManager.Stub {
        final /* synthetic */ AppManager this$0;
        final /* synthetic */ CarContext val$carContext;

        1(AppManager appManager, CarContext carContext) {
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
            throw null;
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
            throw null;
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            throw null;
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            throw null;
        }
    }
}
