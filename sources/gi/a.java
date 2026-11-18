package gi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import di.n4;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.bn;
import org.telegram.ui.fh0;
import org.telegram.ui.g4;
import org.telegram.ui.la;
import org.telegram.ui.lb;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                int i10 = x2.l1;
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
                g8 g8Var = g8.T2;
                break;
            case 12:
                int i15 = ChatActivityEnterView.n7;
                break;
            case 13:
                if (motionEvent.getActionMasked() == 0 && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            case 14:
                int i16 = si.I4;
                break;
            case 15:
                int i17 = kk.h0;
                break;
            case 16:
                int i18 = kl.G0;
                break;
            case 17:
                int i19 = lp.g2;
                break;
            case 18:
                gu guVar = gu.S1;
                break;
            case 19:
                int i20 = ty.h;
                break;
            case 20:
                int[] iArr = pc0.j0;
                break;
            case 21:
                int i21 = ug0.S;
                break;
            case 22:
                int i22 = rm0.b1;
                break;
            case 23:
                int i23 = yo0.U2;
                break;
            case 24:
                int[] iArr2 = gt0.t2;
                break;
            case 25:
                int i24 = iw0.r2;
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
                int i28 = fh0.Z1;
                break;
        }
        return true;
    }
}
