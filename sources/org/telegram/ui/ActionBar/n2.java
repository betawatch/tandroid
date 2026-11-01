package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ei0;
import org.telegram.ui.oa;
import org.telegram.ui.qm0;
import org.telegram.ui.sb;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ n2(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i10 = z2.h1;
                break;
            case 2:
                HashSet hashSet = org.telegram.ui.h4.c1;
            case 1:
                return true;
            case 3:
                int i11 = jg.b1.f;
                break;
            case 4:
                int i12 = org.telegram.ui.Cells.b3.x;
                break;
            case 5:
                Paint paint = oa.H;
                break;
            case 6:
                int i13 = sb.Q0;
                break;
            case 7:
                int i14 = un.bd;
                break;
            case 9:
                Pattern pattern = org.telegram.ui.Components.s4.a;
            case 8:
                return true;
            case 10:
                w7 w7Var = w7.P2;
                break;
            case 11:
                int i15 = ChatActivityEnterView.s5;
                break;
            case 12:
                int i16 = bi.E4;
                break;
            case 13:
                int i17 = xj.g0;
                break;
            case 14:
                int i18 = bl.B0;
                break;
            case 15:
                int i19 = dp.c2;
                break;
            case 16:
                hu huVar = hu.J1;
                break;
            case 17:
                int i20 = xy.h;
                break;
            case 18:
                int[] iArr = zc0.i0;
                break;
            case 19:
                int i21 = kh0.R;
                break;
            case 20:
                int i22 = hn0.a1;
                break;
            case 21:
                int i23 = pp0.Q2;
                break;
            case 22:
                int[] iArr2 = au0.s2;
                break;
            case 23:
                int i24 = dx0.n2;
                break;
            case 24:
                int i25 = u11.e0;
                break;
            case 25:
                int i26 = UndoView.i0;
                break;
            case 26:
                int i27 = UndoView.i0;
                break;
            case 27:
                int i28 = ei0.V1;
                break;
            case 28:
                List list = qm0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
