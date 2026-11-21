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
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.bn;
import org.telegram.ui.fh0;
import org.telegram.ui.g4;
import org.telegram.ui.la;
import org.telegram.ui.lb;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                Pattern pattern = c5.a;
            case 9:
                return true;
            case 11:
                f8 f8Var = f8.T2;
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
                int i16 = ui.I4;
                break;
            case 15:
                int i17 = mk.h0;
                break;
            case 16:
                int i18 = ml.G0;
                break;
            case 17:
                int i19 = np.g2;
                break;
            case 18:
                iu iuVar = iu.S1;
                break;
            case 19:
                int i20 = vy.h;
                break;
            case 20:
                int[] iArr = qc0.j0;
                break;
            case 21:
                int i21 = wg0.S;
                break;
            case 22:
                int i22 = um0.b1;
                break;
            case 23:
                int i23 = ap0.U2;
                break;
            case 24:
                int[] iArr2 = jt0.t2;
                break;
            case 25:
                int i24 = kw0.r2;
                break;
            case 26:
                int i25 = h11.r0;
                break;
            case 27:
                int i26 = UndoView.j0;
                break;
            case 28:
                int i27 = UndoView.j0;
                break;
            default:
                int i28 = fh0.Z1;
                break;
        }
        return true;
    }
}
