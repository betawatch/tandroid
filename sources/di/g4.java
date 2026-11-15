package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g4 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(c6 c6Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = c6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.X2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.X2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.X2.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.X2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
