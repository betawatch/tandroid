package ci;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.s00;
import org.telegram.ui.ck0;
import org.telegram.ui.eo0;
import org.telegram.ui.hf0;
import org.telegram.ui.rm0;
import org.telegram.ui.sa;
import org.telegram.ui.u61;
import org.telegram.ui.vo;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ e6(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.j(9));
                break;
            case 1:
                Comparator comparator = i7.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                break;
            case 4:
                int[] iArr = ei.c1.a0;
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ah.j(17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ah.j(17));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ah.j(17));
                break;
            case 8:
                break;
            case 9:
                Paint paint = sa.H;
                break;
            case 10:
                int i10 = vo.Z2;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.f5.a;
                break;
            case 13:
                int i11 = ex.H0;
                break;
            case 14:
                int i12 = s00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                break;
            case 16:
                int i13 = e11.e;
                break;
            case 17:
                int i14 = hf0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ck0(tLObject, 3));
                break;
            case 19:
                int i15 = rm0.R;
                break;
            case 20:
                List list = eo0.g1;
                break;
            default:
                int i16 = u61.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
