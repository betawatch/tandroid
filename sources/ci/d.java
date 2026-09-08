package ci;

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
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.co;
import org.telegram.ui.ek0;
import org.telegram.ui.h9;
import org.telegram.ui.i4;
import org.telegram.ui.qa;
import org.telegram.ui.ub;
import org.telegram.ui.xo0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                int i10 = t.a0;
                break;
            case 1:
                int i11 = f3.a;
                break;
            case 3:
                HashSet hashSet = i4.b1;
            case 2:
                return true;
            case 4:
                int i12 = h9.e;
                break;
            case 5:
                int i13 = x2.w;
                break;
            case 6:
                Paint paint = qa.H;
                break;
            case 7:
                int i14 = ub.X0;
                break;
            case 8:
                int i15 = co.Hc;
                break;
            case 10:
                Pattern pattern = e5.a;
            case 9:
                return true;
            case 11:
                k8 k8Var = k8.T0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.m5;
                break;
            case 13:
                int i17 = vi.O2;
                break;
            case 14:
                int i18 = ok.g0;
                break;
            case 15:
                int i19 = gl.E0;
                break;
            case 16:
                int i20 = lp.i0;
                break;
            case 17:
                tu tuVar = tu.S;
                break;
            case 18:
                int i21 = mz.h;
                break;
            case 19:
                int[] iArr = sd0.a0;
                break;
            case 20:
                int i22 = ei0.R;
                break;
            case 21:
                int i23 = yn0.X0;
                break;
            case 22:
                int i24 = hq0.a1;
                break;
            case 23:
                int[] iArr2 = xu0.d2;
                break;
            case 24:
                int i25 = ux0.u0;
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
                List list = xo0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
