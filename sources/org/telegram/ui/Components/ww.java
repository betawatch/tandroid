package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ww extends ix {
    public final /* synthetic */ wy c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(wy wyVar, Context context) {
        super(wyVar, context);
        this.c3 = wyVar;
    }

    @Override // org.telegram.ui.Components.ix, org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
