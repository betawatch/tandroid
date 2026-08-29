package mh;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.e9;
import org.telegram.ui.kj0;
import org.telegram.ui.la;
import org.telegram.ui.m4;
import org.telegram.ui.ob;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                int i10 = r.T;
                break;
            case 1:
                int i11 = f3.a;
                break;
            case 3:
                HashSet hashSet = m4.X0;
            case 2:
                return true;
            case 4:
                int i12 = e9.e;
                break;
            case 5:
                int i13 = v2.w;
                break;
            case 6:
                Paint paint = la.D;
                break;
            case 7:
                int i14 = ob.T0;
                break;
            case 8:
                int i15 = tn.Dc;
                break;
            case 10:
                Pattern pattern = c5.a;
            case 9:
                return true;
            case 11:
                g8 g8Var = g8.P0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.i5;
                break;
            case 13:
                int i17 = ni.K2;
                break;
            case 14:
                int i18 = jk.c0;
                break;
            case 15:
                int i19 = bl.A0;
                break;
            case 16:
                int i20 = gp.e0;
                break;
            case 17:
                mu muVar = mu.O;
                break;
            case 18:
                int i21 = hz.h;
                break;
            case 19:
                int[] iArr = nd0.T;
                break;
            case 20:
                int i22 = ai0.N;
                break;
            case 21:
                int i23 = tn0.T0;
                break;
            case 22:
                int i24 = dq0.W0;
                break;
            case 23:
                int[] iArr2 = qu0.Z1;
                break;
            case 24:
                int i25 = nx0.q0;
                break;
            case 25:
                int i26 = UndoView.a0;
                break;
            case 26:
                int i27 = UndoView.a0;
                break;
            case 27:
                int i28 = kj0.Z;
                break;
            case 28:
                List list = bo0.c1;
                break;
            default:
                int i29 = PopupNotificationActivity.X;
                break;
        }
        return true;
    }
}
