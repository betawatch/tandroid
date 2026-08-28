package jh;

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
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.co0;
import org.telegram.ui.f9;
import org.telegram.ui.l4;
import org.telegram.ui.ma;
import org.telegram.ui.nj0;
import org.telegram.ui.pb;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i9) {
        this.a = i9;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i9 = q.T;
                break;
            case 1:
                int i10 = f3.a;
                break;
            case 3:
                HashSet hashSet = l4.X0;
            case 2:
                return true;
            case 4:
                int i11 = f9.e;
                break;
            case 5:
                int i12 = x2.w;
                break;
            case 6:
                Paint paint = ma.D;
                break;
            case 7:
                int i13 = pb.T0;
                break;
            case 8:
                int i14 = qn.Dc;
                break;
            case 10:
                Pattern pattern = y4.a;
            case 9:
                return true;
            case 11:
                c8 c8Var = c8.P0;
                break;
            case 12:
                int i15 = ChatActivityEnterView.i5;
                break;
            case 13:
                int i16 = ki.K2;
                break;
            case 14:
                int i17 = fk.c0;
                break;
            case 15:
                int i18 = xk.A0;
                break;
            case 16:
                int i19 = cp.e0;
                break;
            case 17:
                gu guVar = gu.O;
                break;
            case 18:
                int i20 = yy.h;
                break;
            case 19:
                int[] iArr = yc0.T;
                break;
            case 20:
                int i21 = qh0.N;
                break;
            case 21:
                int i22 = hn0.T0;
                break;
            case 22:
                int i23 = rp0.W0;
                break;
            case 23:
                int[] iArr2 = eu0.Z1;
                break;
            case 24:
                int i24 = cx0.q0;
                break;
            case 25:
                int i25 = UndoView.a0;
                break;
            case 26:
                int i26 = UndoView.a0;
                break;
            case 27:
                int i27 = nj0.Z;
                break;
            case 28:
                List list = co0.c1;
                break;
            default:
                int i28 = PopupNotificationActivity.X;
                break;
        }
        return true;
    }
}
