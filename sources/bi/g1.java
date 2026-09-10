package bi;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s01;
import org.telegram.ui.j81;
import org.telegram.ui.kn0;
import org.telegram.ui.lp;
import org.telegram.ui.ql0;
import org.telegram.ui.wo0;
import org.telegram.ui.zf0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ g1(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                int[] iArr = i1.a0;
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new f0(7));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new f0(7));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new f0(7));
                break;
            case 4:
                break;
            case 5:
                Paint paint = org.telegram.ui.ra.H;
                break;
            case 6:
                int i10 = lp.b3;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new f0(13));
                break;
            case 8:
                Pattern pattern = org.telegram.ui.Components.d5.a;
                break;
            case 9:
                int i11 = cx.H0;
                break;
            case 10:
                int i12 = r00.A0;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new f0(13));
                break;
            case 12:
                int i13 = s01.e;
                break;
            case 13:
                int i14 = zf0.t0;
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ql0(tLObject, 2));
                break;
            case 15:
                int i15 = kn0.R;
                break;
            case 16:
                List list = wo0.g1;
                break;
            case 17:
                int i16 = j81.e;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(19));
                break;
            case 19:
                Comparator comparator = zh.i5.X;
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new f0(13));
                break;
            default:
                AndroidUtilities.runOnUIThread(new f0(13));
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
