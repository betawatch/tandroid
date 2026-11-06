package org.telegram.messenger;

import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ia {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.x5 b;

    public /* synthetic */ ia(bi.x5 x5Var, int i7) {
        this.a = i7;
        this.b = x5Var;
    }

    public final Boolean a(Object obj) {
        Boolean valueOf;
        Boolean valueOf2;
        switch (this.a) {
            case 0:
                valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.dispatchTouchEvent((MotionEvent) obj));
                return valueOf;
            default:
                valueOf2 = Boolean.valueOf(super/*android.widget.FrameLayout*/.onInterceptTouchEvent((MotionEvent) obj));
                return valueOf2;
        }
    }
}
