package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i extends WebView {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Activity activity) {
        super(activity);
        this.a = jVar;
        setFocusable(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j jVar = this.a;
        jVar.s = true;
        TL_iv.pageBlockEmbed pageblockembed = jVar.w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                jVar.y.g0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
