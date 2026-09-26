package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fp0 extends FrameLayout {
    public final /* synthetic */ ff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(ff ffVar, Context context) {
        super(context);
        this.a = ffVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ff ffVar = this.a;
        View contentView = ffVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + ffVar.E;
        iArr[1] = iArr[1] + ffVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (AndroidUtilities.statusBarHeight + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!ffVar.A && !ffVar.D) {
            ffVar.D = true;
            ffVar.l(new o1.k[0]);
        }
        return true;
    }
}
