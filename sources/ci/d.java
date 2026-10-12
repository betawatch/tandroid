package ci;

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
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ac;
import org.telegram.ui.cp0;
import org.telegram.ui.fo;
import org.telegram.ui.ik0;
import org.telegram.ui.k4;
import org.telegram.ui.k9;
import org.telegram.ui.va;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                int i10 = t.a0;
                break;
            case 1:
                int i11 = e3.a;
                break;
            case 3:
                HashSet hashSet = k4.b1;
            case 2:
                return true;
            case 4:
                int i12 = k9.e;
                break;
            case 5:
                int i13 = y2.w;
                break;
            case 6:
                Paint paint = va.H;
                break;
            case 7:
                int i14 = ac.Q0;
                break;
            case 8:
                int i15 = fo.Hc;
                break;
            case 10:
                Pattern pattern = g5.a;
            case 9:
                return true;
            case 11:
                m8 m8Var = m8.T0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.n5;
                break;
            case 13:
                int i17 = vi.R2;
                break;
            case 14:
                int i18 = pk.g0;
                break;
            case 15:
                int i19 = ul.E0;
                break;
            case 16:
                int i20 = zp.i0;
                break;
            case 17:
                hv hvVar = hv.S;
                break;
            case 18:
                int i21 = yz.h;
                break;
            case 19:
                int[] iArr = re0.e0;
                break;
            case 20:
                int i22 = fj0.R;
                break;
            case 21:
                int i23 = zo0.Y0;
                break;
            case 22:
                int i24 = jr0.a1;
                break;
            case 23:
                int[] iArr2 = xv0.d2;
                break;
            case 24:
                int i25 = ty0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = ik0.d0;
                break;
            case 28:
                List list = cp0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
