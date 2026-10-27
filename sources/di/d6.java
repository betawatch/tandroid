package di;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.s00;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bp;
import org.telegram.ui.c71;
import org.telegram.ui.gn0;
import org.telegram.ui.lf0;
import org.telegram.ui.nj0;
import org.telegram.ui.ro0;
import org.telegram.ui.ta;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d6 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ d6(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.c(11));
                break;
            case 1:
                Comparator comparator = h7.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                break;
            case 4:
                int[] iArr = fi.c1.a0;
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ag.c(19));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ag.c(19));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ag.c(19));
                break;
            case 8:
                break;
            case 9:
                Paint paint = ta.H;
                break;
            case 10:
                int i10 = bp.j3;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.a;
                break;
            case 13:
                int i11 = dx.H0;
                break;
            case 14:
                int i12 = s00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                break;
            case 16:
                int i13 = q11.e;
                break;
            case 17:
                int i14 = lf0.v0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new nj0(tLObject, 4));
                break;
            case 19:
                int i15 = gn0.R;
                break;
            case 20:
                List list = ro0.g1;
                break;
            case 21:
                int i16 = ProfileActivity.R6;
                break;
            default:
                int i17 = c71.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
