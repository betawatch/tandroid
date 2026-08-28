package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kv extends jv {
    public final /* synthetic */ lv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(lv lvVar, Context context, int i9, int i10) {
        super(lvVar.s, context, i9, i10);
        this.G = lvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
