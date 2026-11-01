package ag;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.dc;
import org.telegram.messenger.g4;
import org.telegram.messenger.pt;
import org.telegram.messenger.r5;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tz;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a41;
import org.telegram.ui.bp;
import org.telegram.ui.fl0;
import org.telegram.ui.kg0;
import org.telegram.ui.le0;
import org.telegram.ui.oa;
import org.telegram.ui.qm0;
import th.e5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ c3(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = 0;
        int i11 = 13;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new f3(i10));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new f3(i10));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new f3(i10));
                break;
            case 3:
                r5 r5Var = g4.s;
                break;
            case 4:
                break;
            case 5:
                int i12 = dc.i;
                break;
            case 6:
                Pattern pattern = vi.R1;
                break;
            case 7:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.a(tL_error, 24));
                break;
            case 8:
                int i13 = wp.D8;
                break;
            case 9:
                String str = pt.j0;
                break;
            case 10:
                Paint paint = oa.H;
                break;
            case 11:
                int i14 = bp.i3;
                break;
            case 12:
                org.telegram.messenger.i0.g3(new f3(i11));
                break;
            case 13:
                Pattern pattern2 = s4.a;
                break;
            case 14:
                int i15 = gw.H0;
                break;
            case 15:
                int i16 = tz.A0;
                break;
            case 16:
                org.telegram.messenger.i0.g3(new f3(i11));
                break;
            case 17:
                int i17 = qz0.e;
                break;
            case 18:
                int i18 = le0.v0;
                break;
            case 19:
                org.telegram.messenger.i0.g3(new kg0(tLObject, 5));
                break;
            case 20:
                int i19 = fl0.R;
                break;
            case 21:
                List list = qm0.g1;
                break;
            case 22:
                RectF rectF = ProfileActivity.S6;
                break;
            case 23:
                int i20 = a41.l1;
                break;
            case 24:
                org.telegram.messenger.i0.g3(new r5.a(11));
                break;
            case 25:
                Comparator comparator = e5.X;
                break;
            case 26:
                org.telegram.messenger.i0.g3(new f3(i11));
                break;
            case 27:
                org.telegram.messenger.i0.g3(new f3(i11));
                break;
            default:
                int[] iArr = vh.v0.a0;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
