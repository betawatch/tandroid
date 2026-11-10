package di;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.bc;
import org.telegram.messenger.dt;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.hf0;
import org.telegram.ui.ho;
import org.telegram.ui.jd0;
import org.telegram.ui.kl0;
import org.telegram.ui.la;
import org.telegram.ui.o21;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ v5(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.m0(8));
                break;
            case 1:
                Comparator comparator = z6.X;
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                break;
            case 4:
                int[] iArr = fi.b1.a0;
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ai.m0(17));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ai.m0(17));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ai.m0(17));
                break;
            case 8:
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.s;
                break;
            case 9:
                break;
            case 10:
                int i7 = bc.i;
                break;
            case 11:
                Pattern pattern = ui.R1;
                break;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.a(tL_error, 25));
                break;
            case 13:
                int i10 = qp.C8;
                break;
            case 14:
                String str = dt.j0;
                break;
            case 15:
                Paint paint = la.H;
                break;
            case 16:
                int i11 = ho.i3;
                break;
            case 17:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                break;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.u4.a;
                break;
            case 19:
                int i12 = tv.H0;
                break;
            case 20:
                int i13 = ez.A0;
                break;
            case 21:
                org.telegram.messenger.g0.h3(new ai.m0(24));
                break;
            case 22:
                int i14 = ly0.e;
                break;
            case 23:
                int i15 = jd0.v0;
                break;
            case 24:
                org.telegram.messenger.g0.h3(new hf0(tLObject, 5));
                break;
            case 25:
                int i16 = ak0.R;
                break;
            case 26:
                List list = kl0.g1;
                break;
            case 27:
                RectF rectF = ProfileActivity.V6;
                break;
            default:
                int i17 = o21.o1;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
