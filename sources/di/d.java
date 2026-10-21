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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.eo0;
import org.telegram.ui.j9;
import org.telegram.ui.l4;
import org.telegram.ui.mj0;
import org.telegram.ui.qn;
import org.telegram.ui.sa;
import org.telegram.ui.vb;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                Paint paint = sa.H;
                break;
            case 7:
                int i14 = vb.Q0;
                break;
            case 8:
                int i15 = qn.Ic;
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
                int[] iArr = me0.i0;
                break;
            case 20:
                int i22 = bj0.R;
                break;
            case 21:
                int i23 = wo0.Y0;
                break;
            case 22:
                int i24 = fr0.b1;
                break;
            case 23:
                int[] iArr2 = uv0.d2;
                break;
            case 24:
                int i25 = qy0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = mj0.d0;
                break;
            case 28:
                List list = eo0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
