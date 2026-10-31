package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zn0 extends FrameLayout {
    public final /* synthetic */ ie a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(ie ieVar, Context context) {
        super(context);
        this.a = ieVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ie ieVar = this.a;
        View contentView = ieVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + ieVar.E;
        iArr[1] = iArr[1] + ieVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (org.telegram.messenger.i0.m + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!ieVar.A && !ieVar.D) {
            ieVar.D = true;
            ieVar.l(new o1.j[0]);
        }
        return true;
    }
}
