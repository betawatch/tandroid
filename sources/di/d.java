package di;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.io0;
import org.telegram.ui.j9;
import org.telegram.ui.k4;
import org.telegram.ui.rj0;
import org.telegram.ui.sa;
import org.telegram.ui.sn;
import org.telegram.ui.vb;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                int i11 = h3.a;
                break;
            case 3:
                HashSet hashSet = k4.c1;
            case 2:
                return true;
            case 4:
                int i12 = j9.e;
                break;
            case 5:
                int i13 = w2.w;
                break;
            case 6:
                Paint paint = sa.H;
                break;
            case 7:
                int i14 = vb.Q0;
                break;
            case 8:
                int i15 = sn.Vc;
                break;
            case 10:
                Pattern pattern = f5.a;
            case 9:
                return true;
            case 11:
                k8 k8Var = k8.Y0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.r5;
                break;
            case 13:
                int i17 = ti.U2;
                break;
            case 14:
                int i18 = nk.g0;
                break;
            case 15:
                int i19 = rl.C0;
                break;
            case 16:
                int i20 = wp.l0;
                break;
            case 17:
                cv cvVar = cv.S;
                break;
            case 18:
                int i21 = vz.h;
                break;
            case 19:
                int[] iArr = pe0.i0;
                break;
            case 20:
                int i22 = ej0.R;
                break;
            case 21:
                int i23 = ap0.Y0;
                break;
            case 22:
                int i24 = ir0.d1;
                break;
            case 23:
                int[] iArr2 = xv0.g2;
                break;
            case 24:
                int i25 = ty0.w0;
                break;
            case 25:
                int i26 = UndoView.i0;
                break;
            case 26:
                int i27 = UndoView.i0;
                break;
            case 27:
                int i28 = rj0.e0;
                break;
            case 28:
                List list = io0.g1;
                break;
            default:
                int i29 = PopupNotificationActivity.b0;
                break;
        }
        return true;
    }
}
