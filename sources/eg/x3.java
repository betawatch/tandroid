package eg;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x3 extends b {
    public final /* synthetic */ z3 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(z3 z3Var, Context context) {
        super(context);
        this.B = z3Var;
    }

    @Override // org.telegram.ui.Components.zt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.B.E;
        if (iVar == null || iVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zt, android.widget.TextView, android.view.View
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
