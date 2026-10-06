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
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.i4;
import org.telegram.ui.j9;
import org.telegram.ui.sa;
import org.telegram.ui.so0;
import org.telegram.ui.wb;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                int i12 = j9.e;
                break;
            case 5:
                int i13 = y2.w;
                break;
            case 6:
                Paint paint = sa.H;
                break;
            case 7:
                int i14 = wb.Q0;
                break;
            case 8:
                int i15 = yn.Bc;
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
                int i17 = xi.H2;
                break;
            case 14:
                int i18 = rk.g0;
                break;
            case 15:
                int i19 = jl.E0;
                break;
            case 16:
                int i20 = pp.i0;
                break;
            case 17:
                zu zuVar = zu.S;
                break;
            case 18:
                int i21 = pz.h;
                break;
            case 19:
                int[] iArr = ee0.a0;
                break;
            case 20:
                int i22 = ri0.R;
                break;
            case 21:
                int i23 = qo0.a1;
                break;
            case 22:
                int i24 = br0.W0;
                break;
            case 23:
                int[] iArr2 = qv0.d2;
                break;
            case 24:
                int i25 = ry0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = ak0.d0;
                break;
            case 28:
                List list = so0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
