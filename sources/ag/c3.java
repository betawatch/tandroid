package ag;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.cc;
import org.telegram.messenger.g4;
import org.telegram.messenger.ot;
import org.telegram.messenger.r5;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tz;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bp;
import org.telegram.ui.c41;
import org.telegram.ui.hl0;
import org.telegram.ui.me0;
import org.telegram.ui.mg0;
import org.telegram.ui.oa;
import org.telegram.ui.sm0;
import th.e5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                int i12 = cc.i;
                break;
            case 6:
                Pattern pattern = ui.R1;
                break;
            case 7:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.a(tL_error, 24));
                break;
            case 8:
                int i13 = vp.D8;
                break;
            case 9:
                String str = ot.j0;
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
                int i17 = pz0.e;
                break;
            case 18:
                int i18 = me0.v0;
                break;
            case 19:
                org.telegram.messenger.i0.g3(new mg0(tLObject, 5));
                break;
            case 20:
                int i19 = hl0.R;
                break;
            case 21:
                List list = sm0.g1;
                break;
            case 22:
                RectF rectF = ProfileActivity.R6;
                break;
            case 23:
                int i20 = c41.l1;
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
                int[] iArr = vh.u0.a0;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
