package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p1 extends WebView {
    public final /* synthetic */ q1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, Context context) {
        super(context);
        this.a = q1Var;
        setFocusable(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q1 q1Var = this.a;
        q1Var.s = true;
        TL_iv.pageBlockEmbed pageblockembed = q1Var.w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                q1Var.y.f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
