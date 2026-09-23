package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.xw;
import org.telegram.ui.en0;
import org.telegram.ui.fp;
import org.telegram.ui.jl0;
import org.telegram.ui.qo0;
import org.telegram.ui.uf0;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                int i10 = fp.b3;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.a;
                break;
            case 13:
                int i11 = xw.H0;
                break;
            case 14:
                int i12 = l00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 16:
                int i13 = e01.e;
                break;
            case 17:
                int i14 = uf0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new jl0(tLObject, 2));
                break;
            case 19:
                int i15 = en0.R;
                break;
            case 20:
                List list = qo0.g1;
                break;
            default:
                int i16 = w71.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
