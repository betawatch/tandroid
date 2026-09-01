package oh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.vw;
import org.telegram.ui.bn0;
import org.telegram.ui.dp;
import org.telegram.ui.gl0;
import org.telegram.ui.lo0;
import org.telegram.ui.p71;
import org.telegram.ui.pa;
import org.telegram.ui.sf0;
import org.telegram.ui.sj0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ p5(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = 23;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.f(19));
                break;
            case 1:
                Comparator comparator = t6.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.f(i10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.f(i10));
                break;
            case 4:
                break;
            case 5:
                Paint paint = pa.E;
                break;
            case 6:
                int i11 = dp.Y2;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ag.f(i10));
                break;
            case 8:
                Pattern pattern = org.telegram.ui.Components.z4.a;
                break;
            case 9:
                int i12 = vw.E0;
                break;
            case 10:
                int i13 = l00.x0;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ag.f(i10));
                break;
            case 12:
                int i14 = k01.e;
                break;
            case 13:
                int i15 = sf0.q0;
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gl0(tLObject, 2));
                break;
            case 15:
                int i16 = bn0.O;
                break;
            case 16:
                List list = lo0.d1;
                break;
            case 17:
                int i17 = p71.e;
                break;
            case 18:
                int[] iArr = qh.v0.U;
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new sj0(20));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new sj0(20));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sj0(20));
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
