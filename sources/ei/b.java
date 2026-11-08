package ei;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import bi.m5;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.ah0;
import org.telegram.ui.an;
import org.telegram.ui.g4;
import org.telegram.ui.hl0;
import org.telegram.ui.la;
import org.telegram.ui.mb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i7 = n.a0;
                break;
            case 1:
                int i10 = v2.h1;
                break;
            case 3:
                HashSet hashSet = g4.c1;
            case 2:
                return true;
            case 4:
                int i11 = m5.f;
                break;
            case 5:
                int i12 = z2.x;
                break;
            case 6:
                Paint paint = la.H;
                break;
            case 7:
                int i13 = mb.Q0;
                break;
            case 8:
                int i14 = an.id;
                break;
            case 10:
                Pattern pattern = v4.a;
            case 9:
                return true;
            case 11:
                b8 b8Var = b8.P2;
                break;
            case 12:
                int i15 = ChatActivityEnterView.s5;
                break;
            case 13:
                int i16 = di.E4;
                break;
            case 14:
                int i17 = vj.g0;
                break;
            case 15:
                int i18 = wk.F0;
                break;
            case 16:
                int i19 = vo.c2;
                break;
            case 17:
                wt wtVar = wt.O1;
                break;
            case 18:
                int i20 = jy.h;
                break;
            case 19:
                int[] iArr = ec0.i0;
                break;
            case 20:
                int i21 = hg0.R;
                break;
            case 21:
                int i22 = fm0.a1;
                break;
            case 22:
                int i23 = mo0.Q2;
                break;
            case 23:
                int[] iArr2 = xs0.s2;
                break;
            case 24:
                int i24 = yv0.n2;
                break;
            case 25:
                int i25 = s01.m0;
                break;
            case 26:
                int i26 = UndoView.i0;
                break;
            case 27:
                int i27 = UndoView.i0;
                break;
            case 28:
                int i28 = ah0.V1;
                break;
            default:
                List list = hl0.g1;
                break;
        }
        return true;
    }
}
