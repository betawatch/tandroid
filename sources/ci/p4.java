package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p4 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(l6 l6Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = l6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.U2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.U2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.U2.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.U2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
