package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.ac;
import org.telegram.messenger.at;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.zv;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.ed0;
import org.telegram.ui.ef0;
import org.telegram.ui.go;
import org.telegram.ui.i21;
import org.telegram.ui.kl0;
import org.telegram.ui.la;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ m5(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.o(12));
                break;
            case 1:
                Comparator comparator = s6.X;
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ai.o(28));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.o(28));
                break;
            case 4:
                int[] iArr = hi.c1.b0;
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ai.o(19));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ai.o(19));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ai.o(19));
                break;
            case 8:
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.s;
                break;
            case 9:
                break;
            case 10:
                int i7 = ac.i;
                break;
            case 11:
                Pattern pattern = si.S1;
                break;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.a(tL_error, 25));
                break;
            case 13:
                int i10 = np.D8;
                break;
            case 14:
                String str = at.k0;
                break;
            case 15:
                Paint paint = la.I;
                break;
            case 16:
                int i11 = go.j3;
                break;
            case 17:
                org.telegram.messenger.g0.h3(new ai.o(28));
                break;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.t4.a;
                break;
            case 19:
                int i12 = zv.I0;
                break;
            case 20:
                int i13 = iz.B0;
                break;
            case 21:
                org.telegram.messenger.g0.h3(new ai.o(28));
                break;
            case 22:
                int i14 = ny0.e;
                break;
            case 23:
                int i15 = ed0.w0;
                break;
            case 24:
                org.telegram.messenger.g0.h3(new ef0(tLObject, 5));
                break;
            case 25:
                int i16 = ak0.S;
                break;
            case 26:
                List list = kl0.h1;
                break;
            case 27:
                RectF rectF = ProfileActivity.X6;
                break;
            default:
                int i17 = i21.p1;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
