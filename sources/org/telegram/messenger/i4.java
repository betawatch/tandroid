package org.telegram.messenger;

import android.view.MotionEvent;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 implements IMapsProvider.ICallableMethod {
    public final /* synthetic */ int a;
    public final /* synthetic */ GoogleMapsProvider.GoogleMapView.1 b;

    public /* synthetic */ i4(GoogleMapsProvider.GoogleMapView.1 r12, int i10) {
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
