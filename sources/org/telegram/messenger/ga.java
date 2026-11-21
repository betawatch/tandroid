package org.telegram.messenger;

import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class ga {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.l0 b;

    public /* synthetic */ ga(ai.l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
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
