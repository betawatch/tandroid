package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.yw;
import org.telegram.ui.cn0;
import org.telegram.ui.ep;
import org.telegram.ui.il0;
import org.telegram.ui.oo0;
import org.telegram.ui.tf0;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ u7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f(4));
                break;
            case 1:
                Comparator comparator = l9.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 4:
                int[] iArr = ci.d1.a0;
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
                Paint paint = org.telegram.ui.qa.H;
                break;
            case 10:
                int i10 = ep.b3;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.a;
                break;
            case 13:
                int i11 = yw.H0;
                break;
            case 14:
                int i12 = l00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 16:
                int i13 = s01.e;
                break;
            case 17:
                int i14 = tf0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new il0(tLObject, 2));
                break;
            case 19:
                int i15 = cn0.R;
                break;
            case 20:
                List list = oo0.g1;
                break;
            default:
                int i16 = x71.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
