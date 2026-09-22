package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.ww;
import org.telegram.ui.e81;
import org.telegram.ui.jp;
import org.telegram.ui.kn0;
import org.telegram.ui.pl0;
import org.telegram.ui.wo0;
import org.telegram.ui.zf0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                Paint paint = org.telegram.ui.qa.H;
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
                int i13 = f01.e;
                break;
            case 17:
                int i14 = zf0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new pl0(tLObject, 2));
                break;
            case 19:
                int i15 = kn0.R;
                break;
            case 20:
                List list = wo0.g1;
                break;
            default:
                int i16 = e81.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
