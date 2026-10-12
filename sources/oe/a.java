package oe;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public interface a {
    boolean forceEnableVibration();

    long getLongPressDuration();

    boolean ignoreHapticFeedbackSettings(float f7, float f10);

    boolean needCancelTouchBySlopMove();

    boolean needClickAt(View view, float f7, float f10);

    boolean needLongPress(float f7, float f10);

    void onClickAt(View view, float f7, float f10);

    void onClickTouchDown(View view, float f7, float f10);

    void onClickTouchMove(View view, float f7, float f10);

    void onClickTouchUp(View view, float f7, float f10);

    void onLongPressCancelled(View view, float f7, float f10);

    void onLongPressFinish(View view, float f7, float f10);

    void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12);

    boolean onLongPressRequestedAt(View view, float f7, float f10);
}
