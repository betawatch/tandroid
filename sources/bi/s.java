package bi;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s extends hi.d {
    public final /* synthetic */ int l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10);
        this.l0 = i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.l0) {
            case 0:
                if (this.d0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // hi.d
    public boolean j() {
        switch (this.l0) {
            case 1:
                return false;
            case 2:
            default:
                return super.j();
            case 3:
                return false;
        }
    }
}
