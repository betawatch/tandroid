package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.ac;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.ys;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hw;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dk0;
import org.telegram.ui.gd0;
import org.telegram.ui.hf0;
import org.telegram.ui.io;
import org.telegram.ui.la;
import org.telegram.ui.ml0;
import org.telegram.ui.n21;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ l5(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.n(14));
                break;
            case 1:
                Comparator comparator = p6.X;
                break;
            case 2:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 4:
                int[] iArr = hi.d1.b0;
                break;
            case 5:
                org.telegram.messenger.g0.g3(new ai.n(21));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.n(21));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new ai.n(21));
                break;
            case 8:
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.s;
                break;
            case 9:
                break;
            case 10:
                int i10 = ac.i;
                break;
            case 11:
                Pattern pattern = si.U1;
                break;
            case 12:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.a(tL_error, 25));
                break;
            case 13:
                int i11 = np.I8;
                break;
            case 14:
                String str = ys.k0;
                break;
            case 15:
                Paint paint = la.I;
                break;
            case 16:
                int i12 = io.j3;
                break;
            case 17:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.c5.a;
                break;
            case 19:
                int i13 = hw.I0;
                break;
            case 20:
                int i14 = rz.H0;
                break;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 22:
                int i15 = wy0.e;
                break;
            case 23:
                int i16 = gd0.w0;
                break;
            case 24:
                org.telegram.messenger.g0.g3(new hf0(tLObject, 5));
                break;
            case 25:
                int i17 = dk0.S;
                break;
            case 26:
                List list = ml0.h1;
                break;
            case 27:
                RectF rectF = ProfileActivity.Z6;
                break;
            default:
                int i18 = n21.p1;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
