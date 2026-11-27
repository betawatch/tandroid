// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bi3 extends ChatActivityEnterView {
    public final /* synthetic */ uj3 Y7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi3(uj3 uj3Var, Activity activity, nj3 nj3Var) {
        super(activity, nj3Var, null, false, null);
        this.Y7 = uj3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 0) {
            uj3 uj3Var = this.Y7;
            Activity parentActivity = uj3Var.getParentActivity();
            i = ((e) uj3Var).classGuid;
            hl.V2(parentActivity, i);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f1(float f) {
        uj3 uj3Var = this.Y7;
        uj3Var.A1.setInputBubbleHeight(f);
        uj3Var.O2();
        uj3Var.P2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        uj3 uj3Var = this.Y7;
        int i = uj3Var.U0;
        bi3 bi3Var = uj3Var.D1;
        return Math.max(1, i + (!TextUtils.isEmpty(bi3Var == null ? "" : bi3Var.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        uj3 uj3Var = this.Y7;
        ArrayList arrayList = uj3Var.K2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            long M1 = uj3Var.getMessagesController().M1(longValue);
            if (M1 <= 0 && longValue > 0) {
                M1 = wf3.j(uj3Var.getMessagesController().P2(longValue));
            }
            j += M1;
        }
        return j;
    }
}
