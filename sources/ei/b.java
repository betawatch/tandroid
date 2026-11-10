package ei;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import bi.m5;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.cn;
import org.telegram.ui.dh0;
import org.telegram.ui.g4;
import org.telegram.ui.kl0;
import org.telegram.ui.la;
import org.telegram.ui.mb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                int i10 = w2.k1;
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
                int i14 = cn.kd;
                break;
            case 10:
                Pattern pattern = u4.a;
            case 9:
                return true;
            case 11:
                a8 a8Var = a8.S2;
                break;
            case 12:
                int i15 = ChatActivityEnterView.s5;
                break;
            case 13:
                int i16 = ci.H4;
                break;
            case 14:
                int i17 = uj.g0;
                break;
            case 15:
                int i18 = vk.F0;
                break;
            case 16:
                int i19 = vo.f2;
                break;
            case 17:
                vt vtVar = vt.R1;
                break;
            case 18:
                int i20 = iy.h;
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
                int i23 = mo0.T2;
                break;
            case 23:
                int[] iArr2 = ys0.s2;
                break;
            case 24:
                int i24 = yv0.q2;
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
                int i28 = dh0.Y1;
                break;
            default:
                List list = kl0.g1;
                break;
        }
        return true;
    }
}
