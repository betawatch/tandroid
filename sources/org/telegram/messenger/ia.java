package org.telegram.messenger;

import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
