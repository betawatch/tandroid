package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ym0 extends FrameLayout {
    public final /* synthetic */ ne a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(ne neVar, Context context) {
        super(context);
        this.a = neVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ne neVar = this.a;
        View contentView = neVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + neVar.E;
        iArr[1] = iArr[1] + neVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (org.telegram.messenger.g0.m + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!neVar.A && !neVar.D) {
            neVar.D = true;
            neVar.l(new r1.g[0]);
        }
        return true;
    }
}
