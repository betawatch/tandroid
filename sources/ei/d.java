package ei;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.yp;
import org.telegram.ui.j4;
import org.telegram.ui.l9;
import org.telegram.ui.oj0;
import org.telegram.ui.po0;
import org.telegram.ui.ta;
import org.telegram.ui.un;
import org.telegram.ui.wb;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                int i11 = k3.a;
                break;
            case 3:
                HashSet hashSet = j4.c1;
            case 2:
                return true;
            case 4:
                int i12 = l9.e;
                break;
            case 5:
                int i13 = v2.w;
                break;
            case 6:
                Paint paint = ta.H;
                break;
            case 7:
                int i14 = wb.Q0;
                break;
            case 8:
                int i15 = un.bd;
                break;
            case 10:
                Pattern pattern = g5.a;
            case 9:
                return true;
            case 11:
                m8 m8Var = m8.Y0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.r5;
                break;
            case 13:
                int i17 = ti.N2;
                break;
            case 14:
                int i18 = nk.g0;
                break;
            case 15:
                int i19 = sl.B0;
                break;
            case 16:
                int i20 = yp.l0;
                break;
            case 17:
                dv dvVar = dv.S;
                break;
            case 18:
                int i21 = uz.h;
                break;
            case 19:
                int[] iArr = le0.i0;
                break;
            case 20:
                int i22 = dj0.R;
                break;
            case 21:
                int i23 = ep0.a1;
                break;
            case 22:
                int i24 = mr0.Z0;
                break;
            case 23:
                int[] iArr2 = aw0.p2;
                break;
            case 24:
                int i25 = cz0.w0;
                break;
            case 25:
                int i26 = UndoView.i0;
                break;
            case 26:
                int i27 = UndoView.i0;
                break;
            case 27:
                int i28 = oj0.e0;
                break;
            default:
                List list = po0.g1;
                break;
        }
        return true;
    }
}
