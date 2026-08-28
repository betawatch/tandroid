package ih;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.co0;
import org.telegram.ui.jf0;
import org.telegram.ui.lj0;
import org.telegram.ui.ma;
import org.telegram.ui.sm0;
import org.telegram.ui.uo;
import org.telegram.ui.y61;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ q5(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = 13;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.d2(12));
                break;
            case 1:
                Comparator comparator = v6.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                break;
            case 4:
                int[] iArr = kh.d1.T;
                break;
            case 5:
                break;
            case 6:
                Paint paint = ma.D;
                break;
            case 7:
                int i10 = uo.X2;
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                break;
            case 9:
                Pattern pattern = org.telegram.ui.Components.y4.a;
                break;
            case 10:
                int i11 = jw.D0;
                break;
            case 11:
                int i12 = vz.w0;
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                break;
            case 13:
                int i13 = mz0.e;
                break;
            case 14:
                int i14 = jf0.p0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new zk0(tLObject, 2));
                break;
            case 16:
                int i15 = sm0.N;
                break;
            case 17:
                List list = co0.c1;
                break;
            case 18:
                int i16 = y61.e;
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new lj0(i9));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new lj0(i9));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lj0(i9));
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
