package dg;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z3 extends b {
    public final /* synthetic */ b4 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(b4 b4Var, Context context) {
        super(context);
        this.B = b4Var;
    }

    @Override // org.telegram.ui.Components.xt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.B.E;
        if (iVar == null || iVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.xt, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.B.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.B.m();
    }
}
