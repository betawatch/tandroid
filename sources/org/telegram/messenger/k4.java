package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements IMapsProvider.ICallableMethod {
    public final /* synthetic */ int a;
    public final /* synthetic */ GoogleMapsProvider.GoogleMapView.1 b;

    public /* synthetic */ k4(GoogleMapsProvider.GoogleMapView.1 r12, int i10) {
        this.a = i10;
        this.b = r12;
    }

    @Override // org.telegram.messenger.IMapsProvider.ICallableMethod
    public final Object call(Object obj) {
        Boolean lambda$dispatchTouchEvent$0;
        Boolean lambda$onInterceptTouchEvent$1;
        switch (this.a) {
            case 0:
                lambda$dispatchTouchEvent$0 = this.b.lambda$dispatchTouchEvent$0((MotionEvent) obj);
                return lambda$dispatchTouchEvent$0;
            default:
                lambda$onInterceptTouchEvent$1 = this.b.lambda$onInterceptTouchEvent$1((MotionEvent) obj);
                return lambda$onInterceptTouchEvent$1;
        }
    }
}
