package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.i9;
import org.telegram.ui.lo0;
import org.telegram.ui.mf1;
import org.telegram.ui.pa;
import org.telegram.ui.sb;
import org.telegram.ui.uj0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ s2(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i10 = h3.a;
                break;
            case 2:
                HashSet hashSet = org.telegram.ui.l4.Y0;
            case 1:
                return true;
            case 3:
                int i11 = i9.e;
                break;
            case 4:
                int i12 = org.telegram.ui.Cells.x2.w;
                break;
            case 5:
                Paint paint = pa.E;
                break;
            case 6:
                int i13 = sb.U0;
                break;
            case 7:
                int i14 = xn.Ec;
                break;
            case 9:
                Pattern pattern = org.telegram.ui.Components.z4.a;
            case 8:
                return true;
            case 10:
                c8 c8Var = c8.Q0;
                break;
            case 11:
                int i15 = ChatActivityEnterView.j5;
                break;
            case 12:
                int i16 = mi.L2;
                break;
            case 13:
                int i17 = jk.d0;
                break;
            case 14:
                int i18 = cl.B0;
                break;
            case 15:
                int i19 = mp.f0;
                break;
            case 16:
                ru ruVar = ru.P;
                break;
            case 17:
                int i20 = oz.h;
                break;
            case 18:
                int[] iArr = xd0.U;
                break;
            case 19:
                int i21 = ni0.O;
                break;
            case 20:
                int i22 = eo0.U0;
                break;
            case 21:
                int i23 = mq0.X0;
                break;
            case 22:
                int[] iArr2 = zu0.a2;
                break;
            case 23:
                int i24 = yx0.r0;
                break;
            case 24:
                int i25 = UndoView.b0;
                break;
            case 25:
                int i26 = UndoView.b0;
                break;
            case 26:
                int i27 = uj0.a0;
                break;
            case 27:
                List list = lo0.d1;
                break;
            case 28:
                int i28 = PopupNotificationActivity.Y;
                break;
            default:
                HashSet hashSet2 = mf1.k1;
                break;
        }
        return true;
    }
}
