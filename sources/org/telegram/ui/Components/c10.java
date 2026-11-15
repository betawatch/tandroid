package org.telegram.ui.Components;

import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public interface c10 {
    void a1();

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    void onLongPress(MotionEvent motionEvent);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    boolean onSingleTapUp(MotionEvent motionEvent);
}
