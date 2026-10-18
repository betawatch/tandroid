package di;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wp;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.go0;
import org.telegram.ui.j9;
import org.telegram.ui.l4;
import org.telegram.ui.oj0;
import org.telegram.ui.sn;
import org.telegram.ui.ua;
import org.telegram.ui.xb;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                int i10 = r.a0;
                break;
            case 1:
                int i11 = f3.a;
                break;
            case 3:
                HashSet hashSet = l4.b1;
            case 2:
                return true;
            case 4:
                int i12 = j9.e;
                break;
            case 5:
                int i13 = x2.w;
                break;
            case 6:
                Paint paint = ua.H;
                break;
            case 7:
                int i14 = xb.Q0;
                break;
            case 8:
                int i15 = sn.Ic;
                break;
            case 10:
                Pattern pattern = f5.a;
            case 9:
                return true;
            case 11:
                k8 k8Var = k8.T0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.n5;
                break;
            case 13:
                int i17 = ti.R2;
                break;
            case 14:
                int i18 = nk.g0;
                break;
            case 15:
                int i19 = rl.E0;
                break;
            case 16:
                int i20 = wp.i0;
                break;
            case 17:
                cv cvVar = cv.S;
                break;
            case 18:
                int i21 = vz.h;
                break;
            case 19:
                int[] iArr = le0.i0;
                break;
            case 20:
                int i22 = aj0.R;
                break;
            case 21:
                int i23 = vo0.Y0;
                break;
            case 22:
                int i24 = dr0.a1;
                break;
            case 23:
                int[] iArr2 = sv0.d2;
                break;
            case 24:
                int i25 = oy0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = oj0.d0;
                break;
            case 28:
                List list = go0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
