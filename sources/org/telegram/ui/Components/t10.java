package org.telegram.ui.Components;

import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public interface t10 {
    void b1();

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    void onLongPress(MotionEvent motionEvent);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    boolean onSingleTapUp(MotionEvent motionEvent);
}
