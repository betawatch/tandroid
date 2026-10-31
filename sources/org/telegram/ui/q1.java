package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q1 extends WebView {
    public final /* synthetic */ r1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, Context context) {
        super(context);
        this.a = r1Var;
        setFocusable(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r1 r1Var = this.a;
        r1Var.s = true;
        TL_iv.pageBlockEmbed pageblockembed = r1Var.w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                r1Var.y.f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
