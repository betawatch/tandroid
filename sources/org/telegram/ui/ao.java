package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ao extends org.telegram.ui.Components.tm0 {
    public final /* synthetic */ jo O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(jo joVar, Context context, org.telegram.ui.Components.sm0 sm0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, sm0Var, i6Var, false);
        this.O = joVar;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.O.M && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 ? super.onTouchEvent(motionEvent) : !this.O.M && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}
