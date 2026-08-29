package lh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.pw;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.a71;
import org.telegram.ui.bo0;
import org.telegram.ui.ef0;
import org.telegram.ui.if0;
import org.telegram.ui.la;
import org.telegram.ui.rm0;
import org.telegram.ui.vk0;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ o5(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = 25;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.o0(17));
                break;
            case 1:
                Comparator comparator = s6.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.o0(i10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.o0(i10));
                break;
            case 4:
                int[] iArr = nh.c1.T;
                break;
            case 5:
                break;
            case 6:
                Paint paint = la.D;
                break;
            case 7:
                int i11 = xo.X2;
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ag.o0(i10));
                break;
            case 9:
                Pattern pattern = org.telegram.ui.Components.c5.a;
                break;
            case 10:
                int i12 = pw.D0;
                break;
            case 11:
                int i13 = f00.w0;
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ag.o0(i10));
                break;
            case 13:
                int i14 = yz0.e;
                break;
            case 14:
                int i15 = if0.p0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new vk0(tLObject, 2));
                break;
            case 16:
                int i16 = rm0.N;
                break;
            case 17:
                List list = bo0.c1;
                break;
            case 18:
                int i17 = a71.e;
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ef0(18));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ef0(18));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ef0(18));
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
