package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.h9;
import org.telegram.ui.i4;
import org.telegram.ui.oo0;
import org.telegram.ui.qa;
import org.telegram.ui.ub;
import org.telegram.ui.wj0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i10 = u.a0;
                break;
            case 1:
                int i11 = e3.a;
                break;
            case 3:
                HashSet hashSet = i4.b1;
            case 2:
                return true;
            case 4:
                int i12 = h9.e;
                break;
            case 5:
                int i13 = y2.w;
                break;
            case 6:
                Paint paint = qa.H;
                break;
            case 7:
                int i14 = ub.Q0;
                break;
            case 8:
                int i15 = wn.Gc;
                break;
            case 10:
                Pattern pattern = e5.a;
            case 9:
                return true;
            case 11:
                j8 j8Var = j8.T0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.n5;
                break;
            case 13:
                int i17 = wi.O2;
                break;
            case 14:
                int i18 = qk.g0;
                break;
            case 15:
                int i19 = il.E0;
                break;
            case 16:
                int i20 = op.i0;
                break;
            case 17:
                xu xuVar = xu.S;
                break;
            case 18:
                int i21 = oz.h;
                break;
            case 19:
                int[] iArr = ee0.a0;
                break;
            case 20:
                int i22 = ri0.R;
                break;
            case 21:
                int i23 = no0.Y0;
                break;
            case 22:
                int i24 = wq0.a1;
                break;
            case 23:
                int[] iArr2 = lv0.d2;
                break;
            case 24:
                int i25 = hy0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = wj0.d0;
                break;
            case 28:
                List list = oo0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
