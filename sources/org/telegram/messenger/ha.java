package org.telegram.messenger;

import android.view.MotionEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class ha {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.j0 b;

    public /* synthetic */ ha(ai.j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
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
