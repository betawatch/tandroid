package org.telegram.messenger;

import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ca {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.c0 b;

    public /* synthetic */ ca(ai.c0 c0Var, int i3) {
        this.a = i3;
        this.b = c0Var;
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
