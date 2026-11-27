// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cm7 extends fg4 {
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // fg4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + (hl.L(11.5f) << 1);
        int i3 = 0;
        int i4 = 0;
        while (i3 < getTabsCount()) {
            i4 = uh9.w(24.0f, ((i3 < 0 || i3 >= getTabsCount()) ? null : (bg4) this.h.get(i3)).a(false), i4);
            i3++;
        }
        int round = getTabsCount() > 0 ? Math.round((i4 * 0.25f) / getTabsCount()) : 0;
        setExtraTabWidth(round);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((getTabsCount() * round) + i4 + paddingRight, TLObject.FLAG_30), i2);
    }
}
