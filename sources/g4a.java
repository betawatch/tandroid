// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g4a extends FrameLayout {
    public final /* synthetic */ j4a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4a(j4a j4aVar, Context context) {
        super(context);
        this.a = j4aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j4a j4aVar = this.a;
        View contentView = j4aVar.getContentView();
        int[] iArr = new int[2];
        contentView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + j4aVar.E;
        iArr[1] = iArr[1] + j4aVar.F;
        getLocationInWindow(new int[2]);
        if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) {
            if (motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1]) {
                if (motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                    motionEvent.offsetLocation(r2[0] - iArr[0], (gl.m + r2[1]) - iArr[1]);
                    return contentView.dispatchTouchEvent(motionEvent);
                }
            }
        }
        if (!j4aVar.A && !j4aVar.D) {
            j4aVar.D = true;
            j4aVar.l(new yla[0]);
        }
        return true;
    }
}
