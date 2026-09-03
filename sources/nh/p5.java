package nh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.tw;
import org.telegram.ui.bn0;
import org.telegram.ui.ep;
import org.telegram.ui.gl0;
import org.telegram.ui.j21;
import org.telegram.ui.lo0;
import org.telegram.ui.ra;
import org.telegram.ui.tf0;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ p5(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = 21;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.n0(17));
                break;
            case 1:
                Comparator comparator = t6.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cg.n0(i10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new cg.n0(i10));
                break;
            case 4:
                break;
            case 5:
                Paint paint = ra.E;
                break;
            case 6:
                int i11 = ep.Y2;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.n0(i10));
                break;
            case 8:
                Pattern pattern = org.telegram.ui.Components.z4.a;
                break;
            case 9:
                int i12 = tw.E0;
                break;
            case 10:
                int i13 = k00.x0;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new cg.n0(i10));
                break;
            case 12:
                int i14 = j01.e;
                break;
            case 13:
                int i15 = tf0.q0;
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
                int i17 = v71.e;
                break;
            case 18:
                int[] iArr = ph.v0.U;
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new j21(18));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new j21(18));
                break;
            default:
                AndroidUtilities.runOnUIThread(new j21(18));
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
