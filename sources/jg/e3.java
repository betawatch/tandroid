package jg;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e3 extends b {
    public final /* synthetic */ g3 T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(g3 g3Var, Context context) {
        super(context);
        this.T1 = g3Var;
    }

    @Override // org.telegram.ui.Components.qt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.T1.H;
        if (iVar == null || iVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.T1.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.T1.m();
    }
}
