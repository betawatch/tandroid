package bi;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.xw;
import org.telegram.ui.g81;
import org.telegram.ui.kp;
import org.telegram.ui.ln0;
import org.telegram.ui.rl0;
import org.telegram.ui.xo0;
import org.telegram.ui.zf0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ c7(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.j(5));
                break;
            case 1:
                Comparator comparator = u8.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 4:
                int[] iArr = di.d1.a0;
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
                Paint paint = org.telegram.ui.qa.H;
                break;
            case 10:
                int i10 = kp.b3;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.a;
                break;
            case 13:
                int i11 = xw.H0;
                break;
            case 14:
                int i12 = k00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                break;
            case 16:
                int i13 = e01.e;
                break;
            case 17:
                int i14 = zf0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new rl0(tLObject, 2));
                break;
            case 19:
                int i15 = ln0.R;
                break;
            case 20:
                List list = xo0.g1;
                break;
            default:
                int i16 = g81.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
