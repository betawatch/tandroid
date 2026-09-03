package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wo0 extends FrameLayout {
    public final /* synthetic */ ve a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(ve veVar, Context context) {
        super(context);
        this.a = veVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ve veVar = this.a;
        View contentView = veVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + veVar.E;
        iArr[1] = iArr[1] + veVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (AndroidUtilities.statusBarHeight + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!veVar.A && !veVar.D) {
            veVar.D = true;
            veVar.l(new o1.j[0]);
        }
        return true;
    }
}
