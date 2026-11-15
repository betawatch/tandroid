package gi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import di.k4;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.an;
import org.telegram.ui.bh0;
import org.telegram.ui.g4;
import org.telegram.ui.la;
import org.telegram.ui.lb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
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
                int i10 = u2.l1;
                break;
            case 3:
                HashSet hashSet = g4.d1;
            case 2:
                return true;
            case 4:
                int i11 = k4.f;
                break;
            case 5:
                int i12 = z2.x;
                break;
            case 6:
                Paint paint = la.I;
                break;
            case 7:
                int i13 = lb.R0;
                break;
            case 8:
                int i14 = an.ld;
                break;
            case 10:
                Pattern pattern = t4.a;
            case 9:
                return true;
            case 11:
                y7 y7Var = y7.T2;
                break;
            case 12:
                int i15 = ChatActivityEnterView.N6;
                break;
            case 13:
                if (motionEvent.getActionMasked() == 0 && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            case 14:
                int i16 = ki.I4;
                break;
            case 15:
                int i17 = dk.h0;
                break;
            case 16:
                int i18 = dl.G0;
                break;
            case 17:
                int i19 = ep.g2;
                break;
            case 18:
                bu buVar = bu.S1;
                break;
            case 19:
                int i20 = ny.h;
                break;
            case 20:
                int[] iArr = fc0.j0;
                break;
            case 21:
                int i21 = kg0.S;
                break;
            case 22:
                int i22 = jm0.b1;
                break;
            case 23:
                int i23 = po0.U2;
                break;
            case 24:
                int[] iArr2 = ys0.t2;
                break;
            case 25:
                int i24 = bw0.r2;
                break;
            case 26:
                int i25 = v01.n0;
                break;
            case 27:
                int i26 = UndoView.j0;
                break;
            case 28:
                int i27 = UndoView.j0;
                break;
            default:
                int i28 = bh0.Z1;
                break;
        }
        return true;
    }
}
