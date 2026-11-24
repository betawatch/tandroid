// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hh3 extends ChatActivityEnterView {
    public final /* synthetic */ cj3 s7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh3(cj3 cj3Var, Activity activity, vi3 vi3Var) {
        super(activity, vi3Var, null, false, null);
        this.s7 = cj3Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void a1(float f) {
        cj3 cj3Var = this.s7;
        cj3Var.A1.setInputBubbleHeight(f);
        cj3Var.M2();
        cj3Var.N2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 0) {
            cj3 cj3Var = this.s7;
            Activity parentActivity = cj3Var.getParentActivity();
            i = ((d) cj3Var).classGuid;
            gl.W2(parentActivity, i);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        cj3 cj3Var = this.s7;
        int i = cj3Var.U0;
        hh3 hh3Var = cj3Var.D1;
        return Math.max(1, i + (!TextUtils.isEmpty(hh3Var == null ? "" : hh3Var.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        cj3 cj3Var = this.s7;
        ArrayList arrayList = cj3Var.K2;
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
            long K1 = cj3Var.getMessagesController().K1(longValue);
            if (K1 <= 0 && longValue > 0) {
                K1 = cf3.j(cj3Var.getMessagesController().I2(longValue));
            }
            j += K1;
        }
        return j;
    }
}
