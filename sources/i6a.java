// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i6a extends FrameLayout {
    public final /* synthetic */ l6a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6a(l6a l6aVar, Context context) {
        super(context);
        this.a = l6aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l6a l6aVar = this.a;
        View contentView = l6aVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + l6aVar.E;
        iArr[1] = iArr[1] + l6aVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (gm.m + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!l6aVar.A && !l6aVar.D) {
            l6aVar.D = true;
            l6aVar.l(new zna[0]);
        }
        return true;
    }
}
