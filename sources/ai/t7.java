package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.ww;
import org.telegram.ui.bg0;
import org.telegram.ui.f81;
import org.telegram.ui.jp;
import org.telegram.ui.mn0;
import org.telegram.ui.sl0;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ t7(int i10) {
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
                Paint paint = org.telegram.ui.sa.H;
                break;
            case 10:
                int i10 = jp.b3;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.c5.a;
                break;
            case 13:
                int i11 = ww.H0;
                break;
            case 14:
                int i12 = k00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 16:
                int i13 = g01.e;
                break;
            case 17:
                int i14 = bg0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new sl0(tLObject, 2));
                break;
            case 19:
                int i15 = mn0.R;
                break;
            case 20:
                List list = yo0.g1;
                break;
            default:
                int i16 = f81.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
