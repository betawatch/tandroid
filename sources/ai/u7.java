package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.n00;
import org.telegram.ui.gn0;
import org.telegram.ui.gp;
import org.telegram.ui.nl0;
import org.telegram.ui.so0;
import org.telegram.ui.xf0;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                Paint paint = org.telegram.ui.sa.H;
                break;
            case 10:
                int i10 = gp.i3;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.a;
                break;
            case 13:
                int i11 = ax.H0;
                break;
            case 14:
                int i12 = n00.A0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                break;
            case 16:
                int i13 = d11.e;
                break;
            case 17:
                int i14 = xf0.t0;
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new nl0(tLObject, 2));
                break;
            case 19:
                int i15 = gn0.R;
                break;
            case 20:
                List list = so0.g1;
                break;
            default:
                int i16 = z71.e;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
