package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.fk0;
import org.telegram.ui.h4;
import org.telegram.ui.i9;
import org.telegram.ui.ra;
import org.telegram.ui.vb;
import org.telegram.ui.xo0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                int i10 = u.a0;
                break;
            case 1:
                int i11 = f3.a;
                break;
            case 3:
                HashSet hashSet = h4.b1;
            case 2:
                return true;
            case 4:
                int i12 = i9.e;
                break;
            case 5:
                int i13 = y2.w;
                break;
            case 6:
                Paint paint = ra.H;
                break;
            case 7:
                int i14 = vb.Q0;
                break;
            case 8:
                int i15 = zn.Gc;
                break;
            case 10:
                Pattern pattern = d5.a;
            case 9:
                return true;
            case 11:
                i8 i8Var = i8.T0;
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
                int i20 = mp.i0;
                break;
            case 17:
                vu vuVar = vu.S;
                break;
            case 18:
                int i21 = mz.h;
                break;
            case 19:
                int[] iArr = ae0.a0;
                break;
            case 20:
                int i22 = oi0.R;
                break;
            case 21:
                int i23 = lo0.Z0;
                break;
            case 22:
                int i24 = uq0.a1;
                break;
            case 23:
                int[] iArr2 = jv0.d2;
                break;
            case 24:
                int i25 = gy0.u0;
                break;
            case 25:
                int i26 = UndoView.e0;
                break;
            case 26:
                int i27 = UndoView.e0;
                break;
            case 27:
                int i28 = fk0.d0;
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
