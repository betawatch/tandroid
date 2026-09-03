package oh;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.k9;
import org.telegram.ui.lo0;
import org.telegram.ui.n4;
import org.telegram.ui.ra;
import org.telegram.ui.ub;
import org.telegram.ui.uj0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                int i10 = r.U;
                break;
            case 1:
                int i11 = g3.a;
                break;
            case 3:
                HashSet hashSet = n4.Y0;
            case 2:
                return true;
            case 4:
                int i12 = k9.e;
                break;
            case 5:
                int i13 = w2.w;
                break;
            case 6:
                Paint paint = ra.E;
                break;
            case 7:
                int i14 = ub.U0;
                break;
            case 8:
                int i15 = zn.Ec;
                break;
            case 10:
                Pattern pattern = z4.a;
            case 9:
                return true;
            case 11:
                c8 c8Var = c8.Q0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.j5;
                break;
            case 13:
                int i17 = li.L2;
                break;
            case 14:
                int i18 = hk.d0;
                break;
            case 15:
                int i19 = al.B0;
                break;
            case 16:
                int i20 = jp.f0;
                break;
            case 17:
                ou ouVar = ou.P;
                break;
            case 18:
                int i21 = mz.h;
                break;
            case 19:
                int[] iArr = wd0.U;
                break;
            case 20:
                int i22 = mi0.O;
                break;
            case 21:
                int i23 = co0.U0;
                break;
            case 22:
                int i24 = lq0.X0;
                break;
            case 23:
                int[] iArr2 = yu0.a2;
                break;
            case 24:
                int i25 = xx0.r0;
                break;
            case 25:
                int i26 = UndoView.b0;
                break;
            case 26:
                int i27 = UndoView.b0;
                break;
            case 27:
                int i28 = uj0.a0;
                break;
            case 28:
                List list = lo0.d1;
                break;
            default:
                int i29 = PopupNotificationActivity.Y;
                break;
        }
        return true;
    }
}
