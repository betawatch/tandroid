package fi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import ci.t4;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.z7;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.dl0;
import org.telegram.ui.i4;
import org.telegram.ui.ka;
import org.telegram.ui.kb;
import org.telegram.ui.vg0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i3) {
        this.a = i3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i3 = m.b0;
                break;
            case 1:
                int i10 = t2.i1;
                break;
            case 3:
                HashSet hashSet = i4.d1;
            case 2:
                return true;
            case 4:
                int i11 = t4.f;
                break;
            case 5:
                int i12 = z2.x;
                break;
            case 6:
                Paint paint = ka.I;
                break;
            case 7:
                int i13 = kb.R0;
                break;
            case 8:
                int i14 = wm.jd;
                break;
            case 10:
                Pattern pattern = org.telegram.ui.Components.t4.a;
            case 9:
                return true;
            case 11:
                z7 z7Var = z7.Q2;
                break;
            case 12:
                int i15 = ChatActivityEnterView.t5;
                break;
            case 13:
                int i16 = bi.F4;
                break;
            case 14:
                int i17 = uj.h0;
                break;
            case 15:
                int i18 = uk.G0;
                break;
            case 16:
                int i19 = vo.d2;
                break;
            case 17:
                ut utVar = ut.K1;
                break;
            case 18:
                int i20 = gy.h;
                break;
            case 19:
                int[] iArr = zb0.j0;
                break;
            case 20:
                int i21 = kg0.S;
                break;
            case 21:
                int i22 = im0.b1;
                break;
            case 22:
                int i23 = oo0.R2;
                break;
            case 23:
                int[] iArr2 = ws0.t2;
                break;
            case 24:
                int i24 = xv0.o2;
                break;
            case 25:
                int i25 = n01.f0;
                break;
            case 26:
                int i26 = UndoView.j0;
                break;
            case 27:
                int i27 = UndoView.j0;
                break;
            case 28:
                int i28 = vg0.W1;
                break;
            default:
                List list = dl0.h1;
                break;
        }
        return true;
    }
}
