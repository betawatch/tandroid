package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mc1 extends ci.e8 {
    public mc1(Activity activity) {
        super(activity, 3);
    }

    @Override // ci.e8, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
