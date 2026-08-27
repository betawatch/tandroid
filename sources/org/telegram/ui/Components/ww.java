package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ww extends jx {
    public final /* synthetic */ yy c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(yy yyVar, Context context) {
        super(yyVar, context);
        this.c3 = yyVar;
    }

    @Override // org.telegram.ui.Components.jx, org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
