package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.gi0;
import org.telegram.ui.oa;
import org.telegram.ui.sb;
import org.telegram.ui.sm0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                int i14 = un.ad;
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
                int i21 = jh0.R;
                break;
            case 20:
                int i22 = gn0.a1;
                break;
            case 21:
                int i23 = op0.Q2;
                break;
            case 22:
                int[] iArr2 = zt0.s2;
                break;
            case 23:
                int i24 = cx0.n2;
                break;
            case 24:
                int i25 = t11.a0;
                break;
            case 25:
                int i26 = UndoView.i0;
                break;
            case 26:
                int i27 = UndoView.i0;
                break;
            case 27:
                int i28 = gi0.V1;
                break;
            case 28:
                List list = sm0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
