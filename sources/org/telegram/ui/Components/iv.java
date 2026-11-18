package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class iv extends hv {
    public final /* synthetic */ jv P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(jv jvVar, Context context, int i7) {
        super(jvVar.s, context, i7);
        this.P = jvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
