package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a10 {
    public static final int w = ViewConfiguration.getTapTimeout();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final b10 f;
    public final b10 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public MotionEvent m;
    public MotionEvent n;
    public boolean o;
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;
    public VelocityTracker v;
    public long u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q e = new android.support.v4.media.session.q(this, 6);

    public a10(Context context, b10 b10Var) {
        this.f = b10Var;
        this.g = b10Var;
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.t = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = scaledTouchSlop * scaledTouchSlop;
        this.b = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }
}
