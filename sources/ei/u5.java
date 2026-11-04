package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.ub;
import org.telegram.messenger.us;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ao;
import org.telegram.ui.b21;
import org.telegram.ui.dd0;
import org.telegram.ui.dl0;
import org.telegram.ui.ka;
import org.telegram.ui.sg0;
import org.telegram.ui.uj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ u5(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.y1(12));
                break;
            case 1:
                Comparator comparator = z6.X;
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                break;
            case 4:
                int[] iArr = gi.b1.b0;
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ai.y1(21));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ai.y1(21));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ai.y1(21));
                break;
            case 8:
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.s;
                break;
            case 9:
                break;
            case 10:
                int i3 = ub.i;
                break;
            case 11:
                Pattern pattern = li.S1;
                break;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.a(tL_error, 24));
                break;
            case 13:
                int i10 = hp.C8;
                break;
            case 14:
                String str = us.k0;
                break;
            case 15:
                Paint paint = ka.I;
                break;
            case 16:
                int i11 = ao.j3;
                break;
            case 17:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                break;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.t4.a;
                break;
            case 19:
                int i12 = sv.I0;
                break;
            case 20:
                int i13 = bz.B0;
                break;
            case 21:
                org.telegram.messenger.g0.h3(new ai.y1(26));
                break;
            case 22:
                int i14 = ky0.e;
                break;
            case 23:
                int i15 = dd0.w0;
                break;
            case 24:
                org.telegram.messenger.g0.h3(new sg0(tLObject, 4));
                break;
            case 25:
                int i16 = uj0.S;
                break;
            case 26:
                List list = dl0.h1;
                break;
            case 27:
                RectF rectF = ProfileActivity.T6;
                break;
            default:
                int i17 = b21.m1;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
