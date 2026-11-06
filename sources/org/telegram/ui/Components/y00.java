package org.telegram.ui.Components;

import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public interface y00 {
    void d1();

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    void onLongPress(MotionEvent motionEvent);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    boolean onSingleTapUp(MotionEvent motionEvent);
}
