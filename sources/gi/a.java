package gi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import di.n4;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.bn;
import org.telegram.ui.dh0;
import org.telegram.ui.g4;
import org.telegram.ui.la;
import org.telegram.ui.lb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i7 = m.b0;
                break;
            case 1:
                int i10 = w2.l1;
                break;
            case 3:
                HashSet hashSet = g4.d1;
            case 2:
                return true;
            case 4:
                int i11 = n4.f;
                break;
            case 5:
                int i12 = a3.x;
                break;
            case 6:
                Paint paint = la.I;
                break;
            case 7:
                int i13 = lb.R0;
                break;
            case 8:
                int i14 = bn.md;
                break;
            case 10:
                Pattern pattern = b5.a;
            case 9:
                return true;
            case 11:
                e8 e8Var = e8.T2;
                break;
            case 12:
                int i15 = ChatActivityEnterView.s7;
                break;
            case 13:
                if (motionEvent.getActionMasked() == 0 && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            case 14:
                int i16 = ti.I4;
                break;
            case 15:
                int i17 = kk.h0;
                break;
            case 16:
                int i18 = kl.G0;
                break;
            case 17:
                int i19 = kp.g2;
                break;
            case 18:
                gu guVar = gu.S1;
                break;
            case 19:
                int i20 = sy.h;
                break;
            case 20:
                int[] iArr = oc0.j0;
                break;
            case 21:
                int i21 = vg0.S;
                break;
            case 22:
                int i22 = tm0.b1;
                break;
            case 23:
                int i23 = zo0.U2;
                break;
            case 24:
                int[] iArr2 = it0.t2;
                break;
            case 25:
                int i24 = jw0.r2;
                break;
            case 26:
                int i25 = f11.r0;
                break;
            case 27:
                int i26 = UndoView.j0;
                break;
            case 28:
                int i27 = UndoView.j0;
                break;
            default:
                int i28 = dh0.Z1;
                break;
        }
        return true;
    }
}
