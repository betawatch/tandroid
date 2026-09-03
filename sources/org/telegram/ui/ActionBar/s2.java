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
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.i9;
import org.telegram.ui.lo0;
import org.telegram.ui.pa;
import org.telegram.ui.sb;
import org.telegram.ui.sf1;
import org.telegram.ui.uj0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                int i22 = do0.U0;
                break;
            case 21:
                int i23 = lq0.X0;
                break;
            case 22:
                int[] iArr2 = yu0.a2;
                break;
            case 23:
                int i24 = xx0.r0;
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
                HashSet hashSet2 = sf1.k1;
                break;
        }
        return true;
    }
}
