package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class nn0 extends FrameLayout {
    public final /* synthetic */ xe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(xe xeVar, Context context) {
        super(context);
        this.a = xeVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xe xeVar = this.a;
        View contentView = xeVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + xeVar.E;
        iArr[1] = iArr[1] + xeVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (org.telegram.messenger.g0.m + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!xeVar.A && !xeVar.D) {
            xeVar.D = true;
            xeVar.l(new r1.g[0]);
        }
        return true;
    }
}
