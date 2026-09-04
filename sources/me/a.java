package me;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
