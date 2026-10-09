package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.dk0;
import org.telegram.ui.g9;
import org.telegram.ui.i4;
import org.telegram.ui.ra;
import org.telegram.ui.vb;
import org.telegram.ui.vo0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                int i11 = f3.a;
                break;
            case 3:
                HashSet hashSet = i4.b1;
            case 2:
                return true;
            case 4:
                int i12 = g9.e;
                break;
            case 5:
                int i13 = y2.w;
                break;
            case 6:
                Paint paint = ra.H;
                break;
            case 7:
                int i14 = vb.Q0;
                break;
            case 8:
                int i15 = zn.Hc;
                break;
            case 10:
                Pattern pattern = g5.a;
            case 9:
                return true;
            case 11:
                l8 l8Var = l8.T0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.n5;
                break;
            case 13:
                int i17 = yi.R2;
                break;
            case 14:
                int i18 = sk.g0;
                break;
            case 15:
                int i19 = xl.E0;
                break;
            case 16:
                int i20 = cq.i0;
                break;
            case 17:
                lv lvVar = lv.S;
                break;
            case 18:
                int i21 = c00.h;
                break;
            case 19:
                int[] iArr = te0.e0;
                break;
            case 20:
                int i22 = jj0.R;
                break;
            case 21:
                int i23 = dp0.Y0;
                break;
            case 22:
                int i24 = mr0.a1;
                break;
            case 23:
                int[] iArr2 = bw0.d2;
                break;
            case 24:
                int i25 = xy0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = dk0.d0;
                break;
            case 28:
                List list = vo0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
