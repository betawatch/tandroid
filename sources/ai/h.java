package ai;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ek0;
import org.telegram.ui.eo;
import org.telegram.ui.h9;
import org.telegram.ui.j4;
import org.telegram.ui.ra;
import org.telegram.ui.wb;
import org.telegram.ui.wo0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i10 = a0.a0;
                break;
            case 1:
                int i11 = h3.a;
                break;
            case 3:
                HashSet hashSet = j4.b1;
            case 2:
                return true;
            case 4:
                int i12 = h9.e;
                break;
            case 5:
                int i13 = x2.w;
                break;
            case 6:
                Paint paint = ra.H;
                break;
            case 7:
                int i14 = wb.X0;
                break;
            case 8:
                int i15 = eo.Hc;
                break;
            case 10:
                Pattern pattern = d5.a;
            case 9:
                return true;
            case 11:
                j8 j8Var = j8.T0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.m5;
                break;
            case 13:
                int i17 = yi.O2;
                break;
            case 14:
                int i18 = tk.g0;
                break;
            case 15:
                int i19 = ll.E0;
                break;
            case 16:
                int i20 = sp.i0;
                break;
            case 17:
                zu zuVar = zu.S;
                break;
            case 18:
                int i21 = tz.h;
                break;
            case 19:
                int[] iArr = be0.a0;
                break;
            case 20:
                int i22 = oi0.R;
                break;
            case 21:
                int i23 = ho0.X0;
                break;
            case 22:
                int i24 = sq0.a1;
                break;
            case 23:
                int[] iArr2 = iv0.d2;
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
                int i28 = ek0.d0;
                break;
            case 28:
                List list = wo0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
