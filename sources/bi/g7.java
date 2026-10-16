package bi;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.w00;
import org.telegram.ui.ap0;
import org.telegram.ui.dg0;
import org.telegram.ui.mp;
import org.telegram.ui.o81;
import org.telegram.ui.on0;
import org.telegram.ui.xk0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ g7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.j(5));
                break;
            case 1:
                Comparator comparator = x8.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 4:
                int[] iArr = di.c1.a0;
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ah.j(14));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ah.j(14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ah.j(14));
                break;
            case 8:
                break;
            case 9:
                Paint paint = org.telegram.ui.va.H;
                break;
            case 10:
                int i10 = mp.Z2;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.a;
                break;
            case 13:
                int i11 = ix.H0;
                break;
            case 14:
                int i12 = w00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 16:
                int i13 = h11.e;
                break;
            case 17:
                int i14 = dg0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new xk0(tLObject, 3));
                break;
            case 19:
                int i15 = on0.R;
                break;
            case 20:
                List list = ap0.g1;
                break;
            default:
                int i16 = o81.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
