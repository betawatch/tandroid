package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ja extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ tt0 F1;
    public final /* synthetic */ na G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(na naVar, Context context, tt0 tt0Var) {
        super(context, null);
        this.G1 = naVar;
        this.F1 = tt0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        na naVar = this.G1;
        if (naVar.C1 && naVar.D1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.F1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.G1.a1();
    }
}
