package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class l20 {
    public static final int w = ViewConfiguration.getTapTimeout();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final m20 f;
    public final m20 g;
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
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public l20(Context context, m20 m20Var) {
        this.f = m20Var;
        this.g = m20Var;
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
