package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class uk0 implements View.OnTouchListener {
    public float a;
    public float b;
    public boolean c;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (motionEvent.getAction() == 0) {
                this.a = motionEvent.getX();
                this.b = motionEvent.getY();
                this.c = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x10 = this.a - motionEvent.getX();
                float y3 = this.b - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.c) {
                    if (Math.sqrt((y3 * y3) + (x10 * x10)) > scaledTouchSlop) {
                        this.c = false;
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.c = false;
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }
}
