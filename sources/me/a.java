package me;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
