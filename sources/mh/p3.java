package mh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p3 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(g5 g5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = g5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.V0.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.V0.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.V0.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.V0.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
