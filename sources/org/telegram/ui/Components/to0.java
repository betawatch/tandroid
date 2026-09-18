package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class to0 extends FrameLayout {
    public final /* synthetic */ cf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(cf cfVar, Context context) {
        super(context);
        this.a = cfVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cf cfVar = this.a;
        View contentView = cfVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + cfVar.E;
        iArr[1] = iArr[1] + cfVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (AndroidUtilities.statusBarHeight + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!cfVar.A && !cfVar.D) {
            cfVar.D = true;
            cfVar.l(new o1.k[0]);
        }
        return true;
    }
}
