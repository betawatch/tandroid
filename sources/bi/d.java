package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.bo;
import org.telegram.ui.ek0;
import org.telegram.ui.h4;
import org.telegram.ui.j9;
import org.telegram.ui.sa;
import org.telegram.ui.wb;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                int i11 = g3.a;
                break;
            case 3:
                HashSet hashSet = h4.b1;
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
                int i14 = wb.Q0;
                break;
            case 8:
                int i15 = bo.Gc;
                break;
            case 10:
                Pattern pattern = c5.a;
            case 9:
                return true;
            case 11:
                h8 h8Var = h8.T0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.n5;
                break;
            case 13:
                int i17 = vi.O2;
                break;
            case 14:
                int i18 = ok.g0;
                break;
            case 15:
                int i19 = gl.E0;
                break;
            case 16:
                int i20 = mp.i0;
                break;
            case 17:
                vu vuVar = vu.S;
                break;
            case 18:
                int i21 = mz.h;
                break;
            case 19:
                int[] iArr = sd0.a0;
                break;
            case 20:
                int i22 = fi0.R;
                break;
            case 21:
                int i23 = zn0.Z0;
                break;
            case 22:
                int i24 = iq0.a1;
                break;
            case 23:
                int[] iArr2 = zu0.d2;
                break;
            case 24:
                int i25 = wx0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = ek0.d0;
                break;
            case 28:
                List list = yo0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
