package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.mx;
import org.telegram.ui.h81;
import org.telegram.ui.hp;
import org.telegram.ui.jn0;
import org.telegram.ui.tk0;
import org.telegram.ui.vo0;
import org.telegram.ui.zf0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ v7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f(4));
                break;
            case 1:
                Comparator comparator = m9.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 4:
                int[] iArr = ci.c1.a0;
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new f(13));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new f(13));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new f(13));
                break;
            case 8:
                break;
            case 9:
                Paint paint = org.telegram.ui.ra.H;
                break;
            case 10:
                int i10 = hp.Z2;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.a;
                break;
            case 13:
                int i11 = mx.H0;
                break;
            case 14:
                int i12 = a10.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 16:
                int i13 = k11.e;
                break;
            case 17:
                int i14 = zf0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new tk0(tLObject, 3));
                break;
            case 19:
                int i15 = jn0.R;
                break;
            case 20:
                List list = vo0.g1;
                break;
            default:
                int i16 = h81.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
